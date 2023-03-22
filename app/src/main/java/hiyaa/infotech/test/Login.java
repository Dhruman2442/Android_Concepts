package hiyaa.infotech.test;

import static hiyaa.infotech.test.Apis.Api.BASE_URL;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

import hiyaa.infotech.test.Apis.ApiServices;
import hiyaa.infotech.test.Apis.Profiledata;
import hiyaa.infotech.test.Apis.Result;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Login extends AppCompatActivity {

    EditText number, password;

    Button login;

    ArrayList<Profiledata> profiledata = new
            ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        number = findViewById(R.id.number);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login_method(number.getText().toString(), password.getText().toString());
            }
        });

    }

    public void Login_method(String mobile_number, String password) {


        String token = "123456789test";

        final ProgressDialog progressDialog = new ProgressDialog(Login.this);
        progressDialog.setMessage("Please wait...");
        progressDialog.show();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        ApiServices apiServices = retrofit.create(ApiServices.class);

//        Call<Result> call = apiServices.Login(mobile_number, password, token, "1");


        JSONObject obj = new JSONObject();

        try {
            // Add the JSONArray to the JSONObject
            obj.put("mobileno", "9016182082");
            obj.put("password", "keval");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        String json = obj.toString();
        Log.d("checklogin..","is.."+json);

        Call<Result> call = apiServices.Login2("application/json",json);

        call.enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                progressDialog.dismiss();
                if (response.body() != null) {
                    if (response.body().getSuccess()) {

                        profiledata = response.body().getData();

                        Toast.makeText(Login.this, profiledata.get(0).getId(), Toast.LENGTH_SHORT).show();

                    } else {
                        Toast.makeText(Login.this, response.body().getMsg(), Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(Login.this, "Somethings is Wrong", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
package hiyaa.infotech.test;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Signup extends AppCompatActivity {

    EditText email , password , name , number ;
    Button signup ,signup_sharedpref;
    RadioGroup gender;
    RadioButton gender_selected;

    public static final String MyPREFERENCES = "MyPrefs";

    public static final String nameKey = "nameKey";
    public static final String phoneKey = "phoneKey";
    public static final String emailKey = "emailKey";
    public static final String passwordKey = "passwordKey";

    public static final String genderKey = "genderKey";

    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        sharedPreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        gender = findViewById(R.id.gender_signup);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        name = findViewById(R.id.username);
        number = findViewById(R.id.number);
        signup = findViewById(R.id.signup);

        signup_sharedpref = findViewById(R.id.signup_sharedpref);





        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(Signup.this, Profile.class);
                startActivity(i);
//
//                int selectedId = gender.getCheckedRadioButtonId();
//
//                gender_selected = (RadioButton) findViewById(selectedId);
//
//                i.putExtra("username", name.getText().toString());
//                i.putExtra("password", password.getText().toString());
//                i.putExtra("number", number.getText().toString());
//                i.putExtra("email", email.getText().toString());
//
//
//                i.putExtra("gender", gender_selected.getText().toString());
//



                Toast.makeText(Signup.this, "Button Clicked", Toast.LENGTH_SHORT).show();

            }
        });

        signup_sharedpref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences.Editor editor = sharedPreferences.edit();

                int selectedId = gender.getCheckedRadioButtonId();
                gender_selected = (RadioButton) findViewById(selectedId);

                editor.putString(nameKey, name.getText().toString());
                editor.putString(phoneKey, number.getText().toString());
                editor.putString(emailKey, email.getText().toString());
                editor.putString(passwordKey, password.getText().toString());
                editor.putString(genderKey, gender_selected.getText().toString());

                editor.commit();


                Toast.makeText(Signup.this,"Data saved in sharedpref",Toast.LENGTH_LONG).show();

                Toast.makeText(Signup.this,"Signup complete sucessfully",Toast.LENGTH_LONG).show();


                Intent i = new Intent(Signup.this, Profile.class);
                startActivity(i);
            }
        });
    }
}
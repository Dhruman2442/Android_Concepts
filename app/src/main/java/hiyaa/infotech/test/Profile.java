package hiyaa.infotech.test;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {

    TextView name, number, email, password, gender, name_sha, email_sha, password_sha, gender_sha, number_sha;

    Intent intent;

    SharedPreferences sharedPreferences;

    SharedPreferences sharedPreferences2;

    public static final String MyPREFERENCES = "MyPrefs";
    public static final String MyPREFERENCES2 = "MyPrefs2";
    public static final String nameKey = "nameKey";
    public static final String phoneKey = "phoneKey";
    public static final String emailKey = "emailKey";
    public static final String passwordKey = "passwordKey";
    public static final String genderKey = "genderKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        sharedPreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        sharedPreferences2 = getSharedPreferences(MyPREFERENCES2, Context.MODE_PRIVATE);

        intent = getIntent();

        gender = findViewById(R.id.gender);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        name = findViewById(R.id.name);
        number = findViewById(R.id.number);

        gender_sha = findViewById(R.id.gender_sha);
        email_sha = findViewById(R.id.email_sha);
        password_sha = findViewById(R.id.password_sha);
        name_sha = findViewById(R.id.name_sha);
        number_sha = findViewById(R.id.number_sha);

        String name1 = intent.getStringExtra("username");
        name.setText(name1);
        password.setText(intent.getStringExtra("password"));
        number.setText(intent.getStringExtra("number"));
        email.setText(intent.getStringExtra("email"));
        gender.setText(intent.getStringExtra("gender"));


        if (sharedPreferences.contains(nameKey)) {

            name_sha.setText(sharedPreferences.getString(nameKey, ""));

        } else {
            name_sha.setText("No data in sharedpref");
        }

        if (sharedPreferences.contains(phoneKey)) {
            number_sha.setText(sharedPreferences.getString(phoneKey, ""));
        } else {
            number_sha.setText("No data in sharedpref");
        }

        if (sharedPreferences.contains(emailKey)) {

            email_sha.setText(sharedPreferences.getString(emailKey, ""));

        } else {
            email_sha.setText("No data in sharedpref");
        }

        if (sharedPreferences.contains(genderKey)) {
            gender_sha.setText(sharedPreferences.getString(genderKey, ""));
        } else {
            gender_sha.setText("No data in sharedpref");
        }

        if (sharedPreferences.contains(passwordKey)) {
            password_sha.setText(sharedPreferences.getString(passwordKey, ""));
        } else {
            password_sha.setText("No data in sharedpref");
        }

    }
}
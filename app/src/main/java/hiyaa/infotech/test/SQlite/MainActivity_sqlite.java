package hiyaa.infotech.test.SQlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import hiyaa.infotech.test.R;

public class MainActivity_sqlite extends AppCompatActivity {
    SQLiteDatabase sqLiteDatabaseObj;
    EditText editTextName, editTextPhoneNumber;
    String NameHolder, NumberHolder, SQLiteDataBaseQueryHolder;
    Button EnterData, ButtonDisplayData;
    Boolean EditTextEmptyHold;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sqlite);


        EnterData = (Button)findViewById(R.id.button);
        ButtonDisplayData = (Button)findViewById(R.id.button2);
        editTextName = (EditText)findViewById(R.id.editText);
        editTextPhoneNumber = (EditText)findViewById(R.id.editText2);

        EnterData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                SQLiteDataBaseBuild();

                SQLiteTableBuild();

                CheckEditTextStatus();

                InsertDataIntoSQLiteDatabase();

                EmptyEditTextAfterDataInsert();


            }
        });

        ButtonDisplayData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity_sqlite.this, DisplaySQLiteDataActivity.class);
                startActivity(intent);
            }
        });
    }

    public void SQLiteDataBaseBuild(){

        sqLiteDatabaseObj = openOrCreateDatabase(SQLiteHelper.DATABASE_NAME, Context.MODE_PRIVATE, null);

    }

    public void SQLiteTableBuild(){

        sqLiteDatabaseObj.execSQL("CREATE TABLE IF NOT EXISTS "+SQLiteHelper.TABLE_NAME+"("+SQLiteHelper.Table_Column_ID+" PRIMARY KEY ,  "+SQLiteHelper.Table_Column_1_Name+" VARCHAR, "+SQLiteHelper.Table_Column_2_PhoneNumber+" VARCHAR);");

    }
    public void CheckEditTextStatus(){

        NameHolder = editTextName.getText().toString() ;
        NumberHolder = editTextPhoneNumber.getText().toString();

        if(TextUtils.isEmpty(NameHolder) || TextUtils.isEmpty(NumberHolder)){

            EditTextEmptyHold = false ;

        }
        else {

            EditTextEmptyHold = true ;
        }
    }

    public void InsertDataIntoSQLiteDatabase(){

        if(EditTextEmptyHold == true)
        {

            SQLiteDataBaseQueryHolder = "INSERT INTO "+SQLiteHelper.TABLE_NAME+" (name,phone_number) VALUES('"+NameHolder+"', '"+NumberHolder+"');";

            sqLiteDatabaseObj.execSQL(SQLiteDataBaseQueryHolder);

            sqLiteDatabaseObj.close();

            Toast.makeText(MainActivity_sqlite.this,"Data Inserted Successfully", Toast.LENGTH_LONG).show();

        }
        else {

            Toast.makeText(MainActivity_sqlite.this,"Please Fill All The Required Fields.", Toast.LENGTH_LONG).show();

        }

    }

    public void EmptyEditTextAfterDataInsert(){

        editTextName.getText().clear();

        editTextPhoneNumber.getText().clear();

    }
}
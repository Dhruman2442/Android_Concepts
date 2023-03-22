package hiyaa.infotech.test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sqlite extends AppCompatActivity {
    DatabaseHelper myDb;
    EditText name,email,number ,id;
    Button btnAddData;
    Button btnviewAll;
    Button btnDelete;
    Button btnviewUpdate;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite);

        myDb = new DatabaseHelper(this);


        name = (EditText)findViewById(R.id.name_sqlite);
        email = (EditText)findViewById(R.id.email_sqlite);
        number = (EditText)findViewById(R.id.number_sqlite);
        id = (EditText)findViewById(R.id.id_sqlite);

        btnAddData = (Button)findViewById(R.id.button_add);
        btnviewAll = (Button)findViewById(R.id.button_viewAll);
        btnviewUpdate= (Button)findViewById(R.id.button_update);
        btnDelete= (Button)findViewById(R.id.button_delete);
//        AddData();
        viewAll();
        UpdateData();
        DeleteData();

        btnAddData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddData();
            }
        });

    }

    public void DeleteData() {
        btnDelete.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Integer deletedRows = myDb.deleteData(id.getText().toString());
                        if(deletedRows > 0)
                            Toast.makeText(Sqlite.this,"Data Deleted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Sqlite.this,"Data not Deleted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
    public void UpdateData() {
        btnviewUpdate.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isUpdate = myDb.updateData(id.getText().toString(),
                                name.getText().toString(),
                                email.getText().toString(),number.getText().toString());
                        if(isUpdate == true)
                            Toast.makeText(Sqlite.this,"Data Update",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Sqlite.this,"Data not Updated",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
    public  void AddData() {
        btnAddData.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertData(name.getText().toString(),
                                email.getText().toString(),
                                number.getText().toString() );
                        if(isInserted == true)
                            Toast.makeText(Sqlite.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Sqlite.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void viewAll() {
        btnviewAll.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Cursor res = myDb.getAllData();
                        if(res.getCount() == 0) {
                            // show message
                            showMessage("Error","Nothing found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();

                        while (res.moveToNext()) {
                            buffer.append("Id :"+ res.getString(0)+"\n");
                            buffer.append("Name :"+ res.getString(1)+"\n");
                            buffer.append("email :"+ res.getString(2)+"\n");
                            buffer.append("Number :"+ res.getString(3)+"\n\n");
                        }

                        // Show all data
                        showMessage("Data",buffer.toString());
                    }
                }
        );
    }

    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }


}
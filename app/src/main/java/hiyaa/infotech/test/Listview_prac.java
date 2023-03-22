package hiyaa.infotech.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class Listview_prac extends AppCompatActivity {

    ListView listview;
    Spinner spinner;
//                             0           1     2       3      4      5
    String list_data[] = {"Android","Iphone","Hybrid","Java","PHP","Mysql" ,"React js"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        listview = findViewById(R.id.list);
        spinner = findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Listview_prac.this,
                R.layout.list_item2 ,list_data);

        listview.setAdapter(adapter);
        listview.setAdapter(adapter);

        spinner.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(Listview_prac.this, "Hello " + list_data[position], Toast.LENGTH_SHORT).show();

            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(Listview_prac.this, "Spinner " + list_data[position], Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}
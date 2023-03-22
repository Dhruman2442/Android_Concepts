package hiyaa.infotech.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import hiyaa.infotech.test.Adapter.MyListAdapter;
import hiyaa.infotech.test.Adapter.MyListData;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        MyListData[] myListData = new MyListData[]{
                new MyListData("123456789", "User name", R.drawable.ic_user_light_blue),
                new MyListData("123456789", "User 2", R.drawable.user),
                new MyListData("123456789", "User 3", R.drawable.ic_user_light_blue),
                new MyListData("123456789", "User 4", R.drawable.user),
                new MyListData("123456789", "User 5", R.drawable.ic_user_light_blue),
        };

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(Homepage.this));

        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.profile) {
            Intent i = new Intent(Homepage.this, Profile.class);
            startActivity(i);

            return true;
        } else if (id == R.id.changepassword) {

        } else if (id == R.id.logout) {

        }

        return super.onOptionsItemSelected(item);
    }
}
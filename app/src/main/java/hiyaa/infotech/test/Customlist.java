package hiyaa.infotech.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import hiyaa.infotech.test.Adapter.MyListAdapter2;

public class Customlist extends AppCompatActivity {
    ListView list;

    String[] maintitle ={
            "Name 1","Title 2",
            "Title 3","Title 4",
            "Title 5",
    };

    String[] subtitle ={
            "Number 1","Sub Title 2",
            "Sub Title 3","Sub Title 4",
            "Sub Title 5",
    };

    Integer[] imgid={
            R.drawable.user,R.drawable.ic_user_light_blue,
            R.drawable.user,R.drawable.ic_user_light_blue,
            R.drawable.ic_user_light_blue,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customlist);



        MyListAdapter2 adapter=new MyListAdapter2(this, maintitle, subtitle,imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

    }
}
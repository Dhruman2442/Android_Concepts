package hiyaa.infotech.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TabHost;

public class Tabhost extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabhost);


        TabHost host = (TabHost)findViewById(R.id.tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Chats");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Chats");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Status");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Status");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("Calls");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Calls");
        host.addTab(spec);
    }
}
package hiyaa.infotech.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class Wifi extends AppCompatActivity {
    Button enableButton,disableButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi);

        WifiManager wmgr = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
// Get List of Available Wifi Networks
        List<ScanResult> availNetworks = wmgr.getScanResults();
        if (availNetworks.size() > 0) {
            String wifis[] = new String[availNetworks.size()];
            // Get Each network detail
            for (int i=0; i<availNetworks.size();i++) {
                wifis[i] = availNetworks.get(i).toString();
            }
        }

        Button btntOn = (Button)findViewById(R.id.btnOn);
        Button btntOff = (Button)findViewById(R.id.btnOFF);

        btntOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WifiManager wmgr = (WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wmgr.setWifiEnabled(true);
            }
        });
        btntOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WifiManager wmgr = (WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wmgr.setWifiEnabled(false);
            }
        });

    }
}
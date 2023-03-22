package hiyaa.infotech.test;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import hiyaa.infotech.test.Fragment_Dire.FirstFragment;
import hiyaa.infotech.test.Fragment_Dire.SecondFragment;
import hiyaa.infotech.test.Fragment_Dire.ThirdFragment;

public class Fragmentt extends AppCompatActivity {

    Button inbox, sent, bin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        inbox = (Button) findViewById(R.id.Inbox);
        sent = (Button) findViewById(R.id.Sent);
        bin = (Button) findViewById(R.id.Bin);

        loadFragment(new FirstFragment());

// perform setOnClickListener event on First Button
        inbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load First Fragmentt
                FirstFragment fragment = new FirstFragment();

                loadFragment(fragment);

            }
        });

// perform setOnClickListener event on Second Button
        sent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragmentt
                loadFragment(new SecondFragment());
            }
        });

        bin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragmentt
                loadFragment(new ThirdFragment());
            }
        });
    }


    private void loadFragment(Fragment fragment) {
// create a FragmentManager
        FragmentManager fm = getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragmentt
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragmentt
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // save the changes
    }
    
}
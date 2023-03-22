package hiyaa.infotech.test;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager.widget.ViewPager;

import hiyaa.infotech.test.Adapter.CustomPagerAdapter;
import hiyaa.infotech.test.databinding.ActivityViewpagerBinding;

public class Viewpager extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_viewpager);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        CustomPagerAdapter abc = new CustomPagerAdapter(Viewpager.this);

        viewPager.setAdapter(abc);
    }

}
package hiyaa.infotech.test;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Animation extends AppCompatActivity {

    android.view.animation.Animation blink_anim, bounce_anim, fin_anim, fout_anim, sunrise_anim;
    TextView animation_text;
    Button fadein, fadeout, blink, bounce, sunrise;
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_animation);

        animation_text = findViewById(R.id.text);
        image = findViewById(R.id.image);
        fadein = findViewById(R.id.fin);
        fadeout = findViewById(R.id.fout);
        blink = findViewById(R.id.blink);
        bounce = findViewById(R.id.bounce);
        sunrise = findViewById(R.id.sunrise);

        blink_anim = AnimationUtils.loadAnimation(Animation.this,
                R.anim.blink);

        fin_anim = AnimationUtils.loadAnimation(Animation.this,
                R.anim.fade_in);
        bounce_anim = AnimationUtils.loadAnimation(Animation.this,
                R.anim.bounce);
        fout_anim = AnimationUtils.loadAnimation(Animation.this,
                R.anim.fade_out);
        sunrise_anim = AnimationUtils.loadAnimation(Animation.this,
                R.anim.sun_rise);




        fadein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.startAnimation(fin_anim);
            }
        });
        bounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.startAnimation(bounce_anim);
            }
        });
        blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.startAnimation(blink_anim);
            }
        });
        fadeout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.startAnimation(fout_anim);
            }
        });
        sunrise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.startAnimation(sunrise_anim);
            }
        });




    }

    public void test(){
  blink_anim.setAnimationListener(new android.view.animation.Animation.AnimationListener() {
      @Override
      public void onAnimationStart(android.view.animation.Animation animation) {

      }

      @Override
      public void onAnimationEnd(android.view.animation.Animation animation) {

      }

      @Override
      public void onAnimationRepeat(android.view.animation.Animation animation) {

      }
  });
    }



}
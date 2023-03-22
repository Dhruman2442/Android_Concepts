package hiyaa.infotech.test;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Environment;
import android.view.View;
import android.widget.Button;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


public class AudioVideo extends AppCompatActivity {
    Button start,pause,stop,video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_audio_video);
        start=(Button)findViewById(R.id.button1);
        pause=(Button)findViewById(R.id.button2);
        stop=(Button)findViewById(R.id.button3);
        video=(Button)findViewById(R.id.video);
        //creating media player
        final MediaPlayer mp=new MediaPlayer();

        try{
            //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
//            mp.setDataSource(Environment.getExternalStorageDirectory().getPath()+"/Music/maine.mp3");
            mp.setDataSource(Environment.getExternalStorageDirectory().getPath()+"/ring.mp3");

            mp.prepare();
        }
        catch(Exception e){e.printStackTrace();}

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
            }
        });

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(AudioVideo.this,Video.class));
            }
        });
    }

}


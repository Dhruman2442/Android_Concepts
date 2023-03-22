package hiyaa.infotech.test;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);


//        VideoView videoView =(VideoView)findViewById(R.id.videoView1);
//
//        //Creating MediaController
//        MediaController mediaController= new MediaController(this);
//        mediaController.setAnchorView(videoView);
//
//        //specify the location of media file
//        Uri uri=Uri.parse(Environment.getExternalStorageDirectory().getPath()+"test.mp4");
//
//
//        //Setting MediaController and URI, then starting the videoView
//        videoView.setMediaController(mediaController);
//        videoView.setVideoURI(uri);
//        videoView.requestFocus();
//        videoView.start();


        VideoView videoView =(VideoView)findViewById(R.id.videoView1);
        //Set MediaController  to enable play, pause, forward, etc options.
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);
        //Location of Media File
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.test);
        //Starting VideView By Setting MediaController and URI
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

    }
}
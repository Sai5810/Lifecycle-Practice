package com.vakasai.lifecycles;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class TOSPlayer extends AppCompatActivity {
    VideoView vw;
    static int stopPosition;
    boolean pflag = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tos);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.coven_all_any_experience);
        vw = findViewById(R.id.vidvw);
        vw.setVideoURI(uri);
//        vw.seekTo(2000);
        vw.start();
    }

    @Override
    protected void onResume() {
        super.onResume();
//        System.out.println("test 2: " + vw.canSeekForward() + stopPosition);
        vw.seekTo(stopPosition);
        vw.start();
    }

    public void pause(View view) {
        if(!pflag) {
            stopPosition = vw.getCurrentPosition();
//            System.out.println("test: " + stopPosition);
            vw.pause();
            pflag = true;
        } else {
//            System.out.println("test1: " + stopPosition);
            vw.start();
            pflag = false;
        }
    }
}

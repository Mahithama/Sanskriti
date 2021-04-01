package com.example.sanskriti_2020_all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Splashscreen extends AppCompatActivity {
    VideoView splash;
    MediaController mediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        splash = (VideoView) findViewById(R.id.splash);

        Uri video = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.splash);
        splash.setVideoURI(video);
        mediaController = new MediaController(Splashscreen.this);
        mediaController.setAnchorView(splash);
        splash.setMediaController(mediaController);

        splash.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                startNextActivity();
            }
        });

        splash.start();

    }

    private void startNextActivity() {
        if (isFinishing())
            return;
        startActivity(new Intent(Splashscreen.this, MainActivity.class));
        finish();
    }
}

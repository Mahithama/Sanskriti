package com.example.sanskriti_2020_all.Nurseryclass.Unit7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.sanskriti_2020_all.R;

public class X_alphabet extends AppCompatActivity implements View.OnClickListener  {
    ImageView xylo,xray,xmas;
    private ViewFlipper viewFlipper;
    Button start;
    MediaPlayer mp,mp3;
    int i;
    private boolean isxyloTapped=false;
    private boolean isxrayTapped=false;
    private boolean isxmasTapped=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x_alphabet);
        viewFlipper = findViewById(R.id.viewflipper);

        xylo = findViewById(R.id.xylo);
        xray = findViewById(R.id.xray);
        xmas = findViewById(R.id.xmas);


        xylo.setOnClickListener(this);
        xray.setOnClickListener(this);
        xmas.setOnClickListener(this);


        mp3 = MediaPlayer.create(X_alphabet.this, R.raw.x_title_alpha);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();
    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.xray:
                ImageView imagea=(ImageView)findViewById(R.id.xray);
                Animation animationa= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagea.startAnimation(animationa);
                mp = MediaPlayer.create(X_alphabet.this, R.raw.x_ray_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isxrayTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.xylo:
                ImageView imageb=(ImageView)findViewById(R.id.xylo);
                Animation animationb= AnimationUtils.loadAnimation(this,R.anim.blink);
                imageb.startAnimation(animationb);
                mp = MediaPlayer.create(X_alphabet.this, R.raw.x_xylo_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isxyloTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.xmas:
                ImageView imagec=(ImageView)findViewById(R.id.xmas);
                Animation animationc= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagec.startAnimation(animationc);
                mp = MediaPlayer.create(X_alphabet.this, R.raw.x_mas_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isxmasTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;


        }

        mp.seekTo(0);
        mp.start();


    }
    /*public void onBackPressed() {
        // super.onBackPressed();
        return;
    } */

    @Override
    public void onPause() {
        super.onPause();
        // Release the MediaPlayer if going into background if it isn't null
        if (mp != null) mp.release();

    }


    public void nextScreen(int i) {

        if (isxmasTapped && isxyloTapped && isxrayTapped ) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(X_alphabet.this, nur7_literacy.class);
                    act.putExtra("activity_name", activity_name);
                    startActivity(act);


                }
            }, 2000);


        }
    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }


    public void nextView(View v) {
        viewFlipper.showNext();
        if(mp3 != null && mp3.isPlaying()){
            mp3.stop();
        }

    }
}




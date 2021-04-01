package com.example.sanskriti_2020_all.Juniorclass.unit5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.sanskriti_2020_all.R;



public class Heavier_weights extends AppCompatActivity implements View.OnClickListener  {
    ImageView ele,ep,jet,clo,robo,bow,cupp,mittens;
    MediaPlayer mp,mp3;
    int i;
    private boolean iseleTapped=false;
    private boolean isjetTapped=false;
    private boolean isroboTapped=false;
    private boolean iscupTapped=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heavier_weights);
        ele = findViewById(R.id.ele);
        ep = findViewById(R.id.ep);
        jet = findViewById(R.id.jet);
        clo = findViewById(R.id.clo);
        robo = findViewById(R.id.robo);
        bow = findViewById(R.id.bow);
        cupp = findViewById(R.id.cupp);
        mittens = findViewById(R.id.mittens);



        ele.setOnClickListener(this);
        ep.setOnClickListener(this);
        jet.setOnClickListener(this);
        clo.setOnClickListener(this);
        robo.setOnClickListener(this);
        bow.setOnClickListener(this);
        cupp.setOnClickListener(this);
        mittens.setOnClickListener(this);



    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.ele:
                ImageView imagea=(ImageView)findViewById(R.id.ele);
                Animation animationa= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagea.startAnimation(animationa);
                mp = MediaPlayer.create(Heavier_weights.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iseleTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.robo:
                ImageView imageb=(ImageView)findViewById(R.id.robo);
                Animation animationb= AnimationUtils.loadAnimation(this,R.anim.blink);
                imageb.startAnimation(animationb);
                mp = MediaPlayer.create(Heavier_weights.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isroboTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.jet:
                ImageView imagec=(ImageView)findViewById(R.id.jet);
                Animation animationc= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagec.startAnimation(animationc);
                mp = MediaPlayer.create(Heavier_weights.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isjetTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.cupp:
                ImageView imaged=(ImageView)findViewById(R.id.cupp);
                Animation animationd= AnimationUtils.loadAnimation(this,R.anim.blink);
                imaged.startAnimation(animationd);
                mp = MediaPlayer.create(Heavier_weights.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iscupTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.ep:
                mp = MediaPlayer.create(Heavier_weights.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.mittens:
                mp = MediaPlayer.create(Heavier_weights.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.clo:
                mp = MediaPlayer.create(Heavier_weights.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.bow:
                mp = MediaPlayer.create(Heavier_weights.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
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

        if (iseleTapped && iscupTapped && isroboTapped && isjetTapped  ) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Heavier_weights.this, Ju5_theme_activities.class);
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
}



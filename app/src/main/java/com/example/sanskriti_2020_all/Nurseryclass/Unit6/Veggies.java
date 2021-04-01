package com.example.sanskriti_2020_all.Nurseryclass.Unit6;

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

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanskriti_2020_all.R;

public class Veggies extends AppCompatActivity implements View.OnClickListener {
    ImageView caps,cab,carr,corn,pump,tom, oni;
    Button start;
    MediaPlayer mp,mp3;
    int i;
    private boolean iscapsTapped=false;
    private boolean iscabTapped=false;
    private boolean iscarrTapped=false;
    private boolean iscornTapped=false;
    private boolean ispumpTapped=false;
    private boolean istomTapped=false;
    private boolean isoniTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veggies);

        caps = findViewById(R.id.caps);
        cab = findViewById(R.id.cab);
        carr = findViewById(R.id.carr);
        corn = findViewById(R.id.corn);
        pump = findViewById(R.id.pump);
        tom = findViewById(R.id.tom);
        oni = findViewById(R.id.oni);


        caps.setOnClickListener(this);
        cab.setOnClickListener(this);
        carr.setOnClickListener(this);
        corn.setOnClickListener(this);
        pump.setOnClickListener(this);
        tom.setOnClickListener(this);
        oni.setOnClickListener(this);

        mp3 = MediaPlayer.create(Veggies.this, R.raw.spot_diff);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();
    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.cab:
                ImageView imagea=(ImageView)findViewById(R.id.cab);
                Animation animationa= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagea.startAnimation(animationa);
                mp = MediaPlayer.create(Veggies.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iscabTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.caps:
                ImageView imageb=(ImageView)findViewById(R.id.caps);
                Animation animationb= AnimationUtils.loadAnimation(this,R.anim.blink);
                imageb.startAnimation(animationb);
                mp = MediaPlayer.create(Veggies.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iscapsTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.tom:
                ImageView imagec=(ImageView)findViewById(R.id.tom);
                Animation animationc= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagec.startAnimation(animationc);
                mp = MediaPlayer.create(Veggies.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                istomTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.corn:
                ImageView imaged=(ImageView)findViewById(R.id.corn);
                Animation animationd= AnimationUtils.loadAnimation(this,R.anim.blink);
                imaged.startAnimation(animationd);
                mp = MediaPlayer.create(Veggies.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iscornTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.carr:
                ImageView imagee=(ImageView)findViewById(R.id.carr);
                Animation animatione= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagee.startAnimation(animatione);
                mp = MediaPlayer.create(Veggies.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iscarrTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.oni:
                ImageView imagef=(ImageView)findViewById(R.id.oni);
                Animation animationf= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagef.startAnimation(animationf);
                mp = MediaPlayer.create(Veggies.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isoniTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.pump:
                ImageView imageg=(ImageView)findViewById(R.id.pump);
                Animation animationg= AnimationUtils.loadAnimation(this,R.anim.blink);
                imageg.startAnimation(animationg);
                mp = MediaPlayer.create(Veggies.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ispumpTapped=true;
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

        if (iscarrTapped && iscapsTapped && iscornTapped && ispumpTapped && isoniTapped && istomTapped && iscabTapped ) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Veggies.this, nur6_themes_activities_home.class);
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




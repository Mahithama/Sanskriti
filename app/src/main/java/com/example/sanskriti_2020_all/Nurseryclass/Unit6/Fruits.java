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
import com.example.sanskriti_2020_all.Nurseryclass.Unit6.Animals;

public class Fruits extends AppCompatActivity implements View.OnClickListener {
    ImageView grapes,pine,orange,banana,kiwi,pear, greenap;
    Button start;
    MediaPlayer mp,mp3;
    int i;
    private boolean isgrapesTapped=false;
    private boolean ispineTapped=false;
    private boolean isorangeTapped=false;
    private boolean isbananaTapped=false;
    private boolean iskiwiTapped=false;
    private boolean ispearTapped=false;
    private boolean isgreenapTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);
        grapes = findViewById(R.id.grapes);
        pine = findViewById(R.id.pine);
        orange = findViewById(R.id.orange);
        banana = findViewById(R.id.banana);
        kiwi = findViewById(R.id.kiwi);
        pear = findViewById(R.id.pear);
        greenap = findViewById(R.id.greenap);


        grapes.setOnClickListener(this);
        pine.setOnClickListener(this);
        orange.setOnClickListener(this);
        banana.setOnClickListener(this);
        kiwi.setOnClickListener(this);
        pear.setOnClickListener(this);
        greenap.setOnClickListener(this);

        mp3 = MediaPlayer.create(Fruits.this, R.raw.spot_diff);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();
    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.pine:
                ImageView imagea=(ImageView)findViewById(R.id.pine);
                Animation animationa= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagea.startAnimation(animationa);
                mp = MediaPlayer.create(Fruits.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ispineTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.kiwi:
                ImageView imageb=(ImageView)findViewById(R.id.kiwi);
                Animation animationb= AnimationUtils.loadAnimation(this,R.anim.blink);
                imageb.startAnimation(animationb);
                mp = MediaPlayer.create(Fruits.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iskiwiTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.greenap:
                ImageView imagec=(ImageView)findViewById(R.id.greenap);
                Animation animationc= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagec.startAnimation(animationc);
                mp = MediaPlayer.create(Fruits.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isgreenapTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.grapes:
                ImageView imaged=(ImageView)findViewById(R.id.grapes);
                Animation animationd= AnimationUtils.loadAnimation(this,R.anim.blink);
                imaged.startAnimation(animationd);
                mp = MediaPlayer.create(Fruits.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isgrapesTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.banana:
                ImageView imagee=(ImageView)findViewById(R.id.banana);
                Animation animatione= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagee.startAnimation(animatione);
                mp = MediaPlayer.create(Fruits.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isbananaTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.pear:
                ImageView imagef=(ImageView)findViewById(R.id.pear);
                Animation animationf= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagef.startAnimation(animationf);
                mp = MediaPlayer.create(Fruits.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ispearTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.orange:
                ImageView imageg=(ImageView)findViewById(R.id.orange);
                Animation animationg= AnimationUtils.loadAnimation(this,R.anim.blink);
                imageg.startAnimation(animationg);
                mp = MediaPlayer.create(Fruits.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isorangeTapped=true;
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

        if (isgrapesTapped && isgreenapTapped && iskiwiTapped && ispearTapped && isbananaTapped && ispineTapped && isorangeTapped ) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Fruits.this, nur6_themes_activities_home.class);
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




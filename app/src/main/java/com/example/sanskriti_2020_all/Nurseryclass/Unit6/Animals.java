package com.example.sanskriti_2020_all.Nurseryclass.Unit6;

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

import com.example.sanskriti_2020_all.R;
import com.example.sanskriti_2020_all.Nurseryclass.Unit6.Animals;

public class Animals extends AppCompatActivity implements View.OnClickListener {
    ImageView deer,bear,fox,sparrow;
    Button start;
    MediaPlayer mp,mp3;
    int i;
    private boolean isdeerTapped=false;
    private boolean isbearTapped=false;
    private boolean isfoxTapped=false;
    private boolean issparrowTapped=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals2);
        deer = findViewById(R.id.deer);
        bear = findViewById(R.id.bear);
        fox = findViewById(R.id.fox);
        sparrow = findViewById(R.id.sparrow);

        deer.setOnClickListener(this);
        bear.setOnClickListener(this);
        fox.setOnClickListener(this);
        sparrow.setOnClickListener(this);


        mp3 = MediaPlayer.create(Animals.this, R.raw.spot_diff);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();
    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.deer:
                ImageView imagea=(ImageView)findViewById(R.id.deer);
                Animation animationa= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagea.startAnimation(animationa);
                mp = MediaPlayer.create(Animals.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isdeerTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.bear:
                ImageView imageb=(ImageView)findViewById(R.id.bear);
                Animation animationb= AnimationUtils.loadAnimation(this,R.anim.blink);
                imageb.startAnimation(animationb);
                mp = MediaPlayer.create(Animals.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isbearTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.fox:
                ImageView imagec=(ImageView)findViewById(R.id.fox);
                Animation animationc= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagec.startAnimation(animationc);
                mp = MediaPlayer.create(Animals.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isfoxTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.sparrow:
                ImageView imaged=(ImageView)findViewById(R.id.sparrow);
                Animation animationd= AnimationUtils.loadAnimation(this,R.anim.blink);
                imaged.startAnimation(animationd);
                mp = MediaPlayer.create(Animals.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                issparrowTapped=true;
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

        if (issparrowTapped && isfoxTapped && isbearTapped && isdeerTapped ) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Animals.this, Animals1.class);
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




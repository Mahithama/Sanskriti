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



public class Lighter_weight extends AppCompatActivity implements View.OnClickListener {
ImageView fish,fly,muffin,mush,drum,donut,bird,egg;
    MediaPlayer mp,mp3;
    int i;
    private boolean isflyTapped=false;
    private boolean ismushTapped=false;
    private boolean isdonutTapped=false;
    private boolean iseggTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lighter_weight);
        fish = findViewById(R.id.fish);
        fly = findViewById(R.id.fly);
        muffin = findViewById(R.id.muffin);
        mush = findViewById(R.id.mush);
        drum = findViewById(R.id.drum);
        donut = findViewById(R.id.donut);
        bird = findViewById(R.id.bird);
        egg = findViewById(R.id.egg);



        fish.setOnClickListener(this);
        fly.setOnClickListener(this);
        muffin.setOnClickListener(this);
        mush.setOnClickListener(this);
        drum.setOnClickListener(this);
        donut.setOnClickListener(this);
        bird.setOnClickListener(this);
        egg.setOnClickListener(this);



    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.fly:
                ImageView imagea=(ImageView)findViewById(R.id.fly);
                Animation animationa= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagea.startAnimation(animationa);
                mp = MediaPlayer.create(Lighter_weight.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isflyTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.mush:
                ImageView imageb=(ImageView)findViewById(R.id.mush);
                Animation animationb= AnimationUtils.loadAnimation(this,R.anim.blink);
                imageb.startAnimation(animationb);
                mp = MediaPlayer.create(Lighter_weight.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ismushTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.donut:
                ImageView imagec=(ImageView)findViewById(R.id.donut);
                Animation animationc= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagec.startAnimation(animationc);
                mp = MediaPlayer.create(Lighter_weight.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isdonutTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.egg:
                ImageView imaged=(ImageView)findViewById(R.id.egg);
                Animation animationd= AnimationUtils.loadAnimation(this,R.anim.blink);
                imaged.startAnimation(animationd);
                mp = MediaPlayer.create(Lighter_weight.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iseggTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.fish:
                mp = MediaPlayer.create(Lighter_weight.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.muffin:
                mp = MediaPlayer.create(Lighter_weight.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.drum:
                mp = MediaPlayer.create(Lighter_weight.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.bird:
                mp = MediaPlayer.create(Lighter_weight.this, R.raw.failure);
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

        if (isflyTapped && ismushTapped && isdonutTapped && iseggTapped  ) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Lighter_weight.this, Ju5_theme_activities.class);
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




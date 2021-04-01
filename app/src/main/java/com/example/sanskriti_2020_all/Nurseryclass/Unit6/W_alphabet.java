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
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanskriti_2020_all.R;

public class W_alphabet extends AppCompatActivity implements View.OnClickListener  {
    ImageView wolf,water,wood,worm, melon;
    Button start;
    private ViewFlipper viewFlipper;
    MediaPlayer mp,mp3;
    int i;
    private boolean iswolfTapped=false;
    private boolean iswaterTapped=false;
    private boolean iswoodTapped=false;
    private boolean iswormTapped=false;
    private boolean ismelonTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_w_alphabet);
        wolf = findViewById(R.id.wolf);
        water = findViewById(R.id.water);
        wood = findViewById(R.id.wood);
        worm = findViewById(R.id.worm);
        melon = findViewById(R.id.melon);
        viewFlipper = findViewById(R.id.viewflipper);

        wolf.setOnClickListener(this);
        water.setOnClickListener(this);
        wood.setOnClickListener(this);
        worm.setOnClickListener(this);
        melon.setOnClickListener(this);

        mp3 = MediaPlayer.create(W_alphabet.this, R.raw.w_title_alpha);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();
    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.water:
                ImageView imagea=(ImageView)findViewById(R.id.water);
                Animation animationa= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagea.startAnimation(animationa);
                mp = MediaPlayer.create(W_alphabet.this, R.raw.w_water_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iswaterTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.wood:
                ImageView imageb=(ImageView)findViewById(R.id.wood);
                Animation animationb= AnimationUtils.loadAnimation(this,R.anim.blink);
                imageb.startAnimation(animationb);
                mp = MediaPlayer.create(W_alphabet.this, R.raw.w_woodpicker_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iswoodTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.wolf:
                ImageView imagec=(ImageView)findViewById(R.id.wolf);
                Animation animationc= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagec.startAnimation(animationc);
                mp = MediaPlayer.create(W_alphabet.this, R.raw.w_wolf_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iswolfTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.worm:
                ImageView imaged=(ImageView)findViewById(R.id.worm);
                Animation animationd= AnimationUtils.loadAnimation(this,R.anim.blink);
                imaged.startAnimation(animationd);
                mp = MediaPlayer.create(W_alphabet.this, R.raw.w_warm_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iswormTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.melon:
                ImageView imagee=(ImageView)findViewById(R.id.melon);
                Animation animatione= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagee.startAnimation(animatione);
                mp = MediaPlayer.create(W_alphabet.this, R.raw.w_melon_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ismelonTapped=true;
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

        if (iswaterTapped && iswoodTapped && iswormTapped && ismelonTapped && iswolfTapped ) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(W_alphabet.this, Unit6_nursery_literacy_home.class);
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




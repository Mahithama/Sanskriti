package com.example.sanskriti_2020_all.Nurseryclass.Unit5;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanskriti_2020_all.R;

public class Shadow_match extends AppCompatActivity implements View.OnClickListener  {
ImageView straw,cup,hen,ice,ball,pizza;
    MediaPlayer mp,mp3;
    int i;
    private boolean isstrawTapped=false;
    private boolean iscupTapped=false;
    private boolean isiceTapped=false;
    private boolean isballTapped=false;
    private boolean ispizzaTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shadow_match);
        straw = findViewById(R.id.straw);
        cup = findViewById(R.id.cup);
        hen = findViewById(R.id.hen);
        ice = findViewById(R.id.ice);
        ball = findViewById(R.id.ball);
        pizza = findViewById(R.id.pizza);

        straw.setOnClickListener(this);
        cup.setOnClickListener(this);
        hen.setOnClickListener(this);
        ice.setOnClickListener(this);
        ball.setOnClickListener(this);
        pizza.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.straw:
                ImageView imagea=(ImageView)findViewById(R.id.straw);
                Animation animationa= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagea.startAnimation(animationa);
                mp = MediaPlayer.create(Shadow_match.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isstrawTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.cup:
                ImageView imageb=(ImageView)findViewById(R.id.cup);
                Animation animationb= AnimationUtils.loadAnimation(this,R.anim.blink);
                imageb.startAnimation(animationb);
                mp = MediaPlayer.create(Shadow_match.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iscupTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.ice:
                ImageView imagec=(ImageView)findViewById(R.id.ice);
                Animation animationc= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagec.startAnimation(animationc);
                mp = MediaPlayer.create(Shadow_match.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isiceTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.ball:
                ImageView imaged=(ImageView)findViewById(R.id.ball);
                Animation animationd= AnimationUtils.loadAnimation(this,R.anim.blink);
                imaged.startAnimation(animationd);
                mp = MediaPlayer.create(Shadow_match.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isballTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.pizza:
                ImageView imagee=(ImageView)findViewById(R.id.pizza);
                Animation animatione= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagee.startAnimation(animatione);
                mp = MediaPlayer.create(Shadow_match.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ispizzaTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.hen:
                mp = MediaPlayer.create(Shadow_match.this, R.raw.success);
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

        if (iscupTapped && isstrawTapped && isiceTapped && isballTapped && ispizzaTapped ) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Shadow_match.this, nur5_themes_activities_home.class);
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

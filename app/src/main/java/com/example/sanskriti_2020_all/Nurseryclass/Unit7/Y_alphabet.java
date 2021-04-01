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

public class Y_alphabet extends AppCompatActivity implements View.OnClickListener {
    ImageView yolk,yarn,yak,yacht, yam;
    private ViewFlipper viewFlipper;
    Button start;
    MediaPlayer mp,mp3;
    int i;
    private boolean isyolkTapped=false;
    private boolean isyarnTapped=false;
    private boolean isyakTapped=false;
    private boolean isyachtTapped=false;
    private boolean isyamTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_y_alphabet);
        viewFlipper = findViewById(R.id.viewflipper);
        yolk = findViewById(R.id.yolk);
        yarn = findViewById(R.id.yarn);
        yak = findViewById(R.id.yak);
        yacht = findViewById(R.id.yacht);
        yam = findViewById(R.id.yam);


        yolk.setOnClickListener(this);
        yarn.setOnClickListener(this);
        yak.setOnClickListener(this);
        yacht.setOnClickListener(this);
        yam.setOnClickListener(this);

        mp3 = MediaPlayer.create(Y_alphabet.this, R.raw.y_title_alpha);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();
    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.yak:
                ImageView imagea=(ImageView)findViewById(R.id.yak);
                Animation animationa= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagea.startAnimation(animationa);
                mp = MediaPlayer.create(Y_alphabet.this, R.raw.y_yak_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isyakTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.yolk:
                ImageView imageb=(ImageView)findViewById(R.id.yolk);
                Animation animationb= AnimationUtils.loadAnimation(this,R.anim.blink);
                imageb.startAnimation(animationb);
                mp = MediaPlayer.create(Y_alphabet.this, R.raw.y_yolk_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isyolkTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.yarn:
                ImageView imagec=(ImageView)findViewById(R.id.yarn);
                Animation animationc= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagec.startAnimation(animationc);
                mp = MediaPlayer.create(Y_alphabet.this, R.raw.y_yarn_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isyarnTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.yam:
                ImageView imaged=(ImageView)findViewById(R.id.yam);
                Animation animationd= AnimationUtils.loadAnimation(this,R.anim.blink);
                imaged.startAnimation(animationd);
                mp = MediaPlayer.create(Y_alphabet.this, R.raw.y_yam_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isyamTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.yacht:
                ImageView imagee=(ImageView)findViewById(R.id.yacht);
                Animation animatione= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagee.startAnimation(animatione);
                mp = MediaPlayer.create(Y_alphabet.this, R.raw.y_yatch_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isyachtTapped=true;
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

        if (isyolkTapped && isyarnTapped && isyakTapped && isyamTapped && isyachtTapped ) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Y_alphabet.this, nur7_literacy.class);
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




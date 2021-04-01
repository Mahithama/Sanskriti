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

import com.example.sanskriti_2020_all.Nurseryclass.Unit6.Q_alpha;
import com.example.sanskriti_2020_all.Nurseryclass.Unit6.U_alphabet;
import com.example.sanskriti_2020_all.R;

public class V_alphabet extends AppCompatActivity implements View.OnClickListener {
    ImageView vine,volcono,vase,violin, van;
    private ViewFlipper viewFlipper;
    Button start;
    MediaPlayer mp,mp3;
    int i;
    private boolean isvineTapped=false;
    private boolean isvolconoTapped=false;
    private boolean isvaseTapped=false;
    private boolean isviolinTapped=false;
    private boolean isvanTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_alphabet);
        viewFlipper = findViewById(R.id.viewflipper);
        vine = findViewById(R.id.vine);
        volcono = findViewById(R.id.queen);
        vase = findViewById(R.id.volcono);
        violin = findViewById(R.id.violin);
        van = findViewById(R.id.van);


        vine.setOnClickListener(this);
        volcono.setOnClickListener(this);
        vase.setOnClickListener(this);
        violin.setOnClickListener(this);
        van.setOnClickListener(this);

        mp3 = MediaPlayer.create(V_alphabet.this, R.raw.v_title_alpha);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();
    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.volcono:
                ImageView imagea=(ImageView)findViewById(R.id.volcono);
                Animation animationa= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagea.startAnimation(animationa);
                mp = MediaPlayer.create(V_alphabet.this, R.raw.v_volcono_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isvolconoTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.van:
                ImageView imageb=(ImageView)findViewById(R.id.van);
                Animation animationb= AnimationUtils.loadAnimation(this,R.anim.blink);
                imageb.startAnimation(animationb);
                mp = MediaPlayer.create(V_alphabet.this, R.raw.v_van_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isvanTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.vine:
                ImageView imagec=(ImageView)findViewById(R.id.vine);
                Animation animationc= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagec.startAnimation(animationc);
                mp = MediaPlayer.create(V_alphabet.this, R.raw.v_vine_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isvineTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.violin:
                ImageView imaged=(ImageView)findViewById(R.id.violin);
                Animation animationd= AnimationUtils.loadAnimation(this,R.anim.blink);
                imaged.startAnimation(animationd);
                mp = MediaPlayer.create(V_alphabet.this, R.raw.v_violin_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isviolinTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.vase:
                ImageView imagee=(ImageView)findViewById(R.id.vase);
                Animation animatione= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagee.startAnimation(animatione);
                mp = MediaPlayer.create(V_alphabet.this, R.raw.v_vaz_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isvaseTapped=true;
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

        if (isviolinTapped && isvolconoTapped && isvineTapped && isvanTapped && isvaseTapped ) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(V_alphabet.this, nur7_literacy.class);
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




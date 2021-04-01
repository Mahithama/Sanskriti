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
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanskriti_2020_all.Nurseryclass.Unit2.A_alphabet;
import com.example.sanskriti_2020_all.R;

public class L_alphabet extends AppCompatActivity implements View.OnClickListener {
    ImageView lock,lob,lily,lime, lunch;
    MediaPlayer mp,mp3;
    int i;
    private ViewFlipper viewFlipper;
    private boolean islockTapped=false;
    private boolean islobTapped=false;
    private boolean islilyTapped=false;
    private boolean islimeTapped=false;
    private boolean islunchTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l_alphabet);
        lock = findViewById(R.id.lock);
        lob = findViewById(R.id.lob);
        lily = findViewById(R.id.lily);
        lime = findViewById(R.id.lime);
        lunch = findViewById(R.id.lunch);
        viewFlipper = findViewById(R.id.viewflipper);

        lunch.setOnClickListener(this);
        lime.setOnClickListener(this);
        lob.setOnClickListener(this);
        lily.setOnClickListener(this);
        lock.setOnClickListener(this);
        mp3 = MediaPlayer.create(L_alphabet.this, R.raw.l_title_alpha);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();

    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.lunch:
                ImageView imagea=(ImageView)findViewById(R.id.lunch);
                Animation animationa= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagea.startAnimation(animationa);
                mp = MediaPlayer.create(L_alphabet.this, R.raw.l_lunch_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                islunchTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.lime:
                ImageView imageb=(ImageView)findViewById(R.id.lime);
                Animation animationb= AnimationUtils.loadAnimation(this,R.anim.blink);
                imageb.startAnimation(animationb);
                mp = MediaPlayer.create(L_alphabet.this, R.raw.l_lime_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                islimeTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.lob:
                ImageView imagec=(ImageView)findViewById(R.id.lob);
                Animation animationc= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagec.startAnimation(animationc);
                mp = MediaPlayer.create(L_alphabet.this, R.raw.l_lobster_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                islobTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.lily:
                ImageView imaged=(ImageView)findViewById(R.id.lily);
                Animation animationd= AnimationUtils.loadAnimation(this,R.anim.blink);
                imaged.startAnimation(animationd);
                mp = MediaPlayer.create(L_alphabet.this, R.raw.l_lily_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                islilyTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.lock:
                ImageView imagee=(ImageView)findViewById(R.id.lock);
                Animation animatione= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagee.startAnimation(animatione);
                mp = MediaPlayer.create(L_alphabet.this, R.raw.l_lock_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                islockTapped=true;
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

        if (islimeTapped && islilyTapped && islockTapped && islobTapped && islunchTapped ) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(L_alphabet.this, nur5_literacy.class);
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




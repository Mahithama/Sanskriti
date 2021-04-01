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

public class U_alphabet extends AppCompatActivity implements View.OnClickListener {
    ImageView utensil,umb,uni,uniform, urn;
    Button start;
    private ViewFlipper viewFlipper;
    MediaPlayer mp,mp3;
    int i;
    private boolean isutensilTapped=false;
    private boolean isumbTapped=false;
    private boolean isuniTapped=false;
    private boolean isuniformTapped=false;
    private boolean isurnTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_alphabet);

        viewFlipper = findViewById(R.id.viewflipper);
        utensil = findViewById(R.id.utensil);
        umb = findViewById(R.id.umb);
        uni = findViewById(R.id.uni);
        uniform = findViewById(R.id.uniform);
        urn = findViewById(R.id.urn);


        utensil.setOnClickListener(this);
        umb.setOnClickListener(this);
        uni.setOnClickListener(this);
        uniform.setOnClickListener(this);
        urn.setOnClickListener(this);

        mp3 = MediaPlayer.create(U_alphabet.this, R.raw.u_title_alpha);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();
    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.urn:
                ImageView imagea=(ImageView)findViewById(R.id.urn);
                Animation animationa= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagea.startAnimation(animationa);
                mp = MediaPlayer.create(U_alphabet.this, R.raw.u_urn_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isurnTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.umb:
                ImageView imageb=(ImageView)findViewById(R.id.umb);
                Animation animationb= AnimationUtils.loadAnimation(this,R.anim.blink);
                imageb.startAnimation(animationb);
                mp = MediaPlayer.create(U_alphabet.this, R.raw.u_umbrella_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isumbTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.utensil:
                ImageView imagec=(ImageView)findViewById(R.id.utensil);
                Animation animationc= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagec.startAnimation(animationc);
                mp = MediaPlayer.create(U_alphabet.this, R.raw.u_utensil_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isutensilTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.uniform:
                ImageView imaged=(ImageView)findViewById(R.id.uniform);
                Animation animationd= AnimationUtils.loadAnimation(this,R.anim.blink);
                imaged.startAnimation(animationd);
                mp = MediaPlayer.create(U_alphabet.this, R.raw.u_uniform_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isuniformTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.uni:
                ImageView imagee=(ImageView)findViewById(R.id.uni);
                Animation animatione= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagee.startAnimation(animatione);
                mp = MediaPlayer.create(U_alphabet.this, R.raw.u_unicorn_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isuniTapped=true;
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

        if (isumbTapped && isurnTapped && isuniformTapped && isutensilTapped && isuniTapped ) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(U_alphabet.this, Unit6_nursery_literacy_home.class);
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





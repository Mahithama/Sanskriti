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

public class O_alphabet extends AppCompatActivity implements View.OnClickListener {

    ImageView onion,oct,one,owl, orange;
    MediaPlayer mp,mp3;
    int i;
    private ViewFlipper viewFlipper;
    private boolean isonionTapped=false;
    private boolean isoctTapped=false;
    private boolean isoneTapped=false;
    private boolean isowlTapped=false;
    private boolean isorangeTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_alphabet);

        onion = findViewById(R.id.onion);
        oct = findViewById(R.id.oct);
        one = findViewById(R.id.one);
        owl = findViewById(R.id.owl);
        orange = findViewById(R.id.orange);
        viewFlipper = findViewById(R.id.viewflipper);

        onion.setOnClickListener(this);
        one.setOnClickListener(this);
        oct.setOnClickListener(this);
        owl.setOnClickListener(this);
        orange.setOnClickListener(this);
        mp3 = MediaPlayer.create(O_alphabet.this, R.raw.o_title_alpha);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();

    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.onion:
                ImageView imagea=(ImageView)findViewById(R.id.onion);
                Animation animationa= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagea.startAnimation(animationa);
                mp = MediaPlayer.create(O_alphabet.this, R.raw.o_onion_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isonionTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.one:
                ImageView imageb=(ImageView)findViewById(R.id.one);
                Animation animationb= AnimationUtils.loadAnimation(this,R.anim.blink);
                imageb.startAnimation(animationb);
                mp = MediaPlayer.create(O_alphabet.this, R.raw.o_one_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isoneTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.owl:
                ImageView imagec=(ImageView)findViewById(R.id.owl);
                Animation animationc= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagec.startAnimation(animationc);
                mp = MediaPlayer.create(O_alphabet.this, R.raw.o_owl_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isowlTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.orange:
                ImageView imaged=(ImageView)findViewById(R.id.orange);
                Animation animationd= AnimationUtils.loadAnimation(this,R.anim.blink);
                imaged.startAnimation(animationd);
                mp = MediaPlayer.create(O_alphabet.this, R.raw.o_orange_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isorangeTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.oct:
                ImageView imagee=(ImageView)findViewById(R.id.oct);
                Animation animatione= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagee.startAnimation(animatione);
                mp = MediaPlayer.create(O_alphabet.this, R.raw.o_octopus_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isoctTapped=true;
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

        if (isoctTapped && isonionTapped && isorangeTapped && isowlTapped && isoneTapped ) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(O_alphabet.this, nur5_literacy.class);
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




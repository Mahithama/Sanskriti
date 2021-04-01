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

public class Z_alphabet extends AppCompatActivity implements View.OnClickListener  {
    ImageView zero,zig,zoo,zip, zebra;
    Button start;
    private ViewFlipper viewFlipper;
    MediaPlayer mp,mp3;
    int i;
    private boolean iszeroTapped=false;
    private boolean iszigTapped=false;
    private boolean iszooTapped=false;
    private boolean iszipTapped=false;
    private boolean iszebraTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_z_alphabet);
        zero = findViewById(R.id.zero);
        zig = findViewById(R.id.zig);
        zoo = findViewById(R.id.zoo);
        zip = findViewById(R.id.zip);
        zebra = findViewById(R.id.zebra);
        viewFlipper = findViewById(R.id.viewflipper);

        zero.setOnClickListener(this);
        zig.setOnClickListener(this);
        zoo.setOnClickListener(this);
        zip.setOnClickListener(this);
        zebra.setOnClickListener(this);

        mp3 = MediaPlayer.create(Z_alphabet.this, R.raw.z_title_alpha);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();
    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.zero:
                ImageView imagea=(ImageView)findViewById(R.id.zero);
                Animation animationa= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagea.startAnimation(animationa);
                mp = MediaPlayer.create(Z_alphabet.this, R.raw.z_zero_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iszeroTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.zoo:
                ImageView imageb=(ImageView)findViewById(R.id.zoo);
                Animation animationb= AnimationUtils.loadAnimation(this,R.anim.blink);
                imageb.startAnimation(animationb);
                mp = MediaPlayer.create(Z_alphabet.this, R.raw.z_zoo_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iszooTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.zip:
                ImageView imagec=(ImageView)findViewById(R.id.zip);
                Animation animationc= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagec.startAnimation(animationc);
                mp = MediaPlayer.create(Z_alphabet.this, R.raw.z_zip_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iszipTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.zebra:
                ImageView imaged=(ImageView)findViewById(R.id.zebra);
                Animation animationd= AnimationUtils.loadAnimation(this,R.anim.blink);
                imaged.startAnimation(animationd);
                mp = MediaPlayer.create(Z_alphabet.this, R.raw.z_zebra_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iszebraTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.zig:
                ImageView imagee=(ImageView)findViewById(R.id.zig);
                Animation animatione= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagee.startAnimation(animatione);
                mp = MediaPlayer.create(Z_alphabet.this, R.raw.z_zigzag_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iszigTapped=true;
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

        if (iszigTapped && iszeroTapped && iszooTapped && iszebraTapped && iszipTapped ) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Z_alphabet.this, Unit6_nursery_literacy_home.class);
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




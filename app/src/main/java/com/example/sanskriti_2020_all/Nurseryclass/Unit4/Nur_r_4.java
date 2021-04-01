package com.example.sanskriti_2020_all.Nurseryclass.Unit4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.sanskriti_2020_all.R;

import pl.droidsonroids.gif.GifImageView;

public class Nur_r_4 extends AppCompatActivity implements View.OnClickListener {
    ImageView ring,rabbit,rocket,robo,rainbow;
    private ViewFlipper viewFlipper;
    GifImageView goodjob;
    MediaPlayer mp,mp3;
    int i;
    private boolean isringTapped=false;
    private boolean israbbitTapped=false;
    private boolean isrocketTapped=false;
    private boolean isroboTapped=false;
    private boolean israinbowTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nur_r_4);
        ring = findViewById(R.id.ring);
        rabbit = findViewById(R.id.rabbit);
        rocket = findViewById(R.id.rocket);
        robo = findViewById(R.id.robo);
        rainbow = findViewById(R.id.rainbow);
        viewFlipper = findViewById(R.id.viewflipper);


        ring.setOnClickListener(this);
        rabbit.setOnClickListener(this);
        rocket.setOnClickListener(this);
        robo.setOnClickListener(this);
        rainbow.setOnClickListener(this);

        mp3 = MediaPlayer.create(Nur_r_4.this, R.raw.r_title_alpha);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();
    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.ring:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Nur_r_4.this, R.raw.r_ring_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isringTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.rabbit:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Nur_r_4.this, R.raw.r_rabbit_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                israbbitTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.rocket:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Nur_r_4.this, R.raw.r_rocket_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isrocketTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.robo:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Nur_r_4.this, R.raw.r_robo_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isroboTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.rainbow:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Nur_r_4.this, R.raw.r_rainbow_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                israinbowTapped=true;
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

        if (isrocketTapped && israinbowTapped && israbbitTapped && isroboTapped && isringTapped) {

            goodjob.setVisibility(View.VISIBLE);
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Nur_r_4.this, nur4_literacy.class);
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

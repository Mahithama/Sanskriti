package com.example.sanskriti_2020_all.Nurseryclass.Unit5;

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

public class B_alphabet extends AppCompatActivity implements View.OnClickListener {
    ImageView bicycle,bird,bee,bus, bag;
    private ViewFlipper viewFlipper;
    Button start;
    MediaPlayer mp,mp3;
    int i;
    private boolean isbicycleTapped=false;
    private boolean isbirdTapped=false;
    private boolean isbeeTapped=false;
    private boolean isbusTapped=false;
    private boolean isbagTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_alphabet);

        viewFlipper = findViewById(R.id.viewflipper);
        bicycle = findViewById(R.id.bicycle);
        bird = findViewById(R.id.bird);
        bee = findViewById(R.id.bee);
        bus = findViewById(R.id.bus);
        bag = findViewById(R.id.bag);


        bicycle.setOnClickListener(this);
        bird.setOnClickListener(this);
        bee.setOnClickListener(this);
        bus.setOnClickListener(this);
        bag.setOnClickListener(this);

        mp3 = MediaPlayer.create(B_alphabet.this, R.raw.b_title_alpha);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();
    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.bicycle:
                ImageView imagea=(ImageView)findViewById(R.id.bicycle);
                Animation animationa= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagea.startAnimation(animationa);
                mp = MediaPlayer.create(B_alphabet.this, R.raw.b_bicycle_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isbicycleTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.bird:
                ImageView imageb=(ImageView)findViewById(R.id.bird);
                Animation animationb= AnimationUtils.loadAnimation(this,R.anim.blink);
                imageb.startAnimation(animationb);
                mp = MediaPlayer.create(B_alphabet.this, R.raw.b_bird_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isbirdTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.bee:
                ImageView imagec=(ImageView)findViewById(R.id.bee);
                Animation animationc= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagec.startAnimation(animationc);
                mp = MediaPlayer.create(B_alphabet.this, R.raw.b_bee_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isbeeTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.bus:
                ImageView imaged=(ImageView)findViewById(R.id.bus);
                Animation animationd= AnimationUtils.loadAnimation(this,R.anim.blink);
                imaged.startAnimation(animationd);
                mp = MediaPlayer.create(B_alphabet.this, R.raw.b_bus_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isbusTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.bag:
                ImageView imagee=(ImageView)findViewById(R.id.bag);
                Animation animatione= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagee.startAnimation(animatione);
                mp = MediaPlayer.create(B_alphabet.this, R.raw.b_bag_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isbagTapped=true;
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

        if (isbeeTapped && isbusTapped && isbagTapped && isbirdTapped && isbicycleTapped ) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(B_alphabet.this, nur5_literacy.class);
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




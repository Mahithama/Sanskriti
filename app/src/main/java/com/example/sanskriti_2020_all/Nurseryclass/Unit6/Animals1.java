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

import androidx.appcompat.app.AppCompatActivity;
import com.example.sanskriti_2020_all.Nurseryclass.Unit6.Animals1;
import com.example.sanskriti_2020_all.R;

public class Animals1 extends AppCompatActivity implements View.OnClickListener  {
    ImageView elephant,tiger,lion,monkey;
    Button start;
    MediaPlayer mp,mp3;
    int i;
    private boolean iselephantTapped=false;
    private boolean istigerTapped=false;
    private boolean islionTapped=false;
    private boolean ismonkeyTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals1);

        elephant = findViewById(R.id.elephant);
        tiger = findViewById(R.id.tiger);
        lion = findViewById(R.id.lion);
        monkey = findViewById(R.id.monkey);

        elephant.setOnClickListener(this);
        tiger.setOnClickListener(this);
        lion.setOnClickListener(this);
        monkey.setOnClickListener(this);


        mp3 = MediaPlayer.create(Animals1.this, R.raw.spot_diff);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();
    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.tiger:
                ImageView imagea=(ImageView)findViewById(R.id.tiger);
                Animation animationa= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagea.startAnimation(animationa);
                mp = MediaPlayer.create(Animals1.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                istigerTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.lion:
                ImageView imageb=(ImageView)findViewById(R.id.lion);
                Animation animationb= AnimationUtils.loadAnimation(this,R.anim.blink);
                imageb.startAnimation(animationb);
                mp = MediaPlayer.create(Animals1.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                islionTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.elephant:
                ImageView imagec=(ImageView)findViewById(R.id.elephant);
                Animation animationc= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagec.startAnimation(animationc);
                mp = MediaPlayer.create(Animals1.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iselephantTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.monkey:
                ImageView imaged=(ImageView)findViewById(R.id.monkey);
                Animation animationd= AnimationUtils.loadAnimation(this,R.anim.blink);
                imaged.startAnimation(animationd);
                mp = MediaPlayer.create(Animals1.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ismonkeyTapped=true;
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

        if (iselephantTapped && istigerTapped && islionTapped && ismonkeyTapped ) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Animals1.this, nur6_themes_activities_home.class);
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




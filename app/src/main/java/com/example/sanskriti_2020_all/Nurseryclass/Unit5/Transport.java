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
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanskriti_2020_all.R;

public class Transport extends AppCompatActivity implements View.OnClickListener  {
ImageView airo,scooter,cycle,car;
TextView t_airo,t_scooter,t_cycle,t_car;

    MediaPlayer mp,mp3;
    int i;
    private boolean isairoTapped=false;
    private boolean isscooterTapped=false;
    private boolean iscycleTapped=false;
    private boolean iscarTapped=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport);

        airo = findViewById(R.id.airo);
        scooter = findViewById(R.id.scooter);
        cycle = findViewById(R.id.cycle);
        car = findViewById(R.id.car);

        t_airo = findViewById(R.id.t_airo);
        t_scooter = findViewById(R.id.t_scooter);
        t_cycle = findViewById(R.id.t_cycle);
        t_car = findViewById(R.id.t_car);

        airo.setOnClickListener(this);
        scooter.setOnClickListener(this);
        cycle.setOnClickListener(this);
        car.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.airo:
                ImageView imagea=(ImageView)findViewById(R.id.airo);
                Animation animationa= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagea.startAnimation(animationa);
                t_airo.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Transport.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isairoTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.scooter:
                ImageView imageb=(ImageView)findViewById(R.id.scooter);
                Animation animationb= AnimationUtils.loadAnimation(this,R.anim.blink);
                imageb.startAnimation(animationb);
                t_scooter.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Transport.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isscooterTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.cycle:
                ImageView imagec=(ImageView)findViewById(R.id.cycle);
                Animation animationc= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagec.startAnimation(animationc);
                t_cycle.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Transport.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iscycleTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.car:
                ImageView imaged=(ImageView)findViewById(R.id.car);
                Animation animationd= AnimationUtils.loadAnimation(this,R.anim.blink);
                imaged.startAnimation(animationd);
                t_car.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Transport.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iscarTapped=true;
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

        if (iscarTapped && isairoTapped && iscycleTapped && isscooterTapped ) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Transport.this, nur5_themes_activities_home.class);
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

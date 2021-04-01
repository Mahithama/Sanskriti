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

public class Fruit_slices extends AppCompatActivity implements View.OnClickListener {
ImageView or7,be7,ki7,wa7,pi7,le7,po7;
    private ViewFlipper viewFlipper;
    Button start;
    MediaPlayer mp,mp3;
    int i;
    private boolean isor7Tapped=false;
    private boolean isbe7Tapped=false;
    private boolean iski7Tapped=false;
    private boolean iswa7Tapped=false;
    private boolean ispi7Tapped=false;
    private boolean isle7Tapped=false;
    private boolean ispo7Tapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_slices);
        or7 = findViewById(R.id.or7);
        be7 = findViewById(R.id.be7);
        ki7 = findViewById(R.id.ki7);
        wa7 = findViewById(R.id.wa7);
        pi7 = findViewById(R.id.pi7);
        le7 = findViewById(R.id.le7);
        po7 = findViewById(R.id.po7);


        or7.setOnClickListener(this);
        be7.setOnClickListener(this);
        ki7.setOnClickListener(this);
        wa7.setOnClickListener(this);
        pi7.setOnClickListener(this);
        le7.setOnClickListener(this);
        po7.setOnClickListener(this);

        mp3 = MediaPlayer.create(Fruit_slices.this, R.raw.spot_diff);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();
    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.or7:
                or7.setImageResource(R.drawable.orange7a);
                mp = MediaPlayer.create(Fruit_slices.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isor7Tapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.ki7:
                ki7.setImageResource(R.drawable.kiwi7b);
                mp = MediaPlayer.create(Fruit_slices.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iski7Tapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.po7:
                po7.setImageResource(R.drawable.pom7a);
                mp = MediaPlayer.create(Fruit_slices.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ispo7Tapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.le7:
                le7.setImageResource(R.drawable.lemon7a);
                mp = MediaPlayer.create(Fruit_slices.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isle7Tapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.wa7:
                wa7.setImageResource(R.drawable.melon7a);
                mp = MediaPlayer.create(Fruit_slices.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iswa7Tapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.pi7:
                pi7.setImageResource(R.drawable.pine7a);
                mp = MediaPlayer.create(Fruit_slices.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ispi7Tapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.be7:
                be7.setImageResource(R.drawable.berry7a);
                mp = MediaPlayer.create(Fruit_slices.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isbe7Tapped=true;
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

        if (isor7Tapped && iski7Tapped && ispi7Tapped && isbe7Tapped && iswa7Tapped && isle7Tapped && ispo7Tapped ) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Fruit_slices.this, nur7_themes_activities_home.class);
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




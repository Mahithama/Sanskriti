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

public class Nur_m_4 extends AppCompatActivity implements View.OnClickListener {
    ImageView muffin,motor,monkey,mushroom,mittens;
    private ViewFlipper viewFlipper;
    MediaPlayer mp,mp3;
    int i;
    private boolean ismuffinTapped=false;
    private boolean ismotorTapped=false;
    private boolean ismonkeyTapped=false;
    private boolean ismushroomTapped=false;
    private boolean ismittensTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nur_m_4);
        muffin = findViewById(R.id.muffin);
        motor = findViewById(R.id.motor);
        monkey = findViewById(R.id.monkey);
        mushroom = findViewById(R.id.mushroom);
        mittens = findViewById(R.id.mittens);
        viewFlipper = findViewById(R.id.viewflipper);


        muffin.setOnClickListener(this);
        motor.setOnClickListener(this);
        monkey.setOnClickListener(this);
        mushroom.setOnClickListener(this);
        mittens.setOnClickListener(this);

        mp3 = MediaPlayer.create(Nur_m_4.this, R.raw.m_title_alpha);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();
    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.muffin:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Nur_m_4.this, R.raw.m_muffin_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ismuffinTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.motor:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Nur_m_4.this, R.raw.m_motorcycle_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ismotorTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.monkey:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Nur_m_4.this, R.raw.m_monkey_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ismonkeyTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.mushroom:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Nur_m_4.this, R.raw.m_mushroom_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ismushroomTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.mittens:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Nur_m_4.this, R.raw.m_mittens_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ismittensTapped=true;
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

        if (ismuffinTapped && ismushroomTapped && ismonkeyTapped && ismittensTapped && ismotorTapped) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Nur_m_4.this, nur4_literacy.class);
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

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

import com.example.sanskriti_2020_all.Nurseryclass.Unit5.B_alphabet;
import com.example.sanskriti_2020_all.R;

import pl.droidsonroids.gif.GifImageView;

public class Nur_d_4 extends AppCompatActivity implements View.OnClickListener {
    ImageView dog,dino,fly,donut,dolphin;
    private ViewFlipper viewFlipper;
    MediaPlayer mp,mp3;
    int i;
    private boolean isdogTapped=false;
    private boolean isdinoTapped=false;
    private boolean isflyTapped=false;
    private boolean isdonutTapped=false;
    private boolean isdolphinTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nur_d_4);

        viewFlipper = findViewById(R.id.viewflipper);
        dog = findViewById(R.id.dog);
        dino = findViewById(R.id.dino);
        fly = findViewById(R.id.fly);
        donut = findViewById(R.id.donut);
        dolphin = findViewById(R.id.dolphin);


        dog.setOnClickListener(this);
        dino.setOnClickListener(this);
        fly.setOnClickListener(this);
        donut.setOnClickListener(this);
        dolphin.setOnClickListener(this);

        mp3 = MediaPlayer.create(Nur_d_4.this, R.raw.d_title_alpha);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();

    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.dog:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Nur_d_4.this, R.raw.d_dog_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isdogTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.dino:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Nur_d_4.this, R.raw.d_dino_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isdinoTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.fly:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Nur_d_4.this, R.raw.d_dragaonfly_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isflyTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.donut:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Nur_d_4.this, R.raw.d_donut_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isdonutTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.dolphin:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Nur_d_4.this, R.raw.d_dolphin_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isdolphinTapped=true;
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

        if (isdogTapped && isdonutTapped && isdolphinTapped && isflyTapped && isdinoTapped) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Nur_d_4.this, nur4_literacy.class);
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

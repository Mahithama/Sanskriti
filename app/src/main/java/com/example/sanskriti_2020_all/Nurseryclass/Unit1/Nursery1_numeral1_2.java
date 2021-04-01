package com.example.sanskriti_2020_all.Nurseryclass.Unit1;

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

import com.example.sanskriti_2020_all.R;

public class Nursery1_numeral1_2 extends AppCompatActivity implements View.OnClickListener {
    ImageView blue,orange,green,blue_c,cookie1,cookie2,cookie3,jar_c,bluee,jar;
    private ViewFlipper viewFlipper;
    int i;
    MediaPlayer mp,mp3;
    private boolean isblueTapped=false;
    private boolean iscookie1Tapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nursery1_numeral1_2);

        viewFlipper = findViewById(R.id.viewflipper);
        blue = findViewById(R.id.blue);
        green = findViewById(R.id.green);
        orange = findViewById(R.id.orange);
        cookie2 = findViewById(R.id.cookie2);
        cookie3 = findViewById(R.id.cookie3);
        cookie1 = findViewById(R.id.cookie1);
        blue_c = findViewById(R.id.blue_c);
        jar_c = findViewById(R.id.jar_c);
        bluee = findViewById(R.id.bluee);
        jar = findViewById(R.id.jar);





        mp3 = MediaPlayer.create(Nursery1_numeral1_2.this, R.raw.numeral_title);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();





        blue.setOnClickListener(this);
        green.setOnClickListener(this);
        orange.setOnClickListener(this);
        cookie2.setOnClickListener(this);
        cookie3.setOnClickListener(this);
        cookie1.setOnClickListener(this);
        blue_c.setOnClickListener(this);
        jar_c.setOnClickListener(this);
        bluee.setOnClickListener(this);
        jar.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        // Find which ImageButton was pressed and take appropriate action
        //    if (mp != null) mp.release();
        if(mp != null){
            if(mp.isPlaying()){
                mp.stop();
            }
            mp.release();
        }
        switch (v.getId()) {


            case R.id.blue:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView image = (ImageView) findViewById(R.id.blue_c);
                Animation animation = AnimationUtils.loadAnimation(this, R.anim.blink);
                image.startAnimation(animation);
                mp = MediaPlayer.create(Nursery1_numeral1_2.this, R.raw.success);
                bluee.setVisibility(View.INVISIBLE);
                blue_c.setVisibility(View.VISIBLE);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                this.i++;
                isblueTapped=true;
                nextScreen(this.i);
                break;

            case R.id.cookie1:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView imagee = (ImageView) findViewById(R.id.jar_c);
                Animation animationn = AnimationUtils.loadAnimation(this, R.anim.zoom_in);
                imagee.startAnimation(animationn);
                jar.setVisibility(View.INVISIBLE);
                jar_c.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_numeral1_2.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                this.i++;
                iscookie1Tapped=true;
                nextScreen(this.i);
                break;

            case R.id.orange:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);

                mp = MediaPlayer.create(Nursery1_numeral1_2.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.green:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Nursery1_numeral1_2.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.cookie2:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Nursery1_numeral1_2.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.cookie3:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Nursery1_numeral1_2.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
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

        if (isblueTapped && iscookie1Tapped) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Nursery1_numeral1_2.this, Nursery1_numeral1_2_2.class);
                    act.putExtra("activity_name", activity_name);
                    startActivity(act);


                }
            }, 3000);


        }
    }
    public void onBackPressed() {
        return;
    }

    public void nextView(View v) {
        viewFlipper.showNext();
        mp = MediaPlayer.create(Nursery1_numeral1_2.this, R.raw.tap_onn_blue);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.setLooping(false);
        mp.start();
        if(mp3 != null && mp3.isPlaying()){
            mp3.stop();

        }

    }
}




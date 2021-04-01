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

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanskriti_2020_all.R;

public class Nursery1_numeral1_2_2 extends AppCompatActivity implements View.OnClickListener {
    ImageView blue,orange,green,orange_c,cookie1,cookie22,cookie3,cookie2_c,orangee,jar2;

    int i;
    MediaPlayer mp,mp3;


    private boolean isorangeTapped=false;
    private boolean iscookie22Tapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nursery1_numeral1_2_2);
        blue = findViewById(R.id.blue);
        green = findViewById(R.id.green);
        orange = findViewById(R.id.orange);
        cookie22 = findViewById(R.id.cookie22);
        cookie3 = findViewById(R.id.cookie3);
        cookie1 = findViewById(R.id.cookie1);
        orange_c = findViewById(R.id.orange_c);
        cookie2_c = findViewById(R.id.cookie2_c);
        orangee = findViewById(R.id.orangee);
        jar2 = findViewById(R.id.jar2);





      /*  failure = MediaPlayer.create(Numeral_two.this, R.raw.failure);
        success = MediaPlayer.create(Numeral_two.this, R.raw.success);
        two = MediaPlayer.create(Numeral_two.this, R.raw.two);  */

        mp3 = MediaPlayer.create(Nursery1_numeral1_2_2.this, R.raw.tap_onn_orange);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();



        blue.setOnClickListener(this);
        green.setOnClickListener(this);
        orange.setOnClickListener(this);
        cookie22.setOnClickListener(this);
        cookie3.setOnClickListener(this);
        cookie1.setOnClickListener(this);
        orange_c.setOnClickListener(this);
        cookie2_c.setOnClickListener(this);
        orangee.setOnClickListener(this);
        jar2.setOnClickListener(this);


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


            case R.id.orange:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView image = (ImageView) findViewById(R.id.orange_c);
                Animation animation = AnimationUtils.loadAnimation(this, R.anim.blink);
                image.startAnimation(animation);
                mp = MediaPlayer.create(Nursery1_numeral1_2_2.this, R.raw.success);
                orangee.setVisibility(View.INVISIBLE);
                orange_c.setVisibility(View.VISIBLE);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                this.i++;
                isorangeTapped=true;
                nextScreen(this.i);
                break;

            case R.id.cookie22:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView imagee = (ImageView) findViewById(R.id.cookie2_c);
                Animation animationn = AnimationUtils.loadAnimation(this, R.anim.zoom_in);
                imagee.startAnimation(animationn);
                jar2.setVisibility(View.INVISIBLE);
                cookie2_c.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_numeral1_2_2.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                this.i++;
                iscookie22Tapped=true;
                nextScreen(this.i);
                break;

            case R.id.blue:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);

                mp = MediaPlayer.create(Nursery1_numeral1_2_2.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.green:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Nursery1_numeral1_2_2.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.cookie1:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Nursery1_numeral1_2_2.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.cookie3:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Nursery1_numeral1_2_2.this, R.raw.failure);
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

        if (isorangeTapped && iscookie22Tapped) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Nursery1_numeral1_2_2.this, Nursery_numeracy1n_home.class);
                    act.putExtra("activity_name", activity_name);
                    startActivity(act);


                }
            }, 2000);


        }
    }
    public void onBackPressed() {
        return;
    }
}




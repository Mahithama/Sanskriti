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

public class Nursery1_Quantity extends AppCompatActivity implements View.OnClickListener {
    ImageView q_one,q_onee,q_oneee,q_two,q_three,q_threee;
    MediaPlayer mp,mp3;
    int i;
    private ViewFlipper viewFlipper;
    private boolean isq_oneTapped=false;
    private boolean isq_oneeTapped=false;
    private boolean isq_oneeeTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nursery1__quantity);

        viewFlipper = findViewById(R.id.viewflipper);
        q_one= findViewById(R.id.q_one);
        q_onee= findViewById(R.id.q_onee);
        q_oneee= findViewById(R.id.q_oneee);
        q_two= findViewById(R.id.q_two);
        q_three= findViewById(R.id.q_three);
        q_threee= findViewById(R.id.q_threee);

        q_one.setOnClickListener(this);
        q_onee.setOnClickListener(this);
        q_oneee.setOnClickListener(this);
        q_two.setOnClickListener(this);
        q_three.setOnClickListener(this);
        q_threee.setOnClickListener(this);

        mp3 = MediaPlayer.create(Nursery1_Quantity.this, R.raw.quantity_one_title);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();
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


            case R.id.q_one:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView image = (ImageView) findViewById(R.id.frame_one);
                Animation animation = AnimationUtils.loadAnimation(this, R.anim.blink);
                image.startAnimation(animation);
                mp = MediaPlayer.create(Nursery1_Quantity.this, R.raw.success);
                q_one.setVisibility(View.VISIBLE);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                this.i++;
                isq_oneTapped=true;
                nextScreen(this.i);
                break;

            case R.id.q_onee:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView imagee = (ImageView) findViewById(R.id.frame_four);
                Animation animationn = AnimationUtils.loadAnimation(this, R.anim.blink);
                imagee.startAnimation(animationn);
                q_onee.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_Quantity.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                this.i++;
                isq_oneeTapped=true;
                nextScreen(this.i);
                break;

            case R.id.q_oneee:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView iimage = (ImageView) findViewById(R.id.frame_six);
                Animation aanimation = AnimationUtils.loadAnimation(this, R.anim.blink);
                iimage.startAnimation(aanimation);
                q_oneee.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_Quantity.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                this.i++;
                isq_oneeeTapped=true;
                nextScreen(this.i);
                break;

            case R.id.q_two:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                q_two.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_Quantity.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.q_three:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                q_three.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_Quantity.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.q_threee:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                q_threee.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_Quantity.this, R.raw.failure);
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

        if (isq_oneTapped && isq_oneeTapped && isq_oneeeTapped) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Nursery1_Quantity.this, Nursery_numeracy1n_home.class);
                    act.putExtra("activity_name", activity_name);
                    startActivity(act);


                }
            }, 1000);


        }
    }
    public void onBackPressed() {
        return;
    }

    public void nextView(View v) {
        viewFlipper.showNext();
        if(mp3 != null && mp3.isPlaying()){
            mp3.stop();
        }

    }
}



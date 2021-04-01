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

public class Nursery_Spot_cover extends AppCompatActivity implements View.OnClickListener {
    ImageView cloud,cloudd,tri,trii,cap,capp,grass,grasss;
    MediaPlayer mp,mp3;
    private ViewFlipper viewFlipper;
    int i;

    private boolean iscloudTapped=false;
    private boolean iscapTapped=false;
    private boolean isgrassTapped=false;
    private boolean istriTapped=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nursery__spot_cover);

        viewFlipper = findViewById(R.id.viewflipper);
        cloud = findViewById(R.id.cloud);
        tri = findViewById(R.id.tri);
        cap = findViewById(R.id.cap);
        grass = findViewById(R.id.grass);
        cloudd = findViewById(R.id.cloudd);
        trii = findViewById(R.id.trii);
        capp = findViewById(R.id.capp);
        grasss = findViewById(R.id.grasss);

        cloud.setOnClickListener(this);
        tri.setOnClickListener(this);
        cap.setOnClickListener(this);
        grass.setOnClickListener(this);
        cloudd.setOnClickListener(this);
        trii.setOnClickListener(this);
        capp.setOnClickListener(this);
        grasss.setOnClickListener(this);

        mp3 = MediaPlayer.create(Nursery_Spot_cover.this, R.raw.spot_diff);
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


            case R.id.cloud:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView image = (ImageView) findViewById(R.id.cloudd);
                Animation animation = AnimationUtils.loadAnimation(this, R.anim.blink);
                image.startAnimation(animation);
                mp = MediaPlayer.create(Nursery_Spot_cover.this, R.raw.success);
                cloudd.setVisibility(View.VISIBLE);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                iscloudTapped=true;
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.tri:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView imagee = (ImageView) findViewById(R.id.trii);
                Animation animationn = AnimationUtils.loadAnimation(this, R.anim.blink);
                imagee.startAnimation(animationn);
                trii.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery_Spot_cover.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                this.i++;
                istriTapped=true;
                nextScreen(this.i);
                break;

            case R.id.cap:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView iimage = (ImageView) findViewById(R.id.capp);
                Animation aanimation = AnimationUtils.loadAnimation(this, R.anim.blink);
                iimage.startAnimation(aanimation);
                capp.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery_Spot_cover.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                this.i++;
                iscapTapped=true;
                nextScreen(this.i);
                break;

            case R.id.grass:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView iiimage = (ImageView) findViewById(R.id.grasss);
                Animation aaanimation = AnimationUtils.loadAnimation(this, R.anim.blink);
                iiimage.startAnimation(aaanimation);
                grasss.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery_Spot_cover.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                this.i++;
                isgrassTapped=true;
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
        // if (mp != null) mp.release();

    }


    public void nextScreen(int i) {


        if (iscloudTapped && iscapTapped && isgrassTapped && istriTapped) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Nursery_Spot_cover.this, Nursery_activitiess_home.class);
                    act.putExtra("activity_name", activity_name);
                    startActivity(act);


                }
            }, 4000);


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




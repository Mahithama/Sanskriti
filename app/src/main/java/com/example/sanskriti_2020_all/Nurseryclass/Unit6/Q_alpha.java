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
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanskriti_2020_all.R;

public class Q_alpha extends AppCompatActivity implements View.OnClickListener {
    ImageView qtip,queen,quill,quince, question;
    private ViewFlipper viewFlipper;
    Button start;
    MediaPlayer mp,mp3;
    int i;
    private boolean isqtipTapped=false;
    private boolean isqueenTapped=false;
    private boolean isquillTapped=false;
    private boolean isquinceTapped=false;
    private boolean isquestionTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_alpha);

        viewFlipper = findViewById(R.id.viewflipper);
        qtip = findViewById(R.id.qtip);
        queen = findViewById(R.id.queen);
        quill = findViewById(R.id.quill);
        quince = findViewById(R.id.quince);
        question = findViewById(R.id.question);


        qtip.setOnClickListener(this);
        queen.setOnClickListener(this);
        quill.setOnClickListener(this);
        quince.setOnClickListener(this);
        question.setOnClickListener(this);

        mp3 = MediaPlayer.create(Q_alpha.this, R.raw.q_title_alpha);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();
    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.queen:
                ImageView imagea=(ImageView)findViewById(R.id.queen);
                Animation animationa= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagea.startAnimation(animationa);
                mp = MediaPlayer.create(Q_alpha.this, R.raw.q_queen_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isqueenTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.quill:
                ImageView imageb=(ImageView)findViewById(R.id.quill);
                Animation animationb= AnimationUtils.loadAnimation(this,R.anim.blink);
                imageb.startAnimation(animationb);
                mp = MediaPlayer.create(Q_alpha.this, R.raw.q_quill_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isquillTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.quince:
                ImageView imagec=(ImageView)findViewById(R.id.quince);
                Animation animationc= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagec.startAnimation(animationc);
                mp = MediaPlayer.create(Q_alpha.this, R.raw.q_quince_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isquinceTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.qtip:
                ImageView imaged=(ImageView)findViewById(R.id.qtip);
                Animation animationd= AnimationUtils.loadAnimation(this,R.anim.blink);
                imaged.startAnimation(animationd);
                mp = MediaPlayer.create(Q_alpha.this, R.raw.q_qtip_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isqtipTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.question:
                ImageView imagee=(ImageView)findViewById(R.id.question);
                Animation animatione= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagee.startAnimation(animatione);
                mp = MediaPlayer.create(Q_alpha.this, R.raw.q_queastion_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isquestionTapped=true;
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

        if (isqtipTapped && isquinceTapped && isquillTapped && isqueenTapped && isquestionTapped ) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Q_alpha.this, Unit6_nursery_literacy_home.class);
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




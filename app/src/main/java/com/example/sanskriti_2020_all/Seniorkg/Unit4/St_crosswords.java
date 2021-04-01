package com.example.sanskriti_2020_all.Seniorkg.Unit4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.sanskriti_2020_all.R;

public class St_crosswords extends AppCompatActivity implements View.OnClickListener  {
    TextView stage, stop, stud, stem, study, pig,  b, c, d, e, f, h, i1, j;
    int i;
    MediaPlayer mp,mp3;

    private boolean isstageTapped=false;
    private boolean isstopTapped=false;
    private boolean isstudTapped=false;
    private boolean isstemTapped=false;
    private boolean isstudyTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st_crosswords);
        stage = findViewById(R.id.stage);
        pig = findViewById(R.id.pig);
        stop = findViewById(R.id.stop);
        stud = findViewById(R.id.stud);
        stem = findViewById(R.id.stem);
        study = findViewById(R.id.study);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);
        d = findViewById(R.id.d);
        e = findViewById(R.id.e);
        f = findViewById(R.id.f);
        h = findViewById(R.id.h);
        i1 = findViewById(R.id.i1);
        j = findViewById(R.id.j);



        stage.setOnClickListener(this);
        pig.setOnClickListener(this);
        stud.setOnClickListener(this);
        study.setOnClickListener(this);
        stem.setOnClickListener(this);
        stop.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        h.setOnClickListener(this);
        i1.setOnClickListener(this);
        j.setOnClickListener(this);





    }
    @Override
    public void onClick(View v) {


        if(mp != null){
            if(mp.isPlaying()){
                mp.stop();
            }
            mp.release();
        }

        switch (v.getId()) {


            case R.id.stage:
                stage.setTextColor(Color.parseColor("#c061f1"));
                TextView image = (TextView) findViewById(R.id.stage);
                Animation animation = AnimationUtils.loadAnimation(this, R.anim.blink);
                image.startAnimation(animation);
                mp = MediaPlayer.create(St_crosswords.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                isstageTapped=true;
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;


            case R.id.stem:
                stem.setTextColor(Color.parseColor("#f56915"));
                TextView mouthh = (TextView) findViewById(R.id.stem);
                Animation animation_mouth = AnimationUtils.loadAnimation(this, R.anim.blink);
                mouthh.startAnimation(animation_mouth);
                mp = MediaPlayer.create(St_crosswords.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                isstemTapped=true;
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.stud:
                stud.setTextColor(Color.parseColor("#03ffa9"));
                TextView nosee = (TextView) findViewById(R.id.stud);
                Animation animation_nose = AnimationUtils.loadAnimation(this, R.anim.blink);
                nosee.startAnimation(animation_nose);
                mp = MediaPlayer.create(St_crosswords.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                isstudTapped=true;
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.stop:
                stop.setTextColor(Color.parseColor("#152ff5"));
                TextView headd = (TextView) findViewById(R.id.stop);
                Animation animation_head = AnimationUtils.loadAnimation(this, R.anim.blink);
                headd.startAnimation(animation_head);
                mp = MediaPlayer.create(St_crosswords.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                isstopTapped=true;
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.study:
                study.setTextColor(Color.parseColor("#16cddd"));
                TextView earss = (TextView) findViewById(R.id.study);
                Animation animation_ear = AnimationUtils.loadAnimation(this, R.anim.blink);
                earss.startAnimation(animation_ear);
                mp = MediaPlayer.create(St_crosswords.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                isstudyTapped=true;
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.pig:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                pig.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(St_crosswords.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;
            case R.id.b:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                b.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(St_crosswords.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;
            case R.id.c:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                c.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(St_crosswords.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;
            case R.id.d:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                d.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(St_crosswords.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;
            case R.id.e:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                e.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(St_crosswords.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;
            case R.id.f:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                f.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(St_crosswords.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;
            case R.id.h:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                h.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(St_crosswords.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;
            case R.id.i1:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                i1.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(St_crosswords.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;
            case R.id.j:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                j.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(St_crosswords.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;


        }

        mp.seekTo(0);
        mp.start();


    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }

    @Override
    public void onPause() {
        super.onPause();
        // Release the MediaPlayer if going into background if it isn't null
        if (mp != null) mp.release();

    }


    public void nextScreen(int i) {

        if (isstageTapped && isstudTapped && isstemTapped && isstudyTapped && isstopTapped) {
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {


                            String activity_name = "Match The Words Activity";
                            Intent act = new Intent(St_crosswords.this, Sn4_literacy.class);
                            act.putExtra("activity_name", activity_name);
                            startActivity(act);


                        }
                    }, 4000);

                }
            }, 5000);
        }
    }

}




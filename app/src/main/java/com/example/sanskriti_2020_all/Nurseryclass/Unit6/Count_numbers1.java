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
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanskriti_2020_all.R;
import com.example.sanskriti_2020_all.Juniorclass.unit6.Short_a_sounds;

public class Count_numbers1 extends AppCompatActivity implements View.OnClickListener {
    TextView a_3,a_4,a_7,
            b_1,b_8,b_3,
            c_2,c_3,c_4,
            d_6,d_4,d_5;
    Button start;
    MediaPlayer mp,mp3;
    int i;
    private boolean isa_7Tapped=false;
    private boolean isb_8Tapped=false;
    private boolean isc_4Tapped=false;
    private boolean isd_6Tapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_numbers1);
        a_3 = findViewById(R.id.a_3);
        a_4 = findViewById(R.id.a_4);
        a_7 = findViewById(R.id.a_7);
        b_1 = findViewById(R.id.b_1);
        b_8 = findViewById(R.id.b_8);
        b_3 = findViewById(R.id.b_3);
        c_2 = findViewById(R.id.c_2);
        c_3 = findViewById(R.id.c_3);
        c_4 = findViewById(R.id.c_4);
        d_6 = findViewById(R.id.d_6);
        d_4 = findViewById(R.id.d_4);
        d_5 = findViewById(R.id.d_5);

        a_3.setOnClickListener(this);
        a_4.setOnClickListener(this);
        a_7.setOnClickListener(this);
        b_1.setOnClickListener(this);
        b_8.setOnClickListener(this);
        b_3.setOnClickListener(this);
        c_2.setOnClickListener(this);
        c_3.setOnClickListener(this);
        c_4.setOnClickListener(this);
        d_6.setOnClickListener(this);
        d_4.setOnClickListener(this);
        d_5.setOnClickListener(this);


        mp3 = MediaPlayer.create(Count_numbers1.this, R.raw.spot_diff);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();
    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.a_7:
                TextView imagea=(TextView)findViewById(R.id.a_7);
                Animation animationa= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagea.startAnimation(animationa);
                mp = MediaPlayer.create(Count_numbers1.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isa_7Tapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.a_3:
                mp = MediaPlayer.create(Count_numbers1.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.start();
                break;
            case R.id.a_4:
                mp = MediaPlayer.create(Count_numbers1.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.start();
                break;

            case R.id.b_8:
                TextView imageb=(TextView)findViewById(R.id.b_8);
                Animation animationb= AnimationUtils.loadAnimation(this,R.anim.blink);
                imageb.startAnimation(animationb);
                mp = MediaPlayer.create(Count_numbers1.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isb_8Tapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.b_1:
                mp = MediaPlayer.create(Count_numbers1.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.start();
                break;
            case R.id.b_3:
                mp = MediaPlayer.create(Count_numbers1.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.start();
                break;

            case R.id.c_4:
                TextView imagec=(TextView)findViewById(R.id.c_4);
                Animation animationc= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagec.startAnimation(animationc);
                mp = MediaPlayer.create(Count_numbers1.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isc_4Tapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.c_2:
                mp = MediaPlayer.create(Count_numbers1.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.start();
                break;
            case R.id.c_3:
                mp = MediaPlayer.create(Count_numbers1.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.start();
                break;

            case R.id.d_6:
                TextView imaged=(TextView)findViewById(R.id.d_6);
                Animation animationd= AnimationUtils.loadAnimation(this,R.anim.blink);
                imaged.startAnimation(animationd);
                mp = MediaPlayer.create(Count_numbers1.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isd_6Tapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.d_4:
                mp = MediaPlayer.create(Count_numbers1.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.start();
                break;
            case R.id.d_5:
                mp = MediaPlayer.create(Count_numbers1.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
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

        if (isa_7Tapped && isb_8Tapped && isc_4Tapped && isd_6Tapped ) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Count_numbers1.this, Short_a_sounds.class);
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




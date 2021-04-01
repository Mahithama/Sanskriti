package com.example.sanskriti_2020_all.Nurseryclass.Unit3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.sanskriti_2020_all.Nurseryclass.Unit5.B_alphabet;
import com.example.sanskriti_2020_all.R;

public class nur_c_act_3 extends AppCompatActivity implements View.OnClickListener{
    ImageView cherry,clock,cup,cloud;
    private ViewFlipper viewFlipper;
    MediaPlayer mp,mp3;
    int i;
    private boolean ischerryTapped=false;
    private boolean isclockTapped=false;
    private boolean iscupTapped=false;
    private boolean iscloudTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nur_c_act_3);

        viewFlipper = findViewById(R.id.viewflipper);
        cherry = findViewById(R.id.cherry);
        clock = findViewById(R.id.clock);
        cup = findViewById(R.id.cup);
        cloud = findViewById(R.id.cloud);

        cherry.setOnClickListener(this);
        clock.setOnClickListener(this);
        cup.setOnClickListener(this);
        cloud.setOnClickListener(this);
        mp3 = MediaPlayer.create(nur_c_act_3.this, R.raw.c_title_alpha);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();

    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.cherry:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                cherry.setVisibility(View.VISIBLE);
                cherry.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(nur_c_act_3.this, R.raw.c_cherry_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ischerryTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.clock:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                clock.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(nur_c_act_3.this, R.raw.c_clock_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                clock.setBackgroundColor(Color.parseColor("#dd3737"));
                isclockTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.cup:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                cup.setVisibility(View.VISIBLE);
                cup.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(nur_c_act_3.this, R.raw.c_cup_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iscupTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.cloud:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                cloud.setVisibility(View.VISIBLE);
                cloud.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(nur_c_act_3.this, R.raw.c_cloud_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iscloudTapped=true;
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

        if (isclockTapped && iscloudTapped && iscupTapped  && ischerryTapped ) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(nur_c_act_3.this, nur3_literacy_home.class);
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

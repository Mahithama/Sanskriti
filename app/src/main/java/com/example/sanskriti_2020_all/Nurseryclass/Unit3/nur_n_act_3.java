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

import com.example.sanskriti_2020_all.Nurseryclass.Unit4.Nur_h_4;
import com.example.sanskriti_2020_all.R;

public class nur_n_act_3 extends AppCompatActivity implements View.OnClickListener {
    ImageView nest,nut,needle,net;
    private ViewFlipper viewFlipper;
    MediaPlayer mp,mp3;
    int i;
    private boolean isnestTapped=false;
    private boolean isnutTapped=false;
    private boolean isneedleTapped=false;
    private boolean isnetTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nur_n_act_3);

        viewFlipper = findViewById(R.id.viewflipper);
        nest = findViewById(R.id.nest);
        nut = findViewById(R.id.nut);
        needle = findViewById(R.id.needle);
        net = findViewById(R.id.net);

        nest.setOnClickListener(this);
        nut.setOnClickListener(this);
        needle.setOnClickListener(this);
        net.setOnClickListener(this);

        mp3 = MediaPlayer.create(nur_n_act_3.this, R.raw.n_title_alpha);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();

    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.nest:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                nest.setVisibility(View.VISIBLE);
                nest.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(nur_n_act_3.this, R.raw.n_nest_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isnestTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.nut:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                nut.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(nur_n_act_3.this, R.raw.n_nut_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                nut.setBackgroundColor(Color.parseColor("#dd3737"));
                isnutTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.needle:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                needle.setVisibility(View.VISIBLE);
                needle.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(nur_n_act_3.this, R.raw.n_needle_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isneedleTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.net:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                net.setVisibility(View.VISIBLE);
                net.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(nur_n_act_3.this, R.raw.n_net_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isnetTapped=true;
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

        if (isnestTapped && isnutTapped && isneedleTapped  && isnetTapped ) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(nur_n_act_3.this, nur3_literacy_home.class);
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

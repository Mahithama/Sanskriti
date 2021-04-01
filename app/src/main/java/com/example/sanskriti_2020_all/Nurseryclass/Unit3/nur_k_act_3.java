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

public class nur_k_act_3 extends AppCompatActivity implements View.OnClickListener {
    ImageView kettle,knife,key,kiwi;
    private ViewFlipper viewFlipper;
    MediaPlayer mp,mp3;
    int i;
    private boolean iskettleTapped=false;
    private boolean isknifeTapped=false;
    private boolean iskeyTapped=false;
    private boolean iskiwiTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nur_k_act_3);

        viewFlipper = findViewById(R.id.viewflipper);
        kettle = findViewById(R.id.kettle);
        knife = findViewById(R.id.knife);
        key = findViewById(R.id.key);
        kiwi = findViewById(R.id.kiwi);

        kettle.setOnClickListener(this);
        knife.setOnClickListener(this);
        key.setOnClickListener(this);
        kiwi.setOnClickListener(this);

        mp3 = MediaPlayer.create(nur_k_act_3.this, R.raw.k_title_alpha);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();
    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.kettle:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                kettle.setVisibility(View.VISIBLE);
                kettle.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(nur_k_act_3.this, R.raw.k_kettele_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iskettleTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.knife:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                knife.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(nur_k_act_3.this, R.raw.k_knife_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                knife.setBackgroundColor(Color.parseColor("#dd3737"));
                isknifeTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.key:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                key.setVisibility(View.VISIBLE);
                key.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(nur_k_act_3.this, R.raw.k_key_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iskeyTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.kiwi:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                kiwi.setVisibility(View.VISIBLE);
                kiwi.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(nur_k_act_3.this, R.raw.k_kiwi_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iskiwiTapped=true;
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

        if (iskiwiTapped && isknifeTapped && iskettleTapped  && iskeyTapped ) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(nur_k_act_3.this, nur3_literacy_home.class);
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

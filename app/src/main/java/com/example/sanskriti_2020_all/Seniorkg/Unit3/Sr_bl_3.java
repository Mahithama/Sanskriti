package com.example.sanskriti_2020_all.Seniorkg.Unit3;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanskriti_2020_all.R;
import com.example.sanskriti_2020_all.Seniorkg.Unit1.Senior1_missingletter2;

public class Sr_bl_3 extends AppCompatActivity implements View.OnClickListener {
    ImageView bl_block,bl_blue,bl_blanket,bl_blink,br_brown,br_bride;
    MediaPlayer mp,mp3;
    int i;
    private boolean isblockTapped=false;
    private boolean isblueTapped=false;
    private boolean isblanketTapped=false;
    private boolean isblinkTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sr_bl_3);
        bl_block = findViewById(R.id.bl_block);
        bl_blue = findViewById(R.id.bl_blue);
        bl_blanket = findViewById(R.id.bl_blanket);
        bl_blink = findViewById(R.id.bl_blink);
        br_brown = findViewById(R.id.br_brown);
        br_bride = findViewById(R.id.br_bride);

        bl_block.setOnClickListener(this);
        bl_blue.setOnClickListener(this);
        bl_blanket.setOnClickListener(this);
        bl_blink.setOnClickListener(this);
        br_brown.setOnClickListener(this);
        br_bride.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.bl_blanket:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Sr_bl_3.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isblanketTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.bl_block:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Sr_bl_3.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isblockTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.bl_blue:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Sr_bl_3.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isblueTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.bl_blink:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Sr_bl_3.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
               isblinkTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.br_brown:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                br_brown.setVisibility(View.GONE);
                mp = MediaPlayer.create(Sr_bl_3.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.br_bride:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                br_bride.setVisibility(View.GONE);
                mp = MediaPlayer.create(Sr_bl_3.this, R.raw.failure);
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

        if (isblinkTapped && isblockTapped && isblueTapped && isblanketTapped) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Sr_bl_3.this, Sn3_literacy.class);
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

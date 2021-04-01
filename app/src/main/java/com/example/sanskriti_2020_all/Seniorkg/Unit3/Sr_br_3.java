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

public class Sr_br_3 extends AppCompatActivity implements View.OnClickListener  {
    ImageView bl_block,bl_blue,br_brain,br_bridge,br_brown,br_bride;
    MediaPlayer mp,mp3;
    int i;
    private boolean isbrideTapped=false;
    private boolean isbridgeTapped=false;
    private boolean isbrownTapped=false;
    private boolean isbrainTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sr_br_3);
        bl_block = findViewById(R.id.bl_block);
        bl_blue = findViewById(R.id.bl_blue);
        br_brain = findViewById(R.id.br_brain);
        br_bridge = findViewById(R.id.br_bridge);
        br_brown = findViewById(R.id.br_brown);
        br_bride = findViewById(R.id.br_bride);

        bl_block.setOnClickListener(this);
        bl_blue.setOnClickListener(this);
        br_brain.setOnClickListener(this);
        br_bridge.setOnClickListener(this);
        br_brown.setOnClickListener(this);
        br_bride.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.br_bride:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Sr_br_3.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isbrideTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.br_bridge:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Sr_br_3.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isbridgeTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.br_brain:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Sr_br_3.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isbrainTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.br_brown:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Sr_br_3.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isbrownTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.bl_block:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                bl_block.setVisibility(View.GONE);
                mp = MediaPlayer.create(Sr_br_3.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.bl_blue:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                bl_blue.setVisibility(View.GONE);
                mp = MediaPlayer.create(Sr_br_3.this, R.raw.failure);
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

        if (isbrainTapped && isbrideTapped && isbrownTapped && isbridgeTapped) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Sr_br_3.this, Sn3_literacy.class);
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

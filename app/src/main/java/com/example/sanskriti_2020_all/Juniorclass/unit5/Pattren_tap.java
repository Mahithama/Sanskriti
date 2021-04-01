package com.example.sanskriti_2020_all.Juniorclass.unit5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import com.example.sanskriti_2020_all.R;

public class Pattren_tap extends AppCompatActivity implements View.OnClickListener  {
ImageView p_1,p_2,p_3,p_4,p_1_1,p_2_2,p_3_3,p_4_4;
    MediaPlayer mp,mp3;
    int i;
    private boolean isp1Tapped=false;
    private boolean isp2Tapped=false;
    private boolean isp3Tapped=false;
    private boolean isp4Tapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattren_tap);
        p_1 = findViewById(R.id.p_1);
        p_1_1 = findViewById(R.id.p_1_1);
        p_2 = findViewById(R.id.p_2);
        p_2_2 = findViewById(R.id.p_2_2);
        p_3 = findViewById(R.id.p_3);
        p_3_3 = findViewById(R.id.p_3_3);
        p_4 = findViewById(R.id.p_4);
        p_4_4 = findViewById(R.id.p_4_4);

        p_1.setOnClickListener(this);
        p_1_1.setOnClickListener(this);
        p_2.setOnClickListener(this);
        p_2_2.setOnClickListener(this);
        p_3.setOnClickListener(this);
        p_3_3.setOnClickListener(this);
        p_4.setOnClickListener(this);
        p_4_4.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.p_1_1:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Pattren_tap.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isp1Tapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.p_1:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Pattren_tap.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.p_2_2:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Pattren_tap.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isp2Tapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.p_2:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Pattren_tap.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.p_3:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Pattren_tap.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isp3Tapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.p_3_3:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Pattren_tap.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;


            case R.id.p_4:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Pattren_tap.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isp4Tapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.p_4_4:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Pattren_tap.this, R.raw.failure);
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

        if (isp1Tapped && isp2Tapped && isp3Tapped  && isp4Tapped ) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Pattren_tap.this, Ju5_theme_activities.class);
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

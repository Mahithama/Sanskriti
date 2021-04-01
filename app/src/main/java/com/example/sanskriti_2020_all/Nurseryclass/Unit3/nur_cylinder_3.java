package com.example.sanskriti_2020_all.Nurseryclass.Unit3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.sanskriti_2020_all.R;

public class nur_cylinder_3 extends AppCompatActivity implements View.OnClickListener {
    ImageView can,juice,casee,vlc,melon;
    private ViewFlipper viewFlipper;
    MediaPlayer mp,mp3;
    int i;
    private boolean iscanTapped=false;
    private boolean isjuiceTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nur_cylinder_3);

        viewFlipper = findViewById(R.id.viewflipper);
        can = findViewById(R.id.can);
        juice = findViewById(R.id.juice);
        casee = findViewById(R.id.casee);
        vlc = findViewById(R.id.vlc);
        melon = findViewById(R.id.melon);

        can.setOnClickListener(this);
        juice.setOnClickListener(this);
        casee.setOnClickListener(this);
        melon.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.can:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                can.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(nur_cylinder_3.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iscanTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.juice:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                juice.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(nur_cylinder_3.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isjuiceTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.vlc:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                vlc.setVisibility(View.GONE);
                mp = MediaPlayer.create(nur_cylinder_3.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.melon:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                melon.setVisibility(View.GONE);
                mp = MediaPlayer.create(nur_cylinder_3.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.casee:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                casee.setVisibility(View.GONE);
                mp = MediaPlayer.create(nur_cylinder_3.this, R.raw.failure);
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

        if (iscanTapped && isjuiceTapped) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(nur_cylinder_3.this, nur3_themes_activities_home.class);
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

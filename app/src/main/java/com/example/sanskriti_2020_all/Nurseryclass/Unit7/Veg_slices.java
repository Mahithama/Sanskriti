package com.example.sanskriti_2020_all.Nurseryclass.Unit7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.sanskriti_2020_all.R;

public class Veg_slices extends AppCompatActivity implements View.OnClickListener {
    ImageView pu7,to7,br7,ca7,cu7,po7,on7;
    private ViewFlipper viewFlipper;
    Button start;
    MediaPlayer mp,mp3;
    int i;
    private boolean ispu7Tapped=false;
    private boolean isto7Tapped=false;
    private boolean isbr7Tapped=false;
    private boolean isca7Tapped=false;
    private boolean iscu7Tapped=false;
    private boolean ison7Tapped=false;
    private boolean ispo7Tapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg_slices);
        pu7 = findViewById(R.id.pu7);
        to7 = findViewById(R.id.to7);
        br7 = findViewById(R.id.br7);
        ca7 = findViewById(R.id.ca7);
        cu7 = findViewById(R.id.cu7);
        on7 = findViewById(R.id.on7);
        po7 = findViewById(R.id.po7);


        pu7.setOnClickListener(this);
        to7.setOnClickListener(this);
        br7.setOnClickListener(this);
        ca7.setOnClickListener(this);
        cu7.setOnClickListener(this);
        on7.setOnClickListener(this);
        po7.setOnClickListener(this);

        mp3 = MediaPlayer.create(Veg_slices.this, R.raw.spot_diff);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();
    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.pu7:
                pu7.setImageResource(R.drawable.ve_pump_a);
                mp = MediaPlayer.create(Veg_slices.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ispu7Tapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.ca7:
                ca7.setImageResource(R.drawable.ve_car_a);
                mp = MediaPlayer.create(Veg_slices.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isca7Tapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.po7:
                po7.setImageResource(R.drawable.ve_pota_a);
                mp = MediaPlayer.create(Veg_slices.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ispo7Tapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.on7:
                on7.setImageResource(R.drawable.ve_oni_a);
                mp = MediaPlayer.create(Veg_slices.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ison7Tapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.cu7:
                cu7.setImageResource(R.drawable.ve_cucum_a);
                mp = MediaPlayer.create(Veg_slices.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iscu7Tapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.to7:
                to7.setImageResource(R.drawable.ve_toma_a);
                mp = MediaPlayer.create(Veg_slices.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isto7Tapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.br7:
                br7.setImageResource(R.drawable.ve_brin_a);
                mp = MediaPlayer.create(Veg_slices.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isbr7Tapped=true;
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

        if (isto7Tapped && iscu7Tapped && ispu7Tapped && isca7Tapped && ison7Tapped && isbr7Tapped && ispo7Tapped ) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Veg_slices.this, nur7_themes_activities_home.class);
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




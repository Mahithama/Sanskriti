package com.example.sanskriti_2020_all.Nurseryclass.Unit2;

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

public class Shapes1 extends AppCompatActivity implements View.OnClickListener {
    ImageView ice,cube,tent,nut,ball,cake,cheese,tire;
    MediaPlayer mp,mp3;
    int i;

    private boolean isiceTapped=false;
    private boolean iscubeTapped=false;
    private boolean iscakeTapped=false;
    private boolean ischeeseTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes1);
        ice = findViewById(R.id.ice);
        cube = findViewById(R.id.cube);
        tent = findViewById(R.id.tent);
        nut = findViewById(R.id.nut);
        ball = findViewById(R.id.ball);
        cake = findViewById(R.id.cake);
        cheese = findViewById(R.id.cheese);
        tire = findViewById(R.id.tire);


        ice.setOnClickListener(this);
        cube.setOnClickListener(this);
        tent.setOnClickListener(this);
        nut.setOnClickListener(this);
        ball.setOnClickListener(this);
        cake.setOnClickListener(this);
        cheese.setOnClickListener(this);
        tire.setOnClickListener(this);

        mp3 = MediaPlayer.create(Shapes1.this, R.raw.shapes_title);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();
    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();

        if(mp != null){
            if(mp.isPlaying()){
                mp.stop();
            }
            mp.release();
        }

        switch (v.getId()) {


            case R.id.tire:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                tire.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Shapes1.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.nut:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                nut.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Shapes1.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;


            case R.id.tent:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                tent.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Shapes1.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.ball:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ball.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Shapes1.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.cheese:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Shapes1.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ischeeseTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.ice:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Shapes1.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isiceTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.cube:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Shapes1.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iscubeTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.cake:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                mp = MediaPlayer.create(Shapes1.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iscakeTapped=true;
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

        if (isiceTapped && iscubeTapped && iscakeTapped  && ischeeseTapped ) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Shapes1.this, nur2_themes_activities.class);
                    act.putExtra("activity_name", activity_name);
                    startActivity(act);


                }
            }, 4000);


        }
    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }

}

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

public class T_alphabet extends AppCompatActivity implements View.OnClickListener {
    ImageView tractor,train,sun,tomato,tv;
    MediaPlayer mp,mp3;
    int i;
    private ViewFlipper viewFlipper;
    private boolean istractorTapped=false;
    private boolean istrainTapped=false;
    private boolean istomatoTapped=false;
    private boolean istvTapped=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_alphabet);

        tractor = findViewById(R.id.tractor);
        train = findViewById(R.id.train);
        sun = findViewById(R.id.sun);
        tomato = findViewById(R.id.tomato);
        tv = findViewById(R.id.tv);
        viewFlipper = findViewById(R.id.viewflipper);

        tractor.setOnClickListener(this);
        train.setOnClickListener(this);
        sun.setOnClickListener(this);
        tomato.setOnClickListener(this);
        tv.setOnClickListener(this);

        mp3 = MediaPlayer.create(T_alphabet.this, R.raw.t_title_alpha);
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


            case R.id.sun:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                sun.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(T_alphabet.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.tractor:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                tractor.setImageResource(R.drawable.tractor_a);
                tractor.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(T_alphabet.this, R.raw.t_tractor_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                istractorTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.tomato:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                tomato.setImageResource(R.drawable.tomato_a);
                tomato.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(T_alphabet.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                istomatoTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.train:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                train.setImageResource(R.drawable.train_a);
                train.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(T_alphabet.this, R.raw.t_train_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                istrainTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.tv:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                tv.setImageResource(R.drawable.telivision_a);
                tv.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(T_alphabet.this, R.raw.t_tv_title);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                istvTapped=true;
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

        if (istractorTapped && istvTapped && istrainTapped  && istomatoTapped ) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(T_alphabet.this, nur2_literacy.class);
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

    public void nextView(View v) {
        viewFlipper.showNext();
        if(mp3 != null && mp3.isPlaying()){
            mp3.stop();
        }

    }
}

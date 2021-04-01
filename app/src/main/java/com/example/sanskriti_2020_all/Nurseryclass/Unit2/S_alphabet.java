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

public class S_alphabet extends AppCompatActivity implements View.OnClickListener  {
    ImageView star,snow,sun,tomato,berry,sheep;
    MediaPlayer mp,mp3;
    int i;
    private ViewFlipper viewFlipper;
    private boolean isstarTapped=false;
    private boolean issnowTapped=false;
    private boolean isberryTapped=false;
    private boolean issheepTapped=false;
    private boolean issunTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_alphabet);

        star = findViewById(R.id.star);
        snow = findViewById(R.id.snow);
        sun = findViewById(R.id.sun);
        tomato = findViewById(R.id.tomato);
        sheep = findViewById(R.id.sheep);
        berry = findViewById(R.id.berry);
        viewFlipper = findViewById(R.id.viewflipper);
        star.setOnClickListener(this);
        snow.setOnClickListener(this);
        sun.setOnClickListener(this);
        tomato.setOnClickListener(this);
        berry.setOnClickListener(this);
        sheep.setOnClickListener(this);

        mp3 = MediaPlayer.create(S_alphabet.this, R.raw.s_title_alpha);
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



            case R.id.tomato:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                tomato.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(S_alphabet.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.star:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                star.setImageResource(R.drawable.star_a);
                star.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(S_alphabet.this, R.raw.s_star_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isstarTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.sun:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                sun.setImageResource(R.drawable.sunshine_a);
                sun.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(S_alphabet.this, R.raw.s_sun_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                issunTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.snow:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                snow.setImageResource(R.drawable.snow_a);
                snow.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(S_alphabet.this, R.raw.s_snowman_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                issnowTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.sheep:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                sheep.setImageResource(R.drawable.sheep_a);
                sheep.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(S_alphabet.this, R.raw.s_sheep_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                issheepTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.berry:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                berry.setImageResource(R.drawable.berry_a);
                berry.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(S_alphabet.this, R.raw.s_strawberry_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isberryTapped=true;
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

        if (issunTapped && isstarTapped && issheepTapped  && isberryTapped && issnowTapped ) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(S_alphabet.this, nur2_literacy.class);
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

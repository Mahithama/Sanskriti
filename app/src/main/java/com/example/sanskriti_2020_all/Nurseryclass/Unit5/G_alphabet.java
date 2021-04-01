package com.example.sanskriti_2020_all.Nurseryclass.Unit5;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanskriti_2020_all.Nurseryclass.Unit2.A_alphabet;
import com.example.sanskriti_2020_all.R;

public class G_alphabet extends AppCompatActivity implements View.OnClickListener  {
ImageView grapes,giraf,garlic,grass, glass;
    MediaPlayer mp,mp3;
    int i;
    private ViewFlipper viewFlipper;
    private boolean isgrapesTapped=false;
    private boolean isgirafTapped=false;
    private boolean isgarlicTapped=false;
    private boolean isgrassTapped=false;
    private boolean isglassTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_alphabet);

        viewFlipper = findViewById(R.id.viewflipper);
        grapes = findViewById(R.id.grapes);
        giraf = findViewById(R.id.giraf);
        garlic = findViewById(R.id.garlic);
        grass = findViewById(R.id.grass);
        glass = findViewById(R.id.glass);


        grapes.setOnClickListener(this);
        giraf.setOnClickListener(this);
        garlic.setOnClickListener(this);
        grass.setOnClickListener(this);
        glass.setOnClickListener(this);

        mp3 = MediaPlayer.create(G_alphabet.this, R.raw.g_title_alpha);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();
    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.grapes:
                ImageView imagea=(ImageView)findViewById(R.id.grapes);
                Animation animationa= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagea.startAnimation(animationa);
                mp = MediaPlayer.create(G_alphabet.this, R.raw.g_grapes_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isgrapesTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.giraf:
                ImageView imageb=(ImageView)findViewById(R.id.giraf);
                Animation animationb= AnimationUtils.loadAnimation(this,R.anim.blink);
                imageb.startAnimation(animationb);
                mp = MediaPlayer.create(G_alphabet.this, R.raw.g_giraff_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isgirafTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.garlic:
                ImageView imagec=(ImageView)findViewById(R.id.garlic);
                Animation animationc= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagec.startAnimation(animationc);
                mp = MediaPlayer.create(G_alphabet.this, R.raw.g_garlic_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isgarlicTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.grass:
                ImageView imaged=(ImageView)findViewById(R.id.grass);
                Animation animationd= AnimationUtils.loadAnimation(this,R.anim.blink);
                imaged.startAnimation(animationd);
                mp = MediaPlayer.create(G_alphabet.this, R.raw.g_grass_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isgrassTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.glass:
                ImageView imagee=(ImageView)findViewById(R.id.glass);
                Animation animatione= AnimationUtils.loadAnimation(this,R.anim.blink);
                imagee.startAnimation(animatione);
                mp = MediaPlayer.create(G_alphabet.this, R.raw.g_glass_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isglassTapped=true;
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

        if (isgrassTapped && isgrapesTapped && isgarlicTapped && isglassTapped && isgirafTapped ) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(G_alphabet.this, nur5_literacy.class);
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

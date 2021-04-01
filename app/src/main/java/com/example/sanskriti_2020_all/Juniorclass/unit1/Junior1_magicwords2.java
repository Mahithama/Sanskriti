package com.example.sanskriti_2020_all.Juniorclass.unit1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.sanskriti_2020_all.R;

public class Junior1_magicwords2 extends AppCompatActivity implements View.OnClickListener {
    ImageView magic_four,magic_five, magic_fourt,magic_fivet;
    MediaPlayer mp,mp3;
    int i;

    private boolean ism_fourTapped=false;
    private boolean ism_fiveTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junior1_magicwords2);

        magic_four = findViewById(R.id.magic_four);
        magic_five = findViewById(R.id.magic_five);
        magic_fourt = findViewById(R.id.magic_fourt);
        magic_fivet = findViewById(R.id.magic_fivet);

        magic_four.setOnClickListener(this);
        magic_five.setOnClickListener(this);

      /*  mp3 = MediaPlayer.create(Magic_words.this, R.raw.recognition_alpha);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start(); */
    }

    @Override
    public void onClick(View v) {

        // Find which ImageButton was pressed and take appropriate action
        //    if (mp != null) mp.release();
        if(mp != null){
            if(mp.isPlaying()){
                mp.stop();
            }
            mp.release();
        }
        switch (v.getId()) {



            case R.id.magic_four:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                magic_fourt.setVisibility(View.VISIBLE);
                ImageView iiimage = (ImageView) findViewById(R.id.magic_fourt);
                Animation aaanimation = AnimationUtils.loadAnimation(this, R.anim.blink);
                iiimage.startAnimation(aaanimation);
                mp = MediaPlayer.create(Junior1_magicwords2.this, R.raw.please_magic);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                ism_fourTapped=true;
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.magic_five:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                magic_fivet.setVisibility(View.VISIBLE);
                ImageView iiimagge = (ImageView) findViewById(R.id.magic_fivet);
                Animation aaanimationn = AnimationUtils.loadAnimation(this, R.anim.blink);
                iiimagge.startAnimation(aaanimationn);
                mp = MediaPlayer.create(Junior1_magicwords2.this, R.raw.excuseme_magic);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                ism_fiveTapped=true;
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

        if (ism_fourTapped  && ism_fiveTapped) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Junior1_magicwords2.this, Junior_literacy1n_home.class);
                    act.putExtra("activity_name", activity_name);
                    startActivity(act);


                }
            }, 12000);


        }
    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}




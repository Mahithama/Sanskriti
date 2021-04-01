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
import android.widget.ViewFlipper;

import com.example.sanskriti_2020_all.R;


public class Junior1_magicwords extends AppCompatActivity implements View.OnClickListener  {
    ImageView magic_one,magic_two,magic_three, magic_onet,magic_twot,magic_threet;
    MediaPlayer mp,mp3;
    private ViewFlipper viewFlipper;
    int i;

    private boolean ism_oneTapped=false;
    private boolean ism_twoTapped=false;
    private boolean ism_threeTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junior1_magicwords);


        magic_one = findViewById(R.id.magic_one);
        magic_two = findViewById(R.id.magic_two);
        magic_three = findViewById(R.id.magic_three);
        magic_onet = findViewById(R.id.magic_onet);
        magic_twot = findViewById(R.id.magic_twot);
        magic_threet = findViewById(R.id.magic_threet);
        viewFlipper = findViewById(R.id.viewflipper);



        magic_one.setOnClickListener(this);
        magic_two.setOnClickListener(this);
        magic_three.setOnClickListener(this);



        mp3 = MediaPlayer.create(Junior1_magicwords.this, R.raw.magic_title);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();

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


            case R.id.magic_one:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                magic_onet.setVisibility(View.VISIBLE);
                ImageView image = (ImageView) findViewById(R.id.magic_onet);
                Animation animation = AnimationUtils.loadAnimation(this, R.anim.blink);
                image.startAnimation(animation);
                mp = MediaPlayer.create(Junior1_magicwords.this, R.raw.welcome_magic);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                ism_oneTapped=true;
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.magic_two:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                magic_twot.setVisibility(View.VISIBLE);
                ImageView imagee = (ImageView) findViewById(R.id.magic_twot);
                Animation animationn = AnimationUtils.loadAnimation(this, R.anim.blink);
                imagee.startAnimation(animationn);
                mp = MediaPlayer.create(Junior1_magicwords.this, R.raw.sorry_magic);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                ism_twoTapped=true;
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.magic_three:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                magic_threet.setVisibility(View.VISIBLE);
                ImageView iimage = (ImageView) findViewById(R.id.magic_threet);
                Animation aanimation = AnimationUtils.loadAnimation(this, R.anim.blink);
                iimage.startAnimation(aanimation);
                mp = MediaPlayer.create(Junior1_magicwords.this, R.raw.thankyou_magic);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                ism_threeTapped=true;
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

        if (ism_oneTapped && ism_twoTapped &&  ism_threeTapped ) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Junior1_magicwords.this, Junior1_magicwords2.class);
                    act.putExtra("activity_name", activity_name);
                    startActivity(act);


                }
            }, 8500);


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




package com.example.sanskriti_2020_all.Nurseryclass.Unit1;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanskriti_2020_all.R;

public class Nursery1__route_onetoten extends AppCompatActivity implements View.OnClickListener  {
    ImageView one, two,three,four,five,six,seven,eight,nine,ten,goodjob;
    private ViewFlipper viewFlipper;
    MediaPlayer mp,mp3;
    Button Next;
    int i;

    private boolean isoneTapped=false;
    private boolean istwoTapped=false;
    private boolean isthreeTapped=false;
    private boolean isfourTapped=false;
    private boolean isfiveTapped=false;
    private boolean issixTapped=false;
    private boolean issevenTapped=false;
    private boolean iseightTapped=false;
    private boolean isnineTapped=false;
    private boolean istenTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nursery1__route_onetoten);

        viewFlipper = findViewById(R.id.viewflipper);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        ten = findViewById(R.id.ten);






        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        ten.setOnClickListener(this);

        mp3 = MediaPlayer.create(Nursery1__route_onetoten.this, R.raw.counting_one_ten);
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




            case R.id.one:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView imagee=(ImageView)findViewById(R.id.one);
                Animation animationn= AnimationUtils.loadAnimation(this, R.anim.zoom_in);
                imagee.startAnimation(animationn);
                mp = MediaPlayer.create(Nursery1__route_onetoten.this, R.raw.one);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isoneTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.two:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView iimage=(ImageView)findViewById(R.id.two);
                Animation aanimation= AnimationUtils.loadAnimation(this, R.anim.zoom_in);
                iimage.startAnimation(aanimation);
                mp = MediaPlayer.create(Nursery1__route_onetoten.this, R.raw.two);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                istwoTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.three:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView iiimage=(ImageView)findViewById(R.id.three);
                Animation aaanimation= AnimationUtils.loadAnimation(this, R.anim.zoom_in);
                iiimage.startAnimation(aaanimation);
                mp = MediaPlayer.create(Nursery1__route_onetoten.this, R.raw.three);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isthreeTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.four:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView immage=(ImageView)findViewById(R.id.four);
                Animation annimation= AnimationUtils.loadAnimation(this, R.anim.zoom_in);
                immage.startAnimation(annimation);
                mp = MediaPlayer.create(Nursery1__route_onetoten.this, R.raw.four);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isfourTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.five:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView imaage=(ImageView)findViewById(R.id.five);
                Animation aniimation= AnimationUtils.loadAnimation(this, R.anim.zoom_in);
                imaage.startAnimation(aniimation);
                mp = MediaPlayer.create(Nursery1__route_onetoten.this, R.raw.five);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isfiveTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.six:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView imagge=(ImageView)findViewById(R.id.six);
                Animation animaation= AnimationUtils.loadAnimation(this, R.anim.zoom_in);
                imagge.startAnimation(animaation);
                mp = MediaPlayer.create(Nursery1__route_onetoten.this, R.raw.six);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                issixTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.seven:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView imaggee=(ImageView)findViewById(R.id.seven);
                Animation animattion= AnimationUtils.loadAnimation(this, R.anim.zoom_in);
                imaggee.startAnimation(animattion);
                mp = MediaPlayer.create(Nursery1__route_onetoten.this, R.raw.seven);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                issevenTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.eight:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView imageee=(ImageView)findViewById(R.id.eight);
                Animation animatioon= AnimationUtils.loadAnimation(this, R.anim.zoom_in);
                imageee.startAnimation(animatioon);
                mp = MediaPlayer.create(Nursery1__route_onetoten.this, R.raw.eight);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iseightTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.nine:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView imgage=(ImageView)findViewById(R.id.nine);
                Animation aniamationn= AnimationUtils.loadAnimation(this, R.anim.zoom_in);
                imgage.startAnimation(aniamationn);
                mp = MediaPlayer.create(Nursery1__route_onetoten.this, R.raw.nine);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isnineTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.ten:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView mimage=(ImageView)findViewById(R.id.ten);
                Animation nanimation= AnimationUtils.loadAnimation(this, R.anim.zoom_in);
                mimage.startAnimation(nanimation);
                mp = MediaPlayer.create(Nursery1__route_onetoten.this, R.raw.ten);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                istenTapped=true;
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
        //if (mp != null) mp.release();

    }


    public void nextScreen(int i) {

        if (isoneTapped && istwoTapped && isthreeTapped && isfourTapped && isfiveTapped && issixTapped && issevenTapped && iseightTapped && isnineTapped && istenTapped) {


            mp = MediaPlayer.create(Nursery1__route_onetoten.this, R.raw.success);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            istenTapped=true;
            mp.setLooping(false);
            mp.start();

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Nursery1__route_onetoten.this, Nursery_numeracy1n_home.class);
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




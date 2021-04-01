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
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.sanskriti_2020_all.R;


public class Junior1_classroomrules1 extends AppCompatActivity implements View.OnClickListener {
    ImageView class_one,class_two;
    TextView class_onet,class_twot;
    private ViewFlipper viewFlipper;
    MediaPlayer mp,mp3;
    int i;

    private boolean isc_oneTapped=false;
    private boolean isc_twoTapped=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junior1_classroomrules1);

        viewFlipper = findViewById(R.id.viewflipper);
        class_one = findViewById(R.id.class_one);
        class_two = findViewById(R.id.class_two);
        class_onet = findViewById(R.id.class_onet);
        class_twot = findViewById(R.id.class_twot);


        class_one.setOnClickListener(this);
        class_two.setOnClickListener(this);
        class_onet.setOnClickListener(this);
        class_twot.setOnClickListener(this);


        mp3 = MediaPlayer.create(Junior1_classroomrules1.this, R.raw.clasrrom_title);
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


            case R.id.class_one:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                class_onet.setVisibility(View.VISIBLE);
                TextView image = (TextView) findViewById(R.id.class_onet);
                Animation animation = AnimationUtils.loadAnimation(this, R.anim.blink);
                image.startAnimation(animation);
                mp = MediaPlayer.create(Junior1_classroomrules1.this, R.raw.hands_class);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                isc_oneTapped=true;
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.class_two:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                class_twot.setVisibility(View.VISIBLE);
                TextView imagee = (TextView) findViewById(R.id.class_twot);
                Animation animationn = AnimationUtils.loadAnimation(this, R.anim.blink);
                imagee.startAnimation(animationn);
                mp = MediaPlayer.create(Junior1_classroomrules1.this, R.raw.help_class);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                isc_twoTapped=true;
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

        if ( isc_oneTapped && isc_twoTapped  ) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Junior1_classroomrules1.this, Junior1_classroomrules2.class);
                    act.putExtra("activity_name", activity_name);
                    startActivity(act);


                }
            }, 3000);


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




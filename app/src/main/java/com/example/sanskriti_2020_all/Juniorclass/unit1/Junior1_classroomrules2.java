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

import com.example.sanskriti_2020_all.R;

public class Junior1_classroomrules2 extends AppCompatActivity implements View.OnClickListener {
    ImageView class_six,class_five;
    TextView class_fivet,class_sixt;
    MediaPlayer mp,mp3;
    int i;


    private boolean isc_fiveTapped=false;
    private boolean isc_sixTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junior1_classroomrules2);
        class_six = findViewById(R.id.class_six);
        class_five = findViewById(R.id.class_five);
        class_sixt = findViewById(R.id.class_sixt);
        class_fivet = findViewById(R.id.class_fivet);



        class_five.setOnClickListener(this);
        class_six.setOnClickListener(this);
        class_fivet.setOnClickListener(this);
        class_sixt.setOnClickListener(this);



    /*    mp3 = MediaPlayer.create(Classroom_rules_two.this, R.raw.recognition_alpha);
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


            case R.id.class_five:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                class_fivet.setVisibility(View.VISIBLE);
                TextView image = (TextView) findViewById(R.id.class_fivet);
                Animation animation = AnimationUtils.loadAnimation(this, R.anim.blink);
                image.startAnimation(animation);
                mp = MediaPlayer.create(Junior1_classroomrules2.this, R.raw.sit_class);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                isc_fiveTapped=true;
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.class_six:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                class_sixt.setVisibility(View.VISIBLE);
                TextView imagee = (TextView) findViewById(R.id.class_sixt);
                Animation animationn = AnimationUtils.loadAnimation(this, R.anim.blink);
                imagee.startAnimation(animationn);
                mp = MediaPlayer.create(Junior1_classroomrules2.this, R.raw.listen_class);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                isc_sixTapped=true;
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


    }


    public void nextScreen(int i) {

        if (isc_fiveTapped && isc_sixTapped) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Junior1_classroomrules2.this, Junior1_classroomrules3.class);
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
}




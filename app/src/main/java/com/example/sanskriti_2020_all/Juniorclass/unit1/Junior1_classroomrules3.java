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

public class Junior1_classroomrules3 extends AppCompatActivity implements View.OnClickListener {
    ImageView class_three,class_four;
    TextView class_threet,class_fourt;
    MediaPlayer mp,mp3;
    int i;

    private boolean isc_threeTapped=false;
    private boolean isc_fourTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junior1_classroomrules3);
        class_threet = findViewById(R.id.class_threet);
        class_fourt = findViewById(R.id.class_fourt);
        class_three = findViewById(R.id.class_three);
        class_four = findViewById(R.id.class_four);

        class_three.setOnClickListener(this);
        class_four.setOnClickListener(this);
        class_threet.setOnClickListener(this);
        class_fourt.setOnClickListener(this);
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



            case R.id.class_three:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                class_threet.setVisibility(View.VISIBLE);
                TextView iimage = (TextView) findViewById(R.id.class_threet);
                Animation aanimation = AnimationUtils.loadAnimation(this, R.anim.blink);
                iimage.startAnimation(aanimation);
                mp = MediaPlayer.create(Junior1_classroomrules3.this, R.raw.clean_class);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                isc_threeTapped=true;
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.class_four:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                class_fourt.setVisibility(View.VISIBLE);
                TextView iiimage = (TextView) findViewById(R.id.class_fourt);
                Animation aaanimation = AnimationUtils.loadAnimation(this, R.anim.blink);
                iiimage.startAnimation(aaanimation);
                mp = MediaPlayer.create(Junior1_classroomrules3.this, R.raw.kind_class);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                isc_fourTapped=true;
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

        if (  isc_threeTapped &&  isc_fourTapped) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Junior1_classroomrules3.this, Junior1_classroomrules4.class);
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





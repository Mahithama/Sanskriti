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

public class Junior1_classroomrules4 extends AppCompatActivity implements View.OnClickListener  {
    ImageView class_seven,class_eight;
    TextView class_sevent,class_eightt;
    MediaPlayer mp,mp3;
    int i;

    private boolean isc_sevenTapped=false;
    private boolean isc_eightTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junior1_classroomrules4);
        class_seven = findViewById(R.id.class_seven);
        class_eight = findViewById(R.id.class_eight);
        class_sevent = findViewById(R.id.class_sevent);
        class_eightt = findViewById(R.id.class_eightt);

        class_seven.setOnClickListener(this);
        class_eight.setOnClickListener(this);
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


            case R.id.class_seven:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                class_sevent.setVisibility(View.VISIBLE);
                TextView iimage = (TextView) findViewById(R.id.class_sevent);
                Animation aanimation = AnimationUtils.loadAnimation(this, R.anim.blink);
                iimage.startAnimation(aanimation);
                mp = MediaPlayer.create(Junior1_classroomrules4.this, R.raw.play_class);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                isc_sevenTapped=true;
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.class_eight:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                class_eightt.setVisibility(View.VISIBLE);
                TextView iiimage = (TextView) findViewById(R.id.class_eightt);
                Animation aaanimation = AnimationUtils.loadAnimation(this, R.anim.blink);
                iiimage.startAnimation(aaanimation);
                mp = MediaPlayer.create(Junior1_classroomrules4.this, R.raw.nice_class);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                isc_eightTapped=true;
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

        if (isc_sevenTapped &&  isc_eightTapped) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Junior1_classroomrules4.this, Junior_themes1n_home.class);
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




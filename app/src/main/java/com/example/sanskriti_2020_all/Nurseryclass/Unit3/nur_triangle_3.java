package com.example.sanskriti_2020_all.Nurseryclass.Unit3;

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

public class nur_triangle_3 extends AppCompatActivity implements View.OnClickListener {
    ImageView pizza,melon,tent,casee,vlc;
    private ViewFlipper viewFlipper;
    MediaPlayer mp,mp3;
    int i;
    private boolean ispizzaTapped=false;
    private boolean ismelonTapped=false;
    private boolean istentTapped=false;
    private boolean isvlcTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nur_triangle_3);

        viewFlipper = findViewById(R.id.viewflipper);
        pizza = findViewById(R.id.pizza);
        melon = findViewById(R.id.melon);
        casee = findViewById(R.id.casee);
        vlc = findViewById(R.id.vlc);
        tent = findViewById(R.id.tent);

        pizza.setOnClickListener(this);
        melon.setOnClickListener(this);
        casee.setOnClickListener(this);
        vlc.setOnClickListener(this);
        tent.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.pizza:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                pizza.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(nur_triangle_3.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ispizzaTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.melon:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                melon.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(nur_triangle_3.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ismelonTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.vlc:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                vlc.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(nur_triangle_3.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isvlcTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.tent:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                tent.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(nur_triangle_3.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                istentTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.casee:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                casee.setVisibility(View.GONE);
                mp = MediaPlayer.create(nur_triangle_3.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
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

        if (ispizzaTapped && ismelonTapped && isvlcTapped && istentTapped) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(nur_triangle_3.this, nur3_themes_activities_home.class);
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

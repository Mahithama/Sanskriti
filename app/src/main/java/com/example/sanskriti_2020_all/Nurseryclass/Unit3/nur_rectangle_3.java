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

public class nur_rectangle_3 extends AppCompatActivity implements View.OnClickListener  {
    ImageView box,tv,casee,vlc,gift;
    private ViewFlipper viewFlipper;
    MediaPlayer mp,mp3;
    int i;
    private boolean isboxTapped=false;
    private boolean istvTapped=false;
    private boolean iscaseeTapped=false;
    private boolean isgiftTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nur_rectangle_3);

        viewFlipper = findViewById(R.id.viewflipper);
        box = findViewById(R.id.box);
        tv = findViewById(R.id.tv);
        casee = findViewById(R.id.casee);
        vlc = findViewById(R.id.vlc);
        gift = findViewById(R.id.gift);

        box.setOnClickListener(this);
        tv.setOnClickListener(this);
        casee.setOnClickListener(this);
        vlc.setOnClickListener(this);
        gift.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.box:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                box.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(nur_rectangle_3.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isboxTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.tv:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                tv.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(nur_rectangle_3.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                istvTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.gift:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                gift.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(nur_rectangle_3.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isgiftTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.casee:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                casee.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(nur_rectangle_3.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iscaseeTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.vlc:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                vlc.setVisibility(View.GONE);
                mp = MediaPlayer.create(nur_rectangle_3.this, R.raw.failure);
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

        if (isgiftTapped && iscaseeTapped && isboxTapped && istvTapped) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(nur_rectangle_3.this, nur3_themes_activities_home.class);
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

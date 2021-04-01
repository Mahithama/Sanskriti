package com.example.sanskriti_2020_all.Juniorclass.unit6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.sanskriti_2020_all.R;

public class Short_o_sounds extends AppCompatActivity implements View.OnClickListener {
    TextView box,fog,cob,cot,
            mom,pod,fox,rob,
            hop,hot,hog,mop,
            pot,jog,pop,top;
    private ViewFlipper viewFlipper;
    Button button;
    MediaPlayer mp,mp3;
    int i;
    private boolean isboxTapped=false;
    private boolean isfogTapped=false;
    private boolean iscobTapped=false;
    private boolean iscotTapped=false;

    private boolean ismomTapped=false;
    private boolean ispodTapped=false;
    private boolean isfoxTapped=false;
    private boolean isrobTapped=false;

    private boolean ishopTapped=false;
    private boolean ishotTapped=false;
    private boolean ishogTapped=false;
    private boolean ismopTapped=false;

    private boolean ispotTapped=false;
    private boolean isjogTapped=false;
    private boolean ispopTapped=false;
    private boolean istopTapped=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_short_o_sounds);

        viewFlipper = findViewById(R.id.viewflipper);
        box = findViewById(R.id.box);
        fog = findViewById(R.id.fog);
        cob = findViewById(R.id.cob);
        cot = findViewById(R.id.cot);

        mom = findViewById(R.id.mom);
        pod = findViewById(R.id.pod);
        fox = findViewById(R.id.fox);
        rob = findViewById(R.id.rob);

        hop = findViewById(R.id.hop);
        hot = findViewById(R.id.hot);
        hog = findViewById(R.id.hog);
        mop = findViewById(R.id.mop);

        pot = findViewById(R.id.pot);
        jog = findViewById(R.id.jog);
        pop = findViewById(R.id.pop);
        top = findViewById(R.id.top);

//////////////////////////////////////////////
        box.setOnClickListener(this);
        fog.setOnClickListener(this);
        cob.setOnClickListener(this);
        cot.setOnClickListener(this);

        mom.setOnClickListener(this);
        pod.setOnClickListener(this);
        fox.setOnClickListener(this);
        rob.setOnClickListener(this);

        hop.setOnClickListener(this);
        hot.setOnClickListener(this);
        hog.setOnClickListener(this);
        mop.setOnClickListener(this);

        pot.setOnClickListener(this);
        jog.setOnClickListener(this);
        pop.setOnClickListener(this);
        top.setOnClickListener(this);


        mp3 = MediaPlayer.create(Short_o_sounds.this, R.raw.success);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();

        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Short_o_sounds.this, ju6_literacy.class);
                startActivity(intent);
            }
        } );
    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.box:
                box.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_o_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isboxTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.cob:
                cob.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_o_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iscobTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.cot:
                cot.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_o_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iscotTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.fog:
                fog.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_o_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isfogTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
////////////////////////////////////
            case R.id.mom:
                mom.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_o_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ismomTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.pod:
                pod.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_o_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ispodTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.fox:
                fox.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_o_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isfoxTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.rob:
                rob.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_o_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isrobTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
//////////////////////////////////////////

            case R.id.hop:
                hop.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_o_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ishopTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.hot:
                hot.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_o_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ishotTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.hog:
                hog.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_o_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ishogTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.mop:
                mop.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_o_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ismopTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            //////// /////////////////////
            case R.id.pot:
                pot.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_o_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ispotTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.jog:
                jog.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_o_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isjogTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.pop:
                pop.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_o_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ispopTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.top:
                top.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_o_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                istopTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            ///////////////////////////////

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

        if (isboxTapped && isfogTapped && iscobTapped && iscotTapped && ismomTapped && ispodTapped && isfoxTapped && isrobTapped && ishopTapped && ishotTapped
                && ishogTapped && ismopTapped && ispotTapped && isjogTapped && ispopTapped && istopTapped ) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Short_o_sounds.this, ju6_literacy.class);
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




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


public class Short_a_sounds extends AppCompatActivity implements View.OnClickListener {
TextView bag,bat,cab,dad,
        wag,cat,mad,van,
        fat,pad,nap,jam,
        sat,sad,tap,ham,
        mat,rat,gap,yam;
    Button button;
    private ViewFlipper viewFlipper;
    MediaPlayer mp,mp3;
    int i;
    private boolean isbagTapped=false;
    private boolean isbatTapped=false;
    private boolean iscabTapped=false;
    private boolean isdadTapped=false;

    private boolean iswagTapped=false;
    private boolean iscatTapped=false;
    private boolean ismadTapped=false;
    private boolean isvanTapped=false;

    private boolean isfatTapped=false;
    private boolean ispadTapped=false;
    private boolean isnapTapped=false;
    private boolean isjamTapped=false;

    private boolean issatTapped=false;
    private boolean issadTapped=false;
    private boolean istapTapped=false;
    private boolean ishamTapped=false;

    private boolean ismatTapped=false;
    private boolean isratTapped=false;
    private boolean isgapTapped=false;
    private boolean isyamTapped=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_short_a_sounds);

        viewFlipper = findViewById(R.id.viewflipper);
        bag = findViewById(R.id.bag);
        bat = findViewById(R.id.bat);
        cab = findViewById(R.id.cab);
        dad = findViewById(R.id.dad);

        wag = findViewById(R.id.wag);
        cat = findViewById(R.id.cat);
        mad = findViewById(R.id.mad);
        van = findViewById(R.id.van);

        fat = findViewById(R.id.fat);
        pad = findViewById(R.id.pad);
        nap = findViewById(R.id.nap);
        jam = findViewById(R.id.jam);

        sat = findViewById(R.id.sat);
        sad = findViewById(R.id.sad);
        tap = findViewById(R.id.tap);
        ham = findViewById(R.id.ham);

        mat = findViewById(R.id.mat);
        rat = findViewById(R.id.rat);
        gap = findViewById(R.id.gap);
        yam = findViewById(R.id.yam);
//////////////////////////////////////////////
        bag.setOnClickListener(this);
        bat.setOnClickListener(this);
        cab.setOnClickListener(this);
        dad.setOnClickListener(this);

        wag.setOnClickListener(this);
        cat.setOnClickListener(this);
        mad.setOnClickListener(this);
        van.setOnClickListener(this);

        fat.setOnClickListener(this);
        pad.setOnClickListener(this);
        nap.setOnClickListener(this);
        jam.setOnClickListener(this);

        sat.setOnClickListener(this);
        sad.setOnClickListener(this);
        tap.setOnClickListener(this);
        ham.setOnClickListener(this);

        mat.setOnClickListener(this);
        rat.setOnClickListener(this);
        gap.setOnClickListener(this);
        yam.setOnClickListener(this);

        mp3 = MediaPlayer.create(Short_a_sounds.this, R.raw.success);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();

        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Short_a_sounds.this, ju6_literacy.class);
                startActivity(intent);
            }
        } );
    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.bag:
                bag.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_a_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isbagTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.bat:
                bat.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_a_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isbatTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.cab:
                cab.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_a_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iscabTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.dad:
                dad.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_a_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isdadTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
////////////////////////////////////
            case R.id.wag:
                wag.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_a_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iswagTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.cat:
                cat.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_a_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iscatTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.mad:
                mad.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_a_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ismadTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.van:
                van.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_a_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isvanTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
//////////////////////////////////////////

            case R.id.fat:
                fat.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_a_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isfatTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.pad:
                pad.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_a_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ispadTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.nap:
                nap.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_a_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isnapTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.jam:
                jam.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_a_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isjamTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
    //////// /////////////////////
            case R.id.sat:
                sat.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_a_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                issatTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.sad:
                sad.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_a_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                issadTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.tap:
                tap.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_a_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                istapTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.ham:
                ham.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_a_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ishamTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
    ///////////////////////////////
            case R.id.mat:
                mat.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_a_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ismatTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.rat:
                rat.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_a_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isratTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.gap:
                gap.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_a_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isgapTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.yam:
                yam.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_a_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isyamTapped=true;
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
        if (mp != null) mp.release();

    }


    public void nextScreen(int i) {

        if (isbagTapped && isbatTapped && iscabTapped && isdadTapped && iswagTapped && iscatTapped && ismadTapped && isvanTapped && isfatTapped && ispadTapped
        && isnapTapped && isjamTapped && issatTapped && issadTapped && istapTapped && ishamTapped && ismatTapped && isratTapped && isgapTapped&& isyamTapped) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Short_a_sounds.this, ju6_literacy.class);
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




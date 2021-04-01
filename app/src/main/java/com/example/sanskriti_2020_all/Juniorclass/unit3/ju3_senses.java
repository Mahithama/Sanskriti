package com.example.sanskriti_2020_all.Juniorclass.unit3;

import androidx.appcompat.app.AppCompatActivity;

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

import com.example.sanskriti_2020_all.Nurseryclass.Unit1.Nursery1_Quantity;
import com.example.sanskriti_2020_all.Nurseryclass.Unit1.Nursery1__route_onetoten;
import com.example.sanskriti_2020_all.Nurseryclass.Unit1.Nursery_numeracy1n_home;
import com.example.sanskriti_2020_all.R;

public class ju3_senses extends AppCompatActivity implements View.OnClickListener {
    ImageView na, nb,nc,nd,ea,eb,ec,ed,ma,mb,mc,md;
    private ViewFlipper viewFlipper;
    MediaPlayer mp,mp3;
    Button Next;
    int i;

    private boolean isnaTapped=false;
    private boolean isnbTapped=false;
    private boolean isncTapped=false;
    private boolean iseaTapped=false;
    private boolean isedTapped=false;
    private boolean ismaTapped=false;
    private boolean ismbTapped=false;
    private boolean ismcTapped=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ju3_senses);

        viewFlipper = findViewById(R.id.viewflipper);
        na = findViewById(R.id.na);
        nb = findViewById(R.id.nb);
        nc = findViewById(R.id.nc);
        nd = findViewById(R.id.nd);
        ea = findViewById(R.id.ea);
        eb = findViewById(R.id.eb);
        ec = findViewById(R.id.ec);
        ed = findViewById(R.id.ed);
        ma = findViewById(R.id.ma);
        mb = findViewById(R.id.mb);
        mc = findViewById(R.id.mc);
        md = findViewById(R.id.md);

        na.setOnClickListener(this);
        nb.setOnClickListener(this);
        nc.setOnClickListener(this);
        nd.setOnClickListener(this);
        ea.setOnClickListener(this);
        eb.setOnClickListener(this);
        ec.setOnClickListener(this);
        ed.setOnClickListener(this);
        ma.setOnClickListener(this);
        mb.setOnClickListener(this);
        mc.setOnClickListener(this);
        md.setOnClickListener(this);

        mp3 = MediaPlayer.create(ju3_senses.this, R.raw.counting_one_ten);
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




            case R.id.na:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView imagna=(ImageView)findViewById(R.id.one);
                Animation animationa= AnimationUtils.loadAnimation(this, R.anim.zoom_in);
                imagna.startAnimation(animationa);
                mp = MediaPlayer.create(ju3_senses.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isnaTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.nb:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView imagnb=(ImageView)findViewById(R.id.nb);
                Animation animationb= AnimationUtils.loadAnimation(this, R.anim.zoom_in);
                imagnb.startAnimation(animationb);
                mp = MediaPlayer.create(ju3_senses.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isnbTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.nc:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView imagnc=(ImageView)findViewById(R.id.nc);
                Animation animationc= AnimationUtils.loadAnimation(this, R.anim.zoom_in);
                imagnc.startAnimation(animationc);
                mp = MediaPlayer.create(ju3_senses.this, R.raw.one);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isncTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.nd:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                nd.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(ju3_senses.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.ea:
                ImageView imagea=(ImageView)findViewById(R.id.ea);
                Animation animatioea= AnimationUtils.loadAnimation(this, R.anim.zoom_in);
                imagea.startAnimation(animatioea);
                mp = MediaPlayer.create(ju3_senses.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iseaTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.ed:
                ImageView imaged=(ImageView)findViewById(R.id.ed);
                Animation animatioed= AnimationUtils.loadAnimation(this, R.anim.zoom_in);
                imaged.startAnimation(animatioed);
                mp = MediaPlayer.create(ju3_senses.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isedTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.eb:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                eb.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(ju3_senses.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.ec:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ec.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(ju3_senses.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;


            case R.id.ma:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView imagma=(ImageView)findViewById(R.id.one);
                Animation animatioma= AnimationUtils.loadAnimation(this, R.anim.zoom_in);
                imagma.startAnimation(animatioma);
                mp = MediaPlayer.create(ju3_senses.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ismaTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.mb:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView imagmb=(ImageView)findViewById(R.id.nb);
                Animation animatiomb= AnimationUtils.loadAnimation(this, R.anim.zoom_in);
                imagmb.startAnimation(animatiomb);
                mp = MediaPlayer.create(ju3_senses.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ismbTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.mc:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView imagmc=(ImageView)findViewById(R.id.nc);
                Animation animatiomc= AnimationUtils.loadAnimation(this, R.anim.zoom_in);
                imagmc.startAnimation(animatiomc);
                mp = MediaPlayer.create(ju3_senses.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ismcTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.md:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                md.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(ju3_senses.this, R.raw.failure);
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
        //if (mp != null) mp.release();

    }


    public void nextScreen(int i) {

        if (isnaTapped && isnbTapped && isncTapped && iseaTapped && isedTapped && ismaTapped && ismbTapped && ismcTapped ) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(ju3_senses.this, Ju3_theme_activities.class);
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




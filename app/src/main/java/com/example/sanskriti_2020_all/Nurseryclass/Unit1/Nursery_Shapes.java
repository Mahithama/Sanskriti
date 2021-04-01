package com.example.sanskriti_2020_all.Nurseryclass.Unit1;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanskriti_2020_all.R;

public class Nursery_Shapes extends AppCompatActivity implements View.OnClickListener  {
    ImageView s_box,s_tv,s_mirror,s_frame,t_hut,t_ice,t_melon,t_pizza,c_ball,c_rug,c_hut,c_lemon;
    MediaPlayer mp,mp3;
    int i;

    private boolean iss_tvTapped=false;
    private boolean ist_iceTapped=false;
    private boolean isc_rugTapped=false;
    private boolean isc_hutTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nursery__shapes);
        s_box= findViewById(R.id.s_box);
        s_tv= findViewById(R.id.s_tv);
        s_mirror= findViewById(R.id.s_mirror);
        s_frame= findViewById(R.id.s_frame);
        t_hut= findViewById(R.id.t_hut);
        t_ice= findViewById(R.id.t_ice);
        t_melon= findViewById(R.id.t_melon);
        t_pizza= findViewById(R.id.t_pizza);
        c_ball= findViewById(R.id.c_ball);
        c_rug= findViewById(R.id.c_rug);
        c_hut= findViewById(R.id.c_hut);
        c_lemon= findViewById(R.id.c_lemon);

        s_box.setOnClickListener(this);
        s_tv.setOnClickListener(this);
        s_mirror.setOnClickListener(this);
        s_frame.setOnClickListener(this);
        t_hut.setOnClickListener(this);
        t_ice.setOnClickListener(this);
        t_melon.setOnClickListener(this);
        t_pizza.setOnClickListener(this);
        c_ball.setOnClickListener(this);
        c_rug.setOnClickListener(this);
        c_hut.setOnClickListener(this);
        c_lemon.setOnClickListener(this);

        mp3 = MediaPlayer.create(Nursery_Shapes.this, R.raw.shapes_title);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();
    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        if (mp != null) mp.release();

        switch (v.getId()) {


            case R.id.s_box:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                s_box.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery_Shapes.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.s_tv:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView image = (ImageView) findViewById(R.id.s_tv);
                Animation animation = AnimationUtils.loadAnimation(this, R.anim.blink);
                image.startAnimation(animation);
                s_tv.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery_Shapes.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                this.i++;
                iss_tvTapped=true;
                nextScreen(this.i);
                break;

            case R.id.s_mirror:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                s_mirror.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery_Shapes.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.s_frame:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                s_frame.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery_Shapes.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.t_hut:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                t_hut.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery_Shapes.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.t_ice:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView imagee = (ImageView) findViewById(R.id.t_ice);
                Animation animationn = AnimationUtils.loadAnimation(this, R.anim.blink);
                imagee.startAnimation(animationn);
                t_ice.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery_Shapes.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                this.i++;
                ist_iceTapped=true;
                nextScreen(this.i);
                break;

            case R.id.t_melon:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                t_melon.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery_Shapes.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.t_pizza:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                t_pizza.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery_Shapes.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.c_ball:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                c_ball.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery_Shapes.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;


            case R.id.c_rug:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView irimage = (ImageView) findViewById(R.id.c_rug);
                Animation aannimation = AnimationUtils.loadAnimation(this, R.anim.blink);
                irimage.startAnimation(aannimation);
                c_rug.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery_Shapes.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                this.i++;
                isc_rugTapped=true;
                nextScreen(this.i);
                break;

            case R.id.c_hut:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                ImageView iimage = (ImageView) findViewById(R.id.c_hut);
                Animation aanimation = AnimationUtils.loadAnimation(this, R.anim.blink);
                iimage.startAnimation(aanimation);
                c_hut.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery_Shapes.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                this.i++;
                isc_hutTapped=true;
                nextScreen(this.i);
                break;

            case R.id.c_lemon:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                c_lemon.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery_Shapes.this, R.raw.failure);
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

        if (iss_tvTapped && ist_iceTapped && isc_rugTapped && isc_hutTapped ) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Nursery_Shapes.this, Nursery_activitiess_home.class);
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

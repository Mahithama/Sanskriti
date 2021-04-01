package com.example.sanskriti_2020_all.Juniorclass.unit1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.sanskriti_2020_all.R;


public class Junior1_beginingsounds extends AppCompatActivity implements View.OnClickListener {
    TextView b_bo,c_bo,d_bo,
            d_du,s_du,f_du,
            b_fo,f_fo,s_fo,
            b_en,c_en,e_en,
            j_gr,s_gr,g_gr,
            t_to,s_to,a_to;
    private ViewFlipper viewFlipper;
    MediaPlayer mp,mp3;
    int i;

    private boolean isb_boTapped=false;
    private boolean isd_duTapped=false;
    private boolean isf_foTapped=false;
    private boolean ise_enTapped=false;
    private boolean isg_grTapped=false;
    private boolean ist_toTapped=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junior1_beginingsounds);

        viewFlipper = findViewById(R.id.viewflipper);
        b_bo = findViewById(R.id.b_bo);
        c_bo = findViewById(R.id.c_bo);
        d_bo = findViewById(R.id.d_bo);
        d_du = findViewById(R.id.d_du);
        s_du = findViewById(R.id.s_du);
        f_du = findViewById(R.id.f_du);
        b_fo = findViewById(R.id.b_fo);
        f_fo = findViewById(R.id.f_fo);
        s_fo = findViewById(R.id.s_fo);
        b_en = findViewById(R.id.b_en);
        c_en = findViewById(R.id.c_en);
        e_en = findViewById(R.id.e_en);
        j_gr = findViewById(R.id.j_gr);
        s_gr = findViewById(R.id.s_gr);
        g_gr = findViewById(R.id.g_gr);
        t_to = findViewById(R.id.t_to);
        s_to = findViewById(R.id.s_to);
        a_to = findViewById(R.id.a_to);

        b_bo.setOnClickListener(this);
        c_bo.setOnClickListener(this);
        d_bo.setOnClickListener(this);
        d_du.setOnClickListener(this);
        s_du.setOnClickListener(this);
        f_du.setOnClickListener(this);
        b_fo.setOnClickListener(this);
        f_fo.setOnClickListener(this);
        s_fo.setOnClickListener(this);
        b_en.setOnClickListener(this);
        c_en.setOnClickListener(this);
        e_en.setOnClickListener(this);
        j_gr.setOnClickListener(this);
        s_gr.setOnClickListener(this);
        g_gr.setOnClickListener(this);
        t_to.setOnClickListener(this);
        s_to.setOnClickListener(this);
        a_to.setOnClickListener(this);

        mp3 = MediaPlayer.create(Junior1_beginingsounds.this, R.raw.beginning_sound);
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


            case R.id.b_bo:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                b_bo.setTextColor(Color.parseColor("#FF0000"));
                TextView image = (TextView) findViewById(R.id.b_bo);
                Animation animation = AnimationUtils.loadAnimation(this, R.anim.blink);
                image.startAnimation(animation);
                mp = MediaPlayer.create(Junior1_beginingsounds.this, R.raw.b);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                isb_boTapped=true;
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.c_bo:
                mp = MediaPlayer.create(Junior1_beginingsounds.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.d_bo:
                mp = MediaPlayer.create(Junior1_beginingsounds.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.d_du:
                d_du.setTextColor(Color.parseColor("#FF0000"));
                TextView imagee = (TextView) findViewById(R.id.d_du);
                Animation animationn = AnimationUtils.loadAnimation(this, R.anim.blink);
                imagee.startAnimation(animationn);
                mp = MediaPlayer.create(Junior1_beginingsounds.this, R.raw.d);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                isd_duTapped=true;
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.s_du:
                mp = MediaPlayer.create(Junior1_beginingsounds.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.f_du:
                mp = MediaPlayer.create(Junior1_beginingsounds.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.f_fo:
                f_fo.setTextColor(Color.parseColor("#FF0000"));
                TextView iimage = (TextView) findViewById(R.id.f_fo);
                Animation aanimation = AnimationUtils.loadAnimation(this, R.anim.blink);
                iimage.startAnimation(aanimation);
                mp = MediaPlayer.create(Junior1_beginingsounds.this, R.raw.f);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                isf_foTapped=true;
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.b_fo:
                mp = MediaPlayer.create(Junior1_beginingsounds.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.s_fo:
                mp = MediaPlayer.create(Junior1_beginingsounds.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.e_en:
                e_en.setTextColor(Color.parseColor("#FF0000"));
                TextView iiimage = (TextView) findViewById(R.id.e_en);
                Animation aaanimation = AnimationUtils.loadAnimation(this, R.anim.blink);
                iiimage.startAnimation(aaanimation);
                mp = MediaPlayer.create(Junior1_beginingsounds.this, R.raw.e);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                ise_enTapped=true;
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.b_en:
                mp = MediaPlayer.create(Junior1_beginingsounds.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.c_en:
                mp = MediaPlayer.create(Junior1_beginingsounds.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.g_gr:
                g_gr.setTextColor(Color.parseColor("#FF0000"));
                TextView iiimagge = (TextView) findViewById(R.id.g_gr);
                Animation aaanimationn = AnimationUtils.loadAnimation(this, R.anim.blink);
                iiimagge.startAnimation(aaanimationn);
                mp = MediaPlayer.create(Junior1_beginingsounds.this, R.raw.g);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                isg_grTapped=true;
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.s_gr:
                mp = MediaPlayer.create(Junior1_beginingsounds.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.j_gr:
                mp = MediaPlayer.create(Junior1_beginingsounds.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.t_to:
                t_to.setTextColor(Color.parseColor("#FF0000"));
                TextView iiimagage = (TextView) findViewById(R.id.t_to);
                Animation aaanimvationn = AnimationUtils.loadAnimation(this, R.anim.blink);
                iiimagage.startAnimation(aaanimvationn);
                mp = MediaPlayer.create(Junior1_beginingsounds.this, R.raw.t);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                ist_toTapped=true;
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.s_to:
                mp = MediaPlayer.create(Junior1_beginingsounds.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.a_to:
                mp = MediaPlayer.create(Junior1_beginingsounds.this, R.raw.failure);
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



    }


    public void nextScreen(int i) {

        if (isb_boTapped && isd_duTapped && isf_foTapped && ise_enTapped  && isg_grTapped && ist_toTapped) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Junior1_beginingsounds.this, Junior_literacy1n_home.class);
                    act.putExtra("activity_name", activity_name);
                    startActivity(act);


                }
            }, 5000);


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





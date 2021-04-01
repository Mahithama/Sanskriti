package com.example.sanskriti_2020_all.Nurseryclass.Unit2;

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

public class A_alphabet extends AppCompatActivity implements View.OnClickListener {
    ImageView apple,axe,arrow,tomato,star,avacado;
    MediaPlayer mp,mp3;
    int i;
    private ViewFlipper viewFlipper;
    private boolean isappleTapped=false;
    private boolean isaxeTapped=false;
    private boolean isarrowTapped=false;
    private boolean isavacadoTapped=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_alphabet);
        apple = findViewById(R.id.apple);
        axe = findViewById(R.id.axe);
        arrow = findViewById(R.id.arrow);
        tomato = findViewById(R.id.tomato);
        star = findViewById(R.id.star);
        avacado = findViewById(R.id.avacado);

        viewFlipper = findViewById(R.id.viewflipper);

        apple.setOnClickListener(this);
        axe.setOnClickListener(this);
        arrow.setOnClickListener(this);
        tomato.setOnClickListener(this);
        star.setOnClickListener(this);
        avacado.setOnClickListener(this);

        mp3 = MediaPlayer.create(A_alphabet.this, R.raw.a_title_alpha);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();
    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();

        if(mp != null){
            if(mp.isPlaying()){
                mp.stop();
            }
            mp.release();
        }

        switch (v.getId()) {


            case R.id.star:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                star.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(A_alphabet.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;
            case R.id.tomato:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                tomato.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(A_alphabet.this, R.raw.failure);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.apple:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                apple.setImageResource(R.drawable.a_app_a);
                apple.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(A_alphabet.this, R.raw.a_apple_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isappleTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.axe:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                axe.setImageResource(R.drawable.a_ax_a);
                axe.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(A_alphabet.this, R.raw.a_axe_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isaxeTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.arrow:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                arrow.setImageResource(R.drawable.a_arr_a);
                arrow.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(A_alphabet.this, R.raw.a_arrow_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isarrowTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.avacado:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                avacado.setImageResource(R.drawable.a_av_a);
                avacado.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(A_alphabet.this, R.raw.a_apricot_alpha);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isavacadoTapped=true;
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

        if (isavacadoTapped && isaxeTapped && isarrowTapped  && isappleTapped ) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(A_alphabet.this, nur2_literacy.class);
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

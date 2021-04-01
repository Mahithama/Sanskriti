package com.example.sanskriti_2020_all.Nurseryclass.Unit1;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanskriti_2020_all.R;

public class Nursery1_alphabets1 extends AppCompatActivity implements View.OnClickListener {
    TextView a,b,c,d,e,f,g,h,i1,j,k,l,m;
    MediaPlayer mp,mp3;
    private ViewFlipper viewFlipper;
    Button Next;
    int i;

    private boolean isaTapped=false;
    private boolean isbTapped=false;
    private boolean iscTapped=false;
    private boolean isdTapped=false;
    private boolean iseTapped=false;
    private boolean isfTapped=false;
    private boolean isgTapped=false;
    private boolean ishTapped=false;
    private boolean isi1Tapped=false;
    private boolean isjTapped=false;
    private boolean iskTapped=false;
    private boolean islTapped=false;
    private boolean ismTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nursery1_alphabets1);

        viewFlipper = findViewById(R.id.viewflipper);
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);
        d = findViewById(R.id.d);
        e = findViewById(R.id.e);
        f = findViewById(R.id.f);
        g = findViewById(R.id.g);
        h = findViewById(R.id.h);
        i1 = findViewById(R.id.i1);
        j = findViewById(R.id.j);
        k = findViewById(R.id.k);
        l = findViewById(R.id.l);
        m = findViewById(R.id.m);


        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i1.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);

        mp3 = MediaPlayer.create(Nursery1_alphabets1.this, R.raw.letters_a_z);
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


            case R.id.a:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                a.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_alphabets1.this, R.raw.a);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isaTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.b:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                b.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_alphabets1.this, R.raw.b);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isbTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.c:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                c.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_alphabets1.this, R.raw.c);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iscTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.d:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                d.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_alphabets1.this, R.raw.d);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isdTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.e:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                e.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_alphabets1.this, R.raw.e);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iseTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.f:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                f.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_alphabets1.this, R.raw.f);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isfTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.g:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                g.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_alphabets1.this, R.raw.g);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isgTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.h:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                h.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_alphabets1.this, R.raw.h);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ishTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.i1:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                i1.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_alphabets1.this, R.raw.i);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isi1Tapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.j:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                j.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_alphabets1.this, R.raw.j);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isjTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.k:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                k.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_alphabets1.this, R.raw.k);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iskTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.l:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                l.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_alphabets1.this, R.raw.l);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                islTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.m:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                m.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_alphabets1.this, R.raw.m);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ismTapped=true;
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

        if (isaTapped && isbTapped && iscTapped  && isdTapped &&  iseTapped  && isfTapped  && isgTapped  && ishTapped &&  isi1Tapped  && isjTapped &&  iskTapped  && islTapped  && ismTapped) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Nursery1_alphabets1.this, Nursery1_alphabets2.class);
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

package com.example.sanskriti_2020_all.Nurseryclass.Unit1;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanskriti_2020_all.R;

public class Nursery1_alphabets2 extends AppCompatActivity implements View.OnClickListener  {
    TextView n,o,p,q,r,s,t,u,v,w,x,y,z;
    MediaPlayer mp,mp3;
    int i;
    Button Next;
    private boolean isnTapped=false;
    private boolean isoTapped=false;
    private boolean ispTapped=false;
    private boolean isqTapped=false;
    private boolean isrTapped=false;
    private boolean issTapped=false;
    private boolean istTapped=false;
    private boolean isuTapped=false;
    private boolean isvTapped=false;
    private boolean iswTapped=false;
    private boolean isxTapped=false;
    private boolean isyTapped=false;
    private boolean iszTapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nursery1_alphabets2);


        n = findViewById(R.id.n);
        o = findViewById(R.id.o);
        p = findViewById(R.id.p);
        q = findViewById(R.id.q);
        r = findViewById(R.id.r);
        s = findViewById(R.id.s);
        t = findViewById(R.id.t);
        u = findViewById(R.id.u);
        v = findViewById(R.id.v);
        w = findViewById(R.id.w);
        x = findViewById(R.id.x);
        y = findViewById(R.id.y);
        z = findViewById(R.id.z);


        n.setOnClickListener(this);
        o.setOnClickListener(this);
        p.setOnClickListener(this);
        q.setOnClickListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        u.setOnClickListener(this);
        v.setOnClickListener(this);
        w.setOnClickListener(this);
        x.setOnClickListener(this);
        y.setOnClickListener(this);
        z.setOnClickListener(this);

        Next = findViewById(R.id.Next);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Nursery1_alphabets2.this, Nursery_literacy1n_home.class);
                startActivity(i);
            }
        });
    }
    @Override
    public void onClick(View v) {

        // Find which ImageButton was pressed and take appropriate action
        if(mp != null){
            if(mp.isPlaying()){
                mp.stop();
            }
            mp.release();
        }

        switch (v.getId()) {


            case R.id.n:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                n.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_alphabets2.this, R.raw.n);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isnTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.o:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                o.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_alphabets2.this, R.raw.o);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isoTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.p:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                p.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_alphabets2.this, R.raw.p);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ispTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.q:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                q.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_alphabets2.this, R.raw.q);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isqTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.r:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                r.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_alphabets2.this, R.raw.r);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isrTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.s:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                s.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_alphabets2.this, R.raw.s);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                issTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.t:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                t.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_alphabets2.this, R.raw.t);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                istTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.u:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                u.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_alphabets2.this, R.raw.u);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isuTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.v:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                v.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_alphabets2.this, R.raw.v);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isvTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.w:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                w.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_alphabets2.this, R.raw.w);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iswTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.x:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                x.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_alphabets2.this, R.raw.x);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isxTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.y:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                y.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_alphabets2.this, R.raw.y);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isyTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.z:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                z.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(Nursery1_alphabets2.this, R.raw.z);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iszTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;



        }

        mp.seekTo(0);
        mp.start();


    }

    public void nextScreen(int i) {

        if ( isnTapped && isoTapped  && ispTapped &&  isqTapped  && isrTapped  && issTapped  && istTapped  && isuTapped  && isvTapped &&  iswTapped  && isxTapped  && isyTapped  && iszTapped) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Nursery1_alphabets2.this, Nursery_literacy1n_home.class);
                    act.putExtra("activity_name", activity_name);
                    startActivity(act);


                }
            }, 1000);


        }
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
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}

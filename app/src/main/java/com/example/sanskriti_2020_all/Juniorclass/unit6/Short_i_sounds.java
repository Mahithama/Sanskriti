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

public class Short_i_sounds extends AppCompatActivity implements View.OnClickListener {
    TextView bin,chin,grin,skin,
            pin,sin,thin,win,
            twin,in,fin,kin;
    private ViewFlipper viewFlipper;
    Button button;
    MediaPlayer mp,mp3;
    int i;
    private boolean isbinTapped=false;
    private boolean ischinTapped=false;
    private boolean isgrinTapped=false;
    private boolean isskinTapped=false;

    private boolean ispinTapped=false;
    private boolean issinTapped=false;
    private boolean isthinTapped=false;
    private boolean iswinTapped=false;

    private boolean istwinTapped=false;
    private boolean isinTapped=false;
    private boolean isfinTapped=false;
    private boolean iskinTapped=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_short_i_sounds);

        viewFlipper = findViewById(R.id.viewflipper);
        bin = findViewById(R.id.bin);
        chin = findViewById(R.id.chin);
        grin = findViewById(R.id.grin);
        skin = findViewById(R.id.skin);

        pin = findViewById(R.id.pin);
        sin = findViewById(R.id.sin);
        thin = findViewById(R.id.thin);
        win = findViewById(R.id.win);

        twin = findViewById(R.id.twin);
        in = findViewById(R.id.in);
        fin = findViewById(R.id.fin);
        kin = findViewById(R.id.kin);


//////////////////////////////////////////////
        bin.setOnClickListener(this);
        chin.setOnClickListener(this);
        grin.setOnClickListener(this);
        skin.setOnClickListener(this);

        pin.setOnClickListener(this);
        sin.setOnClickListener(this);
        thin.setOnClickListener(this);
        win.setOnClickListener(this);

        twin.setOnClickListener(this);
        in.setOnClickListener(this);
        fin.setOnClickListener(this);
        kin.setOnClickListener(this);

        mp3 = MediaPlayer.create(Short_i_sounds.this, R.raw.success);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();

        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Short_i_sounds.this, ju6_literacy.class);
                startActivity(intent);
            }
        } );
    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.bin:
                bin.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_i_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isbinTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.chin:
                chin.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_i_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ischinTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.grin:
                grin.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_i_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isgrinTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.skin:
                skin.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_i_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isskinTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
////////////////////////////////////
            case R.id.pin:
                pin.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_i_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ispinTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.sin:
                sin.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_i_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                issinTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.thin:
                thin.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_i_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isthinTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.win:
                win.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_i_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iswinTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
//////////////////////////////////////////

            case R.id.twin:
                twin.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_i_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                istwinTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.in:
                in.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_i_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isinTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.fin:
                fin.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_i_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isfinTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.kin:
                kin.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_i_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iskinTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            //////// /////////////////////

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

        if (isbinTapped && ischinTapped && isgrinTapped && isskinTapped && ispinTapped && issinTapped && isthinTapped && iswinTapped && istwinTapped && isinTapped
                && isfinTapped && iskinTapped  ) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Short_i_sounds.this, ju6_literacy.class);
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


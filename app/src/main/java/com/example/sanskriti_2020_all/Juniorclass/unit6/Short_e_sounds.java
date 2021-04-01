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



public class Short_e_sounds extends AppCompatActivity implements View.OnClickListener {
    TextView bed,beg,hem,hen,
            jet,leg,web,red,
            men,pen,ten,net,
            pet,vet,wet,tea;
    private ViewFlipper viewFlipper;
    Button button;
    MediaPlayer mp,mp3;
    int i;
    private boolean isbedTapped=false;
    private boolean isbegTapped=false;
    private boolean ishemTapped=false;
    private boolean ishenTapped=false;

    private boolean isjetTapped=false;
    private boolean islegTapped=false;
    private boolean iswebTapped=false;
    private boolean isredTapped=false;

    private boolean ismenTapped=false;
    private boolean ispenTapped=false;
    private boolean istenTapped=false;
    private boolean isnetTapped=false;

    private boolean ispetTapped=false;
    private boolean isvetTapped=false;
    private boolean iswetTapped=false;
    private boolean isteaTapped=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_short_e_sounds);

        viewFlipper = findViewById(R.id.viewflipper);
        bed = findViewById(R.id.bed);
        beg = findViewById(R.id.beg);
        hem = findViewById(R.id.hem);
        hen = findViewById(R.id.hen);

        jet = findViewById(R.id.jet);
        leg = findViewById(R.id.leg);
        web = findViewById(R.id.web);
        red = findViewById(R.id.red);

        men = findViewById(R.id.men);
        pen = findViewById(R.id.pen);
        ten = findViewById(R.id.ten);
        net = findViewById(R.id.net);

        pet = findViewById(R.id.pet);
        vet = findViewById(R.id.vet);
        wet = findViewById(R.id.wet);
        tea = findViewById(R.id.tea);

//////////////////////////////////////////////
        bed.setOnClickListener(this);
        beg.setOnClickListener(this);
        hem.setOnClickListener(this);
        hen.setOnClickListener(this);

        jet.setOnClickListener(this);
        leg.setOnClickListener(this);
        web.setOnClickListener(this);
        red.setOnClickListener(this);

        men.setOnClickListener(this);
        pen.setOnClickListener(this);
        ten.setOnClickListener(this);
        net.setOnClickListener(this);

        pet.setOnClickListener(this);
        vet.setOnClickListener(this);
        wet.setOnClickListener(this);
        tea.setOnClickListener(this);


        mp3 = MediaPlayer.create(Short_e_sounds.this, R.raw.success);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();

        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Short_e_sounds.this, ju6_literacy.class);
                startActivity(intent);
            }
        } );
    }
    @Override
    public void onClick(View v) {


        // Find which ImageButton was pressed and take appropriate action
        // if (mp != null) mp.release();


        switch (v.getId()) {


            case R.id.bed:
                bed.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_e_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isbedTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.beg:
                beg.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_e_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isbegTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.hem:
                hem.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_e_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ishemTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.hen:
                hen.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_e_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ishenTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
////////////////////////////////////
            case R.id.jet:
                jet.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_e_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isjetTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.leg:
                leg.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_e_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                islegTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.web:
                web.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_e_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iswebTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.red:
                red.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_e_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isredTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
//////////////////////////////////////////

            case R.id.men:
                men.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_e_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ismenTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.pen:
                pen.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_e_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ispenTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.ten:
                ten.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_e_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                istenTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.net:
                net.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_e_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isnetTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            //////// /////////////////////
            case R.id.pet:
                pet.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_e_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ispetTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.vet:
                vet.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_e_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isvetTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.wet:
                wet.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_e_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                iswetTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.tea:
                tea.setBackgroundColor(Color.parseColor("#dd3737"));
                mp = MediaPlayer.create(Short_e_sounds.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isteaTapped=true;
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

        if (isbedTapped && isbegTapped && ishemTapped && ishenTapped && isjetTapped && islegTapped && iswebTapped && isredTapped && ismenTapped && ispenTapped
                && istenTapped && isnetTapped && ispetTapped && isvetTapped && iswetTapped && isteaTapped ) {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Short_e_sounds.this, ju6_literacy.class);
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




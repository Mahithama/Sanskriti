package com.example.sanskriti_2020_all.Seniorkg.Unit1;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanskriti_2020_all.R;


public class Senior1_Quantity extends AppCompatActivity implements View.OnClickListener  {
    TextView lion_1,lion_2,lion_3,
            dog_1,dog_2,dog_3,
            hen_4,hen_2,hen_5,
            emo_1,emo_2,emo_3,
            fruit_7,fruit_2,fruit_3,
            candy_9,candy_8,candy_7;
    private ViewFlipper viewFlipper;
    MediaPlayer mp,mp3;
    int i;

    private boolean islion_1Tapped=false;
    private boolean isemo_3Tapped=false;
    private boolean isdog_2Tapped=false;
    private boolean isfruit_7Tapped=false;
    private boolean iscandy_9Tapped=false;
    private boolean ishen_4Tapped=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senior1__quantity);

        viewFlipper = findViewById(R.id.viewflipper);

        lion_1 = findViewById(R.id.lion_1);
        lion_2 = findViewById(R.id.lion_2);
        lion_3 = findViewById(R.id.lion_3);
        dog_1 = findViewById(R.id.dog_1);
        dog_2 = findViewById(R.id.dog_2);
        dog_3 = findViewById(R.id.dog_3);
        hen_2 = findViewById(R.id.hen_2);
        hen_4 = findViewById(R.id.hen_4);
        hen_5 = findViewById(R.id.hen_5);
        emo_1 = findViewById(R.id.emo_1);
        emo_2 = findViewById(R.id.emo_2);
        emo_3 = findViewById(R.id.emo_3);
        fruit_7 = findViewById(R.id.fruit_7);
        fruit_2 = findViewById(R.id.fruit_2);
        fruit_3 = findViewById(R.id.fruit_3);
        candy_9 = findViewById(R.id.candy_9);
        candy_8 = findViewById(R.id.candy_8);
        candy_7 = findViewById(R.id.candy_7);



        lion_1.setOnClickListener(this);
        lion_2.setOnClickListener(this);
        lion_3.setOnClickListener(this);
        dog_1.setOnClickListener(this);
        dog_2.setOnClickListener(this);
        dog_3.setOnClickListener(this);
        hen_2.setOnClickListener(this);
        hen_4.setOnClickListener(this);
        hen_5.setOnClickListener(this);
        emo_1.setOnClickListener(this);
        emo_2.setOnClickListener(this);
        emo_3.setOnClickListener(this);
        fruit_7.setOnClickListener(this);
        fruit_2.setOnClickListener(this);
        fruit_3.setOnClickListener(this);
        candy_9.setOnClickListener(this);
        candy_8.setOnClickListener(this);
        candy_7.setOnClickListener(this);

        mp3 = MediaPlayer.create(Senior1_Quantity.this, R.raw.senior_quantity_title);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();
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


            case R.id.lion_1:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                lion_1.setTextColor(Color.parseColor("#FF0000"));
                mp = MediaPlayer.create(Senior1_Quantity.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                islion_1Tapped=true;
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.lion_2:
                mp = MediaPlayer.create(Senior1_Quantity.this, R.raw.try_again_new);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.lion_3:
                mp = MediaPlayer.create(Senior1_Quantity.this, R.raw.try_again_new);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;


            case R.id.fruit_7:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                fruit_7.setTextColor(Color.parseColor("#FF0000"));
                mp = MediaPlayer.create(Senior1_Quantity.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                isfruit_7Tapped=true;
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.fruit_2:
                mp = MediaPlayer.create(Senior1_Quantity.this, R.raw.try_again_new);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.fruit_3:
                mp = MediaPlayer.create(Senior1_Quantity.this, R.raw.try_again_new);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;


            case R.id.dog_2:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                dog_2.setTextColor(Color.parseColor("#FF0000"));
                mp = MediaPlayer.create(Senior1_Quantity.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                isdog_2Tapped=true;
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.dog_1:
                mp = MediaPlayer.create(Senior1_Quantity.this, R.raw.try_again_new);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.dog_3:
                mp = MediaPlayer.create(Senior1_Quantity.this, R.raw.try_again_new);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;


            case R.id.emo_3:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                emo_3.setTextColor(Color.parseColor("#FF0000"));
                mp = MediaPlayer.create(Senior1_Quantity.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                isemo_3Tapped=true;
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.emo_1:
                mp = MediaPlayer.create(Senior1_Quantity.this, R.raw.try_again_new);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.emo_2:
                mp = MediaPlayer.create(Senior1_Quantity.this, R.raw.try_again_new);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;


            case R.id.candy_9:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                candy_9.setTextColor(Color.parseColor("#FF0000"));
                mp = MediaPlayer.create(Senior1_Quantity.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                iscandy_9Tapped=true;
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.candy_7:
                mp = MediaPlayer.create(Senior1_Quantity.this, R.raw.try_again_new);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.candy_8:
                mp = MediaPlayer.create(Senior1_Quantity.this, R.raw.try_again_new);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;


            case R.id.hen_4:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                hen_4.setTextColor(Color.parseColor("#FF0000"));
                mp = MediaPlayer.create(Senior1_Quantity.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                ishen_4Tapped=true;
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.hen_2:
                mp = MediaPlayer.create(Senior1_Quantity.this, R.raw.try_again_new);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.hen_5:
                mp = MediaPlayer.create(Senior1_Quantity.this, R.raw.try_again_new);
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
        //  if (mp != null) mp.release();

    }


    public void nextScreen(int i) {

        if (islion_1Tapped && isemo_3Tapped &&  isdog_2Tapped &&  isfruit_7Tapped &&  iscandy_9Tapped &&  ishen_4Tapped) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(Senior1_Quantity.this, Senior_numeracy1n_home.class);
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
    public void nextView(View v) {
        viewFlipper.showNext();
        if(mp3 != null && mp3.isPlaying()){
            mp3.stop();
        }

    }
}



package com.example.sanskriti_2020_all.Juniorclass.unit2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.sanskriti_2020_all.Juniorclass.unit3.junior_count2_3;
import com.example.sanskriti_2020_all.Juniorclass.unit3.junior_count_3;
import com.example.sanskriti_2020_all.MyClickListener;
import com.example.sanskriti_2020_all.Nurseryclass.Unit1.Nursery1_alphabets1;
import com.example.sanskriti_2020_all.Nurseryclass.Unit1.Nursery1_alphabets2;
import com.example.sanskriti_2020_all.R;

public class ju2_classroom extends AppCompatActivity implements View.OnClickListener {
    ImageView bag,board,desk,chair,paper,pencil, globe,book;

    MediaPlayer mp,mp3;
    private ViewFlipper viewFlipper;
    Button Next;
    int i;

    private boolean isbagTapped=false;
    private boolean isboardTapped=false;
    private boolean isdeskTapped=false;
    private boolean ischairTapped=false;
    private boolean ispaperTapped=false;
    private boolean isglobeTapped=false;
    private boolean ispencilTapped=false;
    private boolean isbookTapped=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ju2_classroom);

        viewFlipper = findViewById(R.id.viewflipper);
        bag = findViewById(R.id.bag);
        board = findViewById(R.id.board);
        desk = findViewById(R.id.desk);
        chair = findViewById(R.id.chair);
        paper = findViewById(R.id.paper);
        pencil = findViewById(R.id.pencil);
        globe = findViewById(R.id.globe);
        book = findViewById(R.id.book);

        bag.setOnClickListener(this);
        board.setOnClickListener(this);
        desk.setOnClickListener(this);
        chair.setOnClickListener(this);
        paper.setOnClickListener(this);
        pencil.setOnClickListener(this);
        globe.setOnClickListener(this);
        book.setOnClickListener(this);


        mp3 = MediaPlayer.create(ju2_classroom.this, R.raw.success);
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


            case R.id.bag:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                bag.setImageResource(R.drawable.class_bag_a);
                bag.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(ju2_classroom.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isbagTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.board:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                board.setImageResource(R.drawable.class_board_a);
                board.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(ju2_classroom.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isboardTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;
            case R.id.pencil:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                pencil.setImageResource(R.drawable.class_pencil_a);
                pencil.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(ju2_classroom.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ispencilTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.desk:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                desk.setImageResource(R.drawable.class_desk_a);
                desk.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(ju2_classroom.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isdeskTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;


            case R.id.chair:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                chair.setImageResource(R.drawable.class_chair_a);
                chair.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(ju2_classroom.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ischairTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;


            case R.id.globe:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                globe.setImageResource(R.drawable.class_globe_a);
                globe.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(ju2_classroom.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isglobeTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;


            case R.id.book:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                book.setImageResource(R.drawable.class_book_a);
                book.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(ju2_classroom.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                isbookTapped=true;
                mp.setLooping(false);
                mp.start();
                this.i++;
                nextScreen(this.i);
                break;

            case R.id.paper:
                //mp = MediaPlayer.create(this, R.raw.have_another_go);
                paper.setImageResource(R.drawable.class_papers_a);
                paper.setVisibility(View.VISIBLE);
                mp = MediaPlayer.create(ju2_classroom.this, R.raw.success);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                ispaperTapped=true;
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

        if (isbagTapped && isboardTapped && isdeskTapped  && ispaperTapped &&  ispencilTapped  && isbookTapped  && isglobeTapped  && ischairTapped ) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(ju2_classroom.this, Ju2_theme_activities.class);
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

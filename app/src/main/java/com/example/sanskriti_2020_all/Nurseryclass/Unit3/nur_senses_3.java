package com.example.sanskriti_2020_all.Nurseryclass.Unit3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.sanskriti_2020_all.MyClickListener;
import com.example.sanskriti_2020_all.R;

public class nur_senses_3 extends AppCompatActivity {
    private ViewFlipper viewFlipper;
    ImageView fish1_c,fish1_c_n,
            fish2_c,fish2_c_n,
            fish3_c,fish3_c_n,
            fish4_c,fish4_c_n,
            fish5_c,fish5_c_n,fish6_c,fish6_c_n,drag_ball1,drag_ball2,drag_ball3,drag_ball4,drag_ball5,drag_ball6;
    int i;
    MediaPlayer failure, success,animalhome_dog,animalhome_hen,animalhome_horse,animalhome_cow,animalhome_lion,animalhome_pig,mp3,mp;
    private static final String FISH1_C = "fish1";
    private static final String FISH2_C = "fish2";
    private static final String FISH3_C = "fish3";
    private static final String FISH4_C = "fish4";
    private static final String FISH5_C = "fish5";
    private static final String FISH6_C = "fish6";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nur_senses_3);

        viewFlipper = findViewById(R.id.viewflipper);
        fish1_c = findViewById(R.id.fish1_c);
        fish1_c_n = findViewById(R.id.fish1_c_n);
        fish2_c = findViewById(R.id.fish2_c);
        fish2_c_n = findViewById(R.id.fish2_c_n);
        fish3_c = findViewById(R.id.fish3_c);
        fish3_c_n = findViewById(R.id.fish3_c_n);
        fish4_c = findViewById(R.id.fish4_c);
        fish4_c_n = findViewById(R.id.fish4_c_n);
        fish5_c = findViewById(R.id.fish5_c);
        fish5_c_n = findViewById(R.id.fish5_c_n);
        fish6_c = findViewById(R.id.fish6_c);
        fish6_c_n = findViewById(R.id.fish6_c_n);
        drag_ball1 = findViewById(R.id.drag_ball1);
        drag_ball2 = findViewById(R.id.drag_ball2);
        drag_ball3 = findViewById(R.id.drag_ball3);
        drag_ball4 = findViewById(R.id.drag_ball4);
        drag_ball5 = findViewById(R.id.drag_ball5);
        drag_ball6 = findViewById(R.id.drag_ball6);

        drag_ball1.setTag(FISH1_C);
        drag_ball2.setTag(FISH2_C);
        drag_ball3.setTag(FISH3_C);
        drag_ball4.setTag(FISH4_C);
        drag_ball5.setTag(FISH5_C);
        drag_ball6.setTag(FISH6_C);


        drag_ball1.setOnTouchListener(new MyClickListener());
        drag_ball2.setOnTouchListener(new MyClickListener());
        drag_ball3.setOnTouchListener(new MyClickListener());
        drag_ball4.setOnTouchListener(new MyClickListener());
        drag_ball5.setOnTouchListener(new MyClickListener());
        drag_ball6.setOnTouchListener(new MyClickListener());

        fish1_c.setOnDragListener(new nur_senses_3.MyDragListener());
        fish2_c.setOnDragListener(new nur_senses_3.MyDragListener());
        fish3_c.setOnDragListener(new nur_senses_3.MyDragListener());
        fish4_c.setOnDragListener(new nur_senses_3.MyDragListener());
        fish5_c.setOnDragListener(new nur_senses_3.MyDragListener());
        fish6_c.setOnDragListener(new nur_senses_3.MyDragListener());



    }

    public void youCant(DragEvent event){
        mp = MediaPlayer.create(nur_senses_3.this, R.raw.try_again_new);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.setLooping(false);
        mp.start();

    }

    public void nextScreen(int i){

        if(i==6){

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Drag The Number Activity";
                    Intent act = new Intent(nur_senses_3.this, nur3_themes_activities_home.class);
                    act.putExtra("activity_name", activity_name);
                    startActivity(act);


                }
            }, 2300);



        }

    }

    public class MyDragListener implements View.OnDragListener {
      /*  Drawable normalShape = getResources().getDrawable(R.drawable.normal_shape);
        Drawable targetShape = getResources().getDrawable(R.drawable.target_shape);*/

        @Override
        public boolean onDrag(View v, DragEvent event) {

            // Handles each of the expected events
            switch (event.getAction()) {

                //signal for the start of a drag and drop operation.
                case DragEvent.ACTION_DRAG_STARTED:
                    // do nothing
                    break;

                //the drag point has entered the bounding box of the View
                case DragEvent.ACTION_DRAG_ENTERED:
                    /* v.setBackground(targetShape);*/    //change the shape of the view

                    break;

                //the user has moved the drag shadow outside the bounding box of the View
                case DragEvent.ACTION_DRAG_EXITED:
                    /* v.setBackground(normalShape);   */ //change the shape of the view back to normal
                    break;

                //drag shadow has been released,the drag point is within the bounding box of the View
                case DragEvent.ACTION_DROP:
                    if(mp != null){
                        if(mp.isPlaying()){
                            mp.stop();
                        }
                        mp.release();
                    }
                    String clipData = event.getClipDescription().getLabel().toString();

                    if (v == findViewById(R.id.fish1_c)) {
                        View view = (View) event.getLocalState();

                        if (clipData.equals("fish1")) {


                            fish1_c.setVisibility(View.GONE);
                            fish1_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(nur_senses_3.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_dog.start();
                            nextScreen(i);

                        } else {

                            fish1_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_ball1.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(nur_senses_3.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    } else if (v == findViewById(R.id.fish2_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("fish2")) {

                            fish2_c.setVisibility(View.GONE);
                            fish2_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(nur_senses_3.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            fish2_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_ball2.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(nur_senses_3.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    } else if (v == findViewById(R.id.fish3_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("fish3")) {

                            // mp = MediaPlayer.create(game5.this, R.raw.animalhome_horse);
                            fish3_c.setVisibility(View.GONE);
                            fish3_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(nur_senses_3.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_horse.start();
                            nextScreen(i);

                        } else {

                            //mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            fish3_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_ball3.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(nur_senses_3.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    } else if (v == findViewById(R.id.fish4_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("fish4")) {

                            //  mp = MediaPlayer.create(game5.this, R.raw.animalhomes_cow);
                            fish4_c.setVisibility(View.GONE);
                            fish4_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(nur_senses_3.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_cow.start();
                            nextScreen(i);

                        } else {

                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            fish4_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_ball4.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(nur_senses_3.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            //try_again_new.start();
                        }


                    }
                    else if (v == findViewById(R.id.fish5_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("fish5")) {

                            // mp = MediaPlayer.create(game5.this, R.raw.animalhome_lion);
                            fish5_c.setVisibility(View.GONE);
                            fish5_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(nur_senses_3.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_lion.start();
                            nextScreen(i);

                        } else {

                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            fish5_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_ball5.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(nur_senses_3.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }


                    }else if (v == findViewById(R.id.fish6_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("fish6")) {

                            // mp = MediaPlayer.create(game5.this, R.raw.animalhome_pig);
                            fish6_c.setVisibility(View.GONE);
                            fish6_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(nur_senses_3.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_pig.start();
                            nextScreen(i);

                        } else {

                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            fish6_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_ball6.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(nur_senses_3.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }


                    }else {

                        youCant(event);
                    }
                    break;


                case DragEvent.ACTION_DRAG_ENDED:


                    if(fish1_c_n.getVisibility()==View.VISIBLE){

                        drag_ball1.setVisibility(View.GONE);
                    }
                    else{
                        drag_ball1.setVisibility(View.VISIBLE);
                    }


                    if(fish2_c_n.getVisibility()==View.VISIBLE){

                        drag_ball2.setVisibility(View.GONE);
                    }
                    else{
                        drag_ball2.setVisibility(View.VISIBLE);
                    }

                    if(fish3_c_n.getVisibility()==View.VISIBLE){

                        drag_ball3.setVisibility(View.GONE);
                    }
                    else{
                        drag_ball3.setVisibility(View.VISIBLE);
                    }

                    if(fish4_c_n.getVisibility()==View.VISIBLE){

                        drag_ball4.setVisibility(View.GONE);
                    }
                    else{
                        drag_ball4.setVisibility(View.VISIBLE);
                    }

                    if(fish5_c_n.getVisibility()==View.VISIBLE){

                        drag_ball5.setVisibility(View.GONE);
                    }
                    else{
                        drag_ball5.setVisibility(View.VISIBLE);
                    }


                    if(fish6_c_n.getVisibility()==View.VISIBLE){

                        drag_ball6.setVisibility(View.GONE);
                    }
                    else{
                        drag_ball6.setVisibility(View.VISIBLE);
                    }


                default:
                    break;
            }
            return true;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(failure.isPlaying())
        {
            failure.stop();
            failure.release();
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
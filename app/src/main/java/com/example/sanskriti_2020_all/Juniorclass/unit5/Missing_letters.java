package com.example.sanskriti_2020_all.Juniorclass.unit5;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sanskriti_2020_all.MyClickListener;
import com.example.sanskriti_2020_all.R;


import com.example.sanskriti_2020_all.Seniorkg.Unit5.Sequence_cookie;

public class Missing_letters extends AppCompatActivity {
    ImageView grape_c,grape_c_n,sun_c,sun_c_n,star_c,star_c_n,lock_c,lock_c_n;
TextView drag_grape,drag_sun,drag_star,drag_lock;
    int i;
    MediaPlayer failure, success,mp,s_eye,s_nose,s_ear,s_skin,s_tongue;
    private static final String GRAPE_C = "grape";
    private static final String SUN_C = "sun";
    private static final String STAR_C = "star";
    private static final String LOCK_C = "lock";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_missing_letters);

        drag_grape = findViewById(R.id.drag_grape);
        drag_sun = findViewById(R.id.drag_sun);
        drag_star = findViewById(R.id.drag_star);
        drag_lock = findViewById(R.id.drag_lock);
        grape_c = findViewById(R.id.grape_c);
        grape_c_n = findViewById(R.id.grape_c_n);
        sun_c = findViewById(R.id.sun_c);
        sun_c_n = findViewById(R.id.sun_c_n);
        star_c = findViewById(R.id.star_c);
        star_c_n = findViewById(R.id.star_c_n);
        lock_c = findViewById(R.id.lock_c);
        lock_c_n = findViewById(R.id.lock_c_n);


        failure = MediaPlayer.create(Missing_letters.this, R.raw.failure);
        success = MediaPlayer.create(Missing_letters.this, R.raw.success);


      /*  mp3 = MediaPlayer.create(game6.this, R.raw.matchtheorgans);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start(); */

        drag_grape.setTag(GRAPE_C);
        drag_sun.setTag(SUN_C);
        drag_star.setTag(STAR_C);
        drag_lock.setTag(LOCK_C);

        drag_grape.setOnTouchListener(new MyClickListener());
        drag_sun.setOnTouchListener(new MyClickListener());
        drag_star.setOnTouchListener(new MyClickListener());
        drag_lock.setOnTouchListener(new MyClickListener());

        grape_c.setOnDragListener(new MyDragListener());
        sun_c.setOnDragListener(new MyDragListener());
        star_c.setOnDragListener(new MyDragListener());
        lock_c.setOnDragListener(new MyDragListener());

    }

    public void youCant(DragEvent event){

        mp = MediaPlayer.create(Missing_letters.this, R.raw.failure);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.setLooping(false);
        mp.start();
    }



    public void nextScreen(int i){

        if(i==4){

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Drag The Number Activity";
                    Intent act = new Intent(Missing_letters.this, ju5_literacy.class);
                    act.putExtra("activity_name", activity_name);
                    startActivity(act);


                }
            }, 1000);



        }

    }

    public class MyDragListener implements View.OnDragListener {
      /*  Drawable normalShape = getResources().getDrawable(R.drawable.normal_shape);
        Drawable targetShape = getResources().getDrawable(R.drawable.target_shape);*/

        @RequiresApi(api = Build.VERSION_CODES.O)
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

                    String clipData = event.getClipDescription().getLabel().toString();

                    if (v == findViewById(R.id.grape_c)) {
                        View view = (View) event.getLocalState();

                        if (clipData.equals("grape")) {


                            grape_c.setVisibility(View.GONE);
                            grape_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Missing_letters.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            nextScreen(i);

                        } else {
                            grape_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_grape.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Missing_letters.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    }
                    else if (v == findViewById(R.id.sun_c)) {

                        View view = (View) event.getLocalState();
                        if (clipData.equals("sun")) {


                            sun_c.setVisibility(View.GONE);
                            sun_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Missing_letters.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            nextScreen(i);

                        } else {
                            sun_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_sun.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Missing_letters.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    }else if (v == findViewById(R.id.star_c)) {

                        View view = (View) event.getLocalState();
                        if (clipData.equals("star")) {


                            star_c.setVisibility(View.GONE);
                            star_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Missing_letters.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            nextScreen(i);

                        } else {
                            star_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_star.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Missing_letters.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    }else if (v == findViewById(R.id.lock_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("lock")) {


                            lock_c.setVisibility(View.GONE);
                            lock_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Missing_letters.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            nextScreen(i);

                        } else {
                            lock_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_lock.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Missing_letters.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    }

                    else {

                        youCant(event);
                    }

                    break;


                case DragEvent.ACTION_DRAG_ENDED:

                    if(grape_c_n.getVisibility()==View.VISIBLE){

                        drag_grape.setVisibility(View.GONE);
                    }
                    else{
                        drag_grape.setVisibility(View.VISIBLE);
                    }


                    if(sun_c_n.getVisibility()==View.VISIBLE){

                        drag_sun.setVisibility(View.GONE);
                    }
                    else{
                        drag_sun.setVisibility(View.VISIBLE);
                    }

                    if(star_c.getVisibility()==View.VISIBLE){

                        drag_star.setVisibility(View.GONE);
                    }
                    else{
                        drag_star.setVisibility(View.VISIBLE);
                    }

                    if(lock_c_n.getVisibility()==View.VISIBLE){

                        drag_lock.setVisibility(View.GONE);
                    }
                    else{
                        drag_lock.setVisibility(View.VISIBLE);
                    }




                    /* v.setBackground(normalShape);*/    //go back to normal shape

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
}

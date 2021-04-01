package com.example.sanskriti_2020_all.Seniorkg.Unit3;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.sanskriti_2020_all.MyClickListener;
import com.example.sanskriti_2020_all.R;

public class sr_sequence2_3 extends AppCompatActivity {
    ImageView drag_1, drag_2, drag_3 , drag_4,
            s1_c,s1_c_n,s2_c,s2_c_n,s3_c,s3_c_n,s4_c,s4_c_n;

    ConstraintLayout constraintLayout;

    int i;
    MediaPlayer failure, success,animalhome_dog,animalhome_hen,animalhome_horse,animalhome_cow,animalhome_lion,animalhome_pig,mp3,mp;
    private static final String S1_C = "s1";
    private static final String S2_C = "s2";
    private static final String S3_C = "s3";
    private static final String S4_C = "s4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sr_sequence2_3);
        s1_c = findViewById(R.id.s1_c);
        s1_c_n = findViewById(R.id.s1_c_n);
        s2_c = findViewById(R.id.s2_c);
        s2_c_n = findViewById(R.id.s2_c_n);
        s3_c = findViewById(R.id.s3_c);
        s3_c_n = findViewById(R.id.s3_c_n);
        s4_c = findViewById(R.id.s4_c);
        s4_c_n = findViewById(R.id.s4_c_n);
        drag_1 = findViewById(R.id.drag_1);
        drag_2 = findViewById(R.id.drag_2);
        drag_3 = findViewById(R.id.drag_3);
        drag_4 = findViewById(R.id.drag_4);


        drag_1.setTag(S1_C);
        drag_2.setTag(S2_C);
        drag_3.setTag(S3_C);
        drag_4.setTag(S4_C);

        drag_1.setOnTouchListener(new MyClickListener());
        drag_2.setOnTouchListener(new MyClickListener());
        drag_3.setOnTouchListener(new MyClickListener());
        drag_4.setOnTouchListener(new MyClickListener());

        s1_c.setOnDragListener(new MyDragListener());
        s2_c.setOnDragListener(new MyDragListener());
        s3_c.setOnDragListener(new MyDragListener());
        s4_c.setOnDragListener(new MyDragListener());



    }

    public void youCant(DragEvent event){
        mp = MediaPlayer.create(sr_sequence2_3.this, R.raw.try_again_new);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.setLooping(false);
        mp.start();
        //try_again_new.start();
        //View view = (View) event.getLocalState();
        //view.setVisibility(View.VISIBLE);
    }

    public void nextScreen(int i){

        if(i==4){

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Drag The Number Activity";
                    Intent act = new Intent(sr_sequence2_3.this, Sn3_theme_activities.class);
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

                    if (v == findViewById(R.id.s1_c)) {
                        View view = (View) event.getLocalState();

                        if (clipData.equals("s1")) {


                            s1_c.setVisibility(View.GONE);
                            s1_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(sr_sequence2_3.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_dog.start();
                            nextScreen(i);

                        } else {

                            s1_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_1.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(sr_sequence2_3.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    } else if (v == findViewById(R.id.s2_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("s2")) {

                            s2_c.setVisibility(View.GONE);
                            s2_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(sr_sequence2_3.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            s2_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_2.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(sr_sequence2_3.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    }
                    else if (v == findViewById(R.id.s3_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("s3")) {

                            s3_c.setVisibility(View.GONE);
                            s3_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(sr_sequence2_3.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            s3_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_3.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(sr_sequence2_3.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    }
                    else if (v == findViewById(R.id.s4_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("s4")) {

                            s4_c.setVisibility(View.GONE);
                            s4_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(sr_sequence2_3.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            s4_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_4.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(sr_sequence2_3.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    }else {

                        youCant(event);
                    }
                    break;


                case DragEvent.ACTION_DRAG_ENDED:


                    if(s1_c_n.getVisibility()==View.VISIBLE){

                        drag_1.setVisibility(View.GONE);
                    }
                    else{
                        drag_1.setVisibility(View.VISIBLE);
                    }


                    if(s2_c_n.getVisibility()==View.VISIBLE){

                        drag_2.setVisibility(View.GONE);
                    }
                    else{
                        drag_2.setVisibility(View.VISIBLE);
                    }

                    if(s3_c_n.getVisibility()==View.VISIBLE){

                        drag_3.setVisibility(View.GONE);
                    }
                    else{
                        drag_3.setVisibility(View.VISIBLE);
                    }

                    if(s4_c_n.getVisibility()==View.VISIBLE){

                        drag_4.setVisibility(View.GONE);
                    }
                    else{
                        drag_4.setVisibility(View.VISIBLE);
                    }



                    /*if(View.VISIBLE != pig_c_n.getVisibility() && View.VISIBLE != pig_c_n.getVisibility()
                    && View.VISIBLE != pig_c_n.getVisibility() && View.VISIBLE != pig_c_n.getVisibility()
                    && View.VISIBLE != pig_c_n.getVisibility() && View.VISIBLE != pig_c_n.getVisibility()){
                        if (event.getClipDescription().getLabel().toString().equals("pig")) {
                            pig_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            pig.setVisibility(View.VISIBLE);
                            drag_pig.setVisibility(View.VISIBLE);

                        }

                    }*/



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
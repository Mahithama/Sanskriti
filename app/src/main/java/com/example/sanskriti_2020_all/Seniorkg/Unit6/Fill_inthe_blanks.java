package com.example.sanskriti_2020_all.Seniorkg.Unit6;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanskriti_2020_all.MyClickListener;
import com.example.sanskriti_2020_all.R;

public class Fill_inthe_blanks extends AppCompatActivity {
    TextView drag_make,make_c,make_c_n,
             drag_takes,takes_c,takes_c_n,
             drag_lane,lane_c,lane_c_n,
             drag_slate,slate_c,slate_c_n,
             drag_shape,shape_c,shape_c_n;

    int i;
    MediaPlayer try_again_new, success,animalhome_dog,animalhome_hen,animalhome_horse,animalhome_cow,animalhome_lion,animalhome_pig,mp3,mp;
    private static final String MAKE_C = "make";
    private static final String TAKES_C = "takes";
    private static final String LANE_C = "lane";
    private static final String SLATE_C = "slate";
    private static final String SHAPE_C = "shape";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_inthe_blanks);
        drag_make = findViewById(R.id.drag_make);
        make_c = findViewById(R.id.make_c);
        make_c_n = findViewById(R.id.make_c_n);
        drag_takes = findViewById(R.id.drag_takes);
        takes_c = findViewById(R.id.takes_c);
        takes_c_n = findViewById(R.id.takes_c_n);
        drag_lane = findViewById(R.id.drag_lane);
        lane_c = findViewById(R.id.lane_c);
        lane_c_n = findViewById(R.id.lane_c_n);
        drag_slate = findViewById(R.id.drag_slate);
        slate_c = findViewById(R.id.slate_c);
        slate_c_n = findViewById(R.id.slate_c_n);
        drag_shape = findViewById(R.id.drag_shape);
        shape_c = findViewById(R.id.shape_c);
        shape_c_n = findViewById(R.id.shape_c_n);

        drag_make.setTag(MAKE_C);
        drag_takes.setTag(TAKES_C);
        drag_lane.setTag(LANE_C);
        drag_slate.setTag(SLATE_C);
        drag_shape.setTag(SHAPE_C);

        drag_make.setOnTouchListener(new MyClickListener());
        drag_takes.setOnTouchListener(new MyClickListener());
        drag_lane.setOnTouchListener(new MyClickListener());
        drag_slate.setOnTouchListener(new MyClickListener());
        drag_shape.setOnTouchListener(new MyClickListener());

        make_c.setOnDragListener(new MyDragListener());
        takes_c.setOnDragListener(new MyDragListener());
        lane_c.setOnDragListener(new MyDragListener());
        slate_c.setOnDragListener(new MyDragListener());
        shape_c.setOnDragListener(new MyDragListener());


    }

    public void youCant(DragEvent event){
        mp = MediaPlayer.create(Fill_inthe_blanks.this, R.raw.failure);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.setLooping(false);
        mp.start();
        //try_again_new.start();
        //View view = (View) event.getLocalState();
        //view.setVisibility(View.VISIBLE);
    }

    public void nextScreen(int i){

        if(i==5){

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Drag The Number Activity";
                    Intent act = new Intent(Fill_inthe_blanks.this, Sn6_literacy.class);
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

                    if (v == findViewById(R.id.takes_c)) {
                        View view = (View) event.getLocalState();

                        if (clipData.equals("takes")) {
                            takes_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Fill_inthe_blanks.this, R.raw.animalhome_dog);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_dog.start();
                            nextScreen(i);

                        } else {

                            takes_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_takes.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Fill_inthe_blanks.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    } else if (v == findViewById(R.id.make_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("make")) {

                            make_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Fill_inthe_blanks.this, R.raw.animalhome_hen);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            make_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_make.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Fill_inthe_blanks.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    } else if (v == findViewById(R.id.lane_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("lane")) {

                            lane_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Fill_inthe_blanks.this, R.raw.animalhome_horse);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_horse.start();
                            nextScreen(i);

                        } else {

                            //mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            drag_lane.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            lane_c.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Fill_inthe_blanks.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    } else if (v == findViewById(R.id.slate_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("slate")) {

                            //  mp = MediaPlayer.create(game5.this, R.raw.animalhomes_cow);
                            slate_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Fill_inthe_blanks.this, R.raw.animalhomes_cow);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_cow.start();
                            nextScreen(i);

                        } else {

                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            slate_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_slate.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Fill_inthe_blanks.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            //try_again_new.start();
                        }


                    }
                    else if (v == findViewById(R.id.shape_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("shape")) {

                            // mp = MediaPlayer.create(game5.this, R.raw.animalhome_lion);
                            shape_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Fill_inthe_blanks.this, R.raw.animalhome_lion);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_lion.start();
                            nextScreen(i);

                        } else {

                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            shape_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_shape.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Fill_inthe_blanks.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }


                    }else {

                        youCant(event);
                    }
                    break;


                case DragEvent.ACTION_DRAG_ENDED:


                    if(takes_c_n.getVisibility()==View.VISIBLE){

                        drag_takes.setVisibility(View.GONE);
                    }
                    else{
                        drag_takes.setVisibility(View.VISIBLE);
                    }


                    if(make_c_n.getVisibility()==View.VISIBLE){

                        drag_make.setVisibility(View.GONE);
                    }
                    else{
                        drag_make.setVisibility(View.VISIBLE);
                    }

                    if(slate_c_n.getVisibility()==View.VISIBLE){

                        drag_slate.setVisibility(View.GONE);
                    }
                    else{
                        drag_slate.setVisibility(View.VISIBLE);
                    }

                    if(shape_c_n.getVisibility()==View.VISIBLE){

                        drag_shape.setVisibility(View.GONE);
                    }
                    else{
                        drag_shape.setVisibility(View.VISIBLE);
                    }

                    if(lane_c_n.getVisibility()==View.VISIBLE){

                        drag_lane.setVisibility(View.GONE);
                    }
                    else{
                        drag_lane.setVisibility(View.VISIBLE);
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
        if(try_again_new.isPlaying())
        {
            try_again_new.stop();
            try_again_new.release();
        }

    }

    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}
package com.example.sanskriti_2020_all.Juniorclass.unit3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;

import com.example.sanskriti_2020_all.MyClickListener;
import com.example.sanskriti_2020_all.R;

public class junior_count2_3 extends AppCompatActivity {
    ImageView dino1_c,dino1_c_n,
            dino2_c,dino2_c_n,
            dino3_c,dino3_c_n,
            dino4_c, dino4_c_n,
            dino6_c,dino6_c_n,congo,
            drag_dino1,drag_dino2,drag_dino3,drag_dino4,drag_dino6;

    int i;
    MediaPlayer failure, success,animalhome_dog,animalhome_hen,animalhome_horse,animalhome_cow,animalhome_lion,animalhome_pig,mp3,mp;
    private static final String DINO1_C = "dino1";
    private static final String DINO2_C = "dino2";
    private static final String DINO3_C = "dino3";
    private static final String DINO4_C = "dino4";
    private static final String DINO6_C = "dino6";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junior_count2_3);
        dino1_c = findViewById(R.id.dino1_c);
        dino1_c_n = findViewById(R.id.dino1_c_n);
        dino2_c = findViewById(R.id.dino2_c);
        dino2_c_n = findViewById(R.id.dino2_c_n);
        dino3_c = findViewById(R.id.dino3_c);
        dino3_c_n = findViewById(R.id.dino3_c_n);
        dino4_c = findViewById(R.id.dino4_c);
        dino4_c_n = findViewById(R.id.dino4_c_n);
        dino6_c = findViewById(R.id.dino6_c);
        dino6_c_n = findViewById(R.id.dino6_c_n);
        drag_dino1 = findViewById(R.id.drag_dino1);
        drag_dino2 = findViewById(R.id.drag_dino2);
        drag_dino3 = findViewById(R.id.drag_dino3);
        drag_dino4 = findViewById(R.id.drag_dino4);
        drag_dino6 = findViewById(R.id.drag_dino6);
        congo = findViewById(R.id.congo);

        drag_dino1.setTag(DINO1_C);
        drag_dino2.setTag(DINO2_C);
        drag_dino3.setTag(DINO3_C);
        drag_dino4.setTag(DINO4_C);
        drag_dino6.setTag(DINO6_C);



        drag_dino1.setOnTouchListener(new MyClickListener());
        drag_dino2.setOnTouchListener(new MyClickListener());
        drag_dino3.setOnTouchListener(new MyClickListener());
        drag_dino4.setOnTouchListener(new MyClickListener());
        drag_dino6.setOnTouchListener(new MyClickListener());


        dino1_c.setOnDragListener(new junior_count2_3.MyDragListener());
        dino2_c.setOnDragListener(new junior_count2_3.MyDragListener());
        dino3_c.setOnDragListener(new junior_count2_3.MyDragListener());
        dino4_c.setOnDragListener(new junior_count2_3.MyDragListener());
        dino6_c.setOnDragListener(new junior_count2_3.MyDragListener());




    }

    public void youCant(DragEvent event){
        mp = MediaPlayer.create(junior_count2_3.this, R.raw.try_again_new);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.setLooping(false);
        mp.start();
        //try_again_new.start();
        //View view = (View) event.getLocalState();
        //view.setVisibility(View.VISIBLE);
    }

    public void nextScreen(int i){

        if(i==3){

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {

                    congo.setVisibility(View.VISIBLE);
                    String activity_name = "Drag The Number Activity";
                    Intent act = new Intent(junior_count2_3.this, unit3_numeracy.class);
                    act.putExtra("activity_name", activity_name);
                    startActivity(act);


                }
            }, 4000);



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

                    if (v == findViewById(R.id.dino3_c)) {
                        View view = (View) event.getLocalState();

                        if (clipData.equals("dino3")) {


                            dino3_c.setVisibility(View.GONE);
                            dino3_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(junior_count2_3.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_dog.start();
                            nextScreen(i);

                        } else {

                            dino3_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_dino3.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(junior_count2_3.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    } else if (v == findViewById(R.id.dino4_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("dino4")) {

                            dino4_c.setVisibility(View.GONE);
                            dino4_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(junior_count2_3.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            dino4_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_dino4.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(junior_count2_3.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    } else if (v == findViewById(R.id.dino1_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("dino1")) {

                            // mp = MediaPlayer.create(game5.this, R.raw.animalhome_horse);
                            dino1_c.setVisibility(View.GONE);
                            dino1_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(junior_count2_3.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_horse.start();
                            nextScreen(i);

                        } else {

                            //mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            dino1_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_dino1.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(junior_count2_3.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    } else if (v == findViewById(R.id.dino2_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("dino2")) {

                            //  mp = MediaPlayer.create(game5.this, R.raw.animalhomes_cow);
                            dino2_c.setVisibility(View.GONE);
                            dino2_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(junior_count2_3.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_cow.start();
                            nextScreen(i);

                        } else {

                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            dino2_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_dino2.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(junior_count2_3.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            //try_again_new.start();
                        }


                    }
                    else if (v == findViewById(R.id.dino6_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("dino6")) {

                            // mp = MediaPlayer.create(game5.this, R.raw.animalhome_lion);
                            dino6_c.setVisibility(View.GONE);
                            dino6_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(junior_count2_3.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_lion.start();
                            nextScreen(i);

                        } else {

                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            dino6_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_dino6.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(junior_count2_3.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }


                    }else {

                        youCant(event);
                    }
                    break;


                case DragEvent.ACTION_DRAG_ENDED:


                    if(dino1_c_n.getVisibility()==View.VISIBLE){

                        drag_dino1.setVisibility(View.GONE);
                    }
                    else{
                        drag_dino1.setVisibility(View.VISIBLE);
                    }


                    if(dino2_c_n.getVisibility()==View.VISIBLE){

                        drag_dino2.setVisibility(View.GONE);
                    }
                    else{
                        drag_dino2.setVisibility(View.VISIBLE);
                    }

                    if(dino3_c_n.getVisibility()==View.VISIBLE){

                        drag_dino3.setVisibility(View.GONE);
                    }
                    else{
                        drag_dino3.setVisibility(View.VISIBLE);
                    }

                    if(dino4_c_n.getVisibility()==View.VISIBLE){

                        drag_dino4.setVisibility(View.GONE);
                    }
                    else{
                        drag_dino4.setVisibility(View.VISIBLE);
                    }



                    if(dino6_c_n.getVisibility()==View.VISIBLE){

                        drag_dino6.setVisibility(View.GONE);
                    }
                    else{
                        drag_dino6.setVisibility(View.VISIBLE);
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
package com.example.sanskriti_2020_all.Seniorkg.Unit3;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.sanskriti_2020_all.MyClickListener;
import com.example.sanskriti_2020_all.Nurseryclass.Unit2.S_alphabet;
import com.example.sanskriti_2020_all.R;
import com.example.sanskriti_2020_all.Seniorkg.Unit1.Senior1_words2;

public class sr_blends_3 extends AppCompatActivity {
ImageView drag_br, drag_cl, drag_dr , drag_tr,
    br_c,br_c_n,cl_c,cl_c_n,dr_c,dr_c_n,tr_c,tr_c_n;

    ConstraintLayout constraintLayout;
    private ViewFlipper viewFlipper;
    int i;
    MediaPlayer failure, success,animalhome_dog,animalhome_hen,animalhome_horse,animalhome_cow,animalhome_lion,animalhome_pig,mp3,mp;
    private static final String BR_C = "br";
    private static final String CL_C = "cl";
    private static final String DR_C = "dr";
    private static final String TR_C = "tr";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sr_blends_3);

        viewFlipper = findViewById(R.id.viewflipper);
        br_c = findViewById(R.id.br_c);
        br_c_n = findViewById(R.id.br_c_n);
        cl_c = findViewById(R.id.cl_c);
        cl_c_n = findViewById(R.id.cl_c_n);
        dr_c = findViewById(R.id.dr_c);
        dr_c_n = findViewById(R.id.dr_c_n);
        tr_c = findViewById(R.id.tr_c);
        tr_c_n = findViewById(R.id.tr_c_n);
        drag_br = findViewById(R.id.drag_br);
        drag_cl = findViewById(R.id.drag_cl);
        drag_dr = findViewById(R.id.drag_dr);
        drag_tr = findViewById(R.id.drag_tr);

        mp3 = MediaPlayer.create(sr_blends_3.this, R.raw.success);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();

      /*  try_again_new = MediaPlayer.create(Animal_houses.this, R.raw.try_again_new);
        success = MediaPlayer.create(Animal_houses.this, R.raw.success);
        animalhome_dog = MediaPlayer.create(Animal_houses.this, R.raw.animalhome_dog);
        animalhome_hen = MediaPlayer.create(Animal_houses.this, R.raw.animalhome_hen);
        animalhome_horse = MediaPlayer.create(Animal_houses.this, R.raw.animalhome_horse);
        animalhome_cow = MediaPlayer.create(Animal_houses.this, R.raw.animalhomes_cow);
        animalhome_lion = MediaPlayer.create(Animal_houses.this, R.raw.animalhome_lion);
        animalhome_pig = MediaPlayer.create(Animal_houses.this, R.raw.animalhome_pig); */

      /*  mp3 = MediaPlayer.create(game6.this, R.raw.matchtheorgans);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start(); */

        drag_br.setTag(BR_C);
        drag_cl.setTag(CL_C);
        drag_dr.setTag(DR_C);
        drag_tr.setTag(TR_C);

        drag_br.setOnTouchListener(new MyClickListener());
        drag_cl.setOnTouchListener(new MyClickListener());
        drag_dr.setOnTouchListener(new MyClickListener());
        drag_tr.setOnTouchListener(new MyClickListener());

        br_c.setOnDragListener(new MyDragListener());
        cl_c.setOnDragListener(new MyDragListener());
        dr_c.setOnDragListener(new MyDragListener());
        tr_c.setOnDragListener(new MyDragListener());



    }

    public void youCant(DragEvent event){
        mp = MediaPlayer.create(sr_blends_3.this, R.raw.try_again_new);
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
                    Intent act = new Intent(sr_blends_3.this, Sn3_literacy.class);
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

                    if (v == findViewById(R.id.br_c)) {
                        View view = (View) event.getLocalState();

                        if (clipData.equals("br")) {


                            br_c.setVisibility(View.GONE);
                            br_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(sr_blends_3.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_dog.start();
                            nextScreen(i);

                        } else {

                            br_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_br.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(sr_blends_3.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    } else if (v == findViewById(R.id.cl_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("cl")) {

                            cl_c.setVisibility(View.GONE);
                            cl_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(sr_blends_3.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            cl_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_cl.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(sr_blends_3.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    }
                    else if (v == findViewById(R.id.dr_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("dr")) {

                            dr_c.setVisibility(View.GONE);
                            dr_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(sr_blends_3.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            dr_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_dr.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(sr_blends_3.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    }
                    else if (v == findViewById(R.id.tr_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("tr")) {

                            tr_c.setVisibility(View.GONE);
                            tr_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(sr_blends_3.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            tr_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_tr.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(sr_blends_3.this, R.raw.failure);
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


                    if(br_c_n.getVisibility()==View.VISIBLE){

                        drag_br.setVisibility(View.GONE);
                    }
                    else{
                        drag_br.setVisibility(View.VISIBLE);
                    }


                    if(cl_c_n.getVisibility()==View.VISIBLE){

                        drag_cl.setVisibility(View.GONE);
                    }
                    else{
                        drag_cl.setVisibility(View.VISIBLE);
                    }

                    if(dr_c_n.getVisibility()==View.VISIBLE){

                        drag_dr.setVisibility(View.GONE);
                    }
                    else{
                        drag_dr.setVisibility(View.VISIBLE);
                    }

                    if(tr_c_n.getVisibility()==View.VISIBLE){

                        drag_tr.setVisibility(View.GONE);
                    }
                    else{
                        drag_tr.setVisibility(View.VISIBLE);
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
    public void nextView(View v) {
        viewFlipper.showNext();
        if(mp3 != null && mp3.isPlaying()){
            mp3.stop();
        }

    }
}
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

public class Sr_pattren1_3 extends AppCompatActivity {
    ImageView p1_c,p1_c_n,
            p2_c,p2_c_n,
            p2_2_c,p2_2_c_n,
            p3_c,p3_c_n,
            drag_p1,drag_p2,drag_p2_2,drag_p3;

    ConstraintLayout constraintLayout;

    int i;
    MediaPlayer failure, success,animalhome_dog,animalhome_hen,animalhome_horse,animalhome_cow,animalhome_lion,animalhome_pig,mp3,mp;
    private static final String P1_C = "p1";
    private static final String P2_C = "p2";
    private static final String P2_2_C = "p2_2";
    private static final String P3_C = "p3";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sr_pattren1_3);
        p1_c = findViewById(R.id.p1_c);
        p1_c_n = findViewById(R.id.p1_c_n);
        p2_c = findViewById(R.id.p2_c);
        p2_c_n = findViewById(R.id.p2_c_n);
        p2_2_c = findViewById(R.id.p2_2_c);
        p2_2_c_n = findViewById(R.id.p2_2_c_n);
        p3_c = findViewById(R.id.p3_c);
        p3_c_n = findViewById(R.id.p3_c_n);
        drag_p1 = findViewById(R.id.drag_p1);
        drag_p2 = findViewById(R.id.drag_p2);
        drag_p2_2 = findViewById(R.id.drag_p2_2);
        drag_p3 = findViewById(R.id.drag_p3);

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

        drag_p1.setTag(P1_C);
        drag_p2.setTag(P2_C);
        drag_p2_2.setTag(P2_2_C);
        drag_p3.setTag(P3_C);

        drag_p1.setOnTouchListener(new MyClickListener());
        drag_p2.setOnTouchListener(new MyClickListener());
        drag_p2_2.setOnTouchListener(new MyClickListener());
        drag_p3.setOnTouchListener(new MyClickListener());

        p1_c.setOnDragListener(new MyDragListener());
        p2_c.setOnDragListener(new MyDragListener());
        p2_2_c.setOnDragListener(new MyDragListener());
        p3_c.setOnDragListener(new MyDragListener());

    }

    public void youCant(DragEvent event){
        mp = MediaPlayer.create(Sr_pattren1_3.this, R.raw.try_again_new);
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
                    Intent act = new Intent(Sr_pattren1_3.this, Sr_pattren2_3.class);
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

                    if (v == findViewById(R.id.p1_c)) {
                        View view = (View) event.getLocalState();

                        if (clipData.equals("p1")) {


                            p1_c.setVisibility(View.GONE);
                            p1_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Sr_pattren1_3.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_dog.start();
                            nextScreen(i);

                        } else {

                            p1_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_p1.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Sr_pattren1_3.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    } else if (v == findViewById(R.id.p2_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("p2")) {

                            p2_c.setVisibility(View.GONE);
                            p2_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Sr_pattren1_3.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            p2_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_p2.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Sr_pattren1_3.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    } else if (v == findViewById(R.id.p2_2_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("p2_2")) {

                            // mp = MediaPlayer.create(game5.this, R.raw.animalhome_horse);
                            p2_2_c.setVisibility(View.GONE);
                            p2_2_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Sr_pattren1_3.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_horse.start();
                            nextScreen(i);

                        } else {

                            //mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            p2_2_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_p2_2.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Sr_pattren1_3.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    } else if (v == findViewById(R.id.p3_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("p3")) {

                            //  mp = MediaPlayer.create(game5.this, R.raw.animalhomes_cow);
                            p3_c.setVisibility(View.GONE);
                            p3_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Sr_pattren1_3.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_cow.start();
                            nextScreen(i);

                        } else {

                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            p3_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_p3.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Sr_pattren1_3.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            //try_again_new.start();
                        }


                    }
                   else {

                        youCant(event);
                    }
                    break;


                case DragEvent.ACTION_DRAG_ENDED:


                    if(p1_c_n.getVisibility()==View.VISIBLE){

                        drag_p1.setVisibility(View.GONE);
                    }
                    else{
                        drag_p1.setVisibility(View.VISIBLE);
                    }


                    if(p2_c_n.getVisibility()==View.VISIBLE){

                        drag_p2.setVisibility(View.GONE);
                    }
                    else{
                        drag_p2.setVisibility(View.VISIBLE);
                    }

                    if(p2_2_c_n.getVisibility()==View.VISIBLE){

                        drag_p2_2.setVisibility(View.GONE);
                    }
                    else{
                        drag_p2_2.setVisibility(View.VISIBLE);
                    }

                    if(p3_c_n.getVisibility()==View.VISIBLE){

                        drag_p3.setVisibility(View.GONE);
                    }
                    else{
                        drag_p3.setVisibility(View.VISIBLE);
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
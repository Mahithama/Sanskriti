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

public class Sr_sequence1_3 extends AppCompatActivity {
    ImageView drag_rice, drag_fire, drag_roll , drag_chap,
            rice_c,rice_c_n,fire_c,fire_c_n,roll_c,roll_c_n,chap_c,chap_c_n;

    ConstraintLayout constraintLayout;

    int i;
    MediaPlayer failure, success,animalhome_dog,animalhome_hen,animalhome_horse,animalhome_cow,animalhome_lion,animalhome_pig,mp3,mp;
    private static final String RICE_C = "rice";
    private static final String FIRE_C = "fire";
    private static final String ROLL_C = "roll";
    private static final String CHAP_C = "chap";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sr_sequence1_3);
        rice_c = findViewById(R.id.rice_c);
        rice_c_n = findViewById(R.id.rice_c_n);
        fire_c = findViewById(R.id.fire_c);
        fire_c_n = findViewById(R.id.fire_c_n);
        roll_c = findViewById(R.id.roll_c);
        roll_c_n = findViewById(R.id.roll_c_n);
        chap_c = findViewById(R.id.chap_c);
        chap_c_n = findViewById(R.id.chap_c_n);
        drag_rice = findViewById(R.id.drag_rice);
        drag_fire = findViewById(R.id.drag_fire);
        drag_roll = findViewById(R.id.drag_roll);
        drag_chap = findViewById(R.id.drag_chap);


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

        drag_rice.setTag(RICE_C);
        drag_fire.setTag(FIRE_C);
        drag_roll.setTag(ROLL_C);
        drag_chap.setTag(CHAP_C);

        drag_rice.setOnTouchListener(new MyClickListener());
        drag_fire.setOnTouchListener(new MyClickListener());
        drag_roll.setOnTouchListener(new MyClickListener());
        drag_chap.setOnTouchListener(new MyClickListener());

        chap_c.setOnDragListener(new MyDragListener());
        fire_c.setOnDragListener(new MyDragListener());
        rice_c.setOnDragListener(new MyDragListener());
        roll_c.setOnDragListener(new MyDragListener());



    }

    public void youCant(DragEvent event){
        mp = MediaPlayer.create(Sr_sequence1_3.this, R.raw.try_again_new);
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
                    Intent act = new Intent(Sr_sequence1_3.this, sr_sequence2_3.class);
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

                    if (v == findViewById(R.id.rice_c)) {
                        View view = (View) event.getLocalState();

                        if (clipData.equals("rice")) {


                            rice_c.setVisibility(View.GONE);
                            rice_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Sr_sequence1_3.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_dog.start();
                            nextScreen(i);

                        } else {

                            rice_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_rice.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Sr_sequence1_3.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    } else if (v == findViewById(R.id.roll_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("roll")) {

                            roll_c.setVisibility(View.GONE);
                            roll_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Sr_sequence1_3.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            roll_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_roll.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Sr_sequence1_3.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    }
                    else if (v == findViewById(R.id.fire_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("fire")) {

                            fire_c.setVisibility(View.GONE);
                            fire_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Sr_sequence1_3.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            fire_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_fire.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Sr_sequence1_3.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    }
                    else if (v == findViewById(R.id.chap_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("chap")) {

                            chap_c.setVisibility(View.GONE);
                            chap_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Sr_sequence1_3.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            chap_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_chap.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Sr_sequence1_3.this, R.raw.failure);
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


                    if(rice_c_n.getVisibility()==View.VISIBLE){

                        drag_rice.setVisibility(View.GONE);
                    }
                    else{
                        drag_rice.setVisibility(View.VISIBLE);
                    }


                    if(roll_c_n.getVisibility()==View.VISIBLE){

                        drag_roll.setVisibility(View.GONE);
                    }
                    else{
                        drag_roll.setVisibility(View.VISIBLE);
                    }

                    if(fire_c_n.getVisibility()==View.VISIBLE){

                        drag_fire.setVisibility(View.GONE);
                    }
                    else{
                        drag_fire.setVisibility(View.VISIBLE);
                    }

                    if(chap_c_n.getVisibility()==View.VISIBLE){

                        drag_chap.setVisibility(View.GONE);
                    }
                    else{
                        drag_chap.setVisibility(View.VISIBLE);
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
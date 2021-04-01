package com.example.sanskriti_2020_all.Seniorkg.Unit2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

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
import com.example.sanskriti_2020_all.Nurseryclass.Unit2.S_alphabet;
import com.example.sanskriti_2020_all.R;
import com.example.sanskriti_2020_all.Seniorkg.Unit3.Sr_sequence1_3;
import com.example.sanskriti_2020_all.Seniorkg.Unit3.sr_sequence2_3;

public class Birthday extends AppCompatActivity {
    ImageView drag_bd1, drag_bd2, drag_bd3 , drag_bd4,
            bd1_c,bd1_c_n,bd2_c,bd2_c_n,bd3_c,bd3_c_n,bd4_c,bd4_c_n;

    ConstraintLayout constraintLayout;
    private ViewFlipper viewFlipper;
    int i;
    MediaPlayer failure, success,animalhome_dog,animalhome_hen,animalhome_horse,animalhome_cow,animalhome_lion,animalhome_pig,mp3,mp;
    private static final String BD1_C = "bd1";
    private static final String BD2_C = "bd2";
    private static final String BD3_C = "bd3";
    private static final String BD4_C = "bd4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);

        viewFlipper = findViewById(R.id.viewflipper);
        bd1_c = findViewById(R.id.bd1_c);
        bd1_c_n = findViewById(R.id.bd1_c_n);
        bd2_c = findViewById(R.id.bd2_c);
        bd2_c_n = findViewById(R.id.bd2_c_n);
        bd3_c = findViewById(R.id.bd3_c);
        bd3_c_n = findViewById(R.id.bd3_c_n);
        bd4_c = findViewById(R.id.bd4_c);
        bd4_c_n = findViewById(R.id.bd4_c_n);
        drag_bd1 = findViewById(R.id.drag_bd1);
        drag_bd2 = findViewById(R.id.drag_bd2);
        drag_bd3 = findViewById(R.id.drag_bd3);
        drag_bd4 = findViewById(R.id.drag_bd4);



        drag_bd1.setTag(BD1_C);
        drag_bd2.setTag(BD2_C);
        drag_bd3.setTag(BD3_C);
        drag_bd4.setTag(BD4_C);

        drag_bd1.setOnTouchListener(new MyClickListener());
        drag_bd2.setOnTouchListener(new MyClickListener());
        drag_bd3.setOnTouchListener(new MyClickListener());
        drag_bd4.setOnTouchListener(new MyClickListener());

        bd1_c.setOnDragListener(new MyDragListener());
        bd2_c.setOnDragListener(new MyDragListener());
        bd3_c.setOnDragListener(new MyDragListener());
        bd4_c.setOnDragListener(new MyDragListener());

        mp3 = MediaPlayer.create(Birthday.this, R.raw.success);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();


    }

    public void youCant(DragEvent event){
        mp = MediaPlayer.create(Birthday.this, R.raw.try_again_new);
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
                    Intent act = new Intent(Birthday.this, Sn2_theme_activities.class);
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

                    if (v == findViewById(R.id.bd1_c)) {
                        View view = (View) event.getLocalState();

                        if (clipData.equals("bd1")) {


                            bd1_c.setVisibility(View.GONE);
                            bd1_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Birthday.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_dog.start();
                            nextScreen(i);

                        } else {

                            bd1_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_bd1.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Birthday.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    } else if (v == findViewById(R.id.bd2_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("bd2")) {

                            bd2_c.setVisibility(View.GONE);
                            bd2_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Birthday.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            bd2_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_bd2.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Birthday.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    }
                    else if (v == findViewById(R.id.bd3_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("bd3")) {

                            bd3_c.setVisibility(View.GONE);
                            bd3_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Birthday.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            bd3_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_bd3.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Birthday.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    }
                    else if (v == findViewById(R.id.bd4_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("bd4")) {

                            bd4_c.setVisibility(View.GONE);
                            bd4_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Birthday.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            bd4_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_bd4.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Birthday.this, R.raw.failure);
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


                    if(bd1_c_n.getVisibility()==View.VISIBLE){

                        drag_bd1.setVisibility(View.GONE);
                    }
                    else{
                        drag_bd1.setVisibility(View.VISIBLE);
                    }


                    if(bd2_c_n.getVisibility()==View.VISIBLE){

                        drag_bd2.setVisibility(View.GONE);
                    }
                    else{
                        drag_bd2.setVisibility(View.VISIBLE);
                    }

                    if(bd3_c_n.getVisibility()==View.VISIBLE){

                        drag_bd3.setVisibility(View.GONE);
                    }
                    else{
                        drag_bd3.setVisibility(View.VISIBLE);
                    }

                    if(bd4_c_n.getVisibility()==View.VISIBLE){

                        drag_bd4.setVisibility(View.GONE);
                    }
                    else{
                        drag_bd4.setVisibility(View.VISIBLE);
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
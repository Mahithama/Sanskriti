package com.example.sanskriti_2020_all.Seniorkg.Unit5;

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

import com.example.sanskriti_2020_all.Juniorclass.unit5.Pattren_tap;
import com.example.sanskriti_2020_all.MyClickListener;
import com.example.sanskriti_2020_all.R;
import com.example.sanskriti_2020_all.Seniorkg.Unit3.sr_blends_3;

public class Sequence_cookie extends AppCompatActivity {
    ImageView drag_1,drag_2,drag_3,drag_4,
            a_c,a_c_n,b_c,b_c_n,c_c,c_c_n,d_c,d_c_n;

    ConstraintLayout constraintLayout;
    private ViewFlipper viewFlipper;
    int i;
    MediaPlayer failure, success,animalhome_dog,animalhome_hen,animalhome_horse,animalhome_cow,animalhome_lion,animalhome_pig,mp3,mp;
    private static final String A_C = "a";
    private static final String B_C = "b";
    private static final String C_C = "c";
    private static final String D_C = "d";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sequence_cookie);
        a_c = findViewById(R.id.a_c);
        a_c_n = findViewById(R.id.a_c_n);
        b_c = findViewById(R.id.b_c);
        b_c_n = findViewById(R.id.b_c_n);
        c_c = findViewById(R.id.c_c);
        c_c_n = findViewById(R.id.c_c_n);
        d_c = findViewById(R.id.d_c);
        d_c_n = findViewById(R.id.d_c_n);
        drag_1 = findViewById(R.id.drag_1);
        drag_2 = findViewById(R.id.drag_2);
        drag_3 = findViewById(R.id.drag_3);
        drag_4 = findViewById(R.id.drag_4);
        viewFlipper = findViewById(R.id.viewflipper);
        mp3 = MediaPlayer.create(Sequence_cookie.this, R.raw.success);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();

        drag_1.setTag(A_C);
        drag_2.setTag(B_C);
        drag_3.setTag(C_C);
        drag_4.setTag(D_C);

        drag_1.setOnTouchListener(new MyClickListener());
        drag_2.setOnTouchListener(new MyClickListener());
        drag_3.setOnTouchListener(new MyClickListener());
        drag_4.setOnTouchListener(new MyClickListener());

        a_c.setOnDragListener(new MyDragListener());
        b_c.setOnDragListener(new MyDragListener());
        c_c.setOnDragListener(new MyDragListener());
        d_c.setOnDragListener(new MyDragListener());



    }

    public void youCant(DragEvent event){
        mp = MediaPlayer.create(Sequence_cookie.this, R.raw.failure);
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
                    Intent act = new Intent(Sequence_cookie.this, Sn5_literacy.class);
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

                    if (v == findViewById(R.id.a_c)) {
                        View view = (View) event.getLocalState();

                        if (clipData.equals("a")) {


                            a_c.setVisibility(View.GONE);
                            a_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Sequence_cookie.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_dog.start();
                            nextScreen(i);

                        } else {

                            a_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_1.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Sequence_cookie.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    } else if (v == findViewById(R.id.b_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("b")) {

                            b_c.setVisibility(View.GONE);
                            b_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Sequence_cookie.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            b_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_2.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Sequence_cookie.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    }
                    else if (v == findViewById(R.id.c_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("c")) {

                            c_c.setVisibility(View.GONE);
                            c_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Sequence_cookie.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            c_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_3.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Sequence_cookie.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    }
                    else if (v == findViewById(R.id.d_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("d")) {

                            d_c.setVisibility(View.GONE);
                            d_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Sequence_cookie.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            d_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_4.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Sequence_cookie.this, R.raw.failure);
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


                    if(a_c_n.getVisibility()==View.VISIBLE){

                        drag_1.setVisibility(View.GONE);
                    }
                    else{
                        drag_1.setVisibility(View.VISIBLE);
                    }


                    if(b_c_n.getVisibility()==View.VISIBLE){

                        drag_2.setVisibility(View.GONE);
                    }
                    else{
                        drag_2.setVisibility(View.VISIBLE);
                    }

                    if(c_c_n.getVisibility()==View.VISIBLE){

                        drag_3.setVisibility(View.GONE);
                    }
                    else{
                        drag_3.setVisibility(View.VISIBLE);
                    }

                    if(d_c_n.getVisibility()==View.VISIBLE){

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

    public void nextView(View v) {
        viewFlipper.showNext();
        if(mp3 != null && mp3.isPlaying()){
            mp3.stop();
        }

    }
}
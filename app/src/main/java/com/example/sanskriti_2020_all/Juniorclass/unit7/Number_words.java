package com.example.sanskriti_2020_all.Juniorclass.unit7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sanskriti_2020_all.MyClickListener;
import com.example.sanskriti_2020_all.R;
import com.example.sanskriti_2020_all.Juniorclass.unit5.Pattren_tap;

public class Number_words extends AppCompatActivity {
    ImageView b1_c,b2_c,b3_c,b4_c,b5_c,b6_c,b7_c,b8_c,b9_c,b10_c;
    TextView drag_b1,drag_b2,drag_b3,drag_b4,drag_b5,drag_b6,drag_b7,drag_b8,drag_b9,drag_b10,
             b1_c_n,b2_c_n,b3_c_n,b4_c_n,b5_c_n,b6_c_n,b7_c_n,b8_c_n,b9_c_n,b10_c_n;

    int i;
    MediaPlayer failure, success,animalhome_dog,animalhome_hen,animalhome_horse,animalhome_cow,animalhome_lion,animalhome_pig,mp3,mp;
    private static final String B1_C = "b1";
    private static final String B2_C = "b2";
    private static final String B3_C = "b3";
    private static final String B4_C = "b4";
    private static final String B5_C = "b5";
    private static final String B6_C = "b6";
    private static final String B7_C = "b7";
    private static final String B8_C = "b8";
    private static final String B9_C = "b9";
    private static final String B10_C = "b10";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_words);

        b1_c = findViewById(R.id.b1_c);
        b2_c = findViewById(R.id.b2_c);
        b3_c = findViewById(R.id.b3_c);
        b4_c = findViewById(R.id.b4_c);
        b5_c = findViewById(R.id.b5_c);
        b6_c = findViewById(R.id.b6_c);
        b7_c = findViewById(R.id.b7_c);
        b8_c = findViewById(R.id.b8_c);
        b9_c = findViewById(R.id.b9_c);
        b10_c = findViewById(R.id.b10_c);

        b1_c_n = findViewById(R.id.b1_c_n);
        b2_c_n = findViewById(R.id.b2_c_n);
        b3_c_n = findViewById(R.id.b3_c_n);
        b4_c_n = findViewById(R.id.b4_c_n);
        b5_c_n = findViewById(R.id.b5_c_n);
        b6_c_n = findViewById(R.id.b6_c_n);
        b7_c_n = findViewById(R.id.b7_c_n);
        b8_c_n = findViewById(R.id.b8_c_n);
        b9_c_n = findViewById(R.id.b9_c_n);
        b10_c_n = findViewById(R.id.b10_c_n);

        drag_b1 = findViewById(R.id.drag_b1);
        drag_b2 = findViewById(R.id.drag_b2);
        drag_b3 = findViewById(R.id.drag_b3);
        drag_b4 = findViewById(R.id.drag_b4);
        drag_b5 = findViewById(R.id.drag_b5);
        drag_b6 = findViewById(R.id.drag_b6);
        drag_b7 = findViewById(R.id.drag_b7);
        drag_b8 = findViewById(R.id.drag_b8);
        drag_b9 = findViewById(R.id.drag_b9);
        drag_b10 = findViewById(R.id.drag_b10);

        drag_b1.setTag(B1_C);
        drag_b2.setTag(B2_C);
        drag_b3.setTag(B3_C);
        drag_b4.setTag(B4_C);
        drag_b5.setTag(B5_C);
        drag_b6.setTag(B6_C);
        drag_b7.setTag(B7_C);
        drag_b8.setTag(B8_C);
        drag_b9.setTag(B9_C);
        drag_b10.setTag(B10_C);

        drag_b1.setOnTouchListener(new MyClickListener());
        drag_b2.setOnTouchListener(new MyClickListener());
        drag_b3.setOnTouchListener(new MyClickListener());
        drag_b4.setOnTouchListener(new MyClickListener());
        drag_b5.setOnTouchListener(new MyClickListener());
        drag_b6.setOnTouchListener(new MyClickListener());
        drag_b7.setOnTouchListener(new MyClickListener());
        drag_b8.setOnTouchListener(new MyClickListener());
        drag_b9.setOnTouchListener(new MyClickListener());
        drag_b10.setOnTouchListener(new MyClickListener());

        b1_c.setOnDragListener(new Number_words.MyDragListener());
        b2_c.setOnDragListener(new Number_words.MyDragListener());
        b3_c.setOnDragListener(new Number_words.MyDragListener());
        b4_c.setOnDragListener(new Number_words.MyDragListener());
        b5_c.setOnDragListener(new Number_words.MyDragListener());
        b6_c.setOnDragListener(new Number_words.MyDragListener());
        b7_c.setOnDragListener(new Number_words.MyDragListener());
        b8_c.setOnDragListener(new Number_words.MyDragListener());
        b9_c.setOnDragListener(new Number_words.MyDragListener());
        b10_c.setOnDragListener(new Number_words.MyDragListener());




    }

    public void youCant(DragEvent event){
        mp = MediaPlayer.create(Number_words.this, R.raw.failure);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.setLooping(false);
        mp.start();
        //try_again_new.start();
        //View view = (View) event.getLocalState();
        //view.setVisibility(View.VISIBLE);
    }

    public void nextScreen(int i){

        if(i==10){

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Drag The Number Activity";
                    Intent act = new Intent(Number_words.this, ju7_numeracy.class);
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

                    if (v == findViewById(R.id.b1_c)) {
                        View view = (View) event.getLocalState();

                        if (clipData.equals("b1")) {


                            b1_c.setVisibility(View.GONE);
                            b1_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Number_words.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_dog.start();
                            nextScreen(i);

                        } else {

                            b1_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_b1.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Number_words.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    } else if (v == findViewById(R.id.b2_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("b2")) {

                            b2_c.setVisibility(View.GONE);
                            b2_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Number_words.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            b2_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_b2.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Number_words.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }


                    }
                    else if (v == findViewById(R.id.b3_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("b3")) {

                            b3_c.setVisibility(View.GONE);
                            b3_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Number_words.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            b3_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_b3.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Number_words.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    }
                    else if (v == findViewById(R.id.b4_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("b4")) {

                            b4_c.setVisibility(View.GONE);
                            b4_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Number_words.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            b4_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_b4.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Number_words.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    }else if (v == findViewById(R.id.b5_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("b5")) {

                            b5_c.setVisibility(View.GONE);
                            b5_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Number_words.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            b5_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_b5.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Number_words.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    }else if (v == findViewById(R.id.b6_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("b6")) {

                            b6_c.setVisibility(View.GONE);
                            b6_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Number_words.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            b6_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_b6.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Number_words.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    }else if (v == findViewById(R.id.b7_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("b7")) {

                            b7_c.setVisibility(View.GONE);
                            b7_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Number_words.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            b7_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_b7.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Number_words.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    }else if (v == findViewById(R.id.b8_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("b8")) {

                            b8_c.setVisibility(View.GONE);
                            b8_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Number_words.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            b8_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_b8.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Number_words.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    }else if (v == findViewById(R.id.b9_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("b9")) {

                            b9_c.setVisibility(View.GONE);
                            b9_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Number_words.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            b9_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_b9.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Number_words.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    }else if (v == findViewById(R.id.b10_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("b10")) {

                            b10_c.setVisibility(View.GONE);
                            b10_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Number_words.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            b10_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_b10.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Number_words.this, R.raw.failure);
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


                    if(b1_c_n.getVisibility()==View.VISIBLE){

                        drag_b1.setVisibility(View.GONE);
                    }
                    else{
                        drag_b1.setVisibility(View.VISIBLE);
                    }


                    if(b2_c_n.getVisibility()==View.VISIBLE){

                        drag_b2.setVisibility(View.GONE);
                    }
                    else{
                        drag_b2.setVisibility(View.VISIBLE);
                    }

                    if(b3_c_n.getVisibility()==View.VISIBLE){

                        drag_b3.setVisibility(View.GONE);
                    }
                    else{
                        drag_b3.setVisibility(View.VISIBLE);
                    }

                    if(b4_c_n.getVisibility()==View.VISIBLE){

                        drag_b4.setVisibility(View.GONE);
                    }
                    else{
                        drag_b4.setVisibility(View.VISIBLE);
                    }
                    if(b5_c_n.getVisibility()==View.VISIBLE){

                        drag_b5.setVisibility(View.GONE);
                    }
                    else{
                        drag_b5.setVisibility(View.VISIBLE);
                    }


                    if(b6_c_n.getVisibility()==View.VISIBLE){

                        drag_b6.setVisibility(View.GONE);
                    }
                    else{
                        drag_b6.setVisibility(View.VISIBLE);
                    }

                    if(b7_c_n.getVisibility()==View.VISIBLE){

                        drag_b7.setVisibility(View.GONE);
                    }
                    else{
                        drag_b7.setVisibility(View.VISIBLE);
                    }

                    if(b8_c_n.getVisibility()==View.VISIBLE){

                        drag_b8.setVisibility(View.GONE);
                    }
                    else{
                        drag_b8.setVisibility(View.VISIBLE);
                    }
                    if(b9_c_n.getVisibility()==View.VISIBLE){

                        drag_b9.setVisibility(View.GONE);
                    }
                    else{
                        drag_b9.setVisibility(View.VISIBLE);
                    }

                    if(b10_c_n.getVisibility()==View.VISIBLE){

                        drag_b10.setVisibility(View.GONE);
                    }
                    else{
                        drag_b10.setVisibility(View.VISIBLE);
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
}
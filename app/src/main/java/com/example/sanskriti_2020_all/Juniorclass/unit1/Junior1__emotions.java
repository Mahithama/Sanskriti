package com.example.sanskriti_2020_all.Juniorclass.unit1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
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

public class Junior1__emotions extends AppCompatActivity {
    ImageView drag_happy,happy_c_n,drag_sad,sad_c_n,drag_scared,scared_c_n,drag_excited,excited_c_n,drag_angry,angry_c_n;
    TextView happy_c,sad_c,scared_c,excited_c,angry_c;

    int i;
    MediaPlayer failure, success,mp3,emo_happy,emo_sad,emo_angry,emo_excited,emo_scared,try_again_new,mp;
    private static final String HAPPY_C = "happyy";
    private static final String SAD_C = "sadd";
    private static final String SCARED_C = "scaredd";
    private static final String EXCITED_C = "excitedd";
    private static final String ANGRY_C = "angryy";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junior1__emotions);
        happy_c = findViewById(R.id.happy_c);
        happy_c_n = findViewById(R.id.happy_c_n);
        sad_c = findViewById(R.id.sad_c);
        sad_c_n = findViewById(R.id.sad_c_n);
        scared_c = findViewById(R.id.scared_c);
        scared_c_n = findViewById(R.id.scared_c_n);
        excited_c = findViewById(R.id.excited_c);
        excited_c_n = findViewById(R.id.excited_c_n);
        angry_c = findViewById(R.id.angry_c);
        angry_c_n = findViewById(R.id.angry_c_n);
        drag_happy = findViewById(R.id.drag_happy);
        drag_sad = findViewById(R.id.drag_sad);
        drag_scared = findViewById(R.id.drag_scared);
        drag_excited = findViewById(R.id.drag_excited);
        drag_angry = findViewById(R.id.drag_angry);




        try_again_new = MediaPlayer.create(Junior1__emotions.this, R.raw.try_again_new);
        success = MediaPlayer.create(Junior1__emotions.this, R.raw.success);
        emo_happy = MediaPlayer.create(Junior1__emotions.this, R.raw.emo_happy);
        emo_sad = MediaPlayer.create(Junior1__emotions.this, R.raw.emo_sad);
        emo_angry = MediaPlayer.create(Junior1__emotions.this, R.raw.emo_angry);
        emo_excited = MediaPlayer.create(Junior1__emotions.this, R.raw.emo_excited);
        emo_scared = MediaPlayer.create(Junior1__emotions.this, R.raw.emo_scared);


        mp3 = MediaPlayer.create(Junior1__emotions.this, R.raw.emotions_title);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();

        drag_happy.setTag(HAPPY_C);
        drag_sad.setTag(SAD_C);
        drag_scared.setTag(SCARED_C);
        drag_excited.setTag(EXCITED_C);
        drag_angry.setTag(ANGRY_C);

        drag_happy.setOnTouchListener(new MyClickListener());
        drag_sad.setOnTouchListener(new MyClickListener());
        drag_scared.setOnTouchListener(new MyClickListener());
        drag_excited.setOnTouchListener(new MyClickListener());
        drag_angry.setOnTouchListener(new MyClickListener());

        happy_c.setOnDragListener(new Junior1__emotions.MyDragListener());
        sad_c.setOnDragListener(new Junior1__emotions.MyDragListener());
        scared_c.setOnDragListener(new Junior1__emotions.MyDragListener());
        excited_c.setOnDragListener(new Junior1__emotions.MyDragListener());
        angry_c.setOnDragListener(new Junior1__emotions.MyDragListener());


    }

    public void youCant(DragEvent event){

        mp = MediaPlayer.create(Junior1__emotions.this, R.raw.failure);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.setLooping(false);
        mp.start();
    }



    public void nextScreen(int i){

        if(i==5){

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Drag The Number Activity";
                    Intent act = new Intent(Junior1__emotions.this, Junior_literacy1n_home.class);
                    act.putExtra("activity_name", activity_name);
                    startActivity(act);


                }
            }, 500);



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

                    String clipDataa = event.getClipDescription().getLabel().toString();

                    if (v == findViewById(R.id.happy_c)) {
                        View view = (View) event.getLocalState();

                        if (clipDataa.equals("happyy")) {

                            happy_c.setTextColor(Color.parseColor("#c061f1"));
                            emo_happy.start();
                        } else {
                            happy_c.setTextColor(Color.parseColor("#191819"));
                        }
                    }
                    else if (v == findViewById(R.id.sad_c)) {

                        View view = (View) event.getLocalState();

                        if (clipDataa.equals("sadd")) {

                            sad_c.setTextColor(Color.parseColor("#c061f1"));
                            emo_sad.start();

                        } else {
                            sad_c.setTextColor(Color.parseColor("#191819"));
                        }
                    }else if (v == findViewById(R.id.excited_c)) {

                        View view = (View) event.getLocalState();

                        if (clipDataa.equals("excitedd")) {

                            excited_c.setTextColor(Color.parseColor("#c061f1"));
                            emo_excited.start();

                        } else {

                            excited_c.setTextColor(Color.parseColor("#191819"));
                        }
                    }else if (v == findViewById(R.id.scared_c)) {

                        View view = (View) event.getLocalState();

                        if (clipDataa.equals("scaredd")) {

                            scared_c.setTextColor(Color.parseColor("#c061f1"));
                            emo_scared.start();

                        } else {

                            scared_c.setTextColor(Color.parseColor("#191819"));
                        }
                    }
                    else if (v == findViewById(R.id.angry_c)) {

                        View view = (View) event.getLocalState();

                        if (clipDataa.equals("angryy")) {

                            angry_c.setTextColor(Color.parseColor("#c061f1"));
                            emo_angry.start();

                        } else {

                            angry_c.setTextColor(Color.parseColor("#191819"));
                        }
                    }
                    else {


                    }

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

                    if (v == findViewById(R.id.happy_c)) {
                        View view = (View) event.getLocalState();

                        if (clipData.equals("happyy")) {


                            happy_c.setVisibility(View.GONE);
                            happy_c_n.setVisibility(View.VISIBLE);
                            i++;
                            success.start();
                            nextScreen(i);

                        } else {
                            happy_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_happy.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            try_again_new.start();
                        }
                    } else if (v == findViewById(R.id.sad_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("sadd")) {

                            sad_c.setVisibility(View.GONE);
                            sad_c_n.setVisibility(View.VISIBLE);
                            i++;
                            success.start();
                            nextScreen(i);

                        } else {
                            sad_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_sad.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            try_again_new.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    } else if (v == findViewById(R.id.scared_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("scaredd")) {
                            scared_c.setVisibility(View.GONE);
                            scared_c_n.setVisibility(View.VISIBLE);
                            i++;
                            success.start();
                            nextScreen(i);

                        } else {
                            scared_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_scared.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            try_again_new.start();
                        }
                    } else if (v == findViewById(R.id.excited_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("excitedd")) {
                            excited_c.setVisibility(View.GONE);
                            excited_c_n.setVisibility(View.VISIBLE);
                            i++;
                            success.start();
                            nextScreen(i);

                        } else {
                            excited_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_excited.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            try_again_new.start();
                        }


                    }
                    else if (v == findViewById(R.id.angry_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("angryy")) {
                            angry_c.setVisibility(View.GONE);
                            angry_c_n.setVisibility(View.VISIBLE);
                            i++;
                            success.start();
                            nextScreen(i);

                        } else {
                            angry_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_angry.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            try_again_new.start();
                        }


                    }else {

                        youCant(event);
                    }
                    break;


                case DragEvent.ACTION_DRAG_ENDED:

                    if(happy_c_n.getVisibility()==View.VISIBLE){

                        drag_happy.setVisibility(View.GONE);
                    }
                    else{
                        drag_happy.setVisibility(View.VISIBLE);
                    }


                    if(sad_c_n.getVisibility()==View.VISIBLE){

                        drag_sad.setVisibility(View.GONE);
                    }
                    else{
                        drag_sad.setVisibility(View.VISIBLE);
                    }

                    if(angry_c_n.getVisibility()==View.VISIBLE){

                        drag_angry.setVisibility(View.GONE);
                    }
                    else{
                        drag_angry.setVisibility(View.VISIBLE);
                    }

                    if(scared_c_n.getVisibility()==View.VISIBLE){

                        drag_scared.setVisibility(View.GONE);
                    }
                    else{
                        drag_scared.setVisibility(View.VISIBLE);
                    }

                    if(excited_c_n.getVisibility()==View.VISIBLE){

                        drag_excited.setVisibility(View.GONE);
                    }
                    else{
                        drag_excited.setVisibility(View.VISIBLE);
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
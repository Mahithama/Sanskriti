package com.example.sanskriti_2020_all.Seniorkg.Unit1;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.DragEvent;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanskriti_2020_all.MyClickListener;
import com.example.sanskriti_2020_all.R;

public class Senior1_senses_action extends AppCompatActivity {
    ImageView drag_look,look_c,look_c_n,drag_smell,smell_c,smell_c_n,drag_eat,eat_c,eat_c_n,drag_carry,carry_c,carry_c_n,drag_listen,listen_c,listen_c_n
            ,drag_touch,touch_c,touch_c_n ;
    private ViewFlipper viewFlipper;
    Animation animationblink;
    int i;
    MediaPlayer failure, success,body_eyes,body_arms,body_nose,body_ears,body_fingers,body_mouth,try_again_new,mp,mp3;
    private static final String LOOK_C = "look";
    private static final String SMELL_C = "smell";
    private static final String EAT_C = "eat";
    private static final String CARRY_C = "carry";
    private static final String LISTEN_C = "listen";
    private static final String TOUCH_C = "touch";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senior1_senses_action);

        viewFlipper = findViewById(R.id.viewflipper);
        look_c = findViewById(R.id.look_c);
        look_c_n = findViewById(R.id.look_c_n);
        smell_c = findViewById(R.id.smell_c);
        smell_c_n = findViewById(R.id.smell_c_n);
        eat_c = findViewById(R.id.eat_c);
        eat_c_n = findViewById(R.id.eat_c_n);
        carry_c = findViewById(R.id.carry_c);
        carry_c_n = findViewById(R.id.carry_c_n);
        listen_c = findViewById(R.id.listen_c);
        listen_c_n = findViewById(R.id.listen_c_n);
        touch_c = findViewById(R.id.touch_c);
        touch_c_n = findViewById(R.id.touch_c_n);
        drag_look = findViewById(R.id.drag_look);
        drag_smell = findViewById(R.id.drag_smell);
        drag_eat = findViewById(R.id.drag_eat);
        drag_carry = findViewById(R.id.drag_carry);
        drag_listen = findViewById(R.id.drag_listen);
        drag_touch = findViewById(R.id.drag_touch);

        drag_look.setTag(LOOK_C);
        drag_smell.setTag(SMELL_C);
        drag_eat.setTag(EAT_C);
        drag_carry.setTag(CARRY_C);
        drag_listen.setTag(LISTEN_C);
        drag_touch.setTag(TOUCH_C);

        mp3 = MediaPlayer.create(Senior1_senses_action.this, R.raw.bodyfunction_title);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();


        drag_look.setOnTouchListener(new MyClickListener());
        drag_smell.setOnTouchListener(new MyClickListener());
        drag_eat.setOnTouchListener(new MyClickListener());
        drag_carry.setOnTouchListener(new MyClickListener());
        drag_touch.setOnTouchListener(new MyClickListener());
        drag_listen.setOnTouchListener(new MyClickListener());

        look_c.setOnDragListener(new MyDragListener());
        smell_c.setOnDragListener(new MyDragListener());
        eat_c.setOnDragListener(new MyDragListener());
        carry_c.setOnDragListener(new MyDragListener());
        listen_c.setOnDragListener(new MyDragListener());
        touch_c.setOnDragListener(new MyDragListener());


    }
    public void youCant(DragEvent event){


        mp = MediaPlayer.create(Senior1_senses_action.this, R.raw.try_again_new);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.setLooping(false);
        mp.start();
    }



    public void nextScreen(int i){

        if(i==6){

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Drag The Number Activity";
                    Intent act = new Intent(Senior1_senses_action.this, Senior1_senses_action_two.class);
                    act.putExtra("activity_name", activity_name);
                    startActivity(act);


                }
            }, 2000);



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

                    if (v == findViewById(R.id.look_c)) {
                        View view = (View) event.getLocalState();

                        if (clipData.equals("look")) {


                            look_c.setVisibility(View.GONE);
                            //eye_c.startAnimation(animationblink);
                            look_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Senior1_senses_action.this, R.raw.body_eye);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // body_eyes.start();
                            nextScreen(i);

                        } else {
                            look_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_look.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Senior1_senses_action.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    } else if (v == findViewById(R.id.carry_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("carry")) {

                            carry_c.setVisibility(View.GONE);
                            carry_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Senior1_senses_action.this, R.raw.body_arms);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // body_arms.start();
                            nextScreen(i);

                        } else {
                            carry_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_carry.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Senior1_senses_action.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    } else if (v == findViewById(R.id.smell_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("smell")) {
                            smell_c.setVisibility(View.GONE);
                            smell_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Senior1_senses_action.this, R.raw.body_nose);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // body_nose.start();
                            nextScreen(i);

                        } else {
                            smell_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_smell.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Senior1_senses_action.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    } else if (v == findViewById(R.id.eat_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("eat")) {
                            eat_c.setVisibility(View.GONE);
                            eat_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Senior1_senses_action.this, R.raw.body_mouth);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            nextScreen(i);

                        } else {
                            eat_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_eat.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Senior1_senses_action.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }


                    }
                    else if (v == findViewById(R.id.touch_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("touch")) {
                            touch_c.setVisibility(View.GONE);
                            mp = MediaPlayer.create(Senior1_senses_action.this, R.raw.body_fingers);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            touch_c_n.setVisibility(View.VISIBLE);
                            i++;
                            //body_fingers.start();
                            nextScreen(i);

                        } else {
                            touch_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_touch.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Senior1_senses_action.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }


                    }
                    else if (v == findViewById(R.id.listen_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("listen")) {
                            listen_c.setVisibility(View.GONE);
                            listen_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Senior1_senses_action.this, R.raw.body_ears);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // body_ears.start();
                            nextScreen(i);

                        } else {
                            listen_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_listen.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Senior1_senses_action.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }


                    }else {

                        youCant(event);
                    }
                    break;


                case DragEvent.ACTION_DRAG_ENDED:

                    if(look_c_n.getVisibility()==View.VISIBLE){

                        drag_look.setVisibility(View.GONE);
                    }
                    else{
                        drag_look.setVisibility(View.VISIBLE);
                    }


                    if(smell_c_n.getVisibility()==View.VISIBLE){

                        drag_smell.setVisibility(View.GONE);
                    }
                    else{
                        drag_smell.setVisibility(View.VISIBLE);
                    }


                    if(listen_c_n.getVisibility()==View.VISIBLE){

                        drag_listen.setVisibility(View.GONE);
                    }
                    else{
                        drag_listen.setVisibility(View.VISIBLE);
                    }


                    if(touch_c_n.getVisibility()== View.VISIBLE){

                        drag_touch.setVisibility(View.GONE);
                    }
                    else{
                        drag_touch.setVisibility(View.VISIBLE);
                    }


                    if(eat_c_n.getVisibility()==View.VISIBLE){

                        drag_eat.setVisibility(View.GONE);
                    }
                    else{
                        drag_eat.setVisibility(View.VISIBLE);
                    }

                    if(carry_c_n.getVisibility()==View.VISIBLE){

                        drag_carry.setVisibility(View.GONE);
                    }
                    else{
                        drag_carry.setVisibility(View.VISIBLE);
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
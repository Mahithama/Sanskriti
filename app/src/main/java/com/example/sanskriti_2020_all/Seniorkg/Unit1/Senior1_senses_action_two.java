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

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanskriti_2020_all.MyClickListener;
import com.example.sanskriti_2020_all.R;

public class Senior1_senses_action_two extends AppCompatActivity {
    ImageView drag_kick,kick_c,kick_c_n,
            drag_ride,ride_c,ride_c_n,
            drag_run,run_c,run_c_n,
            drag_bite,bite_c,bite_c_n,
            drag_taste,taste_c,taste_c_n
            ,drag_write,write_c,write_c_n ;
    Animation animationblink;
    int i;
    MediaPlayer try_again_new,mp;
    private static final String KICK_C = "kick";
    private static final String RIDE_C = "ride";
    private static final String RUN_C = "run";
    private static final String BITE_C = "bite";
    private static final String TASTE_C = "taste";
    private static final String WRITE_C = "write";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senior1_senses_action_two);
        kick_c = findViewById(R.id.kick_c);
        kick_c_n = findViewById(R.id.kick_c_n);
        ride_c = findViewById(R.id.ride_c);
        ride_c_n = findViewById(R.id.ride_c_n);
        run_c = findViewById(R.id.run_c);
        run_c_n = findViewById(R.id.run_c_n);
        bite_c = findViewById(R.id.bite_c);
        bite_c_n = findViewById(R.id.bite_c_n);
        taste_c = findViewById(R.id.taste_c);
        taste_c_n = findViewById(R.id.taste_c_n);
        write_c = findViewById(R.id.write_c);
        write_c_n = findViewById(R.id.write_c_n);
        drag_kick = findViewById(R.id.drag_kick);
        drag_ride = findViewById(R.id.drag_ride);
        drag_run = findViewById(R.id.drag_run);
        drag_bite = findViewById(R.id.drag_bite);
        drag_taste = findViewById(R.id.drag_taste);
        drag_write = findViewById(R.id.drag_write);

        drag_kick.setTag(KICK_C);
        drag_ride.setTag(RIDE_C);
        drag_run.setTag(RUN_C);
        drag_bite.setTag(BITE_C);
        drag_taste.setTag(TASTE_C);
        drag_write.setTag(WRITE_C);

        drag_kick.setOnTouchListener(new MyClickListener());
        drag_ride.setOnTouchListener(new MyClickListener());
        drag_run.setOnTouchListener(new MyClickListener());
        drag_bite.setOnTouchListener(new MyClickListener());
        drag_taste.setOnTouchListener(new MyClickListener());
        drag_write.setOnTouchListener(new MyClickListener());

        kick_c.setOnDragListener(new MyDragListener());
        ride_c.setOnDragListener(new MyDragListener());
        run_c.setOnDragListener(new MyDragListener());
        bite_c.setOnDragListener(new MyDragListener());
        taste_c.setOnDragListener(new MyDragListener());
        write_c.setOnDragListener(new MyDragListener());


    }
    public void youCant(DragEvent event){


        mp = MediaPlayer.create(Senior1_senses_action_two.this, R.raw.try_again_new);
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
                    Intent act = new Intent(Senior1_senses_action_two.this, Senior1_themes_home.class);
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

                    if (v == findViewById(R.id.kick_c)) {
                        View view = (View) event.getLocalState();

                        if (clipData.equals("kick")) {


                            kick_c.setVisibility(View.GONE);
                            //eye_c.startAnimation(animationblink);
                            kick_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Senior1_senses_action_two.this, R.raw.body_feet);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // body_eyes.start();
                            nextScreen(i);

                        } else {
                            kick_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_kick.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Senior1_senses_action_two.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    } else if (v == findViewById(R.id.run_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("run")) {

                            run_c.setVisibility(View.GONE);
                            run_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Senior1_senses_action_two.this, R.raw.body_legs);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // body_arms.start();
                            nextScreen(i);

                        } else {
                            run_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_run.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Senior1_senses_action_two.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    } else if (v == findViewById(R.id.bite_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("bite")) {
                            bite_c.setVisibility(View.GONE);
                            bite_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Senior1_senses_action_two.this, R.raw.body_teeth);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // body_nose.start();
                            nextScreen(i);

                        } else {
                            bite_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_bite.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Senior1_senses_action_two.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    } else if (v == findViewById(R.id.taste_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("taste")) {
                            taste_c.setVisibility(View.GONE);
                            taste_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Senior1_senses_action_two.this, R.raw.body_tounge);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            nextScreen(i);

                        } else {
                            taste_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_taste.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Senior1_senses_action_two.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }


                    }
                    else if (v == findViewById(R.id.write_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("write")) {
                            write_c.setVisibility(View.GONE);
                            mp = MediaPlayer.create(Senior1_senses_action_two.this, R.raw.body_hands);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            write_c_n.setVisibility(View.VISIBLE);
                            i++;
                            //body_fingers.start();
                            nextScreen(i);

                        } else {
                            write_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_write.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Senior1_senses_action_two.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }


                    }
                    else if (v == findViewById(R.id.ride_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("ride")) {
                            ride_c.setVisibility(View.GONE);
                            ride_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Senior1_senses_action_two.this, R.raw.body_knees);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // body_ears.start();
                            nextScreen(i);

                        } else {
                            ride_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_ride.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Senior1_senses_action_two.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }


                    }else {

                        youCant(event);
                    }
                    break;


                case DragEvent.ACTION_DRAG_ENDED:

                    if(kick_c_n.getVisibility()==View.VISIBLE){

                        drag_kick.setVisibility(View.GONE);
                    }
                    else{
                        drag_kick.setVisibility(View.VISIBLE);
                    }


                    if(run_c_n.getVisibility()==View.VISIBLE){

                        drag_run.setVisibility(View.GONE);
                    }
                    else{
                        drag_run.setVisibility(View.VISIBLE);
                    }


                    if(taste_c_n.getVisibility()==View.VISIBLE){

                        drag_taste.setVisibility(View.GONE);
                    }
                    else{
                        drag_taste.setVisibility(View.VISIBLE);
                    }


                    if(bite_c_n.getVisibility()==View.VISIBLE){

                        drag_bite.setVisibility(View.GONE);
                    }
                    else{
                        drag_bite.setVisibility(View.VISIBLE);
                    }


                    if(write_c_n.getVisibility()==View.VISIBLE){

                        drag_write.setVisibility(View.GONE);
                    }
                    else{
                        drag_write.setVisibility(View.VISIBLE);
                    }

                    if(ride_c_n.getVisibility()==View.VISIBLE){

                        drag_ride.setVisibility(View.GONE);
                    }
                    else{
                        drag_ride.setVisibility(View.VISIBLE);
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

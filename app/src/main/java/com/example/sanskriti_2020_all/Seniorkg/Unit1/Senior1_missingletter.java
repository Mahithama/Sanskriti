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
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.sanskriti_2020_all.MyClickListener;
import com.example.sanskriti_2020_all.R;

public class Senior1_missingletter extends AppCompatActivity {
    TextView drag_bee,drag_cub,drag_bug,drag_key,drag_sun,
            bee_c_n, cub_c_n,bug_c_n,key_c_n,sun_c_n;
    ImageView bee_c,cub_c,bug_c,key_c,sun_c;
    private ViewFlipper viewFlipper;
    ConstraintLayout constraintLayout;
    Animation animationblink;
    int i;
    MediaPlayer success,try_again_new,mp,bee,cub,bug,key,sun,mp3;

    private static final String BEE_C = "bee";
    private static final String CUB_C = "cub";
    private static final String BUG_C = "bug";
    private static final String KEY_C = "key";
    private static final String SUN_C = "sun";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senior1_missingletter);

        viewFlipper = findViewById(R.id.viewflipper);
        drag_bee = findViewById(R.id.drag_bee);
        drag_cub = findViewById(R.id.drag_cub);
        drag_bug = findViewById(R.id.drag_bug);
        drag_key = findViewById(R.id.drag_key);
        drag_sun = findViewById(R.id.drag_sun);
        bee_c_n = findViewById(R.id.bee_c_n);
        cub_c_n = findViewById(R.id.cub_c_n);
        bug_c_n = findViewById(R.id.bug_c_n);
        key_c_n = findViewById(R.id.key_c_n);
        sun_c_n = findViewById(R.id.sun_c_n);
        bee_c = findViewById(R.id.bee_c);
        cub_c = findViewById(R.id.cub_c);
        bug_c = findViewById(R.id.bug_c);
        key_c = findViewById(R.id.key_c);
        sun_c = findViewById(R.id.sun_c);

        mp3 = MediaPlayer.create(Senior1_missingletter.this, R.raw.complete_word);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();




        try_again_new = MediaPlayer.create(Senior1_missingletter.this, R.raw.try_again_new);
        success = MediaPlayer.create(Senior1_missingletter.this, R.raw.success);
        bee = MediaPlayer.create(Senior1_missingletter.this, R.raw.cvc_bee);
        cub = MediaPlayer.create(Senior1_missingletter.this, R.raw.cvc_cub);
        bug = MediaPlayer.create(Senior1_missingletter.this, R.raw.cvc_bug);
        key = MediaPlayer.create(Senior1_missingletter.this, R.raw.cvc_key);
        sun = MediaPlayer.create(Senior1_missingletter.this, R.raw.cvc_sun);

        drag_bee.setTag(BEE_C);
        drag_cub.setTag(CUB_C);
        drag_bug.setTag(BUG_C);
        drag_key.setTag(KEY_C);
        drag_sun.setTag(SUN_C);

        drag_bee.setOnTouchListener(new MyClickListener());
        drag_cub.setOnTouchListener(new MyClickListener());
        drag_bug.setOnTouchListener(new MyClickListener());
        drag_key.setOnTouchListener(new MyClickListener());
        drag_sun.setOnTouchListener(new MyClickListener());

        bee_c.setOnDragListener(new MyDragListener());
        cub_c.setOnDragListener(new MyDragListener());
        bug_c.setOnDragListener(new MyDragListener());
        key_c.setOnDragListener(new MyDragListener());
        sun_c.setOnDragListener(new MyDragListener());


    }
    public void youCant(DragEvent event){

        mp = MediaPlayer.create(Senior1_missingletter.this, R.raw.try_again_new);
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
                    Intent act = new Intent(Senior1_missingletter.this, Senior1_missingletter2.class);
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

                    String clipData = event.getClipDescription().getLabel().toString();

                    if (v == findViewById(R.id.bee_c)) {
                        View view = (View) event.getLocalState();

                        if (clipData.equals("bee")) {


                            bee_c.setVisibility(View.GONE);
                            bee_c_n.setVisibility(View.VISIBLE);
                            i++;
                            bee.start();
                            nextScreen(i);

                        } else {
                            bee_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_bee.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            try_again_new.start();
                        }
                    } else if (v == findViewById(R.id.cub_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("cub")) {

                            cub_c.setVisibility(View.GONE);
                            cub_c_n.setVisibility(View.VISIBLE);
                            i++;
                            cub.start();
                            nextScreen(i);

                        } else {
                            cub_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_cub.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            try_again_new.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    } else if (v == findViewById(R.id.key_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("key")) {
                            key_c.setVisibility(View.GONE);
                            key_c_n.setVisibility(View.VISIBLE);
                            i++;
                            key.start();
                            nextScreen(i);

                        } else {
                            key_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_key.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            try_again_new.start();
                        }
                    } else if (v == findViewById(R.id.sun_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("sun")) {
                            sun_c.setVisibility(View.GONE);
                            sun_c_n.setVisibility(View.VISIBLE);
                            i++;
                            sun.start();
                            nextScreen(i);

                        } else {
                            sun_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_sun.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            try_again_new.start();
                        }


                    }
                    else if (v == findViewById(R.id.bug_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("bug")) {
                            bug_c.setVisibility(View.GONE);
                            bug_c_n.setVisibility(View.VISIBLE);
                            i++;
                            bug.start();
                            nextScreen(i);

                        } else {
                            bug_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_bug.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            try_again_new.start();
                        }


                    }
                    else {

                        youCant(event);
                    }
                    break;


                case DragEvent.ACTION_DRAG_ENDED:
                    /* v.setBackground(normalShape);*/    //go back to normal shape
                    if(bee_c_n.getVisibility()==View.VISIBLE){

                        drag_bee.setVisibility(View.GONE);
                    }
                    else{
                        drag_bee.setVisibility(View.VISIBLE);
                    }


                    if(cub_c_n.getVisibility()==View.VISIBLE){

                        drag_cub.setVisibility(View.GONE);
                    }
                    else{
                        drag_cub.setVisibility(View.VISIBLE);
                    }


                    if(key_c_n.getVisibility()==View.VISIBLE){

                        drag_key.setVisibility(View.GONE);
                    }
                    else{
                        drag_key.setVisibility(View.VISIBLE);
                    }


                    if(sun_c_n.getVisibility()==View.VISIBLE){

                        drag_sun.setVisibility(View.GONE);
                    }
                    else{
                        drag_sun.setVisibility(View.VISIBLE);
                    }


                    if(bug_c_n.getVisibility()==View.VISIBLE){

                        drag_bug.setVisibility(View.GONE);
                    }
                    else{
                        drag_bug.setVisibility(View.VISIBLE);
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

    public void nextView(View v) {
        viewFlipper.showNext();
        if(mp3 != null && mp3.isPlaying()){
            mp3.stop();
        }

    }
}
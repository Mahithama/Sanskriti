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

import com.example.sanskriti_2020_all.MyClickListener;
import com.example.sanskriti_2020_all.R;


public class Senior1_missingnumbers extends AppCompatActivity {
    TextView drag_one,drag_three,drag_five,drag_six,drag_seven,drag_nine
            ,one_c_n,three_c_n,five_c_n,six_c_n,seven_c_n,nine_c_n;
    ImageView one_c,three_c,five_c,six_c,seven_c,nine_c;
    private ViewFlipper viewFlipper;

    Animation animationblink;
    int i;
    MediaPlayer success,try_again_new,mp,mp3;

    private static final String ONE_C = "one";
    private static final String THREE_C = "three";
    private static final String FIVE_C = "five";
    private static final String SIX_C = "six";
    private static final String SEVEN_C = "seven";
    private static final String NINE_C = "nine";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senior1_missingnumbers);

        viewFlipper = findViewById(R.id.viewflipper);
        drag_one = findViewById(R.id.drag_one);
        drag_three = findViewById(R.id.drag_three);
        drag_five = findViewById(R.id.drag_five);
        drag_six = findViewById(R.id.drag_six);
        drag_seven = findViewById(R.id.drag_seven);
        drag_nine = findViewById(R.id.drag_nine);
        one_c = findViewById(R.id.one_c);
        three_c = findViewById(R.id.three_c);
        five_c = findViewById(R.id.five_c);
        six_c = findViewById(R.id.six_c);
        seven_c = findViewById(R.id.seven_c);
        nine_c = findViewById(R.id.nine_c);
        one_c_n = findViewById(R.id.one_c_n);
        three_c_n = findViewById(R.id.three_c_n);
        five_c_n = findViewById(R.id.five_c_n);
        six_c_n = findViewById(R.id.six_c_n);
        seven_c_n = findViewById(R.id.seven_c_n);
        nine_c_n = findViewById(R.id.nine_c_n);


        try_again_new = MediaPlayer.create(Senior1_missingnumbers.this, R.raw.try_again_new);
        success = MediaPlayer.create(Senior1_missingnumbers.this, R.raw.success);

        mp3 = MediaPlayer.create(Senior1_missingnumbers.this, R.raw.letters_a_z);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();

        drag_one.setTag(ONE_C);
        drag_three.setTag(THREE_C);
        drag_five.setTag(FIVE_C);
        drag_six.setTag(SIX_C);
        drag_seven.setTag(SEVEN_C);
        drag_nine.setTag(NINE_C);

        drag_one.setOnTouchListener(new MyClickListener());
        drag_three.setOnTouchListener(new MyClickListener());
        drag_five.setOnTouchListener(new MyClickListener());
        drag_six.setOnTouchListener(new MyClickListener());
        drag_seven.setOnTouchListener(new MyClickListener());
        drag_nine.setOnTouchListener(new MyClickListener());

        one_c.setOnDragListener(new MyDragListener());
        three_c.setOnDragListener(new MyDragListener());
        five_c.setOnDragListener(new MyDragListener());
        six_c.setOnDragListener(new MyDragListener());
        seven_c.setOnDragListener(new MyDragListener());
        nine_c.setOnDragListener(new MyDragListener());


    }
    public void youCant(DragEvent event){

        mp = MediaPlayer.create(Senior1_missingnumbers.this, R.raw.try_again_new);
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
                    Intent act = new Intent(Senior1_missingnumbers.this, Senior_numeracy1n_home.class);
                    act.putExtra("activity_name", activity_name);
                    startActivity(act);


                }
            }, 1000);



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

                    if (v == findViewById(R.id.one_c)) {
                        View view = (View) event.getLocalState();

                        if (clipData.equals("one")) {


                            one_c.setVisibility(View.GONE);
                            one_c_n.setVisibility(View.VISIBLE);
                            i++;
                            success.start();
                            nextScreen(i);

                        } else {
                            one_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_one.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            try_again_new.start();
                        }
                    } else if (v == findViewById(R.id.three_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("three")) {

                            three_c.setVisibility(View.GONE);
                            three_c_n.setVisibility(View.VISIBLE);
                            i++;
                            success.start();
                            nextScreen(i);

                        } else {
                            three_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_three.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            try_again_new.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    } else if (v == findViewById(R.id.five_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("five")) {
                            five_c.setVisibility(View.GONE);
                            five_c_n.setVisibility(View.VISIBLE);
                            i++;
                            success.start();
                            nextScreen(i);

                        } else {
                            five_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_three.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            try_again_new.start();
                        }
                    } else if (v == findViewById(R.id.six_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("six")) {
                            six_c.setVisibility(View.GONE);
                            six_c_n.setVisibility(View.VISIBLE);
                            i++;
                            success.start();
                            nextScreen(i);

                        } else {
                            six_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_six.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            try_again_new.start();
                        }


                    }
                    else if (v == findViewById(R.id.seven_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("seven")) {
                            seven_c.setVisibility(View.GONE);
                            seven_c_n.setVisibility(View.VISIBLE);
                            i++;
                            success.start();
                            nextScreen(i);

                        } else {
                            seven_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_seven.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            try_again_new.start();
                        }


                    }
                    else if (v == findViewById(R.id.nine_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("nine")) {
                            nine_c.setVisibility(View.GONE);
                            nine_c_n.setVisibility(View.VISIBLE);
                            i++;
                            success.start();
                            nextScreen(i);

                        } else {
                            nine_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_nine.setVisibility(View.VISIBLE);
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
                    /* v.setBackground(normalShape);*/    //go back to normal shape
                    if(one_c_n.getVisibility()==View.VISIBLE){

                        drag_one.setVisibility(View.GONE);
                    }
                    else{
                        drag_one.setVisibility(View.VISIBLE);
                    }


                    if(three_c_n.getVisibility()==View.VISIBLE){

                        drag_three.setVisibility(View.GONE);
                    }
                    else{
                        drag_three.setVisibility(View.VISIBLE);
                    }


                    if(five_c_n.getVisibility()==View.VISIBLE){

                        drag_five.setVisibility(View.GONE);
                    }
                    else{
                        drag_five.setVisibility(View.VISIBLE);
                    }


                    if(six_c_n.getVisibility()==View.VISIBLE){

                        drag_six.setVisibility(View.GONE);
                    }
                    else{
                        drag_six.setVisibility(View.VISIBLE);
                    }


                    if(seven_c_n.getVisibility()==View.VISIBLE){

                        drag_seven.setVisibility(View.GONE);
                    }
                    else{
                        drag_seven.setVisibility(View.VISIBLE);
                    }

                    if(nine_c_n.getVisibility()==View.VISIBLE){

                        drag_nine.setVisibility(View.GONE);
                    }
                    else{
                        drag_nine.setVisibility(View.VISIBLE);
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
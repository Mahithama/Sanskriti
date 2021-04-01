package com.example.sanskriti_2020_all.Seniorkg.Unit1;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanskriti_2020_all.MyClickListener;
import com.example.sanskriti_2020_all.R;

public class Senior1_words1 extends AppCompatActivity {
    ImageView pen_c,fig_c,fan_c,lid_c,mop_c,pen_c_n,fig_c_n,fan_c_n,lid_c_n,mop_c_n;
    TextView drag_pen,drag_fig,drag_lid,drag_mop,drag_fan;
    private ViewFlipper viewFlipper;
    int i;
    MediaPlayer failure, success,try_again_new,mp,fan,pen,fig,lid,mop,mp3;
    private static final String FIG_C = "fig";
    private static final String LID_C = "lid";
    private static final String PEN_C = "pen";
    private static final String FAN_C = "fan";
    private static final String MOP_C = "mop";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senior1_words1);

        viewFlipper = findViewById(R.id.viewflipper);
        pen_c = findViewById(R.id.pen_c);
        fig_c = findViewById(R.id.fig_c);
        fan_c = findViewById(R.id.fan_c);
        lid_c = findViewById(R.id.lid_c);
        mop_c = findViewById(R.id.mop_c);
        pen_c_n = findViewById(R.id.pen_c_n);
        fig_c_n = findViewById(R.id.fig_c_n);
        fan_c_n = findViewById(R.id.fan_c_n);
        lid_c_n = findViewById(R.id.lid_c_n);
        mop_c_n = findViewById(R.id.mop_c_n);
        drag_pen = findViewById(R.id.drag_pen);
        drag_fig = findViewById(R.id.drag_fig);
        drag_lid = findViewById(R.id.drag_lid);
        drag_mop = findViewById(R.id.drag_mop);
        drag_fan = findViewById(R.id.drag_fan);

        mp3 = MediaPlayer.create(Senior1_words1.this, R.raw.pictureword_title);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();

        try_again_new = MediaPlayer.create(Senior1_words1.this, R.raw.try_again_new);
        success = MediaPlayer.create(Senior1_words1.this, R.raw.success);
        fan = MediaPlayer.create(Senior1_words1.this, R.raw.p_w_fan);
        fig = MediaPlayer.create(Senior1_words1.this, R.raw.p_w_fig);
        pen = MediaPlayer.create(Senior1_words1.this, R.raw.p_w_pen);
        lid = MediaPlayer.create(Senior1_words1.this, R.raw.p_w_lid);
        mop = MediaPlayer.create(Senior1_words1.this, R.raw.p_w_mop);



        drag_pen.setTag(PEN_C);
        drag_fig.setTag(FIG_C);
        drag_lid.setTag(LID_C);
        drag_mop.setTag(MOP_C);
        drag_fan.setTag(FAN_C);


        drag_pen.setOnTouchListener(new MyClickListener());
        drag_fig.setOnTouchListener(new MyClickListener());
        drag_lid.setOnTouchListener(new MyClickListener());
        drag_mop.setOnTouchListener(new MyClickListener());
        drag_fan.setOnTouchListener(new MyClickListener());


        pen_c.setOnDragListener(new MyDragListener());
        fig_c.setOnDragListener(new MyDragListener());
        fan_c.setOnDragListener(new MyDragListener());
        lid_c.setOnDragListener(new MyDragListener());
        mop_c.setOnDragListener(new MyDragListener());

    }
    public void youCant(DragEvent event){

        mp = MediaPlayer.create(Senior1_words1.this, R.raw.try_again_new);
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
                    Intent act = new Intent(Senior1_words1.this, Senior1_words2.class);
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

                    if (v == findViewById(R.id.pen_c)) {
                        View view = (View) event.getLocalState();

                        if (clipData.equals("pen")) {


                            pen_c.setVisibility(View.INVISIBLE);
                            //eye_c.startAnimation(animationblink);
                            pen_c_n.setVisibility(View.VISIBLE);
                            i++;
                            pen.start();
                            nextScreen(i);

                        } else {
                            pen_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_pen.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            try_again_new.start();
                        }
                    } else if (v == findViewById(R.id.fig_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("fig")) {

                            fig_c.setVisibility(View.INVISIBLE);
                            fig_c_n.setVisibility(View.VISIBLE);
                            i++;
                            fig.start();
                            nextScreen(i);

                        } else {
                            fig_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_fig.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            try_again_new.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    } else if (v == findViewById(R.id.fan_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("fan")) {
                            fan_c.setVisibility(View.INVISIBLE);
                            fan_c_n.setVisibility(View.VISIBLE);
                            i++;
                            fan.start();
                            nextScreen(i);

                        } else {
                            fan_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_fan.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            try_again_new.start();
                        }
                    } else if (v == findViewById(R.id.lid_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("lid")) {
                            lid_c.setVisibility(View.INVISIBLE);
                            lid_c_n.setVisibility(View.VISIBLE);
                            i++;
                            lid.start();
                            nextScreen(i);

                        } else {
                            lid_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_lid.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            try_again_new.start();
                        }


                    }
                    else if (v == findViewById(R.id.mop_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("mop")) {
                            mop_c.setVisibility(View.INVISIBLE);
                            mop_c_n.setVisibility(View.VISIBLE);
                            i++;
                            mop.start();
                            nextScreen(i);

                        } else {
                            mop_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_mop.setVisibility(View.VISIBLE);
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

                    if(pen_c_n.getVisibility()==View.VISIBLE){

                        drag_pen.setVisibility(View.GONE);
                    }
                    else{
                        drag_pen.setVisibility(View.VISIBLE);
                    }


                    if(fig_c_n.getVisibility()==View.VISIBLE){

                        drag_fig.setVisibility(View.GONE);
                    }
                    else{
                        drag_fig.setVisibility(View.VISIBLE);
                    }


                    if(fan_c_n.getVisibility()==View.VISIBLE){

                        drag_fan.setVisibility(View.GONE);
                    }
                    else{
                        drag_fan.setVisibility(View.VISIBLE);
                    }


                    if(lid_c_n.getVisibility()==View.VISIBLE){

                        drag_lid.setVisibility(View.GONE);
                    }
                    else{
                        drag_lid.setVisibility(View.VISIBLE);
                    }


                    if(mop_c_n.getVisibility()==View.VISIBLE){

                        drag_mop.setVisibility(View.GONE);
                    }
                    else{
                        drag_mop.setVisibility(View.VISIBLE);
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
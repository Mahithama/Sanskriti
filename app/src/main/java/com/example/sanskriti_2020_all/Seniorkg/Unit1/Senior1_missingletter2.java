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

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.sanskriti_2020_all.MyClickListener;
import com.example.sanskriti_2020_all.R;

public class Senior1_missingletter2 extends AppCompatActivity {
    TextView drag_net,drag_pot,drag_tap,drag_mug,drag_bag,
            bag_c_n, net_c_n,pot_c_n,tap_c_n,mug_c_n;
    ImageView bag_c,net_c,pot_c,tap_c,mug_c;

    ConstraintLayout constraintLayout;
    Animation animationblink;
    int i;
    MediaPlayer success,try_again_new,mp,net,pot,mug,bag,tap;

    private static final String BAG_C = "bag";
    private static final String NET_C = "net";
    private static final String POT_C = "pot";
    private static final String TAP_C = "tap";
    private static final String MUG_C = "mug";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senior1_missingletter2);
        drag_net = findViewById(R.id.drag_net);
        drag_pot = findViewById(R.id.drag_pot);
        drag_tap = findViewById(R.id.drag_tap);
        drag_mug = findViewById(R.id.drag_mug);
        drag_bag = findViewById(R.id.drag_bag);
        bag_c_n = findViewById(R.id.bag_c_n);
        net_c_n = findViewById(R.id.net_c_n);
        pot_c_n = findViewById(R.id.pot_c_n);
        tap_c_n = findViewById(R.id.tap_c_n);
        mug_c_n = findViewById(R.id.mug_c_n);
        bag_c = findViewById(R.id.bag_c);
        net_c = findViewById(R.id.net_c);
        pot_c = findViewById(R.id.pot_c);
        tap_c = findViewById(R.id.tap_c);
        mug_c = findViewById(R.id.mug_c);

        // animationblink= AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);



        try_again_new = MediaPlayer.create(Senior1_missingletter2.this, R.raw.try_again_new);
        success = MediaPlayer.create(Senior1_missingletter2.this, R.raw.success);
        net = MediaPlayer.create(Senior1_missingletter2.this, R.raw.cvc_net);
        pot = MediaPlayer.create(Senior1_missingletter2.this, R.raw.cvc_pot);
        tap = MediaPlayer.create(Senior1_missingletter2.this, R.raw.cvc_tap);
        mug = MediaPlayer.create(Senior1_missingletter2.this, R.raw.cvc_mug);
        bag = MediaPlayer.create(Senior1_missingletter2.this, R.raw.cvc_bag);

        drag_net.setTag(NET_C);
        drag_pot.setTag(POT_C);
        drag_tap.setTag(TAP_C);
        drag_mug.setTag(MUG_C);
        drag_bag.setTag(BAG_C);

        drag_net.setOnTouchListener(new MyClickListener());
        drag_pot.setOnTouchListener(new MyClickListener());
        drag_tap.setOnTouchListener(new MyClickListener());
        drag_mug.setOnTouchListener(new MyClickListener());
        drag_bag.setOnTouchListener(new MyClickListener());

        bag_c.setOnDragListener(new MyDragListener());
        net_c.setOnDragListener(new MyDragListener());
        pot_c.setOnDragListener(new MyDragListener());
        tap_c.setOnDragListener(new MyDragListener());
        mug_c.setOnDragListener(new MyDragListener());


    }
    public void youCant(DragEvent event){

        mp = MediaPlayer.create(Senior1_missingletter2.this, R.raw.try_again_new);
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
                    Intent act = new Intent(Senior1_missingletter2.this, Senior_literacy1n_home.class);
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

                    if (v == findViewById(R.id.net_c)) {
                        View view = (View) event.getLocalState();

                        if (clipData.equals("net")) {


                            net_c.setVisibility(View.GONE);
                            net_c_n.setVisibility(View.VISIBLE);
                            i++;
                            net.start();
                            nextScreen(i);

                        } else {
                            net_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_net.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            try_again_new.start();
                        }
                    } else if (v == findViewById(R.id.bag_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("bag")) {

                            bag_c.setVisibility(View.GONE);
                            bag_c_n.setVisibility(View.VISIBLE);
                            i++;
                            bag.start();
                            nextScreen(i);

                        } else {
                            bag_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_bag.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            try_again_new.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    } else if (v == findViewById(R.id.mug_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("mug")) {
                            mug_c.setVisibility(View.GONE);
                            mug_c_n.setVisibility(View.VISIBLE);
                            i++;
                            mug.start();
                            nextScreen(i);

                        } else {
                            mug_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_mug.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            try_again_new.start();
                        }
                    } else if (v == findViewById(R.id.pot_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("pot")) {
                            pot_c.setVisibility(View.GONE);
                            pot_c_n.setVisibility(View.VISIBLE);
                            i++;
                            pot.start();
                            nextScreen(i);

                        } else {
                            pot_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_pot.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            try_again_new.start();
                        }


                    }
                    else if (v == findViewById(R.id.tap_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("tap")) {
                            tap_c.setVisibility(View.GONE);
                            tap_c_n.setVisibility(View.VISIBLE);
                            i++;
                            tap.start();
                            nextScreen(i);

                        } else {
                            tap_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_tap.setVisibility(View.VISIBLE);
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
                    if(net_c_n.getVisibility()==View.VISIBLE){

                        drag_net.setVisibility(View.GONE);
                    }
                    else{
                        drag_net.setVisibility(View.VISIBLE);
                    }


                    if(bag_c_n.getVisibility()==View.VISIBLE){

                        drag_bag.setVisibility(View.GONE);
                    }
                    else{
                        drag_bag.setVisibility(View.VISIBLE);
                    }


                    if(mug_c_n.getVisibility()==View.VISIBLE){

                        drag_mug.setVisibility(View.GONE);
                    }
                    else{
                        drag_mug.setVisibility(View.VISIBLE);
                    }


                    if(pot_c_n.getVisibility()==View.VISIBLE){

                        drag_pot.setVisibility(View.GONE);
                    }
                    else{
                        drag_pot.setVisibility(View.VISIBLE);
                    }


                    if(tap_c_n.getVisibility()==View.VISIBLE){

                        drag_tap.setVisibility(View.GONE);
                    }
                    else{
                        drag_tap.setVisibility(View.VISIBLE);
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
}
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

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanskriti_2020_all.MyClickListener;
import com.example.sanskriti_2020_all.R;

public class Senior1_words2 extends AppCompatActivity {
    ImageView hat_c,bin_c,mat_c,bus_c,fox_c,hat_c_n,fox_c_n,bin_c_n,bus_c_n,mat_c_n;
    TextView drag_hat,drag_bin,drag_mat,drag_bus,drag_fox;


    int i;
    MediaPlayer failure, success,try_again_new,mp,hat,fox,bus,bin,mat;
    private static final String HAT_C = "hat";
    private static final String BIN_C = "bin";
    private static final String MAT_C = "mat";
    private static final String BUS_C = "bus";
    private static final String FOX_C = "fox";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senior1_words2);
        hat_c = findViewById(R.id.hat_c);
        bin_c = findViewById(R.id.bin_c);
        mat_c = findViewById(R.id.mat_c);
        bus_c = findViewById(R.id.bus_c);
        fox_c = findViewById(R.id.fox_c);
        hat_c_n = findViewById(R.id.hat_c_n);
        fox_c_n = findViewById(R.id.fox_c_n);
        bin_c_n = findViewById(R.id.bin_c_n);
        bus_c_n = findViewById(R.id.bus_c_n);
        mat_c_n = findViewById(R.id.mat_c_n);
        drag_hat = findViewById(R.id.drag_hat);
        drag_bin = findViewById(R.id.drag_bin);
        drag_mat = findViewById(R.id.drag_mat);
        drag_bus = findViewById(R.id.drag_bus);
        drag_fox = findViewById(R.id.drag_fox);

        try_again_new = MediaPlayer.create(Senior1_words2.this, R.raw.try_again_new);
        success = MediaPlayer.create(Senior1_words2.this, R.raw.success);
        hat = MediaPlayer.create(Senior1_words2.this, R.raw.p_w_hat);
        bus = MediaPlayer.create(Senior1_words2.this, R.raw.p_w_bus);
        bin = MediaPlayer.create(Senior1_words2.this, R.raw.p_w_bin);
        mat = MediaPlayer.create(Senior1_words2.this, R.raw.p_w_mat);
        fox = MediaPlayer.create(Senior1_words2.this, R.raw.p_w_fox);


        drag_hat.setTag(HAT_C);
        drag_bin.setTag(BIN_C);
        drag_mat.setTag(MAT_C);
        drag_bus.setTag(BUS_C);
        drag_fox.setTag(FOX_C);


        drag_hat.setOnTouchListener(new MyClickListener());
        drag_bin.setOnTouchListener(new MyClickListener());
        drag_mat.setOnTouchListener(new MyClickListener());
        drag_bus.setOnTouchListener(new MyClickListener());
        drag_fox.setOnTouchListener(new MyClickListener());


        hat_c.setOnDragListener(new MyDragListener());
        fox_c.setOnDragListener(new MyDragListener());
        mat_c.setOnDragListener(new MyDragListener());
        bus_c.setOnDragListener(new MyDragListener());
        bin_c.setOnDragListener(new MyDragListener());


    }
    public void youCant(DragEvent event){

        mp = MediaPlayer.create(Senior1_words2.this, R.raw.try_again_new);
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
                    Intent act = new Intent(Senior1_words2.this, Senior_literacy1n_home.class);
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

                    if (v == findViewById(R.id.hat_c)) {
                        View view = (View) event.getLocalState();

                        if (clipData.equals("hat")) {


                            hat_c.setVisibility(View.INVISIBLE);
                            //eye_c.startAnimation(animationblink);
                            hat_c_n.setVisibility(View.VISIBLE);
                            i++;
                            hat.start();
                            nextScreen(i);

                        } else {
                            hat_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_hat.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            try_again_new.start();
                        }
                    } else if (v == findViewById(R.id.fox_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("fox")) {

                            fox_c.setVisibility(View.INVISIBLE);
                            fox_c_n.setVisibility(View.VISIBLE);
                            i++;
                            fox.start();
                            nextScreen(i);

                        } else {
                            fox_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_fox.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            try_again_new.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    } else if (v == findViewById(R.id.bin_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("bin")) {
                            bin_c.setVisibility(View.INVISIBLE);
                            bin_c_n.setVisibility(View.VISIBLE);
                            i++;
                            bin.start();
                            nextScreen(i);

                        } else {
                            bin_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_bin.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            try_again_new.start();
                        }
                    } else if (v == findViewById(R.id.bus_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("bus")) {
                            bus_c.setVisibility(View.INVISIBLE);
                            bus_c_n.setVisibility(View.VISIBLE);
                            i++;
                            bus.start();
                            nextScreen(i);

                        } else {
                            bus_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_bus.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            try_again_new.start();
                        }


                    }
                    else if (v == findViewById(R.id.mat_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("mat")) {
                            mat_c.setVisibility(View.INVISIBLE);
                            mat_c_n.setVisibility(View.VISIBLE);
                            i++;
                            mat.start();
                            nextScreen(i);

                        } else {
                            mat_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_mat.setVisibility(View.VISIBLE);
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

                    if(hat_c_n.getVisibility()==View.VISIBLE){

                        drag_hat.setVisibility(View.GONE);
                    }
                    else{
                        drag_hat.setVisibility(View.VISIBLE);
                    }


                    if(bin_c_n.getVisibility()==View.VISIBLE){

                        drag_bin.setVisibility(View.GONE);
                    }
                    else{
                        drag_bin.setVisibility(View.VISIBLE);
                    }


                    if(fox_c_n.getVisibility()==View.VISIBLE){

                        drag_fox.setVisibility(View.GONE);
                    }
                    else{
                        drag_fox.setVisibility(View.VISIBLE);
                    }


                    if(bus_c_n.getVisibility()==View.VISIBLE){

                        drag_bus.setVisibility(View.GONE);
                    }
                    else{
                        drag_bus.setVisibility(View.VISIBLE);
                    }


                    if(mat_c_n.getVisibility()==View.VISIBLE){

                        drag_mat.setVisibility(View.GONE);
                    }
                    else{
                        drag_mat.setVisibility(View.VISIBLE);
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
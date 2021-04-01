package com.example.sanskriti_2020_all.Seniorkg.Unit5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

import com.example.sanskriti_2020_all.MyClickListener;
import com.example.sanskriti_2020_all.R;
import com.example.sanskriti_2020_all.Seniorkg.Unit6.Fill_inthe_blanks2;

public class Sentence_words extends AppCompatActivity {
    TextView drag_earth,earth_c,earth_c_n,
            drag_flowers,flowers_c,flowers_c_n,
            drag_red,red_c,red_c_n,
            drag_high,high_c,high_c_n,
            drag_ocean,ocean_c,ocean_c_n;

    int i;
    MediaPlayer try_again_new, success,animalhome_dog,animalhome_hen,animalhome_horse,animalhome_cow,animalhome_lion,animalhome_pig,mp3,mp;
    private static final String EARTH_C = "earth";
    private static final String RED_C = "red";
    private static final String FLOWERS_C = "flowers";
    private static final String OCEAN_C = "ocean";
    private static final String HIGH_C = "high";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sentence_words);

        drag_earth = findViewById(R.id.drag_earth);
        earth_c = findViewById(R.id.earth_c);
        earth_c_n = findViewById(R.id.earth_c_n);
        drag_flowers = findViewById(R.id.drag_flowers);
        flowers_c = findViewById(R.id.flowers_c);
        flowers_c_n = findViewById(R.id.flowers_c_n);
        drag_red = findViewById(R.id.drag_red);
        red_c = findViewById(R.id.red_c);
        red_c_n = findViewById(R.id.red_c_n);
        drag_high = findViewById(R.id.drag_high);
        high_c = findViewById(R.id.high_c);
        high_c_n = findViewById(R.id.high_c_n);
        drag_ocean = findViewById(R.id.drag_ocean);
        ocean_c = findViewById(R.id.ocean_c);
        ocean_c_n = findViewById(R.id.ocean_c_n);

        drag_earth.setTag(EARTH_C);
        drag_flowers.setTag(FLOWERS_C);
        drag_red.setTag(RED_C);
        drag_high.setTag(HIGH_C);
        drag_ocean.setTag(OCEAN_C);

        drag_earth.setOnTouchListener(new MyClickListener());
        drag_flowers.setOnTouchListener(new MyClickListener());
        drag_red.setOnTouchListener(new MyClickListener());
        drag_high.setOnTouchListener(new MyClickListener());
        drag_ocean.setOnTouchListener(new MyClickListener());

        earth_c.setOnDragListener(new MyDragListener());
        flowers_c.setOnDragListener(new MyDragListener());
        red_c.setOnDragListener(new MyDragListener());
        high_c.setOnDragListener(new MyDragListener());
        ocean_c.setOnDragListener(new MyDragListener());


    }

    public void youCant(DragEvent event){
        mp = MediaPlayer.create(Sentence_words.this, R.raw.failure);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.setLooping(false);
        mp.start();
        //try_again_new.start();
        //View view = (View) event.getLocalState();
        //view.setVisibility(View.VISIBLE);
    }

    public void nextScreen(int i){

        if(i==5){

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Drag The Number Activity";
                    Intent act = new Intent(Sentence_words.this, Sn5_literacy.class);
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

                    if (v == findViewById(R.id.earth_c)) {
                        View view = (View) event.getLocalState();

                        if (clipData.equals("earth")) {
                            earth_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Sentence_words.this, R.raw.animalhome_dog);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_dog.start();
                            nextScreen(i);

                        } else {

                            earth_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_earth.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Sentence_words.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    } else if (v == findViewById(R.id.red_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("red")) {

                            red_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Sentence_words.this, R.raw.animalhome_hen);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            red_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_red.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Sentence_words.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    } else if (v == findViewById(R.id.ocean_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("ocean")) {

                            ocean_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Sentence_words.this, R.raw.animalhome_horse);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_horse.start();
                            nextScreen(i);

                        } else {

                            //mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            drag_ocean.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            ocean_c.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Sentence_words.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    } else if (v == findViewById(R.id.high_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("high")) {

                            //  mp = MediaPlayer.create(game5.this, R.raw.animalhomes_cow);
                            high_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Sentence_words.this, R.raw.animalhomes_cow);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_cow.start();
                            nextScreen(i);

                        } else {

                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            high_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_high.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Sentence_words.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            //try_again_new.start();
                        }


                    }
                    else if (v == findViewById(R.id.flowers_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("flowers")) {

                            // mp = MediaPlayer.create(game5.this, R.raw.animalhome_lion);
                            flowers_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Sentence_words.this, R.raw.animalhome_lion);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_lion.start();
                            nextScreen(i);

                        } else {

                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            flowers_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_flowers.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Sentence_words.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }


                    }else {

                        youCant(event);
                    }
                    break;


                case DragEvent.ACTION_DRAG_ENDED:


                    if(earth_c_n.getVisibility()==View.VISIBLE){

                        drag_earth.setVisibility(View.GONE);
                    }
                    else{
                        drag_earth.setVisibility(View.VISIBLE);
                    }


                    if(red_c_n.getVisibility()==View.VISIBLE){

                        drag_red.setVisibility(View.GONE);
                    }
                    else{
                        drag_red.setVisibility(View.VISIBLE);
                    }

                    if(flowers_c_n.getVisibility()==View.VISIBLE){

                        drag_flowers.setVisibility(View.GONE);
                    }
                    else{
                        drag_flowers.setVisibility(View.VISIBLE);
                    }

                    if(high_c_n.getVisibility()==View.VISIBLE){

                        drag_high.setVisibility(View.GONE);
                    }
                    else{
                        drag_high.setVisibility(View.VISIBLE);
                    }

                    if(ocean_c_n.getVisibility()==View.VISIBLE){

                        drag_ocean.setVisibility(View.GONE);
                    }
                    else{
                        drag_ocean.setVisibility(View.VISIBLE);
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
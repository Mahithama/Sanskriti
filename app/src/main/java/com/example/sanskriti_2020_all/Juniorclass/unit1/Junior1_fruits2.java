package com.example.sanskriti_2020_all.Juniorclass.unit1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;

import com.example.sanskriti_2020_all.MyClickListener;
import com.example.sanskriti_2020_all.R;

public class Junior1_fruits2 extends AppCompatActivity {
    ImageView
            drag_berry, berry_c, berry_c_n,
            grape_c, drag_grape, grape_c_n,
            chiku_c, drag_chiku, chiku_c_n,
            melon_c, drag_melon, melon_c_n;

    int i;
    MediaPlayer mp,try_again_new;
    private static final String GRAPE_C = "grape";
    private static final String CHIKU_C = "chiku";
    private static final String MELON_C = "melon";
    private static final String BERRY_C = "berry";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junior1_fruits2);
        drag_berry = findViewById(R.id.drag_berry);
        drag_grape = findViewById(R.id.drag_grape);
        drag_chiku = findViewById(R.id.drag_chiku);
        drag_melon = findViewById(R.id.drag_melon);
        berry_c = findViewById(R.id.berry_c);
        grape_c = findViewById(R.id.grape_c);
        chiku_c = findViewById(R.id.chiku_c);
        melon_c = findViewById(R.id.melon_c);
        berry_c_n = findViewById(R.id.berry_c_n);
        grape_c_n = findViewById(R.id.grape_c_n);
        chiku_c_n = findViewById(R.id.chiku_c_n);
        melon_c_n = findViewById(R.id.melon_c_n);


        drag_berry.setTag(BERRY_C);
        drag_grape.setTag(GRAPE_C);
        drag_chiku.setTag(CHIKU_C);
        drag_melon.setTag(MELON_C);

        drag_berry.setOnTouchListener(new MyClickListener());
        drag_grape.setOnTouchListener(new MyClickListener());
        drag_chiku.setOnTouchListener(new MyClickListener());
        drag_melon.setOnTouchListener(new MyClickListener());

        berry_c.setOnDragListener(new Junior1_fruits2.MyDragListener());
        grape_c.setOnDragListener(new Junior1_fruits2.MyDragListener());
        chiku_c.setOnDragListener(new Junior1_fruits2.MyDragListener());
        melon_c.setOnDragListener(new Junior1_fruits2.MyDragListener());
    }

    public void youCant(DragEvent event) {

        mp = MediaPlayer.create(Junior1_fruits2.this, R.raw.try_again_new);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.setLooping(false);
        mp.start();

    }


    public void nextScreen(int i) {

        if (i == 4) {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Drag The Number Activity";
                    Intent act = new Intent(Junior1_fruits2.this, Junior_themes1n_home.class);
                    act.putExtra("activity_name", activity_name);
                    startActivity(act);


                }
            }, 1500);


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

                    if (v == findViewById(R.id.berry_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("berry")) {
                            berry_c.setVisibility(View.GONE);
                            berry_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Junior1_fruits2.this, R.raw.strawberry_fruits);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            nextScreen(i);

                        } else {
                            berry_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_berry.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Junior1_fruits2.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    }  else if (v == findViewById(R.id.grape_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("grape")) {
                            grape_c.setVisibility(View.GONE);
                            grape_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Junior1_fruits2.this, R.raw.grape_fruits);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            nextScreen(i);

                        } else {
                            grape_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_grape.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Junior1_fruits2.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }


                    } else if (v == findViewById(R.id.chiku_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("chiku")) {
                            chiku_c.setVisibility(View.GONE);
                            chiku_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Junior1_fruits2.this, R.raw.cheeku_fruits);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            nextScreen(i);

                        } else {
                            chiku_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_chiku.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Junior1_fruits2.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }


                    } else if (v == findViewById(R.id.melon_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("melon")) {
                            melon_c.setVisibility(View.GONE);
                            melon_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Junior1_fruits2.this, R.raw.watermelon_fruits);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            nextScreen(i);

                        } else {
                            melon_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_melon.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Junior1_fruits2.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }


                    }  else {

                        youCant(event);
                    }
                    break;


                case DragEvent.ACTION_DRAG_ENDED:


                    if(berry_c_n.getVisibility()==View.VISIBLE){

                        drag_berry.setVisibility(View.GONE);
                    }
                    else{
                        drag_berry.setVisibility(View.VISIBLE);
                    }


                    if(grape_c_n.getVisibility()==View.VISIBLE){

                        drag_grape.setVisibility(View.GONE);
                    }
                    else{
                        drag_grape.setVisibility(View.VISIBLE);
                    }

                    if(chiku_c_n.getVisibility()==View.VISIBLE){

                        drag_chiku.setVisibility(View.GONE);
                    }
                    else{
                        drag_chiku.setVisibility(View.VISIBLE);
                    }

                    if(melon_c_n.getVisibility()==View.VISIBLE){

                        drag_melon.setVisibility(View.GONE);
                    }
                    else{
                        drag_melon.setVisibility(View.VISIBLE);
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
        if (try_again_new.isPlaying()) {
            try_again_new.stop();
            try_again_new.release();
        }
    }

    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}
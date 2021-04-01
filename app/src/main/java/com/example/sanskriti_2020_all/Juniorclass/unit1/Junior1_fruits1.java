package com.example.sanskriti_2020_all.Juniorclass.unit1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.sanskriti_2020_all.MyClickListener;
import com.example.sanskriti_2020_all.R;


public class Junior1_fruits1 extends AppCompatActivity {
    ImageView drag_ban, ban_c, ban_c_n,
            drag_pear, pear_c, pear_c_n,
            oran_c, drag_oran, oran_c_n,
            apple_c, drag_apple, apple_c_n;
    private ViewFlipper viewFlipper;
    ConstraintLayout constraintLayout;

    int i;
    MediaPlayer mp,try_again_new,mp3;
    private static final String BAN_C = "ban";
    private static final String PEAR_C = "pear";
    private static final String ORAN_C = "oran";
    private static final String APPLE_C = "apple";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junior1_fruits1);

        viewFlipper = findViewById(R.id.viewflipper);
        drag_ban = findViewById(R.id.drag_ban);
        drag_pear = findViewById(R.id.drag_pear);
        drag_oran = findViewById(R.id.drag_oran);
        drag_apple = findViewById(R.id.drag_apple);
        ban_c = findViewById(R.id.ban_c);
        pear_c = findViewById(R.id.pear_c);
        oran_c = findViewById(R.id.oran_c);
        apple_c = findViewById(R.id.apple_c);
        ban_c_n = findViewById(R.id.ban_c_n);
        pear_c_n = findViewById(R.id.pear_c_n);
        oran_c_n = findViewById(R.id.oran_c_n);
        apple_c_n = findViewById(R.id.apple_c_n);


        mp3 = MediaPlayer.create(Junior1_fruits1.this, R.raw.letters_a_z);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();

        drag_ban.setTag(BAN_C);
        drag_pear.setTag(PEAR_C);
        drag_oran.setTag(ORAN_C);
        drag_apple.setTag(APPLE_C);


        drag_ban.setOnTouchListener(new MyClickListener());
        drag_pear.setOnTouchListener(new MyClickListener());
        drag_oran.setOnTouchListener(new MyClickListener());
        drag_apple.setOnTouchListener(new MyClickListener());



        ban_c.setOnDragListener(new Junior1_fruits1.MyDragListener());
        pear_c.setOnDragListener(new Junior1_fruits1.MyDragListener());

        oran_c.setOnDragListener(new Junior1_fruits1.MyDragListener());

        apple_c.setOnDragListener(new Junior1_fruits1.MyDragListener());

    }

    public void youCant(DragEvent event) {

        mp = MediaPlayer.create(Junior1_fruits1.this, R.raw.try_again_new);
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
                    Intent act = new Intent(Junior1_fruits1.this, Junior1_fruits2.class);
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

                    if (v == findViewById(R.id.ban_c)) {
                        View view = (View) event.getLocalState();

                        if (clipData.equals("ban")) {


                            ban_c.setVisibility(View.GONE);
                            ban_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Junior1_fruits1.this, R.raw.banana_fruits);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            nextScreen(i);

                        } else {
                            ban_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_ban.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Junior1_fruits1.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    } else if (v == findViewById(R.id.pear_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("pear")) {

                            pear_c.setVisibility(View.GONE);
                            pear_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Junior1_fruits1.this, R.raw.pear_fruits);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            nextScreen(i);

                        } else {
                            pear_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_pear.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Junior1_fruits1.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    }else if (v == findViewById(R.id.oran_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("oran")) {
                            oran_c.setVisibility(View.GONE);
                            oran_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Junior1_fruits1.this, R.raw.orange_fruits);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            nextScreen(i);

                        } else {
                            oran_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_oran.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Junior1_fruits1.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }


                    } else if (v == findViewById(R.id.apple_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("apple")) {
                            apple_c.setVisibility(View.GONE);
                            apple_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Junior1_fruits1.this, R.raw.apple_fruits);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            nextScreen(i);

                        } else {
                            apple_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_apple.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Junior1_fruits1.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }


                    } else {

                        youCant(event);
                    }
                    break;


                case DragEvent.ACTION_DRAG_ENDED:
                    if(ban_c_n.getVisibility()==View.VISIBLE){

                        drag_ban.setVisibility(View.GONE);
                    }
                    else{
                        drag_ban.setVisibility(View.VISIBLE);
                    }


                    if(pear_c_n.getVisibility()==View.VISIBLE){

                        drag_pear.setVisibility(View.GONE);
                    }
                    else{
                        drag_pear.setVisibility(View.VISIBLE);
                    }



                    if(oran_c_n.getVisibility()==View.VISIBLE){

                        drag_oran.setVisibility(View.GONE);
                    }
                    else{
                        drag_oran.setVisibility(View.VISIBLE);
                    }



                    if(apple_c_n.getVisibility()==View.VISIBLE){

                        drag_apple.setVisibility(View.GONE);
                    }
                    else{
                        drag_apple.setVisibility(View.VISIBLE);
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

    public void nextView(View v) {
        viewFlipper.showNext();
        if(mp3 != null && mp3.isPlaying()){
            mp3.stop();
        }

    }
}
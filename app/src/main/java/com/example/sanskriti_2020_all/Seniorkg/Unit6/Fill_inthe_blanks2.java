package com.example.sanskriti_2020_all.Seniorkg.Unit6;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanskriti_2020_all.MyClickListener;
import com.example.sanskriti_2020_all.R;

public class Fill_inthe_blanks2 extends AppCompatActivity {
    TextView drag_from,from_c,from_c_n,
            drag_find,find_c,find_c_n,
            drag_under,under_c,under_c_n,
            drag_made,made_c,made_c_n,
            drag_your,your_c,your_c_n;

    int i;
    MediaPlayer try_again_new, success,animalhome_dog,animalhome_hen,animalhome_horse,animalhome_cow,animalhome_lion,animalhome_pig,mp3,mp;
    private static final String FROM_C = "from";
    private static final String UNDER_C = "under";
    private static final String FIND_C = "find";
    private static final String MADE_C = "made";
    private static final String YOUR_C = "your";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_inthe_blanks2);
        drag_from = findViewById(R.id.drag_from);
        from_c = findViewById(R.id.from_c);
        from_c_n = findViewById(R.id.from_c_n);
        drag_find = findViewById(R.id.drag_find);
        find_c = findViewById(R.id.find_c);
        find_c_n = findViewById(R.id.find_c_n);
        drag_under = findViewById(R.id.drag_under);
        under_c = findViewById(R.id.under_c);
        under_c_n = findViewById(R.id.under_c_n);
        drag_made = findViewById(R.id.drag_made);
        made_c = findViewById(R.id.made_c);
        made_c_n = findViewById(R.id.made_c_n);
        drag_your = findViewById(R.id.drag_your);
        your_c = findViewById(R.id.your_c);
        your_c_n = findViewById(R.id.your_c_n);

        drag_from.setTag(FROM_C);
        drag_find.setTag(FIND_C);
        drag_under.setTag(UNDER_C);
        drag_made.setTag(MADE_C);
        drag_your.setTag(YOUR_C);

        drag_from.setOnTouchListener(new MyClickListener());
        drag_find.setOnTouchListener(new MyClickListener());
        drag_under.setOnTouchListener(new MyClickListener());
        drag_made.setOnTouchListener(new MyClickListener());
        drag_your.setOnTouchListener(new MyClickListener());

        from_c.setOnDragListener(new MyDragListener());
        find_c.setOnDragListener(new MyDragListener());
        under_c.setOnDragListener(new MyDragListener());
        made_c.setOnDragListener(new MyDragListener());
        your_c.setOnDragListener(new MyDragListener());


    }

    public void youCant(DragEvent event){
        mp = MediaPlayer.create(Fill_inthe_blanks2.this, R.raw.failure);
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
                    Intent act = new Intent(Fill_inthe_blanks2.this, Sn6_literacy.class);
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

                    if (v == findViewById(R.id.from_c)) {
                        View view = (View) event.getLocalState();

                        if (clipData.equals("from")) {
                            from_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Fill_inthe_blanks2.this, R.raw.animalhome_dog);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_dog.start();
                            nextScreen(i);

                        } else {

                            from_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_from.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Fill_inthe_blanks2.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    } else if (v == findViewById(R.id.find_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("find")) {

                            find_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Fill_inthe_blanks2.this, R.raw.animalhome_hen);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            find_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_find.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Fill_inthe_blanks2.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    } else if (v == findViewById(R.id.under_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("under")) {

                            under_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Fill_inthe_blanks2.this, R.raw.animalhome_horse);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_horse.start();
                            nextScreen(i);

                        } else {

                            //mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            drag_under.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            under_c.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Fill_inthe_blanks2.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    } else if (v == findViewById(R.id.made_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("made")) {

                            //  mp = MediaPlayer.create(game5.this, R.raw.animalhomes_cow);
                            made_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Fill_inthe_blanks2.this, R.raw.animalhomes_cow);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_cow.start();
                            nextScreen(i);

                        } else {

                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            made_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_made.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Fill_inthe_blanks2.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            //try_again_new.start();
                        }


                    }
                    else if (v == findViewById(R.id.your_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("your")) {

                            // mp = MediaPlayer.create(game5.this, R.raw.animalhome_lion);
                            your_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Fill_inthe_blanks2.this, R.raw.animalhome_lion);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_lion.start();
                            nextScreen(i);

                        } else {

                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            your_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_your.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Fill_inthe_blanks2.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }


                    }else {

                        youCant(event);
                    }
                    break;


                case DragEvent.ACTION_DRAG_ENDED:


                    if(from_c_n.getVisibility()==View.VISIBLE){

                        drag_from.setVisibility(View.GONE);
                    }
                    else{
                        drag_from.setVisibility(View.VISIBLE);
                    }


                    if(find_c_n.getVisibility()==View.VISIBLE){

                        drag_find.setVisibility(View.GONE);
                    }
                    else{
                        drag_find.setVisibility(View.VISIBLE);
                    }

                    if(under_c_n.getVisibility()==View.VISIBLE){

                        drag_under.setVisibility(View.GONE);
                    }
                    else{
                        drag_under.setVisibility(View.VISIBLE);
                    }

                    if(made_c_n.getVisibility()==View.VISIBLE){

                        drag_made.setVisibility(View.GONE);
                    }
                    else{
                        drag_made.setVisibility(View.VISIBLE);
                    }

                    if(your_c_n.getVisibility()==View.VISIBLE){

                        drag_your.setVisibility(View.GONE);
                    }
                    else{
                        drag_your.setVisibility(View.VISIBLE);
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
package com.example.sanskriti_2020_all.Juniorclass.unit1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.DragEvent;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.sanskriti_2020_all.MyClickListener;
import com.example.sanskriti_2020_all.R;



public class Junior1_senses extends AppCompatActivity {
    ImageView drag_nose,nose_c,nose_c_n,drag_tounge,tounge_c,tounge_c_n,drag_ear,ear_c,ear_c_n,drag_eye,eye_c,eye_c_n,drag_hand,hand_c,hand_c_n;
    TextView aeye,anose,atongue,aear,askin;
    private ViewFlipper viewFlipper;
    Animation animationblink;
    int i;
    MediaPlayer failure, success,mp,s_eye,s_nose,s_ear,s_skin,s_tongue,mp3;
    private static final String NOSE_C = "nose";
    private static final String TOUNGE_C = "tounge";
    private static final String EAR_C = "ear";
    private static final String EYE_C = "eye";
    private static final String HAND_C = "hand";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junior1_senses);

        viewFlipper = findViewById(R.id.viewflipper);
        nose_c = findViewById(R.id.nose_c);
        nose_c_n = findViewById(R.id.nose_c_n);
        tounge_c = findViewById(R.id.tounge_c);
        tounge_c_n = findViewById(R.id.tounge_c_n);
        ear_c = findViewById(R.id.ear_c);
        ear_c_n = findViewById(R.id.ear_c_n);
        eye_c = findViewById(R.id.eye_c);
        eye_c_n = findViewById(R.id.eye_c_n);
        hand_c = findViewById(R.id.hand_c);
        hand_c_n = findViewById(R.id.hand_c_n);
        drag_nose = findViewById(R.id.drag_nose);
        drag_tounge = findViewById(R.id.drag_tounge);
        drag_ear = findViewById(R.id.drag_ear);
        drag_eye = findViewById(R.id.drag_eye);
        drag_hand = findViewById(R.id.drag_hand);
        aeye = findViewById(R.id.aeye);
        aear = findViewById(R.id.aear);
        anose = findViewById(R.id.anose);
        askin = findViewById(R.id.askin);
        atongue = findViewById(R.id.atongue);

        mp3 = MediaPlayer.create(Junior1_senses.this, R.raw.sense_title);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();

        failure = MediaPlayer.create(Junior1_senses.this, R.raw.try_again_new);
        success = MediaPlayer.create(Junior1_senses.this, R.raw.success);
        s_eye = MediaPlayer.create(Junior1_senses.this, R.raw.s_eye);
        s_nose = MediaPlayer.create(Junior1_senses.this, R.raw.s_nose);
        s_ear = MediaPlayer.create(Junior1_senses.this, R.raw.s_ears);
        s_skin = MediaPlayer.create(Junior1_senses.this, R.raw.s_skin);
        s_tongue = MediaPlayer.create(Junior1_senses.this, R.raw.s_tongue);

        drag_nose.setTag(NOSE_C);
        drag_tounge.setTag(TOUNGE_C);
        drag_ear.setTag(EAR_C);
        drag_eye.setTag(EYE_C);
        drag_hand.setTag(HAND_C);

        drag_nose.setOnTouchListener(new MyClickListener());
        drag_tounge.setOnTouchListener(new MyClickListener());
        drag_ear.setOnTouchListener(new MyClickListener());
        drag_eye.setOnTouchListener(new MyClickListener());
        drag_hand.setOnTouchListener(new MyClickListener());

        nose_c.setOnDragListener(new MyDragListener());
        tounge_c.setOnDragListener(new MyDragListener());
        ear_c.setOnDragListener(new MyDragListener());
        hand_c.setOnDragListener(new MyDragListener());
        eye_c.setOnDragListener(new MyDragListener());

    }

    public void youCant(DragEvent event){

        mp = MediaPlayer.create(Junior1_senses.this, R.raw.failure);
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
                    Intent act = new Intent(Junior1_senses.this, Junior_themes1n_home.class);
                    act.putExtra("activity_name", activity_name);
                    startActivity(act);


                }
            }, 1000);



        }

    }

    public class MyDragListener implements View.OnDragListener {
      /*  Drawable normalShape = getResources().getDrawable(R.drawable.normal_shape);
        Drawable targetShape = getResources().getDrawable(R.drawable.target_shape);*/

        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        public boolean onDrag(View v, DragEvent event) {

            // Handles each of the expected events
            switch (event.getAction()) {

                //signal for the start of a drag and drop operation.
                case DragEvent.ACTION_DRAG_STARTED:
                    // do nothing
                    String clipDataa = event.getClipDescription().getLabel().toString();

                    if (v == findViewById(R.id.eye_c)) {
                        View view = (View) event.getLocalState();

                        if (clipDataa.equals("eye")) {
                            aeye.setTextColor(Color.parseColor("#f47638"));
                            eye_c.setBackgroundColor(Color.parseColor("#dd3737"));
                            s_eye.start();
                        } else {
                            aeye.setTextColor(Color.parseColor("#10100f"));
                            eye_c.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                        }
                    }
                    else if (v == findViewById(R.id.ear_c)) {

                        View view = (View) event.getLocalState();

                        if (clipDataa.equals("ear")) {
                            aear.setTextColor(Color.parseColor("#f47638"));
                            ear_c.setBackgroundColor(Color.parseColor("#dd3737"));
                            s_ear.start();

                        } else {
                            aear.setTextColor(Color.parseColor("#10100f"));
                            ear_c.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                        }
                    }else if (v == findViewById(R.id.nose_c)) {

                        View view = (View) event.getLocalState();

                        if (clipDataa.equals("nose")) {
                            anose.setTextColor(Color.parseColor("#f47638"));
                            nose_c.setBackgroundColor(Color.parseColor("#dd3737"));
                            s_nose.start();

                        } else {
                            anose.setTextColor(Color.parseColor("#10100f"));
                            nose_c.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                        }
                    }else if (v == findViewById(R.id.hand_c)) {

                        View view = (View) event.getLocalState();

                        if (clipDataa.equals("hand")) {
                            askin.setTextColor(Color.parseColor("#f47638"));
                            hand_c.setBackgroundColor(Color.parseColor("#dd3737"));
                            s_skin.start();

                        } else {
                            askin.setTextColor(Color.parseColor("#10100f"));
                            hand_c.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                        }
                    }
                    else if (v == findViewById(R.id.tounge_c)) {

                        View view = (View) event.getLocalState();

                        if (clipDataa.equals("tounge")) {
                            atongue.setTextColor(Color.parseColor("#f47638"));
                            tounge_c.setBackgroundColor(Color.parseColor("#dd3737"));
                            s_tongue.start();

                        } else {
                            atongue.setTextColor(Color.parseColor("#10100f"));
                            tounge_c.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                        }
                    }
                    else {


                    }

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

                    if (v == findViewById(R.id.eye_c)) {
                        View view = (View) event.getLocalState();

                        if (clipData.equals("eye")) {

                            aeye.setVisibility(View.INVISIBLE);
                            eye_c.setVisibility(View.GONE);
                            // eye_c.startAnimation(animationblink);
                            eye_c_n.setVisibility(View.VISIBLE);
                            i++;
                            success.start();
                            nextScreen(i);

                        } else {
                            eye_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_eye.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            failure.start();
                        }
                    } else if (v == findViewById(R.id.ear_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("ear")) {
                            aear.setVisibility(View.INVISIBLE);
                            ear_c.setVisibility(View.GONE);
                            ear_c_n.setVisibility(View.VISIBLE);
                            i++;
                            success.start();
                            nextScreen(i);

                        } else {
                            ear_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_ear.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            failure.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    } else if (v == findViewById(R.id.nose_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("nose")) {
                            anose.setVisibility(View.INVISIBLE);
                            nose_c.setVisibility(View.GONE);
                            nose_c_n.setVisibility(View.VISIBLE);
                            i++;
                            success.start();
                            nextScreen(i);

                        } else {
                            nose_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_nose.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            failure.start();
                        }
                    } else if (v == findViewById(R.id.tounge_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("tounge")) {
                            atongue.setVisibility(View.INVISIBLE);
                            tounge_c.setVisibility(View.GONE);
                            tounge_c_n.setVisibility(View.VISIBLE);
                            i++;
                            success.start();
                            nextScreen(i);

                        } else {
                            tounge_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_tounge.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            failure.start();
                        }


                    }
                    else if (v == findViewById(R.id.hand_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("hand")) {
                            askin.setVisibility(View.INVISIBLE);
                            hand_c.setVisibility(View.GONE);
                            hand_c_n.setVisibility(View.VISIBLE);
                            i++;
                            success.start();
                            nextScreen(i);

                        } else {
                            hand_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_hand.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            failure.start();
                        }


                    }else {

                        youCant(event);
                    }
                    break;


                case DragEvent.ACTION_DRAG_ENDED:

                    if(eye_c_n.getVisibility()==View.VISIBLE){

                        drag_eye.setVisibility(View.GONE);
                    }
                    else{
                        drag_eye.setVisibility(View.VISIBLE);
                    }


                    if(nose_c_n.getVisibility()==View.VISIBLE){

                        drag_nose.setVisibility(View.GONE);
                    }
                    else{
                        drag_nose.setVisibility(View.VISIBLE);
                    }

                    if(ear_c_n.getVisibility()==View.VISIBLE){

                        drag_ear.setVisibility(View.GONE);
                    }
                    else{
                        drag_ear.setVisibility(View.VISIBLE);
                    }

                    if(hand_c_n.getVisibility()==View.VISIBLE){

                        drag_hand.setVisibility(View.GONE);
                    }
                    else{
                        drag_hand.setVisibility(View.VISIBLE);
                    }

                    if(tounge_c_n.getVisibility()==View.VISIBLE){

                        drag_tounge.setVisibility(View.GONE);
                    }
                    else{
                        drag_tounge.setVisibility(View.VISIBLE);
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
        if(failure.isPlaying())
        {
            failure.stop();
            failure.release();
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

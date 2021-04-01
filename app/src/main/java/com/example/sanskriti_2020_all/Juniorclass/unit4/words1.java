package com.example.sanskriti_2020_all.Juniorclass.unit4;

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

import com.example.sanskriti_2020_all.Juniorclass.unit1.Junior1_senses;
import com.example.sanskriti_2020_all.Juniorclass.unit1.Junior_themes1n_home;
import com.example.sanskriti_2020_all.MyClickListener;
import com.example.sanskriti_2020_all.R;

public class words1 extends AppCompatActivity {
    ImageView net_c,net_c_n,hen_c,hen_c_n,cat_c,cat_c_n,ten_c,ten_c_n,men_c,men_c_n;
    TextView drag_net,drag_hen,drag_cat,drag_ten,drag_men;
    private ViewFlipper viewFlipper;
    Animation animationblink;
    int i;
    MediaPlayer failure, success,mp,s_eye,s_nose,s_ear,s_skin,s_tongue,mp3;
    private static final String NET_C = "net";
    private static final String HEN_C = "hen";
    private static final String CAT_C = "cat";
    private static final String TEN_C = "ten";
    private static final String MEN_C = "men";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words1);
        viewFlipper = findViewById(R.id.viewflipper);
        net_c = findViewById(R.id.net_c);
        net_c_n = findViewById(R.id.net_c_n);
        hen_c = findViewById(R.id.hen_c);
        hen_c_n = findViewById(R.id.hen_c_n);
        cat_c = findViewById(R.id.cat_c);
        cat_c_n = findViewById(R.id.cat_c_n);
        ten_c = findViewById(R.id.ten_c);
        ten_c_n = findViewById(R.id.ten_c_n);
        men_c = findViewById(R.id.men_c);
        men_c_n = findViewById(R.id.men_c_n);
        drag_net = findViewById(R.id.drag_net);
        drag_hen = findViewById(R.id.drag_hen);
        drag_cat = findViewById(R.id.drag_cat);
        drag_ten = findViewById(R.id.drag_ten);
        drag_men = findViewById(R.id.drag_men);

        mp3 = MediaPlayer.create(words1.this, R.raw.success);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();

        failure = MediaPlayer.create(words1.this, R.raw.try_again_new);
        success = MediaPlayer.create(words1.this, R.raw.success);

        drag_net.setTag(NET_C);
        drag_hen.setTag(HEN_C);
        drag_cat.setTag(CAT_C);
        drag_ten.setTag(TEN_C);
        drag_men.setTag(MEN_C);

        drag_net.setOnTouchListener(new MyClickListener());
        drag_hen.setOnTouchListener(new MyClickListener());
        drag_cat.setOnTouchListener(new MyClickListener());
        drag_ten.setOnTouchListener(new MyClickListener());
        drag_men.setOnTouchListener(new MyClickListener());

        net_c.setOnDragListener(new words1.MyDragListener());
        ten_c.setOnDragListener(new words1.MyDragListener());
        hen_c.setOnDragListener(new words1.MyDragListener());
        cat_c.setOnDragListener(new words1.MyDragListener());
        men_c.setOnDragListener(new words1.MyDragListener());

    }

    public void youCant(DragEvent event){

        mp = MediaPlayer.create(words1.this, R.raw.failure);
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
                    Intent act = new Intent(words1.this, ju4_literacy.class);
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

                    if (v == findViewById(R.id.hen_c)) {
                        View view = (View) event.getLocalState();

                        if (clipData.equals("hen")) {


                            hen_c.setVisibility(View.GONE);
                            // eye_c.startAnimation(animationblink);
                            hen_c_n.setVisibility(View.VISIBLE);
                            i++;
                            success.start();
                            nextScreen(i);

                        } else {
                            hen_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_hen.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            failure.start();
                        }
                    } else if (v == findViewById(R.id.ten_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("ten")) {

                            ten_c.setVisibility(View.GONE);
                            ten_c_n.setVisibility(View.VISIBLE);
                            i++;
                            success.start();
                            nextScreen(i);

                        } else {
                            ten_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_ten.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            failure.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    } else if (v == findViewById(R.id.men_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("men")) {

                            men_c.setVisibility(View.GONE);
                            men_c_n.setVisibility(View.VISIBLE);
                            i++;
                            success.start();
                            nextScreen(i);

                        } else {
                            men_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_men.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            failure.start();
                        }
                    } else if (v == findViewById(R.id.cat_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("cat")) {

                            cat_c.setVisibility(View.GONE);
                            cat_c_n.setVisibility(View.VISIBLE);
                            i++;
                            success.start();
                            nextScreen(i);

                        } else {
                            cat_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_cat.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            failure.start();
                        }


                    }
                    else if (v == findViewById(R.id.net_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("net")) {

                            net_c.setVisibility(View.GONE);
                            net_c_n.setVisibility(View.VISIBLE);
                            i++;
                            success.start();
                            nextScreen(i);

                        } else {
                            net_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_net.setVisibility(View.VISIBLE);
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

                    if(net_c_n.getVisibility()==View.VISIBLE){

                        drag_net.setVisibility(View.GONE);
                    }
                    else{
                        drag_net.setVisibility(View.VISIBLE);
                    }


                    if(cat_c_n.getVisibility()==View.VISIBLE){

                        drag_cat.setVisibility(View.GONE);
                    }
                    else{
                        drag_cat.setVisibility(View.VISIBLE);
                    }

                    if(hen_c_n.getVisibility()==View.VISIBLE){

                        drag_hen.setVisibility(View.GONE);
                    }
                    else{
                        drag_hen.setVisibility(View.VISIBLE);
                    }

                    if(men_c_n.getVisibility()==View.VISIBLE){

                        drag_men.setVisibility(View.GONE);
                    }
                    else{
                        drag_men.setVisibility(View.VISIBLE);
                    }

                    if(ten_c_n.getVisibility()==View.VISIBLE){

                        drag_ten.setVisibility(View.GONE);
                    }
                    else{
                        drag_ten.setVisibility(View.VISIBLE);
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

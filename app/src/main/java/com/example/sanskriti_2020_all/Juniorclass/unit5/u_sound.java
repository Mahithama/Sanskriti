package com.example.sanskriti_2020_all.Juniorclass.unit5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;

import com.example.sanskriti_2020_all.R;

public class u_sound extends AppCompatActivity {
ImageView mug_c,mug_c_n,sun_c,sun_c_n,bug_c,bug_c_n,duck_c,duck_c_n,key_c,dest;
    int i;
    VideoView videoView;

    MediaPlayer failure, success,mp3;

    private static final String MUG_C = "mug";
    private static final String SUN_C = "sun";
    private static final String BUG_C = "bug";
    private static final String DUCK_C = "duck";
    private static final String KEY_C = "key";

    private boolean ismugDragged=false;
    private boolean issunDragged=false;
    private boolean isbugDragged=false;
    private boolean isduckDragged=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_sound);
        mug_c = findViewById(R.id.mug_c);
        mug_c_n = findViewById(R.id.mug_c_n);
        sun_c = findViewById(R.id.sun_c);
        sun_c_n = findViewById(R.id.sun_c_n);
        bug_c = findViewById(R.id.bug_c);
        bug_c_n = findViewById(R.id.bug_c_n);
        duck_c = findViewById(R.id.duck_c);
        duck_c_n = findViewById(R.id.duck_c_n);
        key_c = findViewById(R.id.key_c);
        dest = findViewById(R.id.dest);


        failure = MediaPlayer.create(u_sound.this, R.raw.failure);
        success = MediaPlayer.create(u_sound.this, R.raw.success);

        mug_c.setTag(MUG_C);
        sun_c.setTag(SUN_C);
        bug_c.setTag(BUG_C);
        duck_c.setTag(DUCK_C);
        key_c.setTag(KEY_C);


        mug_c.setOnLongClickListener(MyClickListener);
        sun_c.setOnLongClickListener( MyClickListener);
        bug_c.setOnLongClickListener(MyClickListener);
        duck_c.setOnLongClickListener(MyClickListener);
        key_c.setOnLongClickListener(MyClickListener);


        dest.setOnDragListener(dragListener);



    }

    View.OnLongClickListener MyClickListener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            ClipData data =ClipData.newPlainText("", "");
            View.DragShadowBuilder myshadowbuilder = new View.DragShadowBuilder(v);
            v.startDrag(data,myshadowbuilder,v,0);
            return true;
        }
    };


    public void youCant(DragEvent event){

        failure.start();

    }



    public void nextScreen(int i){

        if(ismugDragged && issunDragged && isbugDragged && isduckDragged){

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Match The Words Activity";
                    Intent act = new Intent(u_sound.this, ju5_literacy.class);
                    act.putExtra("activity_name", activity_name);
                    startActivity(act);


                }
            }, 5000);




        }

    }

    View.OnDragListener dragListener = new View.OnDragListener() {
        @Override
        public boolean onDrag(View view, DragEvent event) {

            int dragEvent = event.getAction();
            final View view1 = (View) event.getLocalState();
            switch (dragEvent){

                case DragEvent.ACTION_DRAG_STARTED:

                case DragEvent.ACTION_DRAG_EXITED:
                    break;

                case DragEvent.ACTION_DROP:
                    String clipData = event.getClipDescription().getLabel().toString();
                    if(view1.getId() == R.id.sun_c){
                        sun_c_n.setVisibility(View.VISIBLE);
                        issunDragged=true;
                        sun_c.setVisibility(View.GONE);
                    }else if (view1.getId() == R.id.key_c) {
                        key_c.setVisibility(View.VISIBLE);
                    }
                    else if (view1.getId() == R.id.mug_c) {
                        mug_c_n.setVisibility(View.VISIBLE);
                        ismugDragged=true;
                        mug_c.setVisibility(View.GONE);
                    }
                    else if (view1.getId() == R.id.duck_c) {
                        duck_c_n.setVisibility(View.VISIBLE);
                        isduckDragged=true;
                        duck_c.setVisibility(View.GONE);
                    }
                    else if (view1.getId() == R.id.bug_c) {
                        bug_c_n.setVisibility(View.VISIBLE);
                        isbugDragged=true;
                        bug_c.setVisibility(View.GONE);
                    }
                    else {

                        youCant(event);
                    }

                    break;

            }



            return true;
        }
    };




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
}




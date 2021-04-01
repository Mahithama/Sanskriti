package com.example.sanskriti_2020_all.Seniorkg.Unit4;

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
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.sanskriti_2020_all.MyClickListener;
import com.example.sanskriti_2020_all.R;
import com.example.sanskriti_2020_all.Seniorkg.Unit3.Sn3_literacy;
import com.example.sanskriti_2020_all.Seniorkg.Unit3.sr_blends_3;

public class Place_names extends AppCompatActivity {
    TextView drag_school, drag_pet, drag_super , drag_hospital, drag_bakery,
            school_c_n,pet_c_n,super_c_n,bakery_c_n,hospital_c_n;

    ImageView school_c,pet_c,super_c,bakery_c,hospital_c;

    int i;
    MediaPlayer failure, success,animalhome_dog,animalhome_hen,animalhome_horse,animalhome_cow,animalhome_lion,animalhome_pig,mp3,mp;
    private static final String SC_C = "sc";
    private static final String BR_C = "br";
    private static final String SU_C = "su";
    private static final String HO_C = "ho";
    private static final String PE_C = "pe";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_names);

        school_c = findViewById(R.id.school_c);
        school_c_n = findViewById(R.id.school_c_n);
        pet_c = findViewById(R.id.pet_c);
        pet_c_n = findViewById(R.id.pet_c_n);
        super_c = findViewById(R.id.super_c);
        super_c_n = findViewById(R.id.super_c_n);
        bakery_c = findViewById(R.id.bakery_c);
        bakery_c_n = findViewById(R.id.bakery_c_n);
        hospital_c = findViewById(R.id.hospital_c);
        hospital_c_n = findViewById(R.id.hospital_c_n);
        drag_school = findViewById(R.id.drag_school);
        drag_pet = findViewById(R.id.drag_pet);
        drag_super = findViewById(R.id.drag_super);
        drag_hospital = findViewById(R.id.drag_hospital);
        drag_bakery = findViewById(R.id.drag_bakery);



        drag_school.setTag(SC_C);
        drag_pet.setTag(PE_C);
        drag_super.setTag(SU_C);
        drag_hospital.setTag(HO_C);
        drag_bakery.setTag(BR_C);

        drag_school.setOnTouchListener(new MyClickListener());
        drag_pet.setOnTouchListener(new MyClickListener());
        drag_bakery.setOnTouchListener(new MyClickListener());
        drag_super.setOnTouchListener(new MyClickListener());
        drag_hospital.setOnTouchListener(new MyClickListener());

        school_c.setOnDragListener(new MyDragListener());
        pet_c.setOnDragListener(new MyDragListener());
        super_c.setOnDragListener(new MyDragListener());
        bakery_c.setOnDragListener(new MyDragListener());
        hospital_c.setOnDragListener(new MyDragListener());



    }

    public void youCant(DragEvent event){
        mp = MediaPlayer.create(Place_names.this, R.raw.try_again_new);
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
                    Intent act = new Intent(Place_names.this, Sn4_literacy.class);
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

                    if (v == findViewById(R.id.school_c)) {
                        View view = (View) event.getLocalState();

                        if (clipData.equals("sc")) {


                            school_c.setVisibility(View.GONE);
                            school_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Place_names.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_dog.start();
                            nextScreen(i);

                        } else {

                            school_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_school.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Place_names.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    } else if (v == findViewById(R.id.bakery_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("br")) {

                            bakery_c.setVisibility(View.GONE);
                            bakery_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Place_names.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            bakery_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_bakery.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Place_names.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    }
                    else if (v == findViewById(R.id.hospital_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("ho")) {

                            hospital_c.setVisibility(View.GONE);
                            hospital_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Place_names.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            hospital_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_hospital.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Place_names.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    }
                    else if (v == findViewById(R.id.pet_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("pet")) {

                            pet_c.setVisibility(View.GONE);
                            pet_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Place_names.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            pet_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_pet.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Place_names.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    }
                    else if (v == findViewById(R.id.super_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("su")) {

                            super_c.setVisibility(View.GONE);
                            super_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Place_names.this, R.raw.success);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            super_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_super.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Place_names.this, R.raw.failure);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    }else {

                        youCant(event);
                    }
                    break;


                case DragEvent.ACTION_DRAG_ENDED:


                    if(bakery_c_n.getVisibility()==View.VISIBLE){

                        drag_bakery.setVisibility(View.GONE);
                    }
                    else{
                        drag_bakery.setVisibility(View.VISIBLE);
                    }


                    if(school_c_n.getVisibility()==View.VISIBLE){

                        drag_school.setVisibility(View.GONE);
                    }
                    else{
                        drag_school.setVisibility(View.VISIBLE);
                    }

                    if(pet_c_n.getVisibility()==View.VISIBLE){

                        drag_pet.setVisibility(View.GONE);
                    }
                    else{
                        drag_pet.setVisibility(View.VISIBLE);
                    }

                    if(super_c_n.getVisibility()==View.VISIBLE){

                        drag_super.setVisibility(View.GONE);
                    }
                    else{
                        drag_super.setVisibility(View.VISIBLE);
                    }
                    if(hospital_c_n.getVisibility()==View.VISIBLE){

                        drag_hospital.setVisibility(View.GONE);
                    }
                    else{
                        drag_hospital.setVisibility(View.VISIBLE);
                    }



                    /*if(View.VISIBLE != pig_c_n.getVisibility() && View.VISIBLE != pig_c_n.getVisibility()
                    && View.VISIBLE != pig_c_n.getVisibility() && View.VISIBLE != pig_c_n.getVisibility()
                    && View.VISIBLE != pig_c_n.getVisibility() && View.VISIBLE != pig_c_n.getVisibility()){
                        if (event.getClipDescription().getLabel().toString().equals("pig")) {
                            pig_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            pig.setVisibility(View.VISIBLE);
                            drag_pig.setVisibility(View.VISIBLE);

                        }

                    }*/



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

}
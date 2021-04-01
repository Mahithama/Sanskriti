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

public class Junior1_animalhouse extends AppCompatActivity {
    ImageView drag_dog,dog_c,dog_c_n,drag_hen,hen_c,hen_c_n,drag_horse,horse_c,horse_c_n,drag_cow,cow_c,cow_c_n,drag_lion,lion_c,lion_c_n,dog,horse,hen,cow,lion,pig,
            drag_pig,pig_c,pig_c_n,dummy;



    int i;
    MediaPlayer try_again_new, success,animalhome_dog,animalhome_hen,animalhome_horse,animalhome_cow,animalhome_lion,animalhome_pig,mp3,mp;
    private static final String DOG_C = "dog";
    private static final String HEN_C = "hen";
    private static final String HORSE_C = "horse";
    private static final String COW_C = "cow";
    private static final String LION_C = "lion";
    private static final String PIG_C = "pig";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junior1_animalhouse);
        dog_c = findViewById(R.id.dog_c);
        dog_c_n = findViewById(R.id.dog_c_n);
        pig_c = findViewById(R.id.pig_c);
        pig_c_n = findViewById(R.id.pig_c_n);
        hen_c = findViewById(R.id.hen_c);
        hen_c_n = findViewById(R.id.hen_c_n);
        horse_c = findViewById(R.id.horse_c);
        horse_c_n = findViewById(R.id.horse_c_n);
        cow_c = findViewById(R.id.cow_c);
        cow_c_n = findViewById(R.id.cow_c_n);
        lion_c = findViewById(R.id.lion_c);
        lion_c_n = findViewById(R.id.lion_c_n);
        drag_dog = findViewById(R.id.drag_dog);
        drag_hen = findViewById(R.id.drag_hen);
        drag_horse = findViewById(R.id.drag_horse);
        drag_cow = findViewById(R.id.drag_cow);
        drag_lion = findViewById(R.id.drag_lion);
        drag_pig = findViewById(R.id.drag_pig);
        dog = findViewById(R.id.dog);
        hen = findViewById(R.id.hen);
        horse = findViewById(R.id.horse);
        cow = findViewById(R.id.cow);
        lion = findViewById(R.id.lion);
        pig = findViewById(R.id.pig);
        dummy = findViewById(R.id.dummy);





      /*  try_again_new = MediaPlayer.create(Animal_houses.this, R.raw.try_again_new);
        success = MediaPlayer.create(Animal_houses.this, R.raw.success);
        animalhome_dog = MediaPlayer.create(Animal_houses.this, R.raw.animalhome_dog);
        animalhome_hen = MediaPlayer.create(Animal_houses.this, R.raw.animalhome_hen);
        animalhome_horse = MediaPlayer.create(Animal_houses.this, R.raw.animalhome_horse);
        animalhome_cow = MediaPlayer.create(Animal_houses.this, R.raw.animalhomes_cow);
        animalhome_lion = MediaPlayer.create(Animal_houses.this, R.raw.animalhome_lion);
        animalhome_pig = MediaPlayer.create(Animal_houses.this, R.raw.animalhome_pig); */

      /*  mp3 = MediaPlayer.create(game6.this, R.raw.matchtheorgans);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start(); */

        drag_dog.setTag(DOG_C);
        drag_hen.setTag(HEN_C);
        drag_horse.setTag(HORSE_C);
        drag_cow.setTag(COW_C);
        drag_lion.setTag(LION_C);
        drag_pig.setTag(PIG_C);

        drag_dog.setOnTouchListener(new MyClickListener());
        drag_hen.setOnTouchListener(new MyClickListener());
        drag_horse.setOnTouchListener(new MyClickListener());
        drag_cow.setOnTouchListener(new MyClickListener());
        drag_lion.setOnTouchListener(new MyClickListener());
        drag_pig.setOnTouchListener(new MyClickListener());

        dog_c.setOnDragListener(new Junior1_animalhouse.MyDragListener());
        hen_c.setOnDragListener(new Junior1_animalhouse.MyDragListener());
        horse_c.setOnDragListener(new Junior1_animalhouse.MyDragListener());
        cow_c.setOnDragListener(new Junior1_animalhouse.MyDragListener());
        lion_c.setOnDragListener(new Junior1_animalhouse.MyDragListener());
        pig_c.setOnDragListener(new Junior1_animalhouse.MyDragListener());

    }

    public void youCant(DragEvent event){
        mp = MediaPlayer.create(Junior1_animalhouse.this, R.raw.failure);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.setLooping(false);
        mp.start();
        //try_again_new.start();
        //View view = (View) event.getLocalState();
        //view.setVisibility(View.VISIBLE);
    }

    public void nextScreen(int i){

        if(i==6){

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    String activity_name = "Drag The Number Activity";
                    Intent act = new Intent(Junior1_animalhouse.this, Junior_literacy1n_home.class);
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

                    if (v == findViewById(R.id.dog_c)) {
                        View view = (View) event.getLocalState();

                        if (clipData.equals("dog")) {


                            dog_c.setVisibility(View.GONE);
                            dog.setVisibility(View.GONE);
                            dog_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Junior1_animalhouse.this, R.raw.animalhome_dog);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_dog.start();
                            nextScreen(i);

                        } else {

                            dog_c.setVisibility(View.VISIBLE);
                            dog.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_dog.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Junior1_animalhouse.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    } else if (v == findViewById(R.id.hen_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("hen")) {

                            hen_c.setVisibility(View.GONE);
                            hen.setVisibility(View.GONE);
                            hen_c_n.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Junior1_animalhouse.this, R.raw.animalhome_hen);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_hen.start();
                            nextScreen(i);

                        } else {
                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            hen_c.setVisibility(View.VISIBLE);
                            hen.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_hen.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Junior1_animalhouse.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                        /* container.setImageResource(textureArrayWin[i]);*/

                    } else if (v == findViewById(R.id.horse_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("horse")) {

                            // mp = MediaPlayer.create(game5.this, R.raw.animalhome_horse);
                            horse_c.setVisibility(View.GONE);
                            horse_c_n.setVisibility(View.VISIBLE);
                            horse.setVisibility(View.GONE);
                            mp = MediaPlayer.create(Junior1_animalhouse.this, R.raw.animalhome_horse);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_horse.start();
                            nextScreen(i);

                        } else {

                            //mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            drag_horse.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            horse.setVisibility(View.VISIBLE);
                            drag_horse.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Junior1_animalhouse.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }
                    } else if (v == findViewById(R.id.cow_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("cow")) {

                            //  mp = MediaPlayer.create(game5.this, R.raw.animalhomes_cow);
                            cow_c.setVisibility(View.GONE);
                            cow_c_n.setVisibility(View.VISIBLE);
                            cow.setVisibility(View.GONE);
                            mp = MediaPlayer.create(Junior1_animalhouse.this, R.raw.animalhomes_cow);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_cow.start();
                            nextScreen(i);

                        } else {

                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            cow_c.setVisibility(View.VISIBLE);
                            cow.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_cow.setVisibility(View.VISIBLE);
                            mp = MediaPlayer.create(Junior1_animalhouse.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            //try_again_new.start();
                        }


                    }
                    else if (v == findViewById(R.id.lion_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("lion")) {

                            // mp = MediaPlayer.create(game5.this, R.raw.animalhome_lion);
                            lion_c.setVisibility(View.GONE);
                            lion_c_n.setVisibility(View.VISIBLE);
                            lion.setVisibility(View.GONE);
                            mp = MediaPlayer.create(Junior1_animalhouse.this, R.raw.animalhome_lion);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_lion.start();
                            nextScreen(i);

                        } else {

                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            lion_c.setVisibility(View.VISIBLE);
                            lion.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            drag_lion.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Junior1_animalhouse.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }


                    }else if (v == findViewById(R.id.pig_c)) {

                        View view = (View) event.getLocalState();

                        if (clipData.equals("pig")) {

                            // mp = MediaPlayer.create(game5.this, R.raw.animalhome_pig);
                            pig_c.setVisibility(View.GONE);
                            pig_c_n.setVisibility(View.VISIBLE);
                            pig.setVisibility(View.GONE);
                            mp = MediaPlayer.create(Junior1_animalhouse.this, R.raw.animalhome_pig);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                            i++;
                            // animalhome_pig.start();
                            nextScreen(i);

                        } else {

                            // mp = MediaPlayer.create(game5.this, R.raw.try_again_new);
                            pig_c.setVisibility(View.VISIBLE);
                            v.setVisibility(View.VISIBLE);
                            pig.setVisibility(View.VISIBLE);
                            drag_pig.setVisibility(View.VISIBLE);
                            if(view!=null) {
                                view.setVisibility(View.VISIBLE);
                            }
                            mp = MediaPlayer.create(Junior1_animalhouse.this, R.raw.try_again_new);
                            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mp.setLooping(false);
                            mp.start();
                        }


                    }else {

                        youCant(event);
                    }
                    break;


                case DragEvent.ACTION_DRAG_ENDED:


                    if(dog_c_n.getVisibility()==View.VISIBLE){

                        drag_dog.setVisibility(View.GONE);
                    }
                    else{
                        drag_dog.setVisibility(View.VISIBLE);
                    }


                    if(hen_c_n.getVisibility()==View.VISIBLE){

                        drag_hen.setVisibility(View.GONE);
                    }
                    else{
                        drag_hen.setVisibility(View.VISIBLE);
                    }

                    if(horse_c_n.getVisibility()==View.VISIBLE){

                        drag_horse.setVisibility(View.GONE);
                    }
                    else{
                        drag_horse.setVisibility(View.VISIBLE);
                    }

                    if(cow_c_n.getVisibility()==View.VISIBLE){

                        drag_cow.setVisibility(View.GONE);
                    }
                    else{
                        drag_cow.setVisibility(View.VISIBLE);
                    }

                    if(lion_c_n.getVisibility()==View.VISIBLE){

                        drag_lion.setVisibility(View.GONE);
                    }
                    else{
                        drag_lion.setVisibility(View.VISIBLE);
                    }


                    if(pig_c_n.getVisibility()==View.VISIBLE){

                        drag_pig.setVisibility(View.GONE);
                    }
                    else{
                        drag_pig.setVisibility(View.VISIBLE);
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
package com.example.sanskriti_2020_all.Nurseryclass.Unit7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.sanskriti_2020_all.Nurseryclass.Unit6.Animal_cover;
import com.example.sanskriti_2020_all.Nurseryclass.Unit6.Animals;
import com.example.sanskriti_2020_all.R;

public class Fruit_cover extends AppCompatActivity {
    ImageButton start_animals;
    MediaPlayer mp,mp3;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_cover);
        mp3 = MediaPlayer.create(Fruit_cover.this, R.raw.success);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();

        start_animals=findViewById(R.id.start_animals);
        start_animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp3 != null && mp3.isPlaying()){
                    mp3.stop();
                }

                Intent intent=new Intent(Fruit_cover.this, Fruit_slices.class);
                startActivity(intent);
            }
        } );
    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}
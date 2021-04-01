package com.example.sanskriti_2020_all.Seniorkg.Unit5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.sanskriti_2020_all.R;
import com.example.sanskriti_2020_all.Seniorkg.Unit4.Place_names;
import com.example.sanskriti_2020_all.Seniorkg.Unit4.places_cover;

public class sentence_cover extends AppCompatActivity {
    ImageView start;
    MediaPlayer mp,mp3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sentence_cover);
        mp3 = MediaPlayer.create(sentence_cover.this, R.raw.success);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();

        start=findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp3 != null && mp3.isPlaying()){
                    mp3.stop();
                }

                Intent intent=new Intent(sentence_cover.this, Sentence_words.class);
                startActivity(intent);
            }
        } );
    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}

package com.example.sanskriti_2020_all.Seniorkg.Unit7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.example.sanskriti_2020_all.Juniorclass.unit7.Missing_numbers;
import com.example.sanskriti_2020_all.Juniorclass.unit7.ju7_numeracy;
import com.example.sanskriti_2020_all.R;
import com.example.sanskriti_2020_all.Seniorkg.Unit3.sr_blends_3;

public class Addition extends AppCompatActivity {
    EditText a2, a5,a7,b4,b4a,b8,c3,c3a,c6,d5,d4,d9 ;
    Button next;
    private ViewFlipper viewFlipper;
    MediaPlayer failure, success,animalhome_dog,animalhome_hen,animalhome_horse,animalhome_cow,animalhome_lion,animalhome_pig,mp3,mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);

        viewFlipper = findViewById(R.id.viewflipper);
        a2 = findViewById(R.id.a2);
        a5 = findViewById(R.id.a5);
        a7 = findViewById(R.id.a7);
        b4 = findViewById(R.id.b4);
        b4a = findViewById(R.id.b4a);
        b8 = findViewById(R.id.b8);
        c3 = findViewById(R.id.c3);
        c3a = findViewById(R.id.c3a);
        c6 = findViewById(R.id.c6);
        d5 = findViewById(R.id.d5);
        d4 = findViewById(R.id.d4);
        d9 = findViewById(R.id.d9);


        mp3 = MediaPlayer.create(Addition.this, R.raw.success);
        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp3.setLooping(false);
        mp3.start();
        next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              /*if (isConnected()) {
                    Toast.makeText(getApplicationContext(), "Internet Connected", Toast.LENGTH_SHORT).show(); */


                if (a2.getText().toString().equals("2") && a5.getText().toString().equals("5") &&
                        a7.getText().toString().equals("7") && b4.getText().toString().equals("4") &&
                        b4a.getText().toString().equals("4") && b8.getText().toString().equals("8") &&
                        c3.getText().toString().equals("3") && c3a.getText().toString().equals("3") &&
                        c6.getText().toString().equals("6") && d5.getText().toString().equals("5") &&
                        d4.getText().toString().equals("4") && d9.getText().toString().equals("9")) {


                    Toast.makeText(Addition.this, "Correct answers", Toast.LENGTH_SHORT).show();


                    startActivity(new Intent(Addition.this, Sn7_numeracy.class));
                    finish();

                }
                else {
                    Toast.makeText(getApplicationContext(), "Check your answers", Toast.LENGTH_SHORT).show();

                }


               /*}

                else {
                    Toast.makeText(getApplicationContext(), "No Internet Connection", Toast.LENGTH_SHORT).show();
                } */

            }

        });

    }


  /*public boolean isConnected() {
        boolean connected = false;
        try{
            ConnectivityManager cm = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo netinfo = cm.getActiveNetworkInfo();
            connected = netinfo != null && netinfo.isAvailable() && netinfo.isConnected();
            return connected;
        }
        catch (Exception e){
            Log.e("Connectivity Exception", e.getMessage());
        }
        return connected;
    } */

    public void onBackPressed() {
        return;
    }
    public void nextView(View v) {
        viewFlipper.showNext();
        if(mp3 != null && mp3.isPlaying()){
            mp3.stop();
        }

    }

}
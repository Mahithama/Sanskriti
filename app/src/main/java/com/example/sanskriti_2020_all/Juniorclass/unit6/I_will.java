package com.example.sanskriti_2020_all.Juniorclass.unit6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

import com.example.sanskriti_2020_all.R;
import com.example.sanskriti_2020_all.Seniorkg.Unit6.Fill_inthe_blanks;

import pl.droidsonroids.gif.GifImageView;

public class I_will extends AppCompatActivity {
    private ViewFlipper viewFlipper;
    Button close;
    GifImageView gifImageView1,gifImageView2,gifImageView3,gifImageView4,gifImageView5,gifImageView6,gifImageView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_will);
        viewFlipper = findViewById(R.id.view_flipper);
        gifImageView1=findViewById(R.id.gifImageView1);
        gifImageView2=findViewById(R.id.gifImageView2);
        gifImageView3=findViewById(R.id.gifImageView3);
        gifImageView4=findViewById(R.id.gifImageView4);
        gifImageView5=findViewById(R.id.gifImageView5);
        gifImageView6=findViewById(R.id.gifImageView6);
        gifImageView7=findViewById(R.id.gifImageView7);

        close=findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(I_will.this, Fill_inthe_blanks.class);
                startActivity(intent);

            }
        } );

    }
    public void previousView(View v) {

        viewFlipper.showPrevious();
    }
    public void nextView(View v) {

        viewFlipper.showNext();
    }


}

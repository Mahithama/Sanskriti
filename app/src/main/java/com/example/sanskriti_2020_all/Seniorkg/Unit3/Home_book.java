package com.example.sanskriti_2020_all.Seniorkg.Unit3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ViewFlipper;

import com.example.sanskriti_2020_all.R;

public class Home_book extends AppCompatActivity {
    private ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_book);

        viewFlipper = findViewById(R.id.view_flipper);


    }

    public void previousView(View v) {
        viewFlipper.showPrevious();
    }

    public void nextView(View v) {
        viewFlipper.showNext();
    }
}
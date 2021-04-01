package com.example.sanskriti_2020_all.Juniorclass.unit1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.sanskriti_2020_all.R;

public class Junior_stories_home extends AppCompatActivity {
    ImageButton week,months,school,poem;
    ImageView backjs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junior_stories_home);
        week = findViewById(R.id.week);
        week.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Junior_stories_home.this, Junior_days_ina_week.class);
                startActivity(i);
            }
        });

        months = findViewById(R.id.months);
        months.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Junior_stories_home.this, Junior_months.class);
                startActivity(i);
            }
        });

        school = findViewById(R.id.school);
        school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Junior_stories_home.this, Junior_school.class);
                startActivity(i);
            }
        });

        poem = findViewById(R.id.poem);
        poem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Junior_stories_home.this, Junior_poem.class);
                startActivity(i);
            }
        });

        backjs = findViewById(R.id.back_icon);
        backjs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Junior_stories_home.this, Junior1_themes_Home.class);
                startActivity(i);
            }
        });


    }

    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}

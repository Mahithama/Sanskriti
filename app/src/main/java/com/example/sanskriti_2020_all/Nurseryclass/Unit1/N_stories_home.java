package com.example.sanskriti_2020_all.Nurseryclass.Unit1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanskriti_2020_all.R;

public class N_stories_home extends AppCompatActivity {
    ImageButton school,story_anna;
    ImageView backnu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n_stories_home);
        school = findViewById(R.id.school);
        school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(N_stories_home.this, Nursery1_story_school.class);
                startActivity(intent);
            }
        });

        story_anna = findViewById(R.id.story_anna);
        story_anna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(N_stories_home.this, Nursery1_story_ana.class);
                startActivity(intent);
            }
        });


        backnu = findViewById(R.id.back_icon);
        backnu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(N_stories_home.this, Nursery_themes1n_home.class);
                startActivity(intent);
            }
        });
    }

    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}

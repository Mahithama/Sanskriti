package com.example.sanskriti_2020_all.Seniorkg.Unit3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.sanskriti_2020_all.R;
import com.example.sanskriti_2020_all.Seniorkg.Unit2.Birthday;
import com.example.sanskriti_2020_all.Seniorkg.Unit2.Sn2_theme_activities;
import com.example.sanskriti_2020_all.Seniorkg.Unit2.Sn2_themes;

public class Sn3_literacy extends AppCompatActivity {
    ImageView act_1n1t,act_2n1t,act_3n1t,act_4n1t,return_activity;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sn3_literacy);
        act_1n1t=findViewById(R.id.act_1);
        act_1n1t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sn3_literacy.this, Sr_blendss_cover_3.class);
                startActivity(intent);
            }
        } );


        act_2n1t=findViewById(R.id.act_2);
        act_2n1t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sn3_literacy.this, Sr3_br_cover.class);
                startActivity(intent);
                //Toast.makeText(Sn3_literacy.this, "No more activities", Toast.LENGTH_SHORT).show();
            }
        } );

        act_3n1t=findViewById(R.id. act_3);
        act_3n1t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent=new Intent(Sn3_literacy.this,sr_blends_3.class);
                //Toast.makeText(Sn3_literacy.this, "No more activities", Toast.LENGTH_SHORT).show();
                 startActivity(intent);
            }
        } );

        act_4n1t=findViewById(R.id.act_4);
        act_4n1t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(Nursery_activitiess_home.this, Nursery_themes_home.class);
                Toast.makeText(Sn3_literacy.this, "No more activitiesn", Toast.LENGTH_SHORT).show();
                // startActivity(intent);
            }
        } );


        return_activity = findViewById(R.id.return_activity);
        return_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sn3_literacy.this, Sn3_home.class);
                startActivity(intent);
            }
        });



    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}

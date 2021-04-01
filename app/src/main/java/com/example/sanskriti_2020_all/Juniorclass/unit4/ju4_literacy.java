package com.example.sanskriti_2020_all.Juniorclass.unit4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.sanskriti_2020_all.Juniorclass.unit2.Ju2_theme_activities;
import com.example.sanskriti_2020_all.Juniorclass.unit2.ju2_classroom;
import com.example.sanskriti_2020_all.Juniorclass.unit2.ju2_themes;
import com.example.sanskriti_2020_all.R;

public class ju4_literacy extends AppCompatActivity {
    ImageView act_1n1t,act_2n1t,act_3n1t,act_4n1t,return_activity;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nur4_literacy2);
        act_1n1t=findViewById(R.id.act_1);
        act_1n1t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ju4_literacy.this, words1.class);
                startActivity(intent);
            }
        } );


        act_2n1t=findViewById(R.id.act_2);
        act_2n1t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(nur2_themes_activities.this, Nursery_Spot_cover.class);
                //startActivity(intent);
                Toast.makeText(ju4_literacy.this, "No more activities", Toast.LENGTH_SHORT).show();
            }
        } );

        act_3n1t=findViewById(R.id. act_3);
        act_3n1t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent=new Intent(Nursery_activitiess_home.this,Nursery_themes_home.class);
                Toast.makeText(ju4_literacy.this, "No more activities", Toast.LENGTH_SHORT).show();
                // startActivity(intent);
            }
        } );

        act_4n1t=findViewById(R.id.act_4);
        act_4n1t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(Nursery_activitiess_home.this, Nursery_themes_home.class);
                Toast.makeText(ju4_literacy.this, "No more activitiesn", Toast.LENGTH_SHORT).show();
                // startActivity(intent);
            }
        } );


        return_activity = findViewById(R.id.return_activity);
        return_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ju4_literacy.this, ju2_themes.class);
                startActivity(intent);
            }
        });



    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}

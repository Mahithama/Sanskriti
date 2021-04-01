package com.example.sanskriti_2020_all.Nurseryclass.Unit7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.sanskriti_2020_all.Nurseryclass.Unit5.Shadow_match;
import com.example.sanskriti_2020_all.Nurseryclass.Unit5.Transport;
import com.example.sanskriti_2020_all.Nurseryclass.Unit5.nur5_themes;
import com.example.sanskriti_2020_all.Nurseryclass.Unit5.nur5_themes_activities_home;
import com.example.sanskriti_2020_all.R;

public class nur7_themes_activities_home extends AppCompatActivity {
    ImageView act_1n1l,act_2n1l,act_3n1l,act_4n1l,return_activity;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nur7_themes_activities_home);
        act_1n1l=findViewById(R.id.act_1);
        act_1n1l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(nur7_themes_activities_home.this, Fruit_cover.class);
                startActivity(intent);
            }
        } );


        act_2n1l=findViewById(R.id.act_2);
        act_2n1l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(nur7_themes_activities_home.this, Veg_cover.class);
                startActivity(intent);
                // Toast.makeText(nur3_literacy_home.this, "Will be updated soon", Toast.LENGTH_SHORT).show();
            }
        } );

        act_3n1l=findViewById(R.id. act_3);
        act_3n1l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent=new Intent(nur3_themes_activities_home.this,nur_rectangle_3.class);
                //startActivity(intent);
                Toast.makeText(nur7_themes_activities_home.this, "Will be updated soon", Toast.LENGTH_SHORT).show();
            }
        } );

        act_4n1l=findViewById(R.id.act_4);
        act_4n1l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(nur3_themes_activities_home.this, nur_senses_3.class);
                // startActivity(intent);
                Toast.makeText(nur7_themes_activities_home.this, "Will be updated soon", Toast.LENGTH_SHORT).show();
            }
        } );


        return_activity = findViewById(R.id.return_activity);
        return_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(nur7_themes_activities_home.this, nur7_themes.class);
                startActivity(intent);
            }
        });



    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}

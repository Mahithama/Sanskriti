package com.example.sanskriti_2020_all.Seniorkg.Unit3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.sanskriti_2020_all.MainActivity;
import com.example.sanskriti_2020_all.R;
import com.example.sanskriti_2020_all.Seniorkg.Unit2.Sn2_theme_activities;
import com.example.sanskriti_2020_all.Seniorkg.Unit2.Sn2_themes;
import com.example.sanskriti_2020_all.Seniorkg.Unit2.unit2_home;
import com.example.sanskriti_2020_all.Seniorkg.Unitscreens_senior;

public class Sn3_themes extends AppCompatActivity {
    ImageView n_home,n_logout,n_back,n_act_but,n_stories_but;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sn3_themes);
        n_act_but=findViewById(R.id.act_jbut);
        n_act_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sn3_themes.this, Sn3_theme_activities.class);
                startActivity(intent);

            }
        } );



        n_stories_but=findViewById(R.id.stories_jbut);
        n_stories_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(nur2_themes.this, nur2_themes_stories.class);
                // startActivity(intent);
                Toast.makeText(Sn3_themes.this, "Will be updated soon", Toast.LENGTH_SHORT).show();
            }
        } );

        n_home=findViewById(R.id.home_icon);
        n_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sn3_themes.this, Unitscreens_senior.class);
                startActivity(intent);
            }
        } );

        n_logout=findViewById(R.id.logout_icon);
        n_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sn3_themes.this, MainActivity.class);
                startActivity(intent);
            }
        } );

        n_back=findViewById(R.id.back_icon);
        n_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sn3_themes.this, unit2_home.class);
                startActivity(intent);
            }
        } );
    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }

}

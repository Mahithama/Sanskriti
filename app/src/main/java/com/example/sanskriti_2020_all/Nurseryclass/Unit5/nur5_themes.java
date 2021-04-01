package com.example.sanskriti_2020_all.Nurseryclass.Unit5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.sanskriti_2020_all.MainActivity;
import com.example.sanskriti_2020_all.Nurseryclass.Unit1.N_stories_home;
import com.example.sanskriti_2020_all.Nurseryclass.Unit1.Nursery_themes_home;
import com.example.sanskriti_2020_all.Nurseryclass.Unit3.nur3_themes_activities_home;
import com.example.sanskriti_2020_all.Nurseryclass.Unit3.nur3_themes_home;
import com.example.sanskriti_2020_all.Nurseryclass.Unitscreens_nursery;
import com.example.sanskriti_2020_all.R;

public class nur5_themes extends AppCompatActivity {
    ImageView n_home,n_logout,n_back,n_act_but,n_stories_but;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nur5_themes);
        n_act_but=findViewById(R.id.act_jbut);
        n_act_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(nur5_themes.this, nur5_themes_activities_home.class);
                startActivity(intent);

            }
        } );



        n_stories_but=findViewById(R.id.stories_jbut);
        n_stories_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(nur3_themes_home.this, N_stories_home.class);
                //startActivity(intent);
                Toast.makeText(nur5_themes.this, "Will be updated soon", Toast.LENGTH_SHORT).show();
            }
        } );

        n_home=findViewById(R.id.home_icon);
        n_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(nur5_themes.this, Unitscreens_nursery.class);
                startActivity(intent);
            }
        } );

        n_logout=findViewById(R.id.logout_icon);
        n_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(nur5_themes.this, MainActivity.class);
                startActivity(intent);
            }
        } );

        n_back=findViewById(R.id.back_icon);
        n_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(nur5_themes.this, nur5_home.class);
                startActivity(intent);
            }
        } );
    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }

}
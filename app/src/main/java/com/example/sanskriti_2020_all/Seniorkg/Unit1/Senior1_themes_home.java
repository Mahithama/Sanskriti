package com.example.sanskriti_2020_all.Seniorkg.Unit1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanskriti_2020_all.R;


public class Senior1_themes_home extends AppCompatActivity {
    ImageView themes1n,literacy1n,numeracy1n,logoutn;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senior1_themes_home);
        themes1n=findViewById(R.id.themes);
        themes1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent=new Intent(Senior1_themes_home.this, Senior_themes1n_home.class);
                Toast.makeText(Senior1_themes_home.this, "Will be updated soon", Toast.LENGTH_SHORT).show();
                //startActivity(intent);
            }
        } );


        literacy1n=findViewById(R.id.literacy);
        literacy1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Senior1_themes_home.this, Senior_literacy1n_home.class);
                startActivity(intent);
            }
        } );

        numeracy1n=findViewById(R.id.numeracy);
        numeracy1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Senior1_themes_home.this, Senior_numeracy1n_home.class);
                // Toast.makeText(Nursery_unit_one.this, "No Numeracy activities", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        } );


        logoutn = findViewById(R.id.back_icon);
        logoutn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Senior1_themes_home.this, Seniorkg_Home.class);
                startActivity(intent);
            }
        });



    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}

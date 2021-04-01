package com.example.sanskriti_2020_all.Seniorkg.Unit4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.sanskriti_2020_all.R;
import com.example.sanskriti_2020_all.Seniorkg.Unit3.Sn3_home;
import com.example.sanskriti_2020_all.Seniorkg.Unit3.Sn3_literacy;
import com.example.sanskriti_2020_all.Seniorkg.Unit3.Sn3_themes;
import com.example.sanskriti_2020_all.Seniorkg.Unitscreens_senior;

public class Sn4_home extends AppCompatActivity {
    ImageView themes1n,literacy1n,numeracy1n,logoutn;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sn4_home);
        themes1n=findViewById(R.id.themes);
        themes1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(Sn4_home.this, Sn3_themes.class);
                //startActivity(intent);
                Toast.makeText(Sn4_home.this, "Will be updated soon", Toast.LENGTH_SHORT).show();
            }
        } );


        literacy1n=findViewById(R.id.literacy);
        literacy1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sn4_home.this, Sn4_literacy.class);
                startActivity(intent);
                //Toast.makeText(Sn3_home.this, "No Literacy activities", Toast.LENGTH_SHORT).show();
            }
        } );

        numeracy1n=findViewById(R.id.numeracy);
        numeracy1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(nur2_home.this, nur2_numeracy.class);
                Toast.makeText(Sn4_home.this, "No Numeracy activities", Toast.LENGTH_SHORT).show();
                //startActivity(intent);
            }
        } );


        logoutn = findViewById(R.id.back_icon);
        logoutn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sn4_home.this, Unitscreens_senior.class);
                startActivity(intent);
            }
        });



    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}

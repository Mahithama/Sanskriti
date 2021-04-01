package com.example.sanskriti_2020_all.Nurseryclass.Unit3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.sanskriti_2020_all.Nurseryclass.Unit1.Nursery_literacy1n_home;
import com.example.sanskriti_2020_all.Nurseryclass.Unit1.Nursery_numeracy1n_home;
import com.example.sanskriti_2020_all.Nurseryclass.Unit1.Nursery_themes1n_home;
import com.example.sanskriti_2020_all.Nurseryclass.Unit1.Nursery_themes_home;
import com.example.sanskriti_2020_all.Nurseryclass.Unitscreens_nursery;
import com.example.sanskriti_2020_all.R;

public class nur3_home extends AppCompatActivity {
    ImageView themes1n,literacy1n,numeracy1n,logoutn;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nur3_home);
        themes1n=findViewById(R.id.themes);
        themes1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(nur3_home.this, nur3_themes_home.class);
                startActivity(intent);
            }
        } );


        literacy1n=findViewById(R.id.literacy);
        literacy1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(nur3_home.this, nur3_literacy_home.class);
                startActivity(intent);
            }
        } );

        numeracy1n=findViewById(R.id.numeracy);
        numeracy1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent=new Intent(nur3_home.this, Nursery_numeracy1n_home.class);
                Toast.makeText(nur3_home.this, "No Numeracy activities", Toast.LENGTH_SHORT).show();
              //  startActivity(intent);
            }
        } );


        logoutn = findViewById(R.id.back_icon);
        logoutn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(nur3_home.this, Unitscreens_nursery.class);
                startActivity(intent);
            }
        });



    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}

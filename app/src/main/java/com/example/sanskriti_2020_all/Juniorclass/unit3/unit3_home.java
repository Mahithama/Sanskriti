package com.example.sanskriti_2020_all.Juniorclass.unit3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.sanskriti_2020_all.Nurseryclass.Unit3.nur3_home;
import com.example.sanskriti_2020_all.Nurseryclass.Unit3.nur3_literacy_home;
import com.example.sanskriti_2020_all.Nurseryclass.Unit3.nur3_themes_home;
import com.example.sanskriti_2020_all.Nurseryclass.Unitscreens_nursery;
import com.example.sanskriti_2020_all.R;

public class unit3_home extends AppCompatActivity {
    ImageView themes1n,literacy1n,numeracy1n,logoutn;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit3_home);
        themes1n=findViewById(R.id.themes);
        themes1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(unit3_home.this, nur3_themes_home.class);
                //startActivity(intent);
                Toast.makeText(unit3_home.this, "No Numeracy activities", Toast.LENGTH_SHORT).show();
            }
        } );


        literacy1n=findViewById(R.id.literacy);
        literacy1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(unit3_home.this, nur3_literacy_home.class);
                //startActivity(intent);
                Toast.makeText(unit3_home.this, "No Literacy activities", Toast.LENGTH_SHORT).show();
            }
        } );

        numeracy1n=findViewById(R.id.numeracy);
        numeracy1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(unit3_home.this, unit3_numeracy.class);
                //Toast.makeText(unit3_home.this, "No Numeracy activities", Toast.LENGTH_SHORT).show();
                 startActivity(intent);
            }
        } );


        logoutn = findViewById(R.id.back_icon);
        logoutn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(unit3_home.this, Unitscreens_nursery.class);
                startActivity(intent);
            }
        });



    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}

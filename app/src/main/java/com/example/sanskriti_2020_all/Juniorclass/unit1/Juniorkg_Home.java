package com.example.sanskriti_2020_all.Juniorclass.unit1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.sanskriti_2020_all.Juniorclass.Unitscreen_junior;
import com.example.sanskriti_2020_all.MainActivity;
import com.example.sanskriti_2020_all.R;



public class Juniorkg_Home extends AppCompatActivity {
    ImageView themes1n,literacy1n,numeracy1n,logoutn;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juniorkg__home2);
        themes1n=findViewById(R.id.themes);
        themes1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Juniorkg_Home.this, Junior1_themes_Home.class);
                startActivity(intent);
            }
        } );


        literacy1n=findViewById(R.id.literacy);
        literacy1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Juniorkg_Home.this, Junior_literacy1n_home.class);
                startActivity(intent);
            }
        } );

        numeracy1n=findViewById(R.id.numeracy);
        numeracy1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Juniorkg_Home.this, Junior_numeracy1n_home.class);
                // Toast.makeText(Nursery_unit_one.this, "No Numeracy activities", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        } );


        logoutn = findViewById(R.id.back_icon);
        logoutn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Juniorkg_Home.this, Unitscreen_junior.class);
                startActivity(intent);
            }
        });



    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}

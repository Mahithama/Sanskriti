package com.example.sanskriti_2020_all.Nurseryclass.Unit7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.sanskriti_2020_all.MainActivity;
import com.example.sanskriti_2020_all.Nurseryclass.Unit6.Unit6_nursery_literacy_home;
import com.example.sanskriti_2020_all.Nurseryclass.Unit6.Unit6_nursery_numeracy_home;
import com.example.sanskriti_2020_all.Nurseryclass.Unit6.Unit6_nursery_themes_home;
import com.example.sanskriti_2020_all.Nurseryclass.Unit6.Unit6home;
import com.example.sanskriti_2020_all.R;

public class nur7_home extends AppCompatActivity {
    ImageView themes1n,literacy1n,numeracy1n,logoutn;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nur7_home);
        themes1n=findViewById(R.id.themes);
        themes1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(nur7_home.this, nur7_themes.class);
                startActivity(intent);
            }
        } );


        literacy1n=findViewById(R.id.literacy);
        literacy1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(nur7_home.this, nur7_literacy.class);
                startActivity(intent);
            }
        } );

        numeracy1n=findViewById(R.id.numeracy);
        numeracy1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(nur7_home.this, nur7_numeracy.class);
                 Toast.makeText(nur7_home.this, "No Numeracy activities", Toast.LENGTH_SHORT).show();
                //startActivity(intent);
            }
        } );


        logoutn = findViewById(R.id.back_icon);
        logoutn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(nur7_home.this, MainActivity.class);
                startActivity(intent);
            }
        });



    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}

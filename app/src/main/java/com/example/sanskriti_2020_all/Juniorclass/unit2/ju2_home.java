package com.example.sanskriti_2020_all.Juniorclass.unit2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.sanskriti_2020_all.Nurseryclass.Unit2.nur2_home;
import com.example.sanskriti_2020_all.Nurseryclass.Unit2.nur2_literacy;
import com.example.sanskriti_2020_all.Nurseryclass.Unit2.nur2_themes;
import com.example.sanskriti_2020_all.Nurseryclass.Unitscreens_nursery;
import com.example.sanskriti_2020_all.R;

public class ju2_home extends AppCompatActivity {
    ImageView themes1n,literacy1n,numeracy1n,logoutn;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ju2_home);
        themes1n=findViewById(R.id.themes);
        themes1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ju2_home.this, ju2_themes.class);
                startActivity(intent);
            }
        } );


        literacy1n=findViewById(R.id.literacy);
        literacy1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent=new Intent(ju2_home.this, nur2_literacy.class);
                //startActivity(intent);
                Toast.makeText(ju2_home.this, "No Literacy activities", Toast.LENGTH_SHORT).show();
            }
        } );

        numeracy1n=findViewById(R.id.numeracy);
        numeracy1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(nur2_home.this, nur2_numeracy.class);
                Toast.makeText(ju2_home.this, "No Numeracy activities", Toast.LENGTH_SHORT).show();
                //startActivity(intent);
            }
        } );


        logoutn = findViewById(R.id.back_icon);
        logoutn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ju2_home.this, Unitscreens_nursery.class);
                startActivity(intent);
            }
        });



    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}

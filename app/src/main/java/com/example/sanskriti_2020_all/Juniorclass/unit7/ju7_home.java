package com.example.sanskriti_2020_all.Juniorclass.unit7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.sanskriti_2020_all.Juniorclass.unit6.ju6_home;
import com.example.sanskriti_2020_all.Juniorclass.unit6.ju6_literacy;
import com.example.sanskriti_2020_all.Nurseryclass.Unitscreens_nursery;
import com.example.sanskriti_2020_all.R;

public class ju7_home extends AppCompatActivity {
    ImageView themes7n,literacy7n,numeracy7n,logoutn;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ju7_home);

        themes7n=findViewById(R.id.themes);
        themes7n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(ju6_home.this, ju6_themes.class);
                //startActivity(intent);
                Toast.makeText(ju7_home.this, "Will be updated soon", Toast.LENGTH_SHORT).show();
            }
        } );


        literacy7n=findViewById(R.id.literacy);
        literacy7n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent=new Intent(ju7_home.this, ju6_literacy.class);
               // startActivity(intent);
               Toast.makeText(ju7_home.this, "No Literacy activities", Toast.LENGTH_SHORT).show();
            }
        } );

        numeracy7n=findViewById(R.id.numeracy);
        numeracy7n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ju7_home.this, ju7_numeracy.class);
               // Toast.makeText(ju7_home.this, "No Numeracy activities", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        } );


        logoutn = findViewById(R.id.back_icon);
        logoutn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ju7_home.this, Unitscreens_nursery.class);
                startActivity(intent);
            }
        });



    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}

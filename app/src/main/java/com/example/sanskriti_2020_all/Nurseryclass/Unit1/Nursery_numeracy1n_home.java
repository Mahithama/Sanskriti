package com.example.sanskriti_2020_all.Nurseryclass.Unit1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanskriti_2020_all.R;

public class Nursery_numeracy1n_home extends AppCompatActivity {
    ImageView act_1n,act_2n,act_3n,act_4n,return_activity;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nursery_numeracy1n_home);


        act_1n=findViewById(R.id.act_1);
        act_1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Nursery_numeracy1n_home.this, Nursery1_Quantity.class);
                startActivity(intent);
            }
        } );


        act_2n=findViewById(R.id.act_2);
        act_2n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Nursery_numeracy1n_home.this, Nursery1_numeral1_2.class);
                startActivity(intent);
            }
        } );

        act_3n=findViewById(R.id. act_3);
        act_3n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Nursery_numeracy1n_home.this, Nursery1__route_onetoten.class);
                 //Toast.makeText(Nursery_numeracy1n_home.this, "Will be updated soon", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        } );

        act_4n=findViewById(R.id.act_4);
        act_4n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(Nursery_numeracy1n_home.this, Nursery_themes_home.class);
                Toast.makeText(Nursery_numeracy1n_home.this, "Will be updated soon", Toast.LENGTH_SHORT).show();
               // startActivity(intent);
            }
        } );


        return_activity = findViewById(R.id.return_activity);
        return_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Nursery_numeracy1n_home.this, Nursery_themes_home.class);
                startActivity(intent);
            }
        });



    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}

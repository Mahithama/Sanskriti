package com.example.sanskriti_2020_all.Nurseryclass.Unit6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanskriti_2020_all.R;

public class Unit6_nursery_literacy_home extends AppCompatActivity {
    ImageView act_1n,act_2n,act_3n,act_4n,return_activity;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit6_nursery_literacy_home);
        act_1n=findViewById(R.id.act_1);
        act_1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Unit6_nursery_literacy_home.this, Q_alpha.class);
                startActivity(intent);
            }
        } );


        act_2n=findViewById(R.id.act_2);
        act_2n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(Unit6_nursery_literacy_home.this, "Will be updated soon", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Unit6_nursery_literacy_home.this, U_alphabet.class);
                startActivity(intent);
            }
        } );

        act_3n=findViewById(R.id. act_3);
        act_3n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Unit6_nursery_literacy_home.this, W_alphabet.class);
                startActivity(intent);
               // Toast.makeText(Unit6_nursery_literacy_home.this, "Will be updated soon", Toast.LENGTH_SHORT).show();

            }
        } );

        act_4n=findViewById(R.id.act_4);
        act_4n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Unit6_nursery_literacy_home.this, Z_alphabet.class);
                startActivity(intent);
              //  Toast.makeText(Unit6_nursery_literacy_home.this, "Will be updated soon", Toast.LENGTH_SHORT).show();

            }
        } );


        return_activity = findViewById(R.id.return_activity);
        return_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Unit6_nursery_literacy_home.this, Unit6home.class);
                startActivity(intent);
            }
        });



    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}

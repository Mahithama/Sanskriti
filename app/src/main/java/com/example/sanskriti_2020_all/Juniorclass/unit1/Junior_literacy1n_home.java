package com.example.sanskriti_2020_all.Juniorclass.unit1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.sanskriti_2020_all.R;


public class Junior_literacy1n_home extends AppCompatActivity {
    ImageView act_1jl,act_2jl,act_3jl,act_4jl,return_activity;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junior_literacy1n_home);
        act_1jl=findViewById(R.id.act_1);
        act_1jl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Junior_literacy1n_home.this, Junior1_magicwords.class);
                startActivity(intent);
            }
        } );


        act_2jl=findViewById(R.id.act_2);
        act_2jl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Junior_literacy1n_home.this, Junior1_beginingsounds.class);
                startActivity(intent);
            }
        } );

        act_3jl=findViewById(R.id. act_3);
        act_3jl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Junior_literacy1n_home.this,Junior1__emotions.class);
                // Toast.makeText(Nursery_unit_one.this, "No Numeracy activities", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        } );

        act_4jl=findViewById(R.id.act_4);
        act_4jl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Junior_literacy1n_home.this, Junior1_animalhouse_cover.class);
                startActivity(intent);
            }
        } );


        return_activity = findViewById(R.id.return_activity);
        return_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Junior_literacy1n_home.this, Juniorkg_Home.class);
                startActivity(intent);
            }
        });



    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}

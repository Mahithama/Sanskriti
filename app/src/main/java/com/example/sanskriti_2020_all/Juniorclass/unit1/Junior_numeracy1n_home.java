package com.example.sanskriti_2020_all.Juniorclass.unit1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.sanskriti_2020_all.R;


public class Junior_numeracy1n_home extends AppCompatActivity {
    ImageView act_1jn,act_2jn,act_3jn,act_4jn,return_activity;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junior_numeracy1n_home);
        act_1jn=findViewById(R.id.act_1);
        act_1jn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent=new Intent(Junior_numeracy1n_home.this, Nursery_themes_home.class);
                //startActivity(intent);
                Toast.makeText(Junior_numeracy1n_home.this, "No Numeracy activities", Toast.LENGTH_SHORT).show();
            }
        } );


        act_2jn=findViewById(R.id.act_2);
        act_2jn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(Junior_numeracy1n_home.this, Nursery_themes_home.class);
                Toast.makeText(Junior_numeracy1n_home.this, "No Numeracy activities", Toast.LENGTH_SHORT).show();
               // startActivity(intent);
            }
        } );

        act_3jn=findViewById(R.id. act_3);
        act_3jn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent=new Intent(Junior_numeracy1n_home.this,Nursery_themes_home.class);
                Toast.makeText(Junior_numeracy1n_home.this, "No Numeracy activities", Toast.LENGTH_SHORT).show();
              //  startActivity(intent);
            }
        } );

        act_4jn=findViewById(R.id.act_4);
        act_4jn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent=new Intent(Junior_numeracy1n_home.this, Nursery_themes_home.class);
                //startActivity(intent);
                Toast.makeText(Junior_numeracy1n_home.this, "No Numeracy activities", Toast.LENGTH_SHORT).show();
            }
        } );


        return_activity = findViewById(R.id.return_activity);
        return_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Junior_numeracy1n_home.this, Juniorkg_Home.class);
                startActivity(intent);
            }
        });



    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}

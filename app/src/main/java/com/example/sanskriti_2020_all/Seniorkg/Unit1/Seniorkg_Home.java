package com.example.sanskriti_2020_all.Seniorkg.Unit1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanskriti_2020_all.MainActivity;
import com.example.sanskriti_2020_all.R;


public class Seniorkg_Home extends AppCompatActivity {
    ImageView unit1n,unit2n,unit3n,unit4n,unit5n,logoutn;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seniorkg__home2);
        unit1n=findViewById(R.id.unit1);
        unit1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Seniorkg_Home.this, Senior1_themes_home.class);
                startActivity(intent);
            }
        } );


        unit2n=findViewById(R.id.unit2);
        unit2n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent=new Intent(Seniorkg_Home.this, Nursery_themes_home.class);
                Toast.makeText(Seniorkg_Home.this, "will be updated soon", Toast.LENGTH_SHORT).show();
                //startActivity(intent);
            }
        } );

        unit3n=findViewById(R.id.unit3);
        unit3n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(Seniorkg_Home.this,Nursery_themes_home.class);
                 Toast.makeText(Seniorkg_Home.this, "will be updated soon", Toast.LENGTH_SHORT).show();
                ///startActivity(intent);
            }
        } );

        unit4n=findViewById(R.id.unit4);
        unit4n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Intent intent=new Intent(Seniorkg_Home.this, Nursery_themes_home.class);
               // startActivity(intent);
                Toast.makeText(Seniorkg_Home.this, "will be updated soon", Toast.LENGTH_SHORT).show();
            }
        } );

        unit5n=findViewById(R.id.unit5);
        unit5n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(Seniorkg_Home.this,Nursery_themes_home.class);
                Toast.makeText(Seniorkg_Home.this, "will be updated soon", Toast.LENGTH_SHORT).show();
               // startActivity(intent);
            }
        } );




        logoutn = findViewById(R.id.logout_icon);
        logoutn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Seniorkg_Home.this, MainActivity.class);
                startActivity(intent);
            }
        });



    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}

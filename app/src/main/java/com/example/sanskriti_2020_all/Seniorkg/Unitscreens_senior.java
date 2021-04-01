package com.example.sanskriti_2020_all.Seniorkg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.sanskriti_2020_all.Juniorclass.Unitscreen_junior;
import com.example.sanskriti_2020_all.Juniorclass.unit1.Juniorkg_Home;
import com.example.sanskriti_2020_all.Juniorclass.unit2.ju2_home;
import com.example.sanskriti_2020_all.Juniorclass.unit3.ju3_home;
import com.example.sanskriti_2020_all.Juniorclass.unit4.unit4_home;
import com.example.sanskriti_2020_all.Juniorclass.unit5.ju5_home;
import com.example.sanskriti_2020_all.Juniorclass.unit6.ju6_home;
import com.example.sanskriti_2020_all.Juniorclass.unit7.ju7_home;
import com.example.sanskriti_2020_all.MainActivity;
import com.example.sanskriti_2020_all.R;
import com.example.sanskriti_2020_all.Seniorkg.Unit1.Senior1_themes_home;
import com.example.sanskriti_2020_all.Seniorkg.Unit2.unit2_home;
import com.example.sanskriti_2020_all.Seniorkg.Unit3.Sn3_home;
import com.example.sanskriti_2020_all.Seniorkg.Unit4.Sn4_home;
import com.example.sanskriti_2020_all.Seniorkg.Unit5.Sn5_home;
import com.example.sanskriti_2020_all.Seniorkg.Unit6.Sn6_home;

public class Unitscreens_senior extends AppCompatActivity {
    ImageView unit1n,unit2n,unit3n,unit4n,unit5n,unit6n,unit7n,logoutn;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unitscreens_senior);
        unit1n=findViewById(R.id.unit1);
        unit1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Unitscreens_senior.this, Senior1_themes_home.class);
                startActivity(intent);
            }
        } );


        unit2n=findViewById(R.id.unit2);
        unit2n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Unitscreens_senior.this, unit2_home.class);
                startActivity(intent);
                //Toast.makeText(Unitscreens_nursery.this, "No Numeracy activities", Toast.LENGTH_SHORT).show();

            }
        } );

        unit3n=findViewById(R.id.unit3);
        unit3n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Unitscreens_senior.this, Sn3_home.class);
                startActivity(intent);
                //Toast.makeText(Unitscreens_nursery.this, "No Numeracy activities", Toast.LENGTH_SHORT).show();
            }
        } );

        unit4n=findViewById(R.id.unit4);
        unit4n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Unitscreens_senior.this, Sn4_home.class);
                startActivity(intent);
                //Toast.makeText(Unitscreens_nursery.this, "No Numeracy activities", Toast.LENGTH_SHORT).show();
            }
        } );

        unit5n=findViewById(R.id.unit5);
        unit5n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Unitscreens_senior.this, Sn5_home.class);
                startActivity(intent);
                // Toast.makeText(Unitscreens_nursery.this, "No Numeracy activities", Toast.LENGTH_SHORT).show();
            }
        } );

        unit6n=findViewById(R.id.unit6);
        unit6n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Unitscreens_senior.this, Sn6_home.class);
                startActivity(intent);
                //Toast.makeText(Nursery_unit_one.this, "No Numeracy activities", Toast.LENGTH_SHORT).show();
            }
        } );

        unit7n=findViewById(R.id.unit7);
        unit7n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent=new Intent(Unitscreens_senior.this, Sn7_home.class);
               // startActivity(intent);
                Toast.makeText(Unitscreens_senior.this, "Will be updated soon", Toast.LENGTH_SHORT).show();
            }
        } );




        logoutn = findViewById(R.id.logout_icon);
        logoutn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Unitscreens_senior.this, MainActivity.class);
                startActivity(intent);
            }
        });



    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}

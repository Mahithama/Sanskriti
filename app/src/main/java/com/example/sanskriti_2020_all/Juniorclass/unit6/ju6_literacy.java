package com.example.sanskriti_2020_all.Juniorclass.unit6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.sanskriti_2020_all.Juniorclass.unit3.Ju3_theme_activities;
import com.example.sanskriti_2020_all.Juniorclass.unit3.ju3_senses;
import com.example.sanskriti_2020_all.Juniorclass.unit3.ju3_themes;
import com.example.sanskriti_2020_all.R;

public class ju6_literacy extends AppCompatActivity {
    ImageView act_1n1t,act_2n1t,act_3n1t,act_4n1t,return_activity;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ju6_literacy);
        act_1n1t=findViewById(R.id.act_1);
        act_1n1t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ju6_literacy.this, Short_a_sounds.class);
                startActivity(intent);
            }
        } );


        act_2n1t=findViewById(R.id.act_2);
        act_2n1t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent=new Intent(ju6_literacy.this, Short_e_sounds.class);
               startActivity(intent);
                //Toast.makeText(ju6_literacy.this, "No more activities", Toast.LENGTH_SHORT).show();
            }
        } );

        act_3n1t=findViewById(R.id. act_3);
        act_3n1t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ju6_literacy.this,Short_i_sounds.class);
                //Toast.makeText(ju6_literacy.this, "No more activities", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        } );

        act_4n1t=findViewById(R.id.act_4);
        act_4n1t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ju6_literacy.this, Short_o_sounds.class);
                //Toast.makeText(ju6_literacy.this, "No more activitiesn", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        } );


        return_activity = findViewById(R.id.return_activity);
        return_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ju6_literacy.this, ju6_home.class);
                startActivity(intent);
            }
        });



    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}

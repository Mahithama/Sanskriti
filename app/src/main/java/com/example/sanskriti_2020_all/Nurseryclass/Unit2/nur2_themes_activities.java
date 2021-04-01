package com.example.sanskriti_2020_all.Nurseryclass.Unit2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.sanskriti_2020_all.Nurseryclass.Unit1.Nursery_Shapes;
import com.example.sanskriti_2020_all.Nurseryclass.Unit1.Nursery_Spot_cover;
import com.example.sanskriti_2020_all.Nurseryclass.Unit1.Nursery_activitiess_home;
import com.example.sanskriti_2020_all.Nurseryclass.Unit1.Nursery_themes1n_home;
import com.example.sanskriti_2020_all.R;

public class nur2_themes_activities extends AppCompatActivity {
    ImageView act_1n1t,act_2n1t,act_3n1t,act_4n1t,return_activity;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nur2_themes_activities);
        act_1n1t=findViewById(R.id.act_1);
        act_1n1t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(nur2_themes_activities.this, Shapes1.class);
                startActivity(intent);
            }
        } );


        act_2n1t=findViewById(R.id.act_2);
        act_2n1t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(nur2_themes_activities.this, Nursery_Spot_cover.class);
                //startActivity(intent);
                Toast.makeText(nur2_themes_activities.this, "Will be updated soon", Toast.LENGTH_SHORT).show();
            }
        } );

        act_3n1t=findViewById(R.id. act_3);
        act_3n1t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent=new Intent(Nursery_activitiess_home.this,Nursery_themes_home.class);
                Toast.makeText(nur2_themes_activities.this, "Will be updated soon", Toast.LENGTH_SHORT).show();
                // startActivity(intent);
            }
        } );

        act_4n1t=findViewById(R.id.act_4);
        act_4n1t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(Nursery_activitiess_home.this, Nursery_themes_home.class);
                Toast.makeText(nur2_themes_activities.this, "Will be updated soon", Toast.LENGTH_SHORT).show();
                // startActivity(intent);
            }
        } );


        return_activity = findViewById(R.id.return_activity);
        return_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(nur2_themes_activities.this, nur2_home.class);
                startActivity(intent);
            }
        });



    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}

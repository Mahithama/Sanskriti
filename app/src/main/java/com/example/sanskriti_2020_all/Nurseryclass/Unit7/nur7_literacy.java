package com.example.sanskriti_2020_all.Nurseryclass.Unit7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.sanskriti_2020_all.Nurseryclass.Unit6.Q_alpha;
import com.example.sanskriti_2020_all.Nurseryclass.Unit6.U_alphabet;
import com.example.sanskriti_2020_all.Nurseryclass.Unit6.Unit6_nursery_literacy_home;
import com.example.sanskriti_2020_all.Nurseryclass.Unit6.Unit6home;
import com.example.sanskriti_2020_all.Nurseryclass.Unit6.W_alphabet;
import com.example.sanskriti_2020_all.Nurseryclass.Unit6.Z_alphabet;
import com.example.sanskriti_2020_all.R;

public class nur7_literacy extends AppCompatActivity {
    ImageView act_1n,act_2n,act_3n,act_4n,return_activity;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nur7_literacy);
        act_1n=findViewById(R.id.act_1);
        act_1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(nur7_literacy.this, V_alphabet.class);
                startActivity(intent);
            }
        } );


        act_2n=findViewById(R.id.act_2);
        act_2n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(Unit6_nursery_literacy_home.this, "Will be updated soon", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(nur7_literacy.this, X_alphabet.class);
                startActivity(intent);
            }
        } );

        act_3n=findViewById(R.id. act_3);
        act_3n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(nur7_literacy.this, Y_alphabet.class);
                startActivity(intent);
                // Toast.makeText(Unit6_nursery_literacy_home.this, "Will be updated soon", Toast.LENGTH_SHORT).show();

            }
        } );

        act_4n=findViewById(R.id.act_4);
        act_4n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(nur7_literacy.this, Z_alphabet.class);
                //startActivity(intent);
                Toast.makeText(nur7_literacy.this, "Will be updated soon", Toast.LENGTH_SHORT).show();

            }
        } );


        return_activity = findViewById(R.id.return_activity);
        return_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(nur7_literacy.this, nur7_home.class);
                startActivity(intent);
            }
        });



    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}

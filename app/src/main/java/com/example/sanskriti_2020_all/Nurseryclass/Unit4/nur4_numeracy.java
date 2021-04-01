package com.example.sanskriti_2020_all.Nurseryclass.Unit4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.sanskriti_2020_all.Nurseryclass.Unit1.Nursery_themes1n_home;
import com.example.sanskriti_2020_all.Nurseryclass.Unit2.A_alphabet;
import com.example.sanskriti_2020_all.Nurseryclass.Unit2.S_alphabet;
import com.example.sanskriti_2020_all.Nurseryclass.Unit2.T_alphabet;
import com.example.sanskriti_2020_all.Nurseryclass.Unit2.nur2_literacy;
import com.example.sanskriti_2020_all.R;

public class nur4_numeracy extends AppCompatActivity {
    ImageView act_1n1t,act_2n1t,act_3n1t,act_4n1t,return_activity;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nur4_numeracy);
        act_1n1t=findViewById(R.id.act_1);
        act_1n1t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(nur4_numeracy.this, Nur_count.class);
                //startActivity(intent);
                Toast.makeText(nur4_numeracy.this, "Will be updated soon", Toast.LENGTH_SHORT).show();
            }
        } );


        act_2n1t=findViewById(R.id.act_2);
        act_2n1t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(nur4_numeracy.this, S_alphabet.class);
                //startActivity(intent);
                Toast.makeText(nur4_numeracy.this, "Will be updated soon", Toast.LENGTH_SHORT).show();
            }
        } );

        act_3n1t=findViewById(R.id. act_3);
        act_3n1t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(nur4_numeracy.this, T_alphabet.class);
               Toast.makeText(nur4_numeracy.this, "Will be updated soon", Toast.LENGTH_SHORT).show();
               // startActivity(intent);
            }
        } );

        act_4n1t=findViewById(R.id.act_4);
        act_4n1t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(Nursery_activitiess_home.this, Nursery_themes_home.class);
                Toast.makeText(nur4_numeracy.this, "Will be updated soon", Toast.LENGTH_SHORT).show();
                // startActivity(intent);
            }
        } );


        return_activity = findViewById(R.id.return_activity);
        return_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(nur4_numeracy.this, nur4_home.class);
                startActivity(intent);
            }
        });



    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }
}

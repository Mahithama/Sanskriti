package com.example.sanskriti_2020_all.Juniorclass.unit1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.sanskriti_2020_all.Juniorclass.Unitscreen_junior;
import com.example.sanskriti_2020_all.MainActivity;
import com.example.sanskriti_2020_all.R;



public class Junior1_themes_Home extends AppCompatActivity {
    ImageView n_home,n_logout,n_back,n_act_but,n_stories_but;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junior1_themes__home);
        n_act_but=findViewById(R.id.act_jbut);
        n_act_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Junior1_themes_Home.this, Junior_themes1n_home.class);
                startActivity(intent);

            }
        } );



        n_stories_but=findViewById(R.id.stories_jbut);
        n_stories_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Junior1_themes_Home.this, Junior_stories_home.class);
                startActivity(intent);
            }
        } );

        n_home=findViewById(R.id.home_icon);
        n_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Junior1_themes_Home.this, Unitscreen_junior.class);
                startActivity(intent);
            }
        } );

        n_logout=findViewById(R.id.logout_icon);
        n_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Junior1_themes_Home.this, MainActivity.class);
                startActivity(intent);
            }
        } );

        n_back=findViewById(R.id.back_icon);
        n_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Junior1_themes_Home.this, Juniorkg_Home.class);
                startActivity(intent);
            }
        } );
    }
    public void onBackPressed() {
        // super.onBackPressed();
        return;
    }

}

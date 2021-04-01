package com.example.sanskriti_2020_all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sanskriti_2020_all.Juniorclass.Unitscreen_junior;
import com.example.sanskriti_2020_all.Nurseryclass.Unitscreens_nursery;
import com.example.sanskriti_2020_all.Seniorkg.Unitscreens_senior;

public class MainActivity extends AppCompatActivity {
    EditText sans_user, sans_pwd ;
    Button sans_go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sans_user = findViewById(R.id.sans_user);
        sans_pwd = findViewById(R.id.sans_pwd);
        sans_go = findViewById(R.id.sans_go);

        sans_go=findViewById(R.id.sans_go);
        sans_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              /*if (isConnected()) {
                    Toast.makeText(getApplicationContext(), "Internet Connected", Toast.LENGTH_SHORT).show(); */


                if (sans_user.getText().toString().equals("Sanskriti") && sans_pwd.getText().toString().equals("nursery")) {


                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();


                    startActivity(new Intent(MainActivity.this, Unitscreens_nursery.class));
                    finish();

                } else if (sans_user.getText().toString().equals("Sanskriti") && sans_pwd.getText().toString().equals("playgroup")) {


                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();

             // startActivity(new Intent(MainActivity.this, Playgroup_Home.class));
                 // finish();

                }

                else if (sans_user.getText().toString().equals("Sanskriti") && sans_pwd.getText().toString().equals("seniorkg")) {


                    Toast.makeText(MainActivity.this, "Login Successful to seniorkg", Toast.LENGTH_SHORT).show();

                    startActivity(new Intent(MainActivity.this, Unitscreens_senior.class));
                    finish();

                }
                else if (sans_user.getText().toString().equals("Sanskriti") && sans_pwd.getText().toString().equals("juniorkg")) {


                    Toast.makeText(MainActivity.this, "Login Successful fot juniorkg", Toast.LENGTH_SHORT).show();


                    startActivity(new Intent(MainActivity.this, Unitscreen_junior.class));
                    finish();

                }



                else {
                    Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();

                }


               /*}

                else {
                    Toast.makeText(getApplicationContext(), "No Internet Connection", Toast.LENGTH_SHORT).show();
                } */

            }

        });

    }


  /*public boolean isConnected() {
        boolean connected = false;
        try{
            ConnectivityManager cm = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo netinfo = cm.getActiveNetworkInfo();
            connected = netinfo != null && netinfo.isAvailable() && netinfo.isConnected();
            return connected;
        }
        catch (Exception e){
            Log.e("Connectivity Exception", e.getMessage());
        }
        return connected;
    } */

    public void onBackPressed() {
        return;
    }


}
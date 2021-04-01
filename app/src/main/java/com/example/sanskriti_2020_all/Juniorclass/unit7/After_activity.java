package com.example.sanskriti_2020_all.Juniorclass.unit7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sanskriti_2020_all.Nurseryclass.Unitscreens_nursery;
import com.example.sanskriti_2020_all.R;

public class After_activity extends AppCompatActivity {
    EditText a7, a13,a17,a19,a3,a20 ;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_activity);
        a7 = findViewById(R.id.a7);
        a13 = findViewById(R.id.a13);
        a17 = findViewById(R.id.a17);
        a19 = findViewById(R.id.a19);
        a3 = findViewById(R.id.a3);
        a20 = findViewById(R.id.a20);

        next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              /*if (isConnected()) {
                    Toast.makeText(getApplicationContext(), "Internet Connected", Toast.LENGTH_SHORT).show(); */


                if (a7.getText().toString().equals("7") && a13.getText().toString().equals("13") &&
                        a17.getText().toString().equals("17") && a19.getText().toString().equals("19") &&
                        a3.getText().toString().equals("3") && a20.getText().toString().equals("20") ) {


                    Toast.makeText(After_activity.this, "Correct answers", Toast.LENGTH_SHORT).show();


                    startActivity(new Intent(After_activity.this, ju7_numeracy.class));
                    finish();

                }
                else {
                    Toast.makeText(getApplicationContext(), "Check your answers", Toast.LENGTH_SHORT).show();

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
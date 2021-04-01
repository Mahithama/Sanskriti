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

public class Before_numbers extends AppCompatActivity {
    EditText a4, a11,a15,a14,a8,a19 ;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before_numbers);
        a4 = findViewById(R.id.a4);
        a14 = findViewById(R.id.a14);
        a11 = findViewById(R.id.a11);
        a15 = findViewById(R.id.a15);
        a8 = findViewById(R.id.a8);
        a19 = findViewById(R.id.a19);

        next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              /*if (isConnected()) {
                    Toast.makeText(getApplicationContext(), "Internet Connected", Toast.LENGTH_SHORT).show(); */


                if (a4.getText().toString().equals("4") && a14.getText().toString().equals("14") &&
                        a8.getText().toString().equals("8") && a15.getText().toString().equals("15") &&
                        a14.getText().toString().equals("14") && a19.getText().toString().equals("19") ) {


                    Toast.makeText(Before_numbers.this, "Correct answers", Toast.LENGTH_SHORT).show();


                    startActivity(new Intent(Before_numbers.this, ju7_numeracy.class));
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
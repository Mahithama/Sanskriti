package com.example.sanskriti_2020_all.Juniorclass.unit7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sanskriti_2020_all.MainActivity;
import com.example.sanskriti_2020_all.Nurseryclass.Unitscreens_nursery;
import com.example.sanskriti_2020_all.R;

public class Missing_numbers extends AppCompatActivity {
    EditText a3, a5,a8,a10,a14,a16,a18,a20,a22,a23;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_missing_numbers);

        a3 = findViewById(R.id.a3);
        a5 = findViewById(R.id.a5);
        a8 = findViewById(R.id.a8);
        a10 = findViewById(R.id.a10);
        a14 = findViewById(R.id.a14);
        a16 = findViewById(R.id.a16);
        a18 = findViewById(R.id.a18);
        a20 = findViewById(R.id.a20);
        a22 = findViewById(R.id.a22);
        a23 = findViewById(R.id.a23);


        next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              /*if (isConnected()) {
                    Toast.makeText(getApplicationContext(), "Internet Connected", Toast.LENGTH_SHORT).show(); */


                if (a3.getText().toString().equals("3") && a5.getText().toString().equals("5") &&
                        a8.getText().toString().equals("8") && a10.getText().toString().equals("10") &&
                        a14.getText().toString().equals("14") && a16.getText().toString().equals("16") &&
                        a18.getText().toString().equals("18") && a20.getText().toString().equals("20") &&
                        a22.getText().toString().equals("22") && a23.getText().toString().equals("23") ) {


                    Toast.makeText(Missing_numbers.this, "Correct answers", Toast.LENGTH_SHORT).show();


                    startActivity(new Intent(Missing_numbers.this, ju7_numeracy.class));
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
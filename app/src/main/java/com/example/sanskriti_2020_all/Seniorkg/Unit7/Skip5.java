package com.example.sanskriti_2020_all.Seniorkg.Unit7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sanskriti_2020_all.Juniorclass.unit7.ju7_numeracy;
import com.example.sanskriti_2020_all.R;

public class Skip5 extends AppCompatActivity {
    EditText a2, a4,a6,a8,a10,a12,a14,a16,a18,a20,
            a22, a24,a26,a28,a30,a32,a34,a36,a38,a40,a42, a44,a46;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skip5);
        a2 = findViewById(R.id.a2);
        a4 = findViewById(R.id.a4);
        a6 = findViewById(R.id.a6);
        a8 = findViewById(R.id.a8);
        a10 = findViewById(R.id.a10);
        a12 = findViewById(R.id.a12);
        a14 = findViewById(R.id.a14);
        a16 = findViewById(R.id.a16);
        a18 = findViewById(R.id.a18);
        a20 = findViewById(R.id.a20);
        a22 = findViewById(R.id.a22);
        a24 = findViewById(R.id.a24);
        a26 = findViewById(R.id.a26);
        a28 = findViewById(R.id.a28);
        a30 = findViewById(R.id.a30);
        a32 = findViewById(R.id.a32);
        a34 = findViewById(R.id.a34);
        a36 = findViewById(R.id.a36);
        a38 = findViewById(R.id.a38);
        a40 = findViewById(R.id.a40);
        a42 = findViewById(R.id.a42);
        a44 = findViewById(R.id.a44);
        a46 = findViewById(R.id.a46);



        next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              /*if (isConnected()) {
                    Toast.makeText(getApplicationContext(), "Internet Connected", Toast.LENGTH_SHORT).show(); */


                if (a2.getText().toString().equals("5") && a4.getText().toString().equals("10") &&
                        a8.getText().toString().equals("15") && a10.getText().toString().equals("20") && a12.getText().toString().equals("25") &&
                        a14.getText().toString().equals("30") && a16.getText().toString().equals("35") &&
                        a18.getText().toString().equals("40") && a20.getText().toString().equals("45") &&
                        a22.getText().toString().equals("50") && a24.getText().toString().equals("55") &&
                        a26.getText().toString().equals("60") && a28.getText().toString().equals("65") && a30.getText().toString().equals("70") &&
                        a32.getText().toString().equals("75") && a34.getText().toString().equals("34") && a36.getText().toString().equals("80") &&
                        a38.getText().toString().equals("85") && a40.getText().toString().equals("90") && a42.getText().toString().equals("95") &&
                        a44.getText().toString().equals("100") && a46.getText().toString().equals("105") ) {


                    Toast.makeText(Skip5.this, "Correct answers", Toast.LENGTH_SHORT).show();


                    startActivity(new Intent(Skip5.this, Sn7_numeracy.class));
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
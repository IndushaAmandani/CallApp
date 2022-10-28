package com.example.callapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtName;
    EditText txtPayment;
    EditText txtPayDetails;
    EditText txtNumber;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = findViewById(R.id.txtName);
        txtPayment = findViewById(R.id.txtPayment);
        txtPayDetails = findViewById(R.id.txtPayDetails);
        txtNumber = findViewById(R.id.txtPhone);

        Intent payIntent = new Intent(this,PaymentActivity.class);
        Intent callint = new Intent();

    Button btnPayment = this.findViewById(R.id.btnPay2);
    Button btnDial = this.findViewById(R.id.btnDial);
    Button btnCall = this.findViewById(R.id.btnCall);

     btnPayment.setOnClickListener(new View.OnClickListener(){
         @Override
         public void onClick(View v){
             payIntent.setAction(Intent.ACTION_SEND);
             String value1 = txtName.getText().toString();
             String value2 = txtPayment.getText().toString();


            String value = value1 +"_"+ value2;
             payIntent.putExtra("details",value);
             startActivity(payIntent);
         }


    });

     btnDial.setOnClickListener(new View.OnClickListener(){

         public void onClick(View view){
             callint.setAction(Intent.ACTION_VIEW);
             callint.setData(Uri.parse("tel:"));
             startActivity(callint);
         }
     });
     btnCall.setOnClickListener(new View.OnClickListener(){

         public void onClick(View view){
             Intent callint = new Intent();
            String number = txtNumber.getText().toString();
             callint.setAction(Intent.ACTION_CALL);
             callint.setData(Uri.parse("tel:" + number));
             startActivity(callint);
         }
     });




    }

    @Override
    public void onStart(){
        super.onStart();
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("Status is on start");
        alert.show();

    }

    @Override
    public void onResume(){
        super.onResume();
        AlertDialog.Builder alert1 = new AlertDialog.Builder(this);
        alert1.setMessage("Status is onResume");
        alert1.show();

    }
    @Override
    public void onPause(){
        super.onPause();
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("Status is on pause");
        alert.show();


    }
    @Override
    public void onStop(){
        super.onStop();
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("Status is on onstop ");
        alert.show();

    }
    @Override
    public void onRestart(){
        super.onRestart();
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("Status is on onDRestart ");
        alert.show();

    }





}
package com.example.callapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class PaymentActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payement);


        EditText txtPayDetails = findViewById(R.id.txtPayDetails);

        String value = getIntent().getStringExtra("details");
        txtPayDetails.setText(value);
    }




}
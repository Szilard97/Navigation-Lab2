package com.example.navigationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonSingUp;
    private Button buttonRegister;
    private TextView nrCallValue;
    private TextView numberRegister;
    private Integer numberRegisterValueInteger = 0;
    private Integer nrCallValueInteger = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onclickListener();
    }

    private void onclickListener() {

        buttonRegister = findViewById(R.id.buttonRegister);
        buttonSingUp = findViewById(R.id.buttonSingUp);

        buttonSingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(getApplicationContext(), ProfileActivity.class), 2);
                //startActivity(new Intent(MainActivity.this, ProfileActivity.class));

            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(getApplicationContext(), RegisterActivity.class), 3);
                //startActivity(new Intent(MainActivity.this, RegisterActivity.class));


            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        nrCallValue = findViewById(R.id.NrCallValue);
        numberRegister = findViewById(R.id.numberRegisterValue);

        if (requestCode == 2 && resultCode == RESULT_OK) {

            nrCallValue.setText(data.getStringExtra("message"));

        }

        if  ( requestCode == 3 && resultCode == RESULT_OK) {

            numberRegister.setText(data.getStringExtra("message1"));
        }
    }

}

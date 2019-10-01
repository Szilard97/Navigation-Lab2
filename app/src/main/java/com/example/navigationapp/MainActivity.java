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
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));

            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        nrCallValue = findViewById(R.id.NrCallValue);
        numberRegister = findViewById(R.id.numberRegisterValue);


        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
                ++nrCallValueInteger;
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                //Write your code if there's no result
            }
        }

        nrCallValue.setText(nrCallValueInteger);
    }

}

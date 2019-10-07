package com.example.navigationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button buttonSingUp;
    private Button buttonRegister;
    private TextView nrCallValue;
    private TextView numberRegister;
    private static Integer nr3 = 0;
    private EditText firstName;
    private  EditText lastName;
    private ArrayList<Users> usersArrayList = new ArrayList<>();
    private Registered registered = new Registered();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usersArrayList = registered.getUsersArrayList();

        onclickListener();
    }

    private void onclickListener() {

        buttonRegister = findViewById(R.id.buttonRegister);
        buttonSingUp = findViewById(R.id.buttonSingUp);
        firstName = findViewById(R.id.editText);
        lastName = findViewById(R.id.editText2);


            buttonSingUp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    for (int i = 0; i< usersArrayList.size(); ++i){

                        if(firstName.getText().toString() == usersArrayList.get(i).getFirstName() &&
                        lastName.getText().toString() == usersArrayList.get(i).getLastName()){

                            startActivityForResult(new Intent(getApplicationContext(), ProfileActivity.class), 2);
                        }
                    }



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

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

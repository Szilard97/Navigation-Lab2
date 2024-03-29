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

public class RegisterActivity extends AppCompatActivity {

   private static Integer nr2 = 0;
    private EditText firstName ;
    private EditText lastName  ;
    private EditText departmentName ;
    private Button buttonRegisterRegister;
    private TextView nrCallOfSignIn;
    private TextView nrOfCallsFromProfileTextView;
    private TextView textViewBackDetalies;
    private String string;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        firstName = findViewById(R.id.firstNameIdRegister);
        lastName = findViewById(R.id.lastNameRegister);
        departmentName = findViewById(R.id.departmantRegister);
        buttonRegisterRegister = findViewById(R.id.buttonRegister);
        textViewBackDetalies = findViewById(R.id.textViewBackDetalies);

        onClickListener();
        textViewBackDetalies.setText(string);
    }



    public void onClickListener(){
        buttonRegisterRegister.setOnClickListener(new View.OnClickListener() {

           Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
            public void onClick(View v) {
                if(!firstName.getText().toString().isEmpty()){
                    intent.putExtra("FirstName" ,firstName.getText().toString());
                    //string += firstName.getText().toString();

                }else {
                    Toast.makeText(RegisterActivity.this, "First name is empty", Toast.LENGTH_SHORT).show();
                }
                if (!lastName.getText().toString().isEmpty()){
                    intent.putExtra("LastName", lastName.getText().toString());
                    //string += " " +  lastName.getText().toString();
                }else{
                    Toast.makeText(RegisterActivity.this, "Last name is empty", Toast.LENGTH_SHORT).show();
                }
                if (!departmentName.getText().toString().isEmpty()){
                    intent.putExtra("Department",departmentName.getText().toString());
                    //string += " " + departmentName.getText().toString();
                    startActivityForResult(intent, 1);
                }else {
                    Toast.makeText(RegisterActivity.this, "Department is empty", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        nrCallOfSignIn = findViewById(R.id.nrCallOfSignIn);
        nrOfCallsFromProfileTextView = findViewById(R.id.nrOfCallsFromProfileTextView);

        if (requestCode == 2 && resultCode == RESULT_OK) {

            nrCallOfSignIn.setText(data.getStringExtra("message"));

        }

        if  ( requestCode == 3 && resultCode == RESULT_OK) {

            nrOfCallsFromProfileTextView.setText(data.getStringExtra("message1"));
        }
    }

    @Override
    public void onBackPressed() {
        ++nr2;
        Intent returnIntent = new Intent();
        returnIntent.putExtra("message1",nr2.toString());
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }
}

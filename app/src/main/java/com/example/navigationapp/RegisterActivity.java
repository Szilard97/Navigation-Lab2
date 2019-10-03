package com.example.navigationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

   private static Integer nr2 = 0;
//    private EditText firstName = findViewById(R.id.firstNameIdRegister);
//    private EditText lastName = findViewById(R.id.lastNameRegister);
//    private EditText departmentName = findViewById(R.id.departmantRegister);
//    private Button buttonRegister = findViewById(R.id.buttonRegister);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        //onClickListener();
    }

//    public void onClickListener(){
//        buttonRegister.setOnClickListener(new View.OnClickListener() {
//            Intent intent = new Intent();
//            public void onClick(View v) {
//                if(!firstName.getText().toString().isEmpty()){
//                    intent.putExtra("FirstName" ,firstName.getText().toString());
//                }else {
//                    Toast.makeText(RegisterActivity.this, "First name is empty", Toast.LENGTH_SHORT);
//                }
//                if (!lastName.getText().toString().isEmpty()){
//                    intent.putExtra("LastName", lastName.getText().toString());
//                }else{
//                    Toast.makeText(RegisterActivity.this, "Last name is empty", Toast.LENGTH_SHORT);
//                }
//                if (!departmentName.getText().toString().isEmpty()){
//                    intent.putExtra("Department",departmentName.getText().toString());
//                }else {
//                    Toast.makeText(RegisterActivity.this, "department is empty", Toast.LENGTH_SHORT);
//                }
//            }
//        });
//    }

    @Override
    public void onBackPressed() {
        ++nr2;
        Intent returnIntent = new Intent();
        returnIntent.putExtra("message1",nr2.toString());
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }
}

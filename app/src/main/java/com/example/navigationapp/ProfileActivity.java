package com.example.navigationapp;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {

    private static Integer nr1= 0;
    /*public Users users;
    ArrayList <Users> usersArrayList = new ArrayList<>();
    private String firstName;
    private String lastName;
    private String department;
    private TextView firstNameview = findViewById(R.id.textViewFirstName);
    private TextView lastNameView = findViewById(R.id.textViewLastName);
    private TextView departmentView = findViewById(R.id.textViewDepartmantProfile);*/



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        //getData();
        //listElement();

    }

//    private void listElement() {
//        firstNameview.setText(firstName);
//        lastNameView.setText(lastName);
//        departmentView.setText(department);
//
//    }
//
//    private void getData() {
//        Intent intent = getIntent();
//        firstName = intent.getStringExtra("FirstName");
//        lastName = intent.getStringExtra("LastName");
//        department = intent.getStringExtra("Department");
//        users = new Users(firstName, lastName, department);
//        usersArrayList.add(users);
//    }
//
//
    @Override
    public void onBackPressed() {
        ++nr1;
        Intent returnIntent = new Intent();
        returnIntent.putExtra("message", nr1.toString());
        setResult(Activity.RESULT_OK,returnIntent);
        finish();

    }
}

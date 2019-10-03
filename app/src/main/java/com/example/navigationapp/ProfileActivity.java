package com.example.navigationapp;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {

    private static Integer nr1= 0;
    public Users users;
    ArrayList <Users> usersArrayList = new ArrayList<>();
    private String firstName;
    private String lastName;
    private String department;
    private TextView firstNameview;
    private TextView lastNameView;
    private TextView departmentView;
    private Button buttonBack;
    private TextView nrCall2Profile;
    private TextView nrCall3Profile;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getData();
        listElement();
        onclickListener();

    }

    private void onclickListener() {

        buttonBack = findViewById(R.id.buttonBackProfile);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(ProfileActivity.this, RegisterActivity.class), 1);
            }
        });
    }

    private void listElement() {

       firstNameview = findViewById(R.id.textViewFirstName);
       lastNameView = findViewById(R.id.textViewLastName);
       departmentView= findViewById(R.id.textViewDepartmantProfile);
       firstNameview.setText(users.getFirstName());
       lastNameView.setText(users.getLastName());
       departmentView.setText(users.getDepartment());

    }

    private void getData() {
        Intent intent = getIntent();
        firstName = intent.getStringExtra("FirstName");
        lastName = intent.getStringExtra("LastName");
        department = intent.getStringExtra("Department");
        users = new Users(firstName, lastName, department);
        usersArrayList.add(users);
    }


    @Override
    public void onBackPressed() {
        ++nr1;
        Intent returnIntent = new Intent();
        returnIntent.putExtra("message", nr1.toString());
        setResult(Activity.RESULT_OK,returnIntent);
        finish();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        nrCall2Profile = findViewById(R.id.nrCall2Profile);
        nrCall3Profile = findViewById(R.id.nrCall3Profile);

        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1 && resultCode == RESULT_OK) {

            nrCall2Profile.setText(data.getStringExtra("message"));

        }

        if  ( requestCode == 3 && resultCode == RESULT_OK) {

            nrCall3Profile.setText(data.getStringExtra("message1"));
        }
    }
}

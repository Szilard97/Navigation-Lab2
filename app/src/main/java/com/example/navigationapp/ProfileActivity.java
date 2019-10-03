package com.example.navigationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ProfileActivity extends AppCompatActivity {

    private static Integer nr1= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

    }

    @Override
    public void onBackPressed() {
        ++nr1;
        Intent returnIntent = new Intent();
        returnIntent.putExtra("message",nr1.toString());
        setResult(Activity.RESULT_OK,returnIntent);
        finish();

    }
}

package com.example.navigationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class RegisterActivity extends AppCompatActivity {

    private static Integer nr2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
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

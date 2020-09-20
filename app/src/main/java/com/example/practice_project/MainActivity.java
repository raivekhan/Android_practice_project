package com.example.practice_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void navigateToSecondScreen(View view) {
        Intent navigateIntent=new Intent(this, Main2Activity.class);
        startActivity(navigateIntent);
    }
}

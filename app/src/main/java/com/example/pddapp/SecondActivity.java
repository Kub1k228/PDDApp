package com.example.pddapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle arguments = getIntent().getExtras();
        String name = arguments.get("var_number").toString();


    }
    public void onClick(View view) {
        Intent intent =new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
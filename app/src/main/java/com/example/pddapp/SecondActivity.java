package com.example.pddapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
/**
 * second page activity
 * @author Luppov
 * @version 1.0
 * */
public class SecondActivity extends AppCompatActivity {


    @Override
    /**default onCreate get info from first page
     * @param savedInstanceState - info from bundle*/
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


    }
    /** onClick for button to switch page*/
    public void onClick(View view) {
        Intent intent =new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
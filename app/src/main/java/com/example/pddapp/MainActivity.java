package com.example.pddapp;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyApp";
    TextView textView;
    ImageView imageView;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        textView.setText(R.string.var1);


    }
    private void initUI (){
        textView = findViewById(R.id.textView4);
        button = findViewById(R.id.button11);
        imageView = findViewById(R.id.imageView);
    }
    public void onClick(View view) {
        Intent intent =new Intent(this,SecondActivity.class);
        intent.putExtra("var_number", "1");
        startActivity(intent);

    }
    ActivityResultLauncher<Intent> mStartForResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    Bundle arguments = getIntent().getExtras();
                    String name = arguments.get("Result").toString();
                }
            }
    );




}
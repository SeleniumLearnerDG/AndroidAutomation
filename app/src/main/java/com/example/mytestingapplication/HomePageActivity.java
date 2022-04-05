package com.example.mytestingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Intent intent= getIntent();
        String name= intent.getStringExtra(MainActivity.msg);
        TextView textView= findViewById(R.id.userName);
        textView.setText(name);
    }
}

package com.angela.pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView username = findViewById(R.id.tv_header_1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent intent = getIntent();
        String nama = intent.getStringExtra("username");
        username.setText("Hey, " + username +"!");
    }
}
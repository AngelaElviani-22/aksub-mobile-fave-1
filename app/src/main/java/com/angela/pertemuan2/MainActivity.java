package com.angela.pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText input_username= findViewById(R.id.tv_text_username);
        EditText input_password = findViewById(R.id.tv_text_password);
        Button login = findViewById(R.id.tv_button_login);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = input_username.getEditableText().toString();
                String password = input_password.getEditableText().toString();
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("username", username);
                startActivity(intent);
            }
        });
    }

}
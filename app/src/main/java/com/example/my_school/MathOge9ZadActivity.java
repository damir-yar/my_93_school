package com.example.my_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MathOge9ZadActivity extends AppCompatActivity {
    private Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_oge_9_zad);
        getSupportActionBar().hide();

        exit = findViewById(R.id.exit3);


        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathOge9ZadActivity.this, MathOgeActivity.class);
                startActivity(intent);
            }
        });


    }}
package com.example.my_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MathOge10ZadActivity extends AppCompatActivity {

    private Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_oge_10_zad);
        getSupportActionBar().hide();

        exit = findViewById(R.id.exit3);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathOge10ZadActivity.this, MathOgeActivity.class);
                startActivity(intent);
            }
        });
    }
}
package com.example.my_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MathOgeActivity extends AppCompatActivity {

    private Button exit;
    private Button zad1;
    private Button zad9;
    private Button zad10;
    private Button zad11;
    private Button zad14;
    private Button zad15;
    private Button zad16;
    private Button zad17;
    private Button zad22;
    private Button struktura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_oge);
        getSupportActionBar().hide();

        exit = findViewById(R.id.exit2);
        zad1 = findViewById(R.id.math_1_5_zad);
        zad9 = findViewById(R.id.math_9zad);
        zad22 = findViewById(R.id.math_22zad);
        zad10 = findViewById(R.id.math_10zad);
        zad11 = findViewById(R.id.math_11zad);
        zad14 = findViewById(R.id.math_14zad);
        zad15 = findViewById(R.id.math_15zad);
        zad16 = findViewById(R.id.math_16zad);
        zad17 = findViewById(R.id.math_17zad);
        struktura = findViewById(R.id.math_strukture);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathOgeActivity.this, MatOgeActivity.class);
                startActivity(intent);
            }
        });

        zad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathOgeActivity.this, MathOge1ZadActivity.class);
                startActivity(intent);
            }
        });

        zad9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathOgeActivity.this, MathOge9ZadActivity.class);
                startActivity(intent);
            }
        });

        zad10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathOgeActivity.this, MathOge10ZadActivity.class);
                startActivity(intent);
            }
        });

        zad11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathOgeActivity.this, MathOge11ZadActivity.class);
                startActivity(intent);
            }
        });

        zad14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathOgeActivity.this, MathOge14ZadActivity.class);
                startActivity(intent);
            }
        });

        zad15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathOgeActivity.this, MathOge15ZadActivity.class);
                startActivity(intent);
            }
        });

        zad16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathOgeActivity.this, MathOge16ZadActivity.class);
                startActivity(intent);
            }
        });

        zad17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathOgeActivity.this, MathOge17ZadActivity.class);
                startActivity(intent);
            }
        });

        zad22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathOgeActivity.this, MathOge22ZadActivity.class);
                startActivity(intent);
            }
        });

        struktura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathOgeActivity.this, OgeStrukturaActivity.class);
                startActivity(intent);
            }
        });
    }
}
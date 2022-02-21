package com.example.my_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MathOge1ZadActivity extends AppCompatActivity {

    private Button exit;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_oge_1_zad);
        getSupportActionBar().hide();

        exit = findViewById(R.id.exit3);
        text = findViewById(R.id.text6);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathOge1ZadActivity.this, MathOgeActivity.class);
                startActivity(intent);
            }
        });

        text.setText("Типы заданий 1-5:\n" +
                "\n" +
                "Листы бумаги\n" +
                "Участки\n" +
                "Шина\n" +
                "План местности\n" +
                "Тарифы\n" +
                "Печь\n" +
                "Квартира\n" +
                "Террасы\n" +
                "Зонт\n");
    }
}
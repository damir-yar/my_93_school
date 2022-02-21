package com.example.my_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MatAlgTenActivity extends AppCompatActivity {

    private Button exit;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mat_alg_ten);
        getSupportActionBar().hide();

        exit = findViewById(R.id.button13);
        text = findViewById(R.id.textView15);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MatAlgTenActivity.this, MatAlgebraActivity.class);
                startActivity(intent);
            }
        });

        text.setText("Здесь пока ничего нет!\n Но ты можешь исправить это!" + "\n" +
                "Создавай справочные материалы по любым темам по любому предмету за любой класс и отправляй на электорнную почту school93.techsup@gmail.com");
    }
}
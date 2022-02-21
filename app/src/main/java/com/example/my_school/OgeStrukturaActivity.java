package com.example.my_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OgeStrukturaActivity extends AppCompatActivity {

    private Button exit;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oge_struktura);
        getSupportActionBar().hide();

        exit = findViewById(R.id.exit3);
        text = findViewById(R.id.textViewStruk);


        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OgeStrukturaActivity.this, MathOgeActivity.class);
                startActivity(intent);
            }
        });

        text.setText("1 часть:\n" +
                "1-5 задание – Практическая математика\n" +
                "6 задание – Действия с числами\n" +
                "7 задание – Координатная прямая\n" +
                "8 задание – Преобразование выражений\n" +
                "9 задание – Уравнения\n" +
                "10 задание – Вероятность\n" +
                "11 задание – Графики функций\n" +
                "12 задание – Расчёт по формуле\n" +
                "13 задание – Неравенства\n" +
                "14 задание – Прогрессии\n" +
                "15 задание – Треугольники\n" +
                "16 задание – Окружности\n" +
                "17 задание – Многоугольники\n" +
                "18 задание – Фигуры на клеточках\n" +
                "19 задание – Утверждения\n" +
                "2 часть:\n" +
                "20 задание – Работа с выражениями\n" +
                "21 задание – Задача\n" +
                "22 задание – График функций\n" +
                "23 задание – Геометрическая задача на вычисление\n" +
                "24 задание – Геометрическая задача на доказательство\n" +
                "25 задание – Геометрическая задача повыш. ур. \n");
    }
}
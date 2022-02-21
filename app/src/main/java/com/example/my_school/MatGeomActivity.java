package com.example.my_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MatGeomActivity extends AppCompatActivity {

    private Button exit;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mat_geom);
        getSupportActionBar().hide();

        exit = findViewById(R.id.button12);
        text = findViewById(R.id.textView9);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MatGeomActivity.this, MaterialsActivity.class);
                startActivity(intent);
            }
        });

        text.setText("Здесь пока ничего нет!\n Но ты можешь исправить это!" + "\n" +
                "Создавай справочные материалы по любым темам по любому предмету за любой класс и отправляй на электорнную почту school93.techsup@gmail.com");
    }
}
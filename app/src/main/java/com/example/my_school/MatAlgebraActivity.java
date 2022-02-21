package com.example.my_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MatAlgebraActivity extends AppCompatActivity {

    private Button exit;
    private Button nine;
    private Button ten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mat_algebra);
        getSupportActionBar().hide();

        exit = findViewById(R.id.button9);
        nine = findViewById(R.id.nineClass);
        ten = findViewById(R.id.tenClass);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MatAlgebraActivity.this, MaterialsActivity.class);
                startActivity(intent);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MatAlgebraActivity.this, MatAlgNineActivity.class);
                startActivity(intent);
            }
        });

        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MatAlgebraActivity.this, MatAlgTenActivity.class);
                startActivity(intent);
            }
        });
    }
}
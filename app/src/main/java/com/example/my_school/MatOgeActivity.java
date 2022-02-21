package com.example.my_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MatOgeActivity extends AppCompatActivity {

    private Button exit;
    private Button math;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mat_oge);
        getSupportActionBar().hide();

        exit = findViewById(R.id.exit);
        math = findViewById(R.id.ogeMath);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MatOgeActivity.this, MaterialsActivity.class);
                startActivity(intent);
            }
        });

        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MatOgeActivity.this, MathOgeActivity.class);
                startActivity(intent);
            }
        });
    }
}
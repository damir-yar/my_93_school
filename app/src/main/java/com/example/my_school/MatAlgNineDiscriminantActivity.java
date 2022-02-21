package com.example.my_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MatAlgNineDiscriminantActivity extends AppCompatActivity {

    private Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mat_alg_nine_discriminant);
        getSupportActionBar().hide();

        exit = findViewById(R.id.button11);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MatAlgNineDiscriminantActivity.this, MatAlgNineActivity.class);
                startActivity(intent);
            }
        });
    }
}
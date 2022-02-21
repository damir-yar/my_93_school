package com.example.my_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MatAlgNineActivity extends AppCompatActivity {

    private Button exit;
    private Button discrim;
    private Button kvadrf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mat_alg_nine);
        getSupportActionBar().hide();

        exit = findViewById(R.id.button10);
        discrim = findViewById(R.id.discriminant);
        kvadrf = findViewById(R.id.kvadratichf);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MatAlgNineActivity.this, MatAlgebraActivity.class);
                startActivity(intent);
            }
        });

        discrim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MatAlgNineActivity.this, MatAlgNineDiscriminantActivity.class);
                startActivity(intent);
            }
        });

        kvadrf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MatAlgNineActivity.this, MatAlgNineKvadrfuncActivity.class);
                startActivity(intent);
            }
        });
    }
}
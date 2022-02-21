package com.example.my_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MaterialsActivity extends AppCompatActivity {

    private Button menu;
    private Button newsMenu;
    private Button distMenu;
    private Button mainMenu;
    private Button about;
    private Button mat;
    private Button oge;
    private ImageView menuIm;
    private Integer menuOnOff = 0;


    private Button algebra;
    private Button geometric;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materials);
        getSupportActionBar().hide();

        menu = findViewById(R.id.menu);
        newsMenu = findViewById(R.id.button3);
        distMenu = findViewById(R.id.button4);
        mainMenu = findViewById(R.id.button5);
        about = findViewById(R.id.button6);
        mat = findViewById(R.id.button8);
        oge = findViewById(R.id.mat_oge);
        menuIm = findViewById(R.id.imageView2);
        menuIm.setVisibility(View.INVISIBLE);
        newsMenu.setVisibility(View.INVISIBLE);
        distMenu.setVisibility(View.INVISIBLE);
        mainMenu.setVisibility(View.INVISIBLE);
        about.setVisibility(View.INVISIBLE);
        mat.setVisibility(View.INVISIBLE);


        algebra = findViewById(R.id.mat_algebra);
        geometric = findViewById(R.id.mat_geometric);

        algebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MaterialsActivity.this, MatAlgebraActivity.class);
                startActivity(intent);
            }
        });
        geometric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MaterialsActivity.this, MatGeomActivity.class);
                startActivity(intent);
            }
        });
        oge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MaterialsActivity.this, MatOgeActivity.class);
                startActivity(intent);
            }
        });





        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                if (menuOnOff == 0) {
                    menuIm.setVisibility(View.VISIBLE);
                    newsMenu.setVisibility(View.VISIBLE);
                    distMenu.setVisibility(View.VISIBLE);
                    mainMenu.setVisibility(View.VISIBLE);
                    about.setVisibility(View.VISIBLE);
                    mat.setVisibility(View.VISIBLE);
                    algebra.setVisibility(View.INVISIBLE);
                    oge.setVisibility(View.INVISIBLE);
                    menuOnOff = 1;
                }
                else if (menuOnOff == 1) {
                    menuIm.setVisibility(View.INVISIBLE);
                    newsMenu.setVisibility(View.INVISIBLE);
                    distMenu.setVisibility(View.INVISIBLE);
                    mainMenu.setVisibility(View.INVISIBLE);
                    about.setVisibility(View.INVISIBLE);
                    mat.setVisibility(View.INVISIBLE);
                    algebra.setVisibility(View.VISIBLE);
                    oge.setVisibility(View.VISIBLE);
                    menuOnOff = 0;
                }

            }
        });

        newsMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MaterialsActivity.this, News.class);
                startActivity(intent);
            }
        });

        mainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MaterialsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        distMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MaterialsActivity.this, Dist.class);
                startActivity(intent);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MaterialsActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });

        mat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MaterialsActivity.this, MaterialsActivity.class);
                startActivity(intent);
            }
        });
    }
}
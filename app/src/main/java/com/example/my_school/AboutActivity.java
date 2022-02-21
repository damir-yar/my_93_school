package com.example.my_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    private Button menu;
    private Button newsMenu;
    private Button distMenu;
    private Button mainMenu;
    private Button about;
    private Button mat;
    private ImageView menuIm;
    private Integer menuOnOff = 0;

    private Button usl;
    private TextView text;
    private TextView version;

    private ScrollView sv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        menu = findViewById(R.id.menu);
        newsMenu = findViewById(R.id.button3);
        distMenu = findViewById(R.id.button4);
        mainMenu = findViewById(R.id.button5);
        about = findViewById(R.id.button6);
        mat = findViewById(R.id.button8);
        menuIm = findViewById(R.id.imageView2);
        sv = findViewById(R.id.sw2);
        menuIm.setVisibility(View.INVISIBLE);
        newsMenu.setVisibility(View.INVISIBLE);
        distMenu.setVisibility(View.INVISIBLE);
        mainMenu.setVisibility(View.INVISIBLE);
        about.setVisibility(View.INVISIBLE);
        mat.setVisibility(View.INVISIBLE);

        usl = findViewById(R.id.menu2);
        text = findViewById(R.id.textView2);
        version = findViewById(R.id.textView3);

        getSupportActionBar().hide();

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
                    sv.setVisibility(View.INVISIBLE);
                    menuOnOff = 1;
                }
                else if (menuOnOff == 1) {
                    menuIm.setVisibility(View.INVISIBLE);
                    newsMenu.setVisibility(View.INVISIBLE);
                    distMenu.setVisibility(View.INVISIBLE);
                    mainMenu.setVisibility(View.INVISIBLE);
                    about.setVisibility(View.INVISIBLE);
                    mat.setVisibility(View.INVISIBLE);
                    sv.setVisibility(View.VISIBLE);
                    menuOnOff = 0;
                }

            }
        });

        newsMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutActivity.this, News.class);
                startActivity(intent);
            }
        });

        mainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        distMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutActivity.this, Dist.class);
                startActivity(intent);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });

        mat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutActivity.this, MaterialsActivity.class);
                startActivity(intent);
            }
        });

        usl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutActivity.this, UslovActivity.class);
                startActivity(intent);
            }
        });


        text.setText("Это БЕТА-версия приложения. Отзывы, пожелания, информация о багах принимается на эллектронную почту school93.techsup@gmail.com.\n\n\n" +
                "Что нового в версии 1.4.3?\n" +
                "1. Исправлен баг с меню в разделе \"Справочник\".\n" +
                "2. Добалена возможность листать текст в разделе \"О проекте\".\n" +
                "3. Исправлен баг с меню в разделе \"О проекте\".\n" +
                "4. Исправлена проблема отображения 7 урока в пятницу.\n\n\n" +
                "Что нового в версии 1.4.2?\n" +
                "1. Исправлен баг с показаниями погоды на Главной старнице.\n" +
                "2. Исправлен баг: при первом запуске при нажатии кнопки \"Условия использования и политика конфиденциальности\" и нажатии кноки \"Назад\" показывался раздел \"О проекте\".\n\n\n" +
                "Что нового в версии 1.4.1?\n" +
                "1. Дополнены справочные материалы для подготовки к ОГЭ.\n" +
                "2. Исправлен баг: при первом запуске при нажатии кнопки \"Готово\" показывался экран с Условиями использования и Политикой конфиденциальности.\n\n\n" +
                "Что нового в версии 1.4?\n" +
                "1. Добавлен показатель температуры и скорости ветра на Главную страницу.\n" +
                "2. Добавлена возможность переключения между сокращённым и обычным расписанием звонков на Главной странице.\n" +
                "3. Добавлена информация об ученике и дате на Главной странице.\n" +
                "4. Показ задания для дистанционного обучения теперь происходит в браузере, а не в приложении.");

        version.setText("Версия 1.4.3");
    }
}
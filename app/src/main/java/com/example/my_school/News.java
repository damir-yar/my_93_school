package com.example.my_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

import java.util.concurrent.TimeUnit;

public class News extends AppCompatActivity {

    private Button menu;
    private Button newsMenu;
    private Button distMenu;
    private Button mainMenu;
    private Button about;
    private Button mat;
    private ImageView menuIm;
    private Integer menuOnOff = 0;

    private ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        menu = findViewById(R.id.menu);
        newsMenu = findViewById(R.id.button3);
        distMenu = findViewById(R.id.button4);
        mainMenu = findViewById(R.id.button5);
        about = findViewById(R.id.button6);
        mat = findViewById(R.id.button8);
        menuIm = findViewById(R.id.imageView2);
        menuIm.setVisibility(View.INVISIBLE);
        newsMenu.setVisibility(View.INVISIBLE);
        distMenu.setVisibility(View.INVISIBLE);
        mainMenu.setVisibility(View.INVISIBLE);
        about.setVisibility(View.INVISIBLE);
        mat.setVisibility(View.INVISIBLE);
        getSupportActionBar().hide();
        WebView browser =(WebView)findViewById(R.id.webView2);
        browser.getSettings().setJavaScriptEnabled(true);

        browser.setWebChromeClient(new WebChromeClient());

        browser.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        browser.loadUrl("https://vk.com/school93izh");
        progress = findViewById(R.id.progressBar2);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                progress.setVisibility(View.INVISIBLE);
            }
        }, 3000);

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
                    menuOnOff = 1;
                }
                else if (menuOnOff == 1) {
                    menuIm.setVisibility(View.INVISIBLE);
                    newsMenu.setVisibility(View.INVISIBLE);
                    distMenu.setVisibility(View.INVISIBLE);
                    mainMenu.setVisibility(View.INVISIBLE);
                    about.setVisibility(View.INVISIBLE);
                    mat.setVisibility(View.INVISIBLE);
                    menuOnOff = 0;
                }

            }
        });

        newsMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(News.this, News.class);
                startActivity(intent);
            }
        });

        mainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(News.this, MainActivity.class);
                startActivity(intent);
            }
        });

        distMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(News.this, Dist.class);
                startActivity(intent);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(News.this, AboutActivity.class);
                startActivity(intent);
            }
        });

        mat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(News.this, MaterialsActivity.class);
                startActivity(intent);
            }
        });
    }
}
package com.example.my_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class Dist extends AppCompatActivity {

    //MENU
    private Button menu;
    private Button newsMenu;
    private Button distMenu;
    private Button mainMenu;
    private Button about;
    private Button mat;
    private ImageView menuIm;
    private Integer menuOnOff = 0;
    //MENU
    SharedPreferences sPref;
    final String SAVED_TEXT = "saved_text";
    final String SAVED_TEXT2 = "saved_text2";
    private String number;
    private String bukva;
    private Button pokazZad;
    private EditText day;
    private EditText month;
    private String monthRus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dist);
        //MENU
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
        //MENU

        pokazZad = findViewById(R.id.button2);
        day = findViewById(R.id.dist_day);
        month = findViewById(R.id.dist_month);

        getSupportActionBar().hide();
//        WebView browser =(WebView)findViewById(R.id.webView2);
////        browser.getSettings().setJavaScriptEnabled(true);
//        browser.setVisibility(View.INVISIBLE);

//        browser.setWebChromeClient(new WebChromeClient());


//        browser.setWebViewClient(new WebViewClient() {
//
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request){
                //Log.d("WebViewActivity", request.getUrl().toString());

                /*if( request.getUrl().toString().startsWith("http:") || request.getUrl().toString().startsWith("https:") ) {



                }*/
//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(request.getUrl().toString()));
//                startActivity( intent );
//                return true;
//            }});
            loadText();
        pokazZad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                browser.setVisibility(View.VISIBLE);
                pokazZad.setVisibility(View.INVISIBLE);
                day.setVisibility(View.INVISIBLE);
                month.setVisibility(View.INVISIBLE);
                switch (month.getText().toString()) {
                    case "1":
                        monthRus = "Январь";
                    case "2":
                        monthRus = "Февраль";
                    case "3":
                        monthRus = "Март";
                    case "4":
                        monthRus = "Апрель";
                    case "5":
                        monthRus = "Май";
                    case "6":
                        monthRus = "Июнь";
                    case "7":
                        monthRus = "Июль";
                    case "8":
                        monthRus = "Август";
                    case "9":
                        monthRus = "Сентябрь";
                    case "10":
                        monthRus = "Октябрь";
                    case "11":
                        monthRus = "Ноябрь";
                    case "12":
                        monthRus = "Декабрь";
                }
                String d = day.getText().toString();
                String m = month.getText().toString();
                String n = number;
                String mm = monthRus;
                String url1 = "https://ciur.ru/izh/s93_izh/2/Forms/AllItems.aspx";
//
                Intent browserIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse(url1));
                startActivity(browserIntent1);
                String url = "https://ciur.ru/izh/s93_izh/DocLib31/Дистанционное%20обучение/"+n+"%20класс/"+mm+"%202021/"+n+"."+d+"."+m+".pdf";
//
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(browserIntent);
                //browser.loadUrl("https://ciur.ru/izh/s93_izh/DocLib31/Дистанционное%20обучение/"+number+"%20класс/"+monthRus+"%202021/"+number+"."+d+"."+m+".pdf");
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setDataAndType(Uri.parse(url), "application/pdf");
//                browser.getContext().startActivity(intent);
//
//
//                if (browser.getTitle().equals("404") || browser.getTitle().equals("500")) {
//                    Toast.makeText(getBaseContext(), R.string.pageTitle, Toast.LENGTH_SHORT).show();
//                }



            }
        });
//        if (number.equals("10"))
//            browser.loadUrl("https://ciur.ru/izh/s93_izh/2/Forms/AllItems.aspx");

        //MENU
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
                Intent intent = new Intent(Dist.this, News.class);
                startActivity(intent);
            }
        });

        mainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dist.this, MainActivity.class);
                startActivity(intent);
            }
        });

        distMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dist.this, Dist.class);
                startActivity(intent);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dist.this, AboutActivity.class);
                startActivity(intent);
            }
        });

        mat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dist.this, MaterialsActivity.class);
                startActivity(intent);
            }
        });

        //MENU
    }
    void loadText() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT, "");
        String savedText2 = sPref.getString(SAVED_TEXT2, "");
        number = savedText;
        bukva = savedText2;
    }
}
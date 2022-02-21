package com.example.my_school;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Calendar;

import javax.net.ssl.HttpsURLConnection;

public class MainActivity extends AppCompatActivity {

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

    private EditText classNum;
    private EditText classBuk;
    private EditText famil;
    private EditText name;

    private String number;
    private String bukva;
    private String namee;
    private String famill;

    private TextView text;
    private TextView text1;
    private Button saveClass;

    private TextView u1;
    private TextView u2;
    private TextView u3;
    private TextView u4;
    private TextView u5;
    private TextView u6;
    private TextView u7;
    private TextView u8;
    private TextView zvU1;
    private TextView zvU2;
    private TextView zvU3;
    private TextView zvU4;
    private TextView zvU5;
    private TextView zvU6;
    private TextView zvU7;
    private TextView zvU8;

    private TextView namename;
    private  TextView temper;
    private  TextView wspeed;
    private  TextView weweather;

    private Button usl;
    private TextView us;
    private TextView beta;

    private Switch sokr;

    SharedPreferences sPref;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        classNum = findViewById(R.id.classNum);
        classBuk = findViewById(R.id.classBuk);
        famil = findViewById(R.id.familiya);
        name = findViewById(R.id.imya);
        saveClass = findViewById(R.id.button);
        u1 = findViewById(R.id.u1);
        u2 = findViewById(R.id.u2);
        u3 = findViewById(R.id.u3);
        u4 = findViewById(R.id.u4);
        u5 = findViewById(R.id.u5);
        u6 = findViewById(R.id.u6);
        u7 = findViewById(R.id.u7);
        u8 = findViewById(R.id.u8);
        zvU1 = findViewById(R.id.zvU1);
        zvU2 = findViewById(R.id.zvU2);
        zvU3 = findViewById(R.id.zvU3);
        zvU4 = findViewById(R.id.zvU4);
        zvU5 = findViewById(R.id.zvU5);
        zvU6 = findViewById(R.id.zvU6);
        zvU7 = findViewById(R.id.zvU7);
        zvU8 = findViewById(R.id.zvU8);
        usl = findViewById(R.id.uslovPolitic);
        namename = findViewById(R.id.namename);
        temper = findViewById(R.id.textViewtemp);
        wspeed = findViewById(R.id.textViewspeed);
        beta = findViewById(R.id.textView17);
        temper.setVisibility(View.INVISIBLE);
        wspeed.setVisibility(View.INVISIBLE);
        namename.setVisibility(View.INVISIBLE);
        getSupportActionBar().hide();
        us = findViewById(R.id.textView6);
        Switch sokr = findViewById(R.id.switch1);
        sokr.setVisibility(View.INVISIBLE);




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
                    menuOnOff = 1; }

                else if (menuOnOff == 1) {
                    menuIm.setVisibility(View.INVISIBLE);
                    newsMenu.setVisibility(View.INVISIBLE);
                    distMenu.setVisibility(View.INVISIBLE);
                    mainMenu.setVisibility(View.INVISIBLE);
                    about.setVisibility(View.INVISIBLE);
                    mat.setVisibility(View.INVISIBLE);
                    menuOnOff = 0; }
            }
        });

        newsMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, News.class);
                startActivity(intent);
            }
        });

        mainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        distMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Dist.class);
                startActivity(intent);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });

        mat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MaterialsActivity.class);
                startActivity(intent);
            }
        });

        //MENU




        usl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UslovActivity.class);
                startActivity(intent);
            }
        });

        loadText();
        Calendar calendar = Calendar.getInstance();
        int dayday = calendar.get(Calendar.DATE);
        int monthmonth = calendar.get(Calendar.MONTH);
        int weekweek = calendar.get(Calendar.DAY_OF_WEEK);
        String weekRus;
        String monthRus;
        switch (monthmonth) {
            case 0:
                monthRus = "января";
                break;
            case 1:
                monthRus = "февраля";
                break;
            case 2:
                monthRus = "марта";
                break;
            case 3:
                monthRus = "апреля";
                break;
            case 4:
                monthRus = "мая";
                break;
            case 5:
                monthRus = "июня";
                break;
            case 6:
                monthRus = "июля";
                break;
            case 7:
                monthRus = "августа";
                break;
            case 8:
                monthRus = "сентября";
                break;
            case 9:
                monthRus = "октября";
                break;
            case 10:
                monthRus = "ноября";
                break;
            case 11:
                monthRus = "декабря";
                break;
            default:
                monthRus = "ERROR 10M";
                break;
        }
        switch (weekweek) {
            case Calendar.MONDAY:
                weekRus = "Понедельник";
                break;
            case Calendar.TUESDAY:
                weekRus = "Вторник";
                break;
            case Calendar.WEDNESDAY:
                weekRus = "Среда";
                break;
            case Calendar.THURSDAY:
                weekRus = "Четверг";
                break;
            case Calendar.FRIDAY:
                weekRus = "Пятница";
                break;
            case Calendar.SATURDAY:
                weekRus = "Суббота";
                break;
            case Calendar.SUNDAY:
                weekRus = "Воскресенье";
                break;
            default:
                weekRus = "ERROR 10W";
                break;
        }
        String urlT = "https://api.openweathermap.org/data/2.5/weather?q=Izhevsk&appid=a73c8065a91ebec5076cc5e6fc9eebc1&units=metric&lang=ru";
        new getUrlData().execute(urlT);
        String bb = bukva;
        if ((bb.equals("Б") || bb.equals("б")) && number.equals("10"))
            bb = "а";
        namename.setText(famill + " " + namee + ", " + number + bb + "\n" + dayday + " " + monthRus + "\n" + weekRus);
        if (!number.equals("")) {
            classNum.setVisibility(View.INVISIBLE);
            classBuk.setVisibility(View.INVISIBLE);
            saveClass.setVisibility(View.INVISIBLE);
            beta.setVisibility(View.INVISIBLE);
            name.setVisibility(View.INVISIBLE);
            famil.setVisibility(View.INVISIBLE);
            us.setVisibility(View.INVISIBLE);
            usl.setVisibility(View.INVISIBLE);
            sokr.setVisibility(View.VISIBLE);
            namename.setVisibility(View.VISIBLE);
            temper.setVisibility(View.VISIBLE);
            wspeed.setVisibility(View.VISIBLE);
            int day = calendar.get(Calendar.DAY_OF_WEEK);

            switch (day) {
                case Calendar.SATURDAY:
                    zvU1.setText(R.string.zuS1);
                    zvU2.setText(R.string.zuS2);
                    zvU3.setText(R.string.zuS3);
                    zvU4.setText(R.string.zuS4);
                    zvU5.setText(R.string.zuS5);
                    zvU6.setText(R.string.zuS6);
                    zvU7.setText(R.string.zuS7);
                    zvU8.setText(R.string.zuS8);
                    break;
                default:
                    zvU1.setText(R.string.zu1);
                    zvU2.setText(R.string.zu2);
                    zvU3.setText(R.string.zu3);
                    zvU4.setText(R.string.zu4);
                    zvU5.setText(R.string.zu5);
                    zvU6.setText(R.string.zu6);
                    zvU7.setText(R.string.zu7);
                    zvU8.setText(R.string.zu8);
                    break; }

            sokr.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean checked = ((Switch) v).isChecked();
                    if (checked) {
                        zvU1.setText(R.string.zuSSS1);
                        zvU2.setText(R.string.zuSSS2);
                        zvU3.setText(R.string.zuSSS3);
                        zvU4.setText(R.string.zuSSS4);
                        zvU5.setText(R.string.zuSSS5);
                        zvU6.setText(R.string.zuSSS6);
                        zvU7.setText(R.string.zuSSS7);
                        zvU8.setText(R.string.zuSSS8);
                    } else {
                        Calendar calendar = Calendar.getInstance();
                        int day = calendar.get(Calendar.DAY_OF_WEEK);

                        switch (day) {
                            case Calendar.SATURDAY:
                                zvU1.setText(R.string.zuS1);
                                zvU2.setText(R.string.zuS2);
                                zvU3.setText(R.string.zuS3);
                                zvU4.setText(R.string.zuS4);
                                zvU5.setText(R.string.zuS5);
                                zvU6.setText(R.string.zuS6);
                                zvU7.setText(R.string.zuS7);
                                zvU8.setText(R.string.zuS8);
                                break;
                            default:
                                zvU1.setText(R.string.zu1);
                                zvU2.setText(R.string.zu2);
                                zvU3.setText(R.string.zu3);
                                zvU4.setText(R.string.zu4);
                                zvU5.setText(R.string.zu5);
                                zvU6.setText(R.string.zu6);
                                zvU7.setText(R.string.zu7);
                                zvU8.setText(R.string.zu8);
                                break;
                        }
                    }
                }});



            if (number.equals("10") && (bukva.equals("A") || bukva.equals("a") || bukva.equals("а") || bukva.equals("А")))  {
                tenAClassRasp();
            }
            if (number.equals("10") && (bukva.equals("Б") || bukva.equals("б")))  {
                tenBClassRasp();
            }
            if (number.equals("9") && (bukva.equals("A") || bukva.equals("a") || bukva.equals("а") || bukva.equals("А"))) {
                nineAClassRasp();
            }
            if (number.equals("9") && (bukva.equals("Б") || bukva.equals("б"))) {
                nineBClassRasp();
            }
            if (number.equals("9") && (bukva.equals("В") || bukva.equals("в")|| bukva.equals("B"))) {
                nineVClassRasp();
            }
            if (number.equals("9") && (bukva.equals("Г") || bukva.equals("г"))) {
                nineGClassRasp();
            }
            if (number.equals("9") && (bukva.equals("Д") || bukva.equals("д"))) {
                nineDClassRasp();
            }
        }
        else {
            saveClass.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    classNum.setVisibility(View.INVISIBLE);
                    classBuk.setVisibility(View.INVISIBLE);
                    saveClass.setVisibility(View.INVISIBLE);
                    name.setVisibility(View.INVISIBLE);
                    famil.setVisibility(View.INVISIBLE);
                    us.setVisibility(View.INVISIBLE);
                    usl.setVisibility(View.INVISIBLE);
                    saveText();
                }
            });
        }
    }
    void saveText() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString("numberClass", classNum.getText().toString());
        ed.putString("bukvaClass", classBuk.getText().toString());
        ed.putString("name", name.getText().toString());
        ed.putString("famil", famil.getText().toString());
        ed.commit();
    }

    void loadText() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString("numberClass", "");
        String savedText2 = sPref.getString("bukvaClass", "");
        String savedText3 = sPref.getString("name", "");
        String savedText4 = sPref.getString("famil", "");
        number = savedText;
        bukva = savedText2;
        namee = savedText3;
        famill = savedText4;
    }

    private  class getUrlData extends AsyncTask<String, String, String> {

        protected void onPreExecute(){

        }

        @Override
        protected String doInBackground(String... strings) {
            HttpURLConnection connection = null;
            BufferedReader reader = null;

            try {
                URL url = new URL(strings[0]);
                connection = (HttpURLConnection) url.openConnection();
                connection.connect();

                InputStream stream = connection.getInputStream();
                reader = new BufferedReader(new InputStreamReader(stream));

                StringBuffer buffer = new StringBuffer();
                String line = "";

                while ((line = reader.readLine()) != null)
                    buffer.append(line).append("\n");

                return buffer.toString();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (connection != null)
                    connection.disconnect();
                try {
                    if (reader != null)
                        reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            return null;

        }
            @Override
            protected void onPostExecute(String result) {
                super.onPostExecute(result);
                try {
                    JSONObject jsonObject = new JSONObject(result);
                    temper.setText("Температура "+ jsonObject.getJSONObject("main").getDouble("temp") + "°C");
                } catch (JSONException jsonException) {
                    namename.setText("Error333");
                    jsonException.printStackTrace();
                }
                try {
                    JSONObject jsonObject = new JSONObject(result);
                    wspeed.setText("Скорость ветра " + jsonObject.getJSONObject("wind").getDouble("speed") + "м/с");
                } catch (JSONException jsonException) {
                    jsonException.printStackTrace();
                }


                JSONObject jsonObject = null;

            }
    }

    void tenAClassRasp() {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        switch (day) {
            case Calendar.SUNDAY:
                u1.setText("Выходной");
                break;
            case Calendar.MONDAY:
                u1.setText(R.string.tenAMon1);
                u2.setText(R.string.tenAMon2);
                u3.setText(R.string.tenAMon3);
                u4.setText(R.string.tenAMon4);
                u5.setText(R.string.tenAMon5);
                u6.setText(R.string.tenAMon6);
                u7.setText(R.string.tenAMon7);
                u8.setText(R.string.tenAMon8);
                break;
            case Calendar.TUESDAY:
                u1.setText(R.string.tenATue1);
                u2.setText(R.string.tenATue2);
                u3.setText(R.string.tenATue3);
                u4.setText(R.string.tenATue4);
                u5.setText(R.string.tenATue5);
                u6.setText(R.string.tenATue6);
                u7.setText(R.string.tenATue7);
                u8.setText(R.string.tenATue8);
                break;
            case Calendar.WEDNESDAY:
                u1.setText(R.string.tenAWed1);
                u2.setText(R.string.tenAWed2);
                u3.setText(R.string.tenAWed3);
                u4.setText(R.string.tenAWed4);
                u5.setText(R.string.tenAWed5);
                u6.setText(R.string.tenAWed6);
                u7.setText(R.string.tenAWed7);
                u8.setText(R.string.tenAWed8);
                break;
            case Calendar.THURSDAY:
                u1.setText(R.string.tenAThu1);
                u2.setText(R.string.tenAThu2);
                u3.setText(R.string.tenAThu3);
                u4.setText(R.string.tenAThu4);
                u5.setText(R.string.tenAThu5);
                u6.setText(R.string.tenAThu6);
                u7.setText(R.string.tenAThu7);
                u8.setText(R.string.tenAThu8);
                break;
            case Calendar.FRIDAY:
                u1.setText(R.string.tenAFri1);
                u2.setText(R.string.tenAFri2);
                u3.setText(R.string.tenAFri3);
                u4.setText(R.string.tenAFri4);
                u5.setText(R.string.tenAFri5);
                u6.setText(R.string.tenAFri6);
                u7.setText(R.string.tenAFri7);
                u8.setText(R.string.tenAFri8);
                break;
            case Calendar.SATURDAY:
                u1.setText(R.string.tenASat1);
                u2.setText(R.string.tenASat2);
                u3.setText(R.string.tenASat3);
                u4.setText(R.string.tenASat4);
                u5.setText(R.string.tenASat5);
                u6.setText(R.string.tenASat6);
                u7.setText(R.string.tenASat7);
                u8.setText(R.string.tenASat8);
                break;
        }
    }

    void tenBClassRasp() {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        switch (day) {
            case Calendar.SUNDAY:
                u1.setText("Выходной");
                break;
            case Calendar.MONDAY:
                u1.setText(R.string.tenBMon1);
                u2.setText(R.string.tenBMon2);
                u3.setText(R.string.tenBMon3);
                u4.setText(R.string.tenBMon4);
                u5.setText(R.string.tenBMon5);
                u6.setText(R.string.tenBMon6);
                u7.setText(R.string.tenBMon7);
                u8.setText(R.string.tenBMon8);
                break;
            case Calendar.TUESDAY:
                u1.setText(R.string.tenBTue1);
                u2.setText(R.string.tenBTue2);
                u3.setText(R.string.tenBTue3);
                u4.setText(R.string.tenBTue4);
                u5.setText(R.string.tenBTue5);
                u6.setText(R.string.tenBTue6);
                u7.setText(R.string.tenBTue7);
                u8.setText(R.string.tenBTue8);
                break;
            case Calendar.WEDNESDAY:
                u1.setText(R.string.tenBWed1);
                u2.setText(R.string.tenBWed2);
                u3.setText(R.string.tenBWed3);
                u4.setText(R.string.tenBWed4);
                u5.setText(R.string.tenBWed5);
                u6.setText(R.string.tenBWed6);
                u7.setText(R.string.tenBWed7);
                u8.setText(R.string.tenBWed8);
                break;
            case Calendar.THURSDAY:
                u1.setText(R.string.tenBThu1);
                u2.setText(R.string.tenBThu2);
                u3.setText(R.string.tenBThu3);
                u4.setText(R.string.tenBThu4);
                u5.setText(R.string.tenBThu5);
                u6.setText(R.string.tenBThu6);
                u7.setText(R.string.tenBThu7);
                u8.setText(R.string.tenBThu8);
                break;
            case Calendar.FRIDAY:
                u1.setText(R.string.tenBFri1);
                u2.setText(R.string.tenBFri2);
                u3.setText(R.string.tenBFri3);
                u4.setText(R.string.tenBFri4);
                u5.setText(R.string.tenBFri5);
                u6.setText(R.string.tenBFri6);
                u7.setText(R.string.tenBSat7);
                u8.setText(R.string.tenBFri8);
                break;
            case Calendar.SATURDAY:
                u1.setText(R.string.tenBSat1);
                u2.setText(R.string.tenBSat2);
                u3.setText(R.string.tenBSat3);
                u4.setText(R.string.tenBSat4);
                u5.setText(R.string.tenBSat5);
                u6.setText(R.string.tenBSat6);
                u7.setText(R.string.tenBSat7);
                u8.setText(R.string.tenBSat8);
                break;
        }
    }

//    public void сreateDialog(Activity activity) {
//        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
//        builder.setTitle("Меню")
//                .setMessage("Текст в диалоге")
//                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
//                        Toast.makeText(activity,"Нажата кнопка 'OK'",Toast.LENGTH_SHORT).show();
//                    }
//                })
//                .setNegativeButton("Отмена", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
//                        Toast.makeText(activity,"Нажата кнопка 'Отмена'",Toast.LENGTH_SHORT).show();
//                    }
//                });
//        builder.create().show();
//    }
void nineAClassRasp() {
    Calendar calendar = Calendar.getInstance();
    int day = calendar.get(Calendar.DAY_OF_WEEK);

    switch (day) {
        case Calendar.SUNDAY:
            u1.setText("Выходной");
            break;
        case Calendar.MONDAY:
            u1.setText(R.string.nineAMon1);
            u2.setText(R.string.nineAMon2);
            u3.setText(R.string.nineAMon3);
            u4.setText(R.string.nineAMon4);
            u5.setText(R.string.nineAMon5);
            u6.setText(R.string.nineAMon6);
            u7.setText(R.string.nineAMon7);
            u8.setText(R.string.nineAMon8);
            break;
        case Calendar.TUESDAY:
            u1.setText(R.string.nineATue1);
            u2.setText(R.string.nineATue2);
            u3.setText(R.string.nineATue3);
            u4.setText(R.string.nineATue4);
            u5.setText(R.string.nineATue5);
            u6.setText(R.string.nineATue6);
            u7.setText(R.string.nineATue7);
            u8.setText(R.string.nineATue8);
            break;
        case Calendar.WEDNESDAY:
            u1.setText(R.string.nineAWed1);
            u2.setText(R.string.nineAWed2);
            u3.setText(R.string.nineAWed3);
            u4.setText(R.string.nineAWed4);
            u5.setText(R.string.nineAWed5);
            u6.setText(R.string.nineAWed6);
            u7.setText(R.string.nineAWed7);
            u8.setText(R.string.nineAWed8);
            break;
        case Calendar.THURSDAY:
            u1.setText(R.string.nineAThu1);
            u2.setText(R.string.nineAThu2);
            u3.setText(R.string.nineAThu3);
            u4.setText(R.string.nineAThu4);
            u5.setText(R.string.nineAThu5);
            u6.setText(R.string.nineAThu6);
            u7.setText(R.string.nineAThu7);
            u8.setText(R.string.nineAThu8);
            break;
        case Calendar.FRIDAY:
            u1.setText(R.string.nineAFri1);
            u2.setText(R.string.nineAFri2);
            u3.setText(R.string.nineAFri3);
            u4.setText(R.string.nineAFri4);
            u5.setText(R.string.nineAFri5);
            u6.setText(R.string.nineAFri6);
            u7.setText(R.string.nineAFri7);
            u8.setText(R.string.nineAFri8);
            break;
        case Calendar.SATURDAY:
            u1.setText(R.string.nineASat1);
            u2.setText(R.string.nineASat2);
            u3.setText(R.string.nineASat3);
            u4.setText(R.string.nineASat4);
            u5.setText(R.string.nineASat5);
            u6.setText(R.string.nineASat6);
            u7.setText(R.string.nineASat7);
            u8.setText(R.string.nineASat8);
            break;
    }
}
    void nineBClassRasp() {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        switch (day) {
            case Calendar.SUNDAY:
                u1.setText("Выходной");
                break;
            case Calendar.MONDAY:
                u1.setText(R.string.nineBMon1);
                u2.setText(R.string.nineBMon2);
                u3.setText(R.string.nineBMon3);
                u4.setText(R.string.nineBMon4);
                u5.setText(R.string.nineBMon5);
                u6.setText(R.string.nineBMon6);
                u7.setText(R.string.nineBMon7);
                u8.setText(R.string.nineBMon8);
                break;
            case Calendar.TUESDAY:
                u1.setText(R.string.nineBTue1);
                u2.setText(R.string.nineBTue2);
                u3.setText(R.string.nineBTue3);
                u4.setText(R.string.nineBTue4);
                u5.setText(R.string.nineBTue5);
                u6.setText(R.string.nineBTue6);
                u7.setText(R.string.nineBTue7);
                u8.setText(R.string.nineBTue8);
                break;
            case Calendar.WEDNESDAY:
                u1.setText(R.string.nineBWed1);
                u2.setText(R.string.nineBWed2);
                u3.setText(R.string.nineBWed3);
                u4.setText(R.string.nineBWed4);
                u5.setText(R.string.nineBWed5);
                u6.setText(R.string.nineBWed6);
                u7.setText(R.string.nineBWed7);
                u8.setText(R.string.nineBWed8);
                break;
            case Calendar.THURSDAY:
                u1.setText(R.string.nineBThu1);
                u2.setText(R.string.nineBThu2);
                u3.setText(R.string.nineBThu3);
                u4.setText(R.string.nineBThu4);
                u5.setText(R.string.nineBThu5);
                u6.setText(R.string.nineBThu6);
                u7.setText(R.string.nineBThu7);
                u8.setText(R.string.nineBThu8);
                break;
            case Calendar.FRIDAY:
                u1.setText(R.string.nineBFri1);
                u2.setText(R.string.nineBFri2);
                u3.setText(R.string.nineBFri3);
                u4.setText(R.string.nineBFri4);
                u5.setText(R.string.nineBFri5);
                u6.setText(R.string.nineBFri6);
                u7.setText(R.string.nineBFri7);
                u8.setText(R.string.nineBFri8);
                break;
            case Calendar.SATURDAY:
                u1.setText(R.string.nineBSat1);
                u2.setText(R.string.nineBSat2);
                u3.setText(R.string.nineBSat3);
                u4.setText(R.string.nineBSat4);
                u5.setText(R.string.nineBSat5);
                u6.setText(R.string.nineBSat6);
                u7.setText(R.string.nineBSat7);
                u8.setText(R.string.nineBSat8);
                break;
        }
    }
    void nineVClassRasp() {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        switch (day) {
            case Calendar.SUNDAY:
                u1.setText("Выходной");
                break;
            case Calendar.MONDAY:
                u1.setText(R.string.nineVMon1);
                u2.setText(R.string.nineVMon2);
                u3.setText(R.string.nineVMon3);
                u4.setText(R.string.nineVMon4);
                u5.setText(R.string.nineVMon5);
                u6.setText(R.string.nineVMon6);
                u7.setText(R.string.nineVMon7);
                u8.setText(R.string.nineVMon8);
                break;
            case Calendar.TUESDAY:
                u1.setText(R.string.nineVTue1);
                u2.setText(R.string.nineVTue2);
                u3.setText(R.string.nineVTue3);
                u4.setText(R.string.nineVTue4);
                u5.setText(R.string.nineVTue5);
                u6.setText(R.string.nineVTue6);
                u7.setText(R.string.nineVTue7);
                u8.setText(R.string.nineVTue8);
                break;
            case Calendar.WEDNESDAY:
                u1.setText(R.string.nineVWed1);
                u2.setText(R.string.nineVWed2);
                u3.setText(R.string.nineVWed3);
                u4.setText(R.string.nineVWed4);
                u5.setText(R.string.nineVWed5);
                u6.setText(R.string.nineVWed6);
                u7.setText(R.string.nineVWed7);
                u8.setText(R.string.nineVWed8);
                break;
            case Calendar.THURSDAY:
                u1.setText(R.string.nineVThu1);
                u2.setText(R.string.nineVThu2);
                u3.setText(R.string.nineVThu3);
                u4.setText(R.string.nineVThu4);
                u5.setText(R.string.nineVThu5);
                u6.setText(R.string.nineVThu6);
                u7.setText(R.string.nineVThu7);
                u8.setText(R.string.nineVThu8);
                break;
            case Calendar.FRIDAY:
                u1.setText(R.string.nineVFri1);
                u2.setText(R.string.nineVFri2);
                u3.setText(R.string.nineVFri3);
                u4.setText(R.string.nineVFri4);
                u5.setText(R.string.nineVFri5);
                u6.setText(R.string.nineVFri6);
                u7.setText(R.string.nineVFri7);
                u8.setText(R.string.nineVFri8);
                break;
            case Calendar.SATURDAY:
                u1.setText(R.string.nineVSat1);
                u2.setText(R.string.nineVSat2);
                u3.setText(R.string.nineVSat3);
                u4.setText(R.string.nineVSat4);
                u5.setText(R.string.nineVSat5);
                u6.setText(R.string.nineVSat6);
                u7.setText(R.string.nineVSat7);
                u8.setText(R.string.nineVSat8);
                break;
        }
    }
    void nineGClassRasp() {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        switch (day) {
            case Calendar.SUNDAY:
                u1.setText("Выходной");
                break;
            case Calendar.MONDAY:
                u1.setText(R.string.nineGMon1);
                u2.setText(R.string.nineGMon2);
                u3.setText(R.string.nineGMon3);
                u4.setText(R.string.nineGMon4);
                u5.setText(R.string.nineGMon5);
                u6.setText(R.string.nineGMon6);
                u7.setText(R.string.nineGMon7);
                u8.setText(R.string.nineGMon8);
                break;
            case Calendar.TUESDAY:
                u1.setText(R.string.nineGTue1);
                u2.setText(R.string.nineGTue2);
                u3.setText(R.string.nineGTue3);
                u4.setText(R.string.nineGTue4);
                u5.setText(R.string.nineGTue5);
                u6.setText(R.string.nineGTue6);
                u7.setText(R.string.nineGTue7);
                u8.setText(R.string.nineGTue8);
                break;
            case Calendar.WEDNESDAY:
                u1.setText(R.string.nineGWed1);
                u2.setText(R.string.nineGWed2);
                u3.setText(R.string.nineGWed3);
                u4.setText(R.string.nineGWed4);
                u5.setText(R.string.nineGWed5);
                u6.setText(R.string.nineGWed6);
                u7.setText(R.string.nineGWed7);
                u8.setText(R.string.nineGWed8);
                break;
            case Calendar.THURSDAY:
                u1.setText(R.string.nineGThu1);
                u2.setText(R.string.nineGThu2);
                u3.setText(R.string.nineGThu3);
                u4.setText(R.string.nineGThu4);
                u5.setText(R.string.nineGThu5);
                u6.setText(R.string.nineGThu6);
                u7.setText(R.string.nineGThu7);
                u8.setText(R.string.nineGThu8);
                break;
            case Calendar.FRIDAY:
                u1.setText(R.string.nineGFri1);
                u2.setText(R.string.nineGFri2);
                u3.setText(R.string.nineGFri3);
                u4.setText(R.string.nineGFri4);
                u5.setText(R.string.nineGFri5);
                u6.setText(R.string.nineGFri6);
                u7.setText(R.string.nineGFri7);
                u8.setText(R.string.nineGFri8);
                break;
            case Calendar.SATURDAY:
                u1.setText(R.string.nineGSat1);
                u2.setText(R.string.nineGSat2);
                u3.setText(R.string.nineGSat3);
                u4.setText(R.string.nineGSat4);
                u5.setText(R.string.nineGSat5);
                u6.setText(R.string.nineGSat6);
                u7.setText(R.string.nineGSat7);
                u8.setText(R.string.nineGSat8);
                break;
        }
    }
    void nineDClassRasp() {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        switch (day) {
            case Calendar.SUNDAY:
                u1.setText("Выходной");
                break;
            case Calendar.MONDAY:
                u1.setText(R.string.nineDMon1);
                u2.setText(R.string.nineDMon2);
                u3.setText(R.string.nineDMon3);
                u4.setText(R.string.nineDMon4);
                u5.setText(R.string.nineDMon5);
                u6.setText(R.string.nineDMon6);
                u7.setText(R.string.nineDMon7);
                u8.setText(R.string.nineDMon8);
                break;
            case Calendar.TUESDAY:
                u1.setText(R.string.nineDTue1);
                u2.setText(R.string.nineDTue2);
                u3.setText(R.string.nineDTue3);
                u4.setText(R.string.nineDTue4);
                u5.setText(R.string.nineDTue5);
                u6.setText(R.string.nineDTue6);
                u7.setText(R.string.nineDTue7);
                u8.setText(R.string.nineDTue8);
                break;
            case Calendar.WEDNESDAY:
                u1.setText(R.string.nineDWed1);
                u2.setText(R.string.nineDWed2);
                u3.setText(R.string.nineDWed3);
                u4.setText(R.string.nineDWed4);
                u5.setText(R.string.nineDWed5);
                u6.setText(R.string.nineDWed6);
                u7.setText(R.string.nineDWed7);
                u8.setText(R.string.nineDWed8);
                break;
            case Calendar.THURSDAY:
                u1.setText(R.string.nineDThu1);
                u2.setText(R.string.nineDThu2);
                u3.setText(R.string.nineDThu3);
                u4.setText(R.string.nineDThu4);
                u5.setText(R.string.nineDThu5);
                u6.setText(R.string.nineDThu6);
                u7.setText(R.string.nineDThu7);
                u8.setText(R.string.nineDThu8);
                break;
            case Calendar.FRIDAY:
                u1.setText(R.string.nineDFri1);
                u2.setText(R.string.nineDFri2);
                u3.setText(R.string.nineDFri3);
                u4.setText(R.string.nineDFri4);
                u5.setText(R.string.nineDFri5);
                u6.setText(R.string.nineDFri6);
                u7.setText(R.string.nineDFri7);
                u8.setText(R.string.nineDFri8);
                break;
            case Calendar.SATURDAY:
                u1.setText(R.string.nineDSat1);
                u2.setText(R.string.nineDSat2);
                u3.setText(R.string.nineDSat3);
                u4.setText(R.string.nineDSat4);
                u5.setText(R.string.nineDSat5);
                u6.setText(R.string.nineDSat6);
                u7.setText(R.string.nineDSat7);
                u8.setText(R.string.nineDSat8);
                break;
        }
    }
}

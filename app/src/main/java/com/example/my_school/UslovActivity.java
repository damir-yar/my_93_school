package com.example.my_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UslovActivity extends AppCompatActivity {

    private Button exit;
    private TextView text;

    private String number;
    private String bukva;
    private String namee;
    private String famill;

    SharedPreferences sPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uslov);
        exit = findViewById(R.id.button7);
        text = findViewById(R.id.textView7);

        text.setText("\n" + "Условия использования" + "\n" + "\n" +
                "Вам предоставляется ограниченная, не подлежащая передаче и неисключительная лицензия на установку и использование приложения \"My 93 school\" в личных некоммерческих целях. Исключительные права на распространение приложения, включая логотипы и названия приложения, принадлежат Ярославцеву Дамиру." + "\n" +
                "Вы не можете копировать или распространять приложение. Вы не можете декомпилировать, реконструировать, дизассемблировать, извлекать исходный код, транскрибировать, изменять или создавать производные работы из приложения или любой его части." + "\n" +
                "Используя приложение вы обязаны соблюдать законы стран United States of America и Российской Федерации." + "\n" +
                "Пользователь приложения несёт полную ответственность за действия, совершаемые в приложении. За противозаконные дейтсвия, совершённые с использованием приложения \"My 93 school\" Разработчик приложения не несёт никакой ответственности." + "\n" +
                "Условия действительны до прекращения использования приложения." + "\n" +
                "\n" + "Политика конфиденциальности" + "\n" + "\n" +
                "Приложение собирает и хранит на вашем устройстве: фамилию, имя, номер класса и букву. Приложение не копирует, не изменяет и не пересылает ваши данные. Для улучшения и обеспечения стабильной работы, приложение может осуществлять отправку анонимной статистики об использовании приложения. Для получения и анализа анонимной статистики используется сервис Firebase Analytics, предоставляемый компанией Google." + "\n" +
                "В разделе \"Дистант\" используется оффициальный сайт социальной сети \"ВКонтакте\" (https://vk.com). Пароль и логин, введённые вами в этом разделе приложением \"My 93 school\" не собирается, не обрабатывается, не копируется, не хранится и не пересылается. При утечке ваших персональных данных с этого разрела просьба обращаться в Техническую Поддержку социальной сети ВКонтакте." + "\n" + "\n" + "\n" +
                "Terms of Use\n" +
                "\n" +
                "You are granted a limited, non-transferable and non-exclusive license to install and use the application \"My 93 school\" for your personal, non-commercial use. The exclusive rights to distribute the application, including the logos and names of the application, belong to Damir Iaroslavtsev.\n" +
                "\n" +
                "You may not copy or redistribute the application. You may not decompile, reverse engineer, disassemble, extract source code, transcribe, modify, or create derivative works from the application or any part of it." +
                        "The user of the application is solely responsible for the actions performed in the application. For illegal actions committed using the application \"My 93 school\" Application developer does not bear any responsibility." + "\n" +
                "\n" + "By using the application, you are required to comply with the laws of the countries of the United States of America and the Russian Federation." + "\n" +
                "The conditions are valid until the termination of the use of the application." +
                "\n" + "\n" +
                "Privacy Policy\n" +
                "\n" +
                "The application collects and stores on your device: last name, first name, class number and letter. The app does not send your data. To improve and ensure stable operation, the application can send anonymous statistics about the use of the application. To obtain and analyze anonymous statistics use a service Firebase, provided by Google." +
                "In the \"Дистант\" section, the official site of the social network \"VKontakte\" (https://vk.com) is used. The password and login entered by you in this section by the \"My 93 school\" application is not collected, not processed, is not copied, stored or sent. If your personal data leaks from this, please contact the Technical Support of the social network VKontakte."
                );



        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadText();
                if (!number.equals("")) {
                Intent intent = new Intent(UslovActivity.this, AboutActivity.class);
                startActivity(intent);}
                else {
                    Intent intent = new Intent(UslovActivity.this, MainActivity.class);
                    startActivity(intent);}
                }

        });
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
}
package com.example.toshiba.bahasaprogramwebsitepopuler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String Website[] = {
                "Google",
                "Facebook",
                "Youtube",
                "Yahoo",
                "Amazon",
                "Wiipedia",
                "Twitter",
                "Bing",
                "Microsoft",
                "Linkedin"
        };

        String Bahasa[] = {
                "C, C++, Java, Python",
                "Hack, PHP, Python, C++, Java, Erlang, D, Xhpm, Haskell",
                "C, C++, Python, Java, GO",
                "PHP",
                "Java, C++, Perl",
                "PHP, Hack",
                "C++, Scala, Java, Ruby",
                "ASP.NET",
                "ASP.NET",
                "Java, Javascript, Scala",
        };
        Integer Gambar[] = {
                R.drawable.google,
                R.drawable.facebook,
                R.drawable.youtube,
                R.drawable.yahoo,
                R.drawable.amazon,
                R.drawable.wikipedia,
                R.drawable.twitter,
                R.drawable.bing,
                R.drawable.microsoft,
                R.drawable.linkendin,
        };

        ListView list = (ListView)findViewById(R.id.list);
        list.setAdapter(new Website(this,Website,Bahasa,Gambar));

    }
}

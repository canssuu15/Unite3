package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Uyg7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg7);

        int x = 10;
        int y = 3;
        int toplam = x + y;
        int fark = x - y;
        int carpim = x * y;
        int bolme = x / y ;
        int mod = x % y ;

        x++;
        y--;
        System.out.println("toplam: "+ toplam);
        System.out.println("fark:" + fark);
        System.out.println("çarpım:" + carpim);
        System.out.println("mod alma:" + mod);
        System.out.println("artırma: "+ x);


    }
}
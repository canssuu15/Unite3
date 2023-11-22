package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Uyg2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg2);


    byte kucukSayi =127;
    short kisaSayi = 32767;
    int tamSayı = 2147483647;
    long uzunSayi = 9223372036854775807L;
    System.out.println("byte:   "+kucukSayi);
    System.out.println("short:  "+ kisaSayi);
    System.out.println("int:    "+ tamSayı);
    System.out.println("long:   "+uzunSayi);

        boolean degisken1=true;
        System.out.println(degisken1);

        boolean degisken2=false;
        System.out.println(degisken2);
    }

    public void Geri(View view) {
            Intent i = new Intent(Uyg2.this, MainActivity.class);
            startActivity(i);
    }
}
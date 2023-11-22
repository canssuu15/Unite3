package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Uyg4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg4);

        char karakter = 'a';
        int ascii = (int) karakter;
        if (ascii >= 48 && ascii <= 57) {
            System.out.println("rakam girildi");
        } else {
            System.out.println("yazı girildi");
        }

        boolean degisken1 = true;
        System.out.println(degisken1);

        boolean degisken2 = false;
        System.out.println(degisken2);
    }

    public void Geri(View view) {
        Intent i = new Intent(Uyg4.this, MainActivity.class);
        startActivity(i);
    }
}
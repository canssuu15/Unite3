package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Uyg3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg3);

    char karakter= 'A';
    System.out.println("karakter: " + karakter);
    karakter ='A' + 1;
    System.out.println("karakter:" + karakter);
    }

    public void Geri(View view) {
            Intent i = new Intent(Uyg3.this, MainActivity.class);
            startActivity(i);
    }
}
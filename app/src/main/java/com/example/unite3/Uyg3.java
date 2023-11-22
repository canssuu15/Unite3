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
        boolean degisken1=true;
        System.out.println(degisken1);

        boolean degisken2=false;
        System.out.println(degisken2);
    }

    public void Geri(View view) {
            Intent i = new Intent(Uyg3.this, MainActivity.class);
            startActivity(i);
    }
}
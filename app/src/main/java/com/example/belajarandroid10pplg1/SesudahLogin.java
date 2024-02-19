package com.example.belajarandroid10pplg1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SesudahLogin extends AppCompatActivity {

    Button Kalkulator,List;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesudah_login);
        Kalkulator = findViewById(R.id.Kalkulator);
        List = findViewById(R.id.ListSiswa);
        Kalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SesudahLogin.this, CalculatorAritmatika.class);
                startActivity(intent);
            }
        });

        List.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SesudahLogin.this, ListSiswa10PPLG1.class);
                startActivity(intent);
            }
        });
    }
}
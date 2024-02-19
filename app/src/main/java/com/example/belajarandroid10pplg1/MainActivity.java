package com.example.belajarandroid10pplg1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    variabel komponen
    EditText txtUsername;
    EditText txtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        txtPassword = findViewById(R.id.txtPassword);
        txtUsername = findViewById(R.id.txtUsername);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtUsername.getText().toString().equals("Satria") && txtPassword.getText().toString().equals("69420")){
                    Toast.makeText(MainActivity.this, "Sign Up Berhasil", Toast.LENGTH_LONG).show();
                    Toast.makeText(MainActivity.this, "Halo " + txtUsername.getText().toString(), Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, SesudahLogin.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this, "Login Salah", Toast.LENGTH_LONG).show();
                }
            }
    });
}}
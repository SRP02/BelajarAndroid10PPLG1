package com.example.belajarandroid10pplg1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ListSiswa10PPLG1 extends AppCompatActivity {

    RecyclerView RVListSiswa10PPLG1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_siswa10_pplg1);
        RVListSiswa10PPLG1 = findViewById(R.id.RVListSiswa10PPLG1);

    }
}
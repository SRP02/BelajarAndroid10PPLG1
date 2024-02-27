package com.example.belajarandroid10pplg1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListSiswa10PPLG1 extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterSiswa10PPLG1 adapter;
    private List<Item_Pelajar> pelajar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_siswa10_pplg1);

        recyclerView = findViewById(R.id.RVListSiswa10PPLG1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        pelajar = new ArrayList<>();

        Item_Pelajar siswa1 = new Item_Pelajar();
        siswa1.setName("Royyan");
        siswa1.setAlamat("Surabaya");
        siswa1.setAbsen("33");
        siswa1.setImageResource("https://www.thesportsdb.com//images//media//team//badge//xzqdr11517660252.png");
        pelajar.add(siswa1);

        Item_Pelajar siswa2 = new Item_Pelajar();
        siswa2.setName("Ocean");
        siswa2.setAlamat("Jogja");
        siswa2.setAbsen("29");
        siswa2.setImageResource("https://www.thesportsdb.com//images//media//team//badge//xzqdr11517660252.png");
        pelajar.add(siswa2);

        Item_Pelajar siswa3 = new Item_Pelajar();
        siswa3.setName("Burhan");
        siswa3.setAlamat("Purbalingga");
        siswa3.setAbsen("9");
        siswa3.setImageResource("https://www.thesportsdb.com//images//media//team//badge//xzqdr11517660252.png");
        pelajar.add(siswa3);

        Item_Pelajar siswa4 = new Item_Pelajar();
        siswa4.setName("Satria");
        siswa4.setAlamat("Pati");
        siswa4.setAbsen("35");
        siswa4.setImageResource("https://www.thesportsdb.com//images//media//team//badge//xzqdr11517660252.png"); // Menggunakan metode setImageResource() untuk menetapkan URL gambar
        pelajar.add(siswa4);

        adapter = new AdapterSiswa10PPLG1(this, pelajar);
        recyclerView.setAdapter(adapter);

    }
}

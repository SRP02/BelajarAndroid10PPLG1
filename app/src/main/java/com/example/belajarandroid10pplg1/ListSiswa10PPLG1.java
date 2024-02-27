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
        pelajar.add(new Item_Pelajar("Abdun Nafi Hibatullah", R.drawable.hatta_profile, "Absen: 1"));
        pelajar.add(new Item_Pelajar("Aldiansyah Fayruz", R.drawable.hatta_profile, "Absen: 2"));
        pelajar.add(new Item_Pelajar("Alikha Mutiara Hati", R.drawable.hatta_profile, "Absen: 3"));
        pelajar.add(new Item_Pelajar("Allam Permata Putra", R.drawable.hatta_profile, "Absen: 4"));
        pelajar.add(new Item_Pelajar("Arbani Akhyar Radjadin", R.drawable.hatta_profile, "Absen: 5"));
        pelajar.add(new Item_Pelajar("Arsya Fauz Marzuki", R.drawable.hatta_profile, "Absen: 6"));
        pelajar.add(new Item_Pelajar("Azzam Fitrawansyah Salim", R.drawable.hatta_profile, "Absen: 7"));
        pelajar.add(new Item_Pelajar("Azzan Isham Alawiy", R.drawable.hatta_profile, "Absen: 8"));
        pelajar.add(new Item_Pelajar("Burhanuddin Zain", R.drawable.hatta_profile, "Absen: 9"));
        pelajar.add(new Item_Pelajar("Daffa Raziq Angie Irawan", R.drawable.hatta_profile, "Absen: 10"));
        pelajar.add(new Item_Pelajar("Dylan Athallah Alam", R.drawable.hatta_profile, "Absen: 11"));
        pelajar.add(new Item_Pelajar("Dzaky Ihsan Rasyid", R.drawable.hatta_profile, "Absen: 12"));
        pelajar.add(new Item_Pelajar("Hilal Syah Amali", R.drawable.hatta_profile, "Absen: 13"));
        pelajar.add(new Item_Pelajar("Jeremy Edward Domenico Sanjaya", R.drawable.hatta_profile, "Absen: 14"));
        pelajar.add(new Item_Pelajar("Jovanco Nicholas Rise", R.drawable.hatta_profile, "Absen: 15"));
        pelajar.add(new Item_Pelajar("Khalisha Kaylanasywa", R.drawable.hatta_profile, "Absen: 16"));
        pelajar.add(new Item_Pelajar("Maulana Arka Narendra", R.drawable.hatta_profile, "Absen: 17"));
        pelajar.add(new Item_Pelajar("Muhammad Asraf El Farras", R.drawable.hatta_profile, "Absen: 18"));
        pelajar.add(new Item_Pelajar("Muhammad Choirul'Anam", R.drawable.hatta_profile, "Absen: 19"));
        pelajar.add(new Item_Pelajar("Muhammad Evan Maxsalmina", R.drawable.hatta_profile, "Absen: 20"));
        pelajar.add(new Item_Pelajar("Muhammad Fakhry Alifahrizq A.", R.drawable.hatta_profile, "Absen: 21"));
        pelajar.add(new Item_Pelajar("Muhammad Rafif Azka Budiawan", R.drawable.hatta_profile, "Absen: 22"));
        pelajar.add(new Item_Pelajar("Muhammad Zuhrizal", R.drawable.hatta_profile, "Absen: 23"));
        pelajar.add(new Item_Pelajar("Nafisah Isbarsani", R.drawable.hatta_profile, "Absen: 24"));
        pelajar.add(new Item_Pelajar("Nail Zhavier Adhyaksa", R.drawable.hatta_profile, "Absen: 25"));
        pelajar.add(new Item_Pelajar("Nasharuddin Hatta", R.drawable.hatta_profile, "Absen: 26"));
        pelajar.add(new Item_Pelajar("Naufal Afdhal Haryda", R.drawable.hatta_profile, "Absen: 27"));
        pelajar.add(new Item_Pelajar("Nicholas Christian Chandra", R.drawable.hatta_profile, "Absen: 28"));
        pelajar.add(new Item_Pelajar("Ocean Karuna Muryanto", R.drawable.hatta_profile, "Absen: 29"));
        pelajar.add(new Item_Pelajar("Pajri Al Fikri Riandi", R.drawable.hatta_profile, "Absen: 30"));
        pelajar.add(new Item_Pelajar("Radithia Arlistian Saputra", R.drawable.hatta_profile, "Absen: 31"));
        pelajar.add(new Item_Pelajar("Rifqi Wibisono Himmawan", R.drawable.hatta_profile, "Absen: 32"));
        pelajar.add(new Item_Pelajar("Royyan Ahmad Zaydan", R.drawable.hatta_profile, "Absen: 33"));
        pelajar.add(new Item_Pelajar("Ruga Zinedine Airinka", R.drawable.hatta_profile, "Absen: 34"));
        pelajar.add(new Item_Pelajar("Satria Rudi Pratama", R.drawable.hatta_profile, "Absen: 35"));
        pelajar.add(new Item_Pelajar("Shofiyyul Hilmi", R.drawable.hatta_profile, "Absen: 36"));
        pelajar.add(new Item_Pelajar("Zaskia Amelia Putri", R.drawable.hatta_profile, "Absen: 37"));

        adapter = new AdapterSiswa10PPLG1(this, pelajar);
        recyclerView.setAdapter(adapter);
    }
}

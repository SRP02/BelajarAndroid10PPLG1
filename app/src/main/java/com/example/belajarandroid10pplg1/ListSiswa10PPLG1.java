package com.example.belajarandroid10pplg1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListSiswa10PPLG1 extends AppCompatActivity implements AdapterSiswa10PPLG1.ItemClickListener {

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
        siswa1.setImageResource("https://i.pinimg.com/736x/4e/22/be/4e22beef6d94640c45a1b15f4a158b23.jpg");
        pelajar.add(siswa1);

        Item_Pelajar siswa2 = new Item_Pelajar();
        siswa2.setName("Ocean");
        siswa2.setAlamat("Jogja");
        siswa2.setAbsen("29");
        siswa2.setImageResource("https://i.pinimg.com/736x/4e/22/be/4e22beef6d94640c45a1b15f4a158b23.jpg");
        pelajar.add(siswa2);

        Item_Pelajar siswa3 = new Item_Pelajar();
        siswa3.setName("Burhan");
        siswa3.setAlamat("Purbalingga");
        siswa3.setAbsen("9");
        siswa3.setImageResource("https://i.pinimg.com/736x/4e/22/be/4e22beef6d94640c45a1b15f4a158b23.jpg");
        pelajar.add(siswa3);

        Item_Pelajar siswa4 = new Item_Pelajar();
        siswa4.setName("Satria");
        siswa4.setAlamat("Pati");
        siswa4.setAbsen("35");
        siswa4.setImageResource("https://i.pinimg.com/736x/4e/22/be/4e22beef6d94640c45a1b15f4a158b23.jpg"); // Menggunakan metode setImageResource() untuk menetapkan URL gambar
        pelajar.add(siswa4);

        Item_Pelajar siswa5 = new Item_Pelajar();
        siswa5.setName("Dzaky");
        siswa5.setAlamat("Bekasi");
        siswa5.setAbsen("12");
        siswa5.setImageResource("https://i.pinimg.com/736x/4e/22/be/4e22beef6d94640c45a1b15f4a158b23.jpg"); // Menggunakan metode setImageResource() untuk menetapkan URL gambar
        pelajar.add(siswa5);

        Item_Pelajar siswa6 = new Item_Pelajar();
        siswa6.setName("Nico");
        siswa6.setAlamat("Jakarta");
        siswa6.setAbsen("28");
        siswa6.setImageResource("https://i.pinimg.com/736x/4e/22/be/4e22beef6d94640c45a1b15f4a158b23.jpg"); // Menggunakan metode setImageResource() untuk menetapkan URL gambar
        pelajar.add(siswa6);

        Item_Pelajar siswa7 = new Item_Pelajar();
        siswa7.setName("Afdhal");
        siswa7.setAlamat("Tangerang");
        siswa7.setAbsen("27");
        siswa7.setImageResource("https://i.pinimg.com/736x/4e/22/be/4e22beef6d94640c45a1b15f4a158b23.jpg"); // Menggunakan metode setImageResource() untuk menetapkan URL gambar
        pelajar.add(siswa7);

        Item_Pelajar siswa8 = new Item_Pelajar();
        siswa8.setName("Hatta");
        siswa8.setAlamat("Jakarta");
        siswa8.setAbsen("26");
        siswa8.setImageResource("https://i.pinimg.com/736x/4e/22/be/4e22beef6d94640c45a1b15f4a158b23.jpg"); // Menggunakan metode setImageResource() untuk menetapkan URL gambar
        pelajar.add(siswa8);

        Item_Pelajar siswa9 = new Item_Pelajar();
        siswa9.setName("Farras");
        siswa9.setAlamat("Kudus");
        siswa9.setAbsen("18");
        siswa9.setImageResource("https://i.pinimg.com/736x/4e/22/be/4e22beef6d94640c45a1b15f4a158b23.jpg"); // Menggunakan metode setImageResource() untuk menetapkan URL gambar
        pelajar.add(siswa9);

        Item_Pelajar siswa10 = new Item_Pelajar();
        siswa10.setName("Nail");
        siswa10.setAlamat("Jakarta");
        siswa10.setAbsen("25");
        siswa10.setImageResource("https://i.pinimg.com/736x/4e/22/be/4e22beef6d94640c45a1b15f4a158b23.jpg"); // Menggunakan metode setImageResource() untuk menetapkan URL gambar
        pelajar.add(siswa10);

        Item_Pelajar siswa11 = new Item_Pelajar();
        siswa11.setName("Rizal");
        siswa11.setAlamat("Sumbawa");
        siswa11.setAbsen("23");
        siswa11.setImageResource("https://i.pinimg.com/736x/4e/22/be/4e22beef6d94640c45a1b15f4a158b23.jpg"); // Menggunakan metode setImageResource() untuk menetapkan URL gambar
        pelajar.add(siswa11);


        adapter = new AdapterSiswa10PPLG1(this, pelajar);
        recyclerView.setAdapter(adapter);

    }
    @Override
    public void onItemClick(View view, int position) {
        String nama = pelajar.get(position).getName();
        String absen = pelajar.get(position).getAbsen();
        String alamat = pelajar.get(position).getAlamat();
        Toast.makeText(this, "Nama : " + nama + "\nNo absen : " + absen + "\nAlamat :" +alamat, Toast.LENGTH_SHORT).show();
    }
}

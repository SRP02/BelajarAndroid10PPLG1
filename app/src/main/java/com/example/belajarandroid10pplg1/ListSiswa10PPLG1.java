package com.example.belajarandroid10pplg1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class ListSiswa10PPLG1 extends AppCompatActivity implements AdapterSiswa10PPLG1.ItemClickListener {

    AdapterSiswa10PPLG1 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_siswa10_pplg1);

        // data to populate the RecyclerView with
        ArrayList<String> NamaLengkap = new ArrayList<>();
        NamaLengkap.add("Abdun Nafi Hibatullah");
        NamaLengkap.add("Aldiansyah Fayruz");
        NamaLengkap.add("Alikha Mutiara Hati");
        NamaLengkap.add("Allam Permata Putra");
        NamaLengkap.add("Arbani Akhyar Radjadin");
        NamaLengkap.add("Arsya Fauz Marzuki");
        NamaLengkap.add("Azzam Fitrawansyah Salim");
        NamaLengkap.add("Azzan Isham Alawiy");
        NamaLengkap.add("Burhanuddin Zain");
        NamaLengkap.add("Daffa Raziq Angie Irawan");
        NamaLengkap.add("Dylan Atallah Allam");
        NamaLengkap.add("Dzaky Ihsan Rasyid");
        NamaLengkap.add("Hilal Syah Amali");
        NamaLengkap.add("Jeremy Edward Domenico Sanjaya");
        NamaLengkap.add("Jovanco Nicolas Rise");
        NamaLengkap.add("Khalisa Kaylanasywa");
        NamaLengkap.add("Maulana Arka Narendra");
        NamaLengkap.add("Muhammad Asraf El Farras");

        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.RVListSiswa10PPLG1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new AdapterSiswa10PPLG1(this, NamaLengkap);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "Anda mengklik " + adapter.getItem(position) + "\n No absen " + (position+1), Toast.LENGTH_SHORT).show();
    }
}

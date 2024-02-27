package com.example.belajarandroid10pplg1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListSiswa10PPLG1 extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterSiswa10PPLG1 adapter;
    private List<Student> students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_siswa10_pplg1);

        recyclerView = findViewById(R.id.RVListSiswa10PPLG1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        students = new ArrayList<>();
        students.add(new Student("Abdun Nafi Hibatullah", R.drawable.hatta_profile, "Absen: 1"));
        students.add(new Student("Aldiansyah Fayruz", R.drawable.hatta_profile, "Absen: 2"));
        students.add(new Student("Alikha Mutiara Hati", R.drawable.hatta_profile, "Absen: 3"));
        students.add(new Student("Allam Permata Putra", R.drawable.hatta_profile, "Absen: 4"));
        students.add(new Student("Arbani Akhyar Radjadin", R.drawable.hatta_profile, "Absen: 5"));
        students.add(new Student("Arsya Fauz Marzuki", R.drawable.hatta_profile, "Absen: 6"));
        students.add(new Student("Azzam Fitrawansyah Salim", R.drawable.hatta_profile, "Absen: 7"));
        students.add(new Student("Azzan Isham Alawiy", R.drawable.hatta_profile, "Absen: 8"));
        students.add(new Student("Burhanuddin Zain", R.drawable.hatta_profile, "Absen: 9"));
        students.add(new Student("Daffa Raziq Angie Irawan", R.drawable.hatta_profile, "Absen: 10"));
        students.add(new Student("Dylan Athallah Alam", R.drawable.hatta_profile, "Absen: 11"));
        students.add(new Student("Dzaky Ihsan Rasyid", R.drawable.hatta_profile, "Absen: 12"));
        students.add(new Student("Hilal Syah Amali", R.drawable.hatta_profile, "Absen: 13"));
        students.add(new Student("Jeremy Edward Domenico Sanjaya", R.drawable.hatta_profile, "Absen: 14"));
        students.add(new Student("Jovanco Nicholas Rise", R.drawable.hatta_profile, "Absen: 15"));
        students.add(new Student("Khalisha Kaylanasywa", R.drawable.hatta_profile, "Absen: 16"));
        students.add(new Student("Maulana Arka Narendra", R.drawable.hatta_profile, "Absen: 17"));
        students.add(new Student("Muhammad Asraf El Farras", R.drawable.hatta_profile, "Absen: 18"));
        students.add(new Student("Muhammad Choirul'Anam", R.drawable.hatta_profile, "Absen: 19"));
        students.add(new Student("Muhammad Evan Maxsalmina", R.drawable.hatta_profile, "Absen: 20"));
        students.add(new Student("Muhammad Fakhry Alifahrizq A.", R.drawable.hatta_profile, "Absen: 21"));
        students.add(new Student("Muhammad Rafif Azka Budiawan", R.drawable.hatta_profile, "Absen: 22"));
        students.add(new Student("Muhammad Zuhrizal", R.drawable.hatta_profile, "Absen: 23"));
        students.add(new Student("Nafisah Isbarsani", R.drawable.hatta_profile, "Absen: 24"));
        students.add(new Student("Nail Zhavier Adhyaksa", R.drawable.hatta_profile, "Absen: 25"));
        students.add(new Student("Nasharuddin Hatta", R.drawable.hatta_profile, "Absen: 26"));
        students.add(new Student("Naufal Afdhal Haryda", R.drawable.hatta_profile, "Absen: 27"));
        students.add(new Student("Nicholas Christian Chandra", R.drawable.hatta_profile, "Absen: 28"));
        students.add(new Student("Ocean Karuna Muryanto", R.drawable.hatta_profile, "Absen: 29"));
        students.add(new Student("Pajri Al Fikri Riandi", R.drawable.hatta_profile, "Absen: 30"));
        students.add(new Student("Radithia Arlistian Saputra", R.drawable.hatta_profile, "Absen: 31"));
        students.add(new Student("Rifqi Wibisono Himmawan", R.drawable.hatta_profile, "Absen: 32"));
        students.add(new Student("Royyan Ahmad Zaydan", R.drawable.hatta_profile, "Absen: 33"));
        students.add(new Student("Ruga Zinedine Airinka", R.drawable.hatta_profile, "Absen: 34"));
        students.add(new Student("Satria Rudi Pratama", R.drawable.hatta_profile, "Absen: 35"));
        students.add(new Student("Shofiyyul Hilmi", R.drawable.hatta_profile, "Absen: 36"));
        students.add(new Student("Zaskia Amelia Putri", R.drawable.hatta_profile, "Absen: 37"));

        adapter = new AdapterSiswa10PPLG1(this, students);
        recyclerView.setAdapter(adapter);
    }
}

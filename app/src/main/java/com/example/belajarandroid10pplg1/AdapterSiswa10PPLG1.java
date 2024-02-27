package com.example.belajarandroid10pplg1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class AdapterSiswa10PPLG1 extends  RecyclerView.Adapter<AdapterSiswa10PPLG1.ViewHolder> {

    private List<Item_Pelajar> students;
    private Context context;

    public AdapterSiswa10PPLG1(Context context, List<Item_Pelajar> students) {
        this.context = context;
        this.students = students;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textAbsen;
        ImageView imageView;
        TextView textAlamat;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.tvNamaLengkap);
            textAbsen = itemView.findViewById(R.id.tvNoAbsen);
            imageView = itemView.findViewById(R.id.IVitem);
            textAlamat = itemView.findViewById(R.id.tvAlamat);
        }
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Item_Pelajar student = students.get(position);
        holder.textViewName.setText(student.getName());
        holder.textAbsen.setText(student.getAbsen());
        holder.textAlamat.setText(student.getAlamat());

// Memuat gambar menggunakan Glide
        Glide.with(context)
                .load(student.getImageResource())
                .into(holder.imageView);
    }


    @Override
    public int getItemCount() {
        return students.size();
    }
}


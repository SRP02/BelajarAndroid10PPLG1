package com.example.belajarandroid10pplg1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterSiswa10PPLG1 extends  RecyclerView.Adapter<AdapterSiswa10PPLG1.ViewHolder> {

    private List<Student> students;
    private Context context;

    public AdapterSiswa10PPLG1(Context context, List<Student> students) {
        this.context = context;
        this.students = students;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewDescription;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.tvNamaLengkap);
            textViewDescription = itemView.findViewById(R.id.tvNoAbsen);
            imageView = itemView.findViewById(R.id.IVitem);
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

        Student student = students.get(position);

        holder.textViewName.setText(student.getName());
        holder.textViewDescription.setText(student.getAttendanceDescription());
        holder.imageView.setImageResource(student.getImageResource());
    }


    @Override
    public int getItemCount() {
        return students.size();
    }
}

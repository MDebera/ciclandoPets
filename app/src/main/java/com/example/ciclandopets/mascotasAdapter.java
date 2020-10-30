package com.example.ciclandopets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class mascotasAdapter extends RecyclerView.Adapter<mascotasAdapter.ViewHolder> {

    Context context;
    String[] favoritList;
    int[] mascotPics;
    int[] huesoBlanco;
    int[] huesoAmarillo;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView mascota;
        ImageView huesoBlanco;
        ImageView huesoAmarillo;
        TextView nombre;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mascota = itemView.findViewById(R.id.foto);
/*            huesoBlanco = itemView.findViewById(R.id.huesoBlanco);
            huesoAmarillo = itemView.findViewById(R.id.huesoAmarillo);*/
            nombre = itemView.findViewById(R.id.nombre);
        }
    }

    public mascotasAdapter (Context context, int[] mascota, String[] nombre){
        /*    public mascotasAdapter (Context context, int[] mascota, int[] huesoBlanco, int[] huesoAmarillo, String[] nombre){*/
        this.context = context;
        this.mascotPics = mascota;
/*        this.huesoBlanco = huesoBlanco;
        this.huesoAmarillo = huesoAmarillo;*/
        this.favoritList = nombre;
    }


    @NonNull
    @Override
    public mascotasAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.unamascota, parent, false);
        ViewHolder ViewHolder = new ViewHolder(view);
        return ViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull mascotasAdapter.ViewHolder holder, int position) {
        holder.mascota.setImageResource(mascotPics[position]);
        /*holder.huesoBlanco.setImageResource(huesoBlanco[position]);*/
        /*holder.huesoAmarillo.setImageResource(huesoAmarillo[position]);*/
        holder.nombre.setText(favoritList[position]);

    }

    @Override
    public int getItemCount() {
        return favoritList.length;
    }
}

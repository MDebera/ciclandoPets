package com.example.ciclandopets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class favoritasAdapter extends RecyclerView.Adapter<favoritasAdapter.ViewHolder> {

    Context context;
    String[] favoritList;
    int[] favoritPics;
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

    public favoritasAdapter(Context context, int[] mascota, String[] nombre){
        /*    public mascotasAdapter (Context context, int[] mascota, int[] huesoBlanco, int[] huesoAmarillo, String[] nombre){*/
        this.context = context;
        this.favoritPics = mascota;
/*        this.huesoBlanco = huesoBlanco;
        this.huesoAmarillo = huesoAmarillo;*/
        this.favoritList = nombre;
    }


    @NonNull
    @Override
    public favoritasAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.unamascota, parent, false);
        ViewHolder ViewHolder = new ViewHolder(view);
        return ViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull favoritasAdapter.ViewHolder holder, int position) {
        holder.mascota.setImageResource(favoritPics[position]);
        /*holder.huesoBlanco.setImageResource(huesoBlanco[position]);*/
        /*holder.huesoAmarillo.setImageResource(huesoAmarillo[position]);*/
        holder.nombre.setText(favoritList[position]);

    }

    @Override
    public int getItemCount() {
        return favoritList.length;
    }
}

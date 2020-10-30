package com.example.ciclandopets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class favoritas extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter favoritasAdapter;
    RecyclerView.LayoutManager layoutManager;
    String[] favoritList = {"Bambalina","Firulete","Chulardo","Estrepto","Meninga"};
    int[] favoritPics = {R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4, R.drawable.p5};
    /*int[] huesoBlanco = {R.drawable.oseo};
    int[] huesoAmarillo = {R.drawable.oseo2};*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rvMascotas);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        favoritasAdapter = new mascotasAdapter (this, favoritPics, favoritList);
        /*mascotAdapter = new mascotasAdapter (this, favoritPics, huesoBlanco, huesoAmarillo, favoritList);*/
        recyclerView.setAdapter(favoritasAdapter);


    }



}
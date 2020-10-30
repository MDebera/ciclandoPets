package com.example.ciclandopets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter mascotAdapter;
    RecyclerView.LayoutManager layoutManager;
    String[] mascotList = {"Bambalina","Firulete","Chulardo","Estrepto","Meninga","Rigobert","noSabe","NoContesta"};
    int[] mascotPics = {R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4, R.drawable.p5, R.drawable.p6, R.drawable.p7, R.drawable.p8};
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
        mascotAdapter = new mascotasAdapter (this, mascotPics, mascotList);
        /*mascotAdapter = new mascotasAdapter (this, mascotPics, huesoBlanco, huesoAmarillo, mascotList);*/
        recyclerView.setAdapter(mascotAdapter);



    }

    public void call2 (View v) {
        Intent i = new Intent (this, favoritas.class);
        startActivity(i);

    }

}
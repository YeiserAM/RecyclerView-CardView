package com.example.tarearecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListElement> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }
    public void init (){
        elements = new ArrayList<>();
        elements.add(new ListElement("#008000", "Paola", "Peru", "Activo"));
        elements.add(new ListElement("#FF00FF", "Gabriela", "Chile", "Desconectado"));
        elements.add(new ListElement("#800000", "Brisa", "Ecuador", "Activo"));
        elements.add(new ListElement("#808080", "Luz", "Argentina", "Desconectado"));
        elements.add(new ListElement("#000000", "Isabel", "Mexico", "Activo"));

        ListAdapter listAdapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}
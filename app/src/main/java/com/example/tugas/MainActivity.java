package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //pemberian variable
    RecyclerView recyclerView;
    MoviesRecyclerViewAdapter adapter;
    ArrayList<Movies> objMovies = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.buttonback2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DaftarMenu.class);
                startActivity(intent);
                finish();
            }
        });

        recyclerView = findViewById(R.id.recyclerView);
        //memasukkan data untuk movies seperti rating tittle dll yang sudah di setting sebelumnya
        objMovies.add(new Movies("The Suicide Squad","Action,Adventure,Comedy","James Gunn",7.3,"Supervillains Harley Quinn, Bloodsport, Peacemaker and a collection of nutty cons at Belle Reve prison join the super-secret, super-shady Task Force X as they are dropped off at the remote, enemy-infused island of Corto Maltese.","6 Agustus 2021"));
        objMovies.add(new Movies("The Suicide Squad","Action,Adventure,Comedy","James Gunn",7.3,"Supervillains Harley Quinn, Bloodsport, Peacemaker and a collection of nutty cons at Belle Reve prison join the super-secret, super-shady Task Force X as they are dropped off at the remote, enemy-infused island of Corto Maltese.","6 Agustus 2021"));

        //adapter untuk dimasukkan ke MoviesRecyclerViewAdapter sesuai dengan yang di inputkan
        // pada obj movies
        adapter = new MoviesRecyclerViewAdapter(objMovies);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
}
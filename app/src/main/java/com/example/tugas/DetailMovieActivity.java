package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Movie;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetailMovieActivity extends AppCompatActivity {
        //Membuat variabel untuk text view yang nantinya akan di masukkan melalui id masing masing pada layout
        TextView textViewTittle,textViewRating,textViewGenre,textViewReleaseDate,textViewDirector,textViewDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        //menset nilai textview tersebut sama dengan id yang ada pada layout
        textViewTittle = findViewById(R.id.tvTittle);
        textViewRating = findViewById(R.id.tvRating);
        textViewDescription = findViewById(R.id.tvDescription);
        textViewDirector = findViewById(R.id.tvDirector);
        textViewGenre = findViewById(R.id.tvGenre);
        textViewReleaseDate = findViewById(R.id.tvReleaseDate);

        //untuk memasukkan nilai get dari objMovie yang nanti di masukkan
        Movies movies = getIntent().getParcelableExtra("MOVIES");
        textViewTittle.setText(movies.getTittle());
        textViewGenre.setText(movies.getGenre());
        textViewReleaseDate.setText(movies.getReleasedate());
        textViewDirector.setText(movies.getDirector());
        textViewDescription.setText(movies.getDescription());
        //karena ini merupakan tipe data double maka akan di konversi menjadi String agar lebih mudah
        textViewRating.setText(String.valueOf(movies.getRating()));
    }
}
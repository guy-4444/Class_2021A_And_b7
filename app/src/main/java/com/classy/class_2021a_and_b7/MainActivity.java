package com.classy.class_2021a_and_b7;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView main_LST_names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_LST_names = findViewById(R.id.main_LST_names);

        ArrayList<Movie> movies = MovieMockDB.generateMovies();

        Adapter_Movie adapter_movie = new Adapter_Movie(this, movies);
        adapter_movie.setClickListener(new Adapter_Movie.MyItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this, movies.get(position).getName(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onReadMoreClicked(View view, Movie movie) {
                openInfo(movie);
            }
        });

        main_LST_names.setLayoutManager(new LinearLayoutManager(this));
        main_LST_names.setAdapter(adapter_movie);
    }

    private void openInfo(Movie movie) {
        // https://stackoverflow.com/a/50309163/7147289
        new AlertDialog.Builder(this)
                .setTitle(movie.getName())
                .setMessage(movie.getContent())
                .setPositiveButton("Close", null)
                .show();
    }
}
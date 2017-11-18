package com.example.danielfigueiredo.aula2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.danielfigueiredo.aula2.RecyclerView.LineAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<StarWarsItemDto> list = new ArrayList<StarWarsItemDto>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people);

        Toolbar toolbar = findViewById(R.id.toolbar_people);
        this.setSupportActionBar(toolbar);
        recyclerView = findViewById(R.id.recycler_view);

        // populateMenuList();
        populatePeopleList();

        setUpRecylerView();
    }

    private void setUpRecylerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        LineAdapter adapter = new LineAdapter(this.list);
        recyclerView.setAdapter(adapter);
    }

    private void populateMenuList() {
        list.add(new StarWarsItemDto("People", R.drawable.icon_user));
        list.add(new StarWarsItemDto("Starship", R.drawable.starship));
        list.add(new StarWarsItemDto("Film", R.drawable.movie));
        list.add(new StarWarsItemDto("Planets", R.drawable.globe));
    }

    private void populatePeopleList() {
        list.add(new StarWarsItemDto("Oi <3", R.drawable.icon_user));
        list.add(new StarWarsItemDto("Luke Skywalker", R.drawable.icon_user));
        list.add(new StarWarsItemDto("Obi-wan", R.drawable.icon_user));
        list.add(new StarWarsItemDto("Hans Solo", R.drawable.icon_user));
        list.add(new StarWarsItemDto("Lando", R.drawable.icon_user));
        list.add(new StarWarsItemDto("Padmé", R.drawable.icon_user));
        list.add(new StarWarsItemDto("Boba Fett", R.drawable.icon_user));
    }
}

package com.example.eva1_9_listas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener{

    ListView listaPokemon;
    TextView textoPokemon;

    private String[] pokemones = {
            "Charmander",
            "Squirtle",
            "Bulbasaur",
            "Umbreon",
            "Gengar",
            "Alakazam",
            "Dragonite",
            "Zapdos",
            "Moltres",
            "Articuno",
            "Mewtwo",
            "Mew",
            "Luxray",
            "Zubat",
            "Metapod",
            "Magikarp",
            "Suicune"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaPokemon = findViewById(R.id.listaPokemon);
        listaPokemon.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pokemones));
        listaPokemon.setOnItemClickListener(this);

        textoPokemon = findViewById(R.id.textoPokemon);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //Toast.makeText(this, pokemones[i], Toast.LENGTH_SHORT).show();
        textoPokemon.setText(pokemones[i]);
    }
}

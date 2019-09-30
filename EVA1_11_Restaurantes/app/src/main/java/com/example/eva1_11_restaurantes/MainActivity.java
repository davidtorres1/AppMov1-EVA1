package com.example.eva1_11_restaurantes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    Restaurante[] Restaurantes = {
            new Restaurante(),
            new Restaurante(R.drawable.f1, "New York", "cacapopo"),
            new Restaurante(R.drawable.f2, "Sushi", "ore wa mou shinderiu"),
            new Restaurante(R.drawable.f3, "Veganolandia", "aiuda we")
    };

    ListView miLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miLista =findViewById(R.id.miLista);
        miLista.setAdapter(new RestAdapter(this, R.layout.layout_rest, Restaurantes));
        miLista.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, Restaurantes[i].getNombre(), Toast.LENGTH_SHORT).show();
    }
}

package com.example.eva1_10_lista_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    Clima[] Ciudades = {
            new Clima(),
            new Clima(R.drawable.sunny, "Camargo", 25, "Chido"),
            new Clima(R.drawable.rainy, "Delicias", 18, "Pedorro"),
            new Clima(R.drawable.atmospher, "Parrar", 14, "Normal"),
            new Clima(R.drawable.cloudy, "Chihuahua", 21, "Masomenos"),
            new Clima(R.drawable.tornado, "Juarez", 23, "Gacho"),
    };

    ListView listaClima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaClima = findViewById(R.id.listaClima);
        listaClima.setAdapter(new ClimaAdapter(this, R.layout.layout_clima, Ciudades));
        listaClima.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, Ciudades[i].getCiudad(), Toast.LENGTH_SHORT).show();
    }
}

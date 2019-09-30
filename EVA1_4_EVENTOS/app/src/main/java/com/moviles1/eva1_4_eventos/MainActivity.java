package com.moviles1.eva1_4_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnPorInt;
    private Button btnClaseAnonima;
    private Button btnClase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPorInt = findViewById(R.id.button2);
        btnPorInt.setOnClickListener(this);

        btnClaseAnonima = findViewById(R.id.btn_clase_anonima);
        btnClaseAnonima.setOnClickListener( new  View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Por clase anonima",Toast.LENGTH_SHORT).show();
            }
        });

        MiEventoClick mi_evento_click = new MiEventoClick();
        mi_evento_click.setApp_context(getApplicationContext());
        btnClase = findViewById(R.id.btn_class);
        btnClase.setOnClickListener(mi_evento_click);
    }

    public void miClick(View button){
        Toast.makeText(this,"Por XML",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        String mensaje = "Mensaje por interfaz";
        Toast.makeText(this,mensaje,Toast.LENGTH_SHORT).show();

    }
}

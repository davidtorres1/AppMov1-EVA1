package com.example.eva1_11_restaurantes;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class RestAdapter extends ArrayAdapter<Restaurante> {

    Context context;
    int resource;
    Restaurante[] Restaurantes;

    public RestAdapter(Context context, int resource, Restaurante[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.Restaurantes = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgImagen;
        TextView txtTitulo, txtSub;

        if(convertView == null){
            //Crear nuestro layout que representa una fila en la lista
            //INFLATER
            LayoutInflater lInflator = ((Activity) context).getLayoutInflater();
            convertView = lInflator.inflate(resource, parent, false);
        }

        imgImagen = convertView.findViewById(R.id.imgImagen);
        txtTitulo = convertView.findViewById(R.id.txtTitulo);
        txtSub = convertView.findViewById(R.id.txtSub);

        imgImagen.setImageResource(Restaurantes[position].getImagen());
        txtTitulo.setText(Restaurantes[position].getNombre());
        txtSub.setText(Restaurantes[position].getLema());


        return convertView;
    }
}

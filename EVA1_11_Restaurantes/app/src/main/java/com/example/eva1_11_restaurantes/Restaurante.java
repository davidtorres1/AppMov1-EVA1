package com.example.eva1_11_restaurantes;

public class Restaurante {
    private int imagen;
    private String nombre;
    private String lema;

    public Restaurante(){
        imagen = R.drawable.f1;
        nombre = "Carl´s JR";
        lema = "Eat like you mean it";
    }

    public Restaurante(int imagen, String nombre, String lema){
        this.imagen = imagen;
        this.nombre = nombre;
        this. lema = lema;
    }

    public int getImagen() {
        return imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLema() {
        return lema;
    }
}

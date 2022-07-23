package com.mycompany.reto5;

public class Charmander extends Pokemon{
    private String nombre;
    private byte nivel;
    private int salud;

    public Charmander(String nombre, byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    public Charmander(String nombre) {
        this.nivel = 0;
        this.salud = 100;
    }

    Charmander() {
    }

    @Override
    public Pokemon getEvolucionar() {
        Pokemon Charmeleon = null;
        return Charmeleon;
    }

    @Override
    public String getGritar() {
        return "Charmander!";
    }
    
}

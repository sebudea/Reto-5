package com.mycompany.reto5;

public class Charmeleon extends Pokemon{
    private String nombre;
    private byte nivel;
    private int salud;

    public Charmeleon(String nombre, byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    @Override
    public Pokemon getEvolucionar() {
        Pokemon Charizard = null;
        return Charizard;
    }

    @Override
    public String getGritar() {
        return "Charmeleon!";
    }
    
}

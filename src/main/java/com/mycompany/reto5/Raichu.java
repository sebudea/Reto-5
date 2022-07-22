package com.mycompany.reto5;

public class Raichu extends Pokemon{
    private String nombre;
    private byte nivel;
    private int salud;

    public Raichu(String nombre, byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    public Raichu() {
    }
    
    

    @Override
    public Pokemon getEvolucionar() {
        return null;
    }

    @Override
    public String getGritar() {
        return "Raichu!";
    }
    
}

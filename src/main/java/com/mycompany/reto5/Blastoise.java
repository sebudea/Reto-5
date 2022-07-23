package com.mycompany.reto5;

public class Blastoise extends Pokemon{
    private String nombre;
    private byte nivel;
    private int salud;

    public Blastoise(String nombre, byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }
    
    

    @Override
    public Pokemon getEvolucionar() {
        return null;
    }

    @Override
    public String getGritar() {
        return "Blastoise!";
    }
    
}

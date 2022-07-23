
package com.mycompany.reto5;

public class Squirtle extends Pokemon{
    private String nombre;
    private byte nivel;
    private int salud;

    public Squirtle(String nombre, byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }
    
    @Override
    public Pokemon getEvolucionar() {
        Pokemon Wartortle = null;
        return Wartortle;
    }

    @Override
    public String getGritar() {
        return "Squirtle!";
    }
    
}

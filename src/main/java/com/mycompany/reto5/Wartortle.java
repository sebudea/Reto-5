package com.mycompany.reto5;

public class Wartortle extends Pokemon{
    private String nombre;
    private byte nivel;
    private int salud;

    public Wartortle(String nombre, byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    Wartortle() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    @Override
    public Pokemon getEvolucionar() {
        Pokemon Blastoise = null;
        return Blastoise;
    }

    @Override
    public String getGritar() {
        return "Wartortle!";
    }
    
}

package com.mycompany.reto5;

/*Grupo de actividad Sebastian Aristizabal y Sebastian Gomez
*/
public class Reto5 {

    public static void main(String[] args) {

        Pokebola pokebolaRoja = new Pokebola();
        Pokemon fuego = new Charmander();
        pokebolaRoja.setPokemon(fuego);
        
        System.out.println(pokebolaRoja.getPokemon());
        
        Pokemon elektriko = new Pikachu();
        
        Pokebola pokebola2 = new Pokebola();
        
        Pokemon elektriko3 = new Pikachu();
        
        Pokebola pokebola3 = new Pokebola();
        
        Pokemon agua = new Wartortle();
        
        Pokebola pokebola4 = new Pokebola();


    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *
 * @author J4
 */
public class Pokemon {
    
    private int pokemonID;
    private String pokemonAdi;
    private String pokemonTip;

    public Pokemon(){
        pokemonAdi="Henüz girilmedi";
        pokemonTip="Henüz girilmedi";
    }
    public Pokemon(String pokemonAdi, String pokemonTip) {
        setPokemonAdi(pokemonAdi);
        setPokemonTip(pokemonTip);
    }

    public int getPokemonID() {
        return pokemonID;
    }

    public void setPokemonID(int pokemonID) {
        this.pokemonID = pokemonID;
    }

    public String getPokemonAdi() {
        return pokemonAdi;
    }

    public void setPokemonAdi(String pokemonAdi) {
        this.pokemonAdi = pokemonAdi;
    }

    public String getPokemonTip() {
        return pokemonTip;
    }

    public void setPokemonTip(String pokemonTip) {
        this.pokemonTip = pokemonTip;
    }
    
    public void hasarPuaniGoster(){
        System.out.println("");
    }
    public int hasarPuaniDondur(){
        return 0;
    }
    
}

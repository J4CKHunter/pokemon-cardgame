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
public class Butterfree extends Pokemon{
    
    private final int hasarPuani=10;
    private boolean kartKullanildiMi;

    public Butterfree() {
        super();
        kartKullanildiMi=false;
    }

    public Butterfree(String pokemonAdi, String pokemonTip) {
        super(pokemonAdi, pokemonTip);
        kartKullanildiMi=false;
    }

    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }

    public int getHasarPuani() {
        return hasarPuani;
    }
    
    @Override
    public void hasarPuaniGoster(){
        System.out.println(hasarPuani);
    }
    
    @Override
    public int hasarPuaniDondur(){
        return getHasarPuani();
    }
    
}

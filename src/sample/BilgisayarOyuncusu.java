/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.util.Random;

/**
 *
 * @author J4
 */
public class BilgisayarOyuncusu extends Oyuncu{

    Random rand=new Random();
    
    public BilgisayarOyuncusu() {
        super();
    }

    public BilgisayarOyuncusu(String oyuncuID, String oyuncuAdi, int skor) {
        super(oyuncuID, oyuncuAdi, skor);
    }

    
    @Override
    public Pokemon kartSec() {
        Pokemon x=kartListesi.get(rand.nextInt(kartListesi.size()));
        kartListesi.remove(x);
        return x;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.util.ArrayList;

/**
 *
 * @author J4
 */
public abstract class Oyuncu {
    
    private String oyuncuID;
    private String oyuncuAdi;
    private int skor;

    public Oyuncu() {
        setOyuncuID("Henüz Girilmedi");
        setOyuncuAdi("Henüz girilmedi");
        setSkor(0);
    }

    public Oyuncu(String oyuncuID, String oyuncuAdi, int skor) {
        setOyuncuID(oyuncuID);
        setOyuncuAdi(oyuncuAdi);
        setSkor(skor);
    }

    public String getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(String oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }
    
    public void SkorGoster(){
        System.out.println(getSkor());
    }
    
    ArrayList<Pokemon> kartListesi=new ArrayList<Pokemon>(3);
    
    public abstract Pokemon kartSec();
    
}

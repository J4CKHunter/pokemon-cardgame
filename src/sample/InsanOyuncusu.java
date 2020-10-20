/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.util.Random;

public class InsanOyuncusu extends Oyuncu{

    public InsanOyuncusu() {
        super();
    }

    public InsanOyuncusu(String oyuncuID, String oyuncuAdi, int skor) {
        super(oyuncuID, oyuncuAdi, skor);
    }
    
    // BURASI FX NE İSTİYOR BİLMİYORUM.ONA GÖRE DÜZENLE.POKEMON DÖNDÜR.
    // MOUSE CLIKI İLE SEÇİM NASIL OLUCAK YANİ ONLARI BİLMİYORUM.
    Random rand=new Random();
    //@Override
    public Pokemon kartal(int a,int b)
    {
        //Pokemon x;
        Pokemon x=kartListesi.get(rand.nextInt(kartListesi.size()));
        Random rand=new Random();
        int i,kontrol=b;
        
        
        if(a==1){
            
            if(2==kartListesi.size()){
                if(kontrol==1){
                    i=rand.nextInt(2);
                    x=kartListesi.get(i);
                    kartListesi.remove(x);
                }
                else if(kontrol==2){
                    x=kartListesi.get(0);
                    kartListesi.remove(x);
                }
                else{
                    x=kartListesi.get(0);
                    kartListesi.remove(x);
            
                }
                
            }
            
            else if(1==kartListesi.size()){
                
                x=kartListesi.get(0);
                kartListesi.remove(x);
                
            }
            
            else{
                
                x=kartListesi.get(0);
                kartListesi.remove(x);
                
            }
        }
            
        
        
        if(a==2){
            if(2==kartListesi.size()){
                if(kontrol==1){
                    x=kartListesi.get(0);
                    kartListesi.remove(x);
                    
                }
                else if(kontrol==2){
                    i=rand.nextInt(2);
                    x=kartListesi.get(i);
                    kartListesi.remove(x);
                }
                else{
                    x=kartListesi.get(1);
                    kartListesi.remove(x);
            
                }
                
            }
            else if(1==kartListesi.size()){
                
                x=kartListesi.get(0);
                kartListesi.remove(x);
                
            }
            
            else{
                
                x=kartListesi.get(1);
                kartListesi.remove(x);
                
            }

        }
        
        if(a==3){
            if(2==kartListesi.size()){
                if(kontrol==1){
                    x=kartListesi.get(1);
                    kartListesi.remove(x);
                    
                }
                else if(kontrol==2){
                    x=kartListesi.get(1);
                    kartListesi.remove(x);
                }
                else{
                    i=rand.nextInt(2);
                    x=kartListesi.get(i);
                    kartListesi.remove(x);
                }
                
            }
            else if(1==kartListesi.size()){
                
                x=kartListesi.get(0);
                kartListesi.remove(x);
            }
            
            else{
                
                x=kartListesi.get(2);
                kartListesi.remove(x);
            }
        } 
        
        return x;
        
    }
    
    @Override
    public Pokemon kartSec() {
        Pokemon x=kartListesi.get(rand.nextInt(kartListesi.size()));
        kartListesi.remove(x);
        return x;
    }
    
}

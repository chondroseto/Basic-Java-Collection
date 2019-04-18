/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ovr;

/**
 *
 * @author chondroseto
 */
public class Balok {
    private int panjang;
    private int lebar;
    private int tinggi;
    
    public Balok(){
        
    }

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

   public double volume(){
       return this.panjang*this.lebar*this.tinggi;
   }
   public double volume(int panjang){
       return panjang*this.lebar*this.tinggi;
   }
   public double volume(double panjang){
       return panjang*this.lebar*this.tinggi;
   }
   public double volume(double panjang, int lebar, int tinggi){
       return panjang*lebar*tinggi;
   }
   public double volume(int panjang, double lebar, int tinggi){
       return panjang*lebar*tinggi;
   } 


    @Override
    public String toString() {
        return "Balok{" + "panjang=" + panjang + ", lebar=" + lebar + ", tinggi=" + tinggi + '}';
    }
   
}

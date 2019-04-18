/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interf;

/**
 *
 * @author chondroseto
 */
public class Persegipanjang implements Bangundatar{
    private final double panjang, lebar;
    
    public Persegipanjang(double p,double l){
        panjang = p;
        lebar = l;
    }
    public double getPanjang(){
        return panjang;
    }
    public double getLebar(){
        return lebar;
    }

    public double HitungLuas() {
        return (panjang*lebar);
    }
    public double HitungKeliling() {
        return (2*(panjang*lebar));
    }

    public String displayInfo() {
        return ("Persegipanjang"
                + "\no panjang : " + (float)getPanjang()
                + "\no lebar : " + (float)getLebar()
                + "\no luas : " + (float)HitungLuas()
                + "\no keliling : " + (float)HitungKeliling());
                
    }

   
    
    
}

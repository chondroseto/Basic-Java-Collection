/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

/**
 *
 * @author chondroseto
 */
public class Persegi {
    /*-- information hiding --*/
private int panjang;
private int lebar;
 
public int getLebar() {
return lebar;
}
 
public void setLebar(int lebar) {
this.lebar = lebar;
}
 
public int getPanjang() {
return panjang;
}
 
public void setPanjang(int panjang) {
this.panjang = panjang;
}
 
/*-- constructor --*/
public Persegi(){
int p = 0;
int l = 0;
}
 
public int luas(int p, int l){
return p * l;
}
 
public int getLuas(){
return luas(panjang, lebar);
}
    
}

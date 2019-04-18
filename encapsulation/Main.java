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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persegi p = new Persegi();
p.setPanjang(12);
p.setLebar(6);
 
System.out.println("Panjang: " + p.getPanjang());
System.out.println("Lebar: " + p.getLebar());
System.out.println("Luas persegi: " + p.getLuas());

        // TODO code application logic here
    }
    
}

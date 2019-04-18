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
public class MainOverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Balok b1 = new Balok();
       Balok b2 = new Balok(10,5,3);
       System.out.println(b1);
       System.out.println(b2);
       System.out.println("Volume b1 = "+b1.volume());
       System.out.println("Volume b2 = "+b2.volume());
       System.out.println("Volume b2 panjang = "+b2.volume(11));
       System.out.println("Volume b1 = "+b1.volume(12,5.0,4));
       System.out.println("info bil = "+b1);
       
    }
    
}

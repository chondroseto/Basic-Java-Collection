/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfisme;

/**
 *
 * @author chondroseto
 */
public class Suara {
    public void suara () {
        System.out.println("Suara binatang ...");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Suara binatang = new Suara();
        Kucing k = new Kucing();
        Ayam a = new Ayam();
        Tikus t = new Tikus();
        
        binatang.suara();
        k.suara();
        a.suara();
        t.suara();
        // TODO code application logic here
    }
    
}

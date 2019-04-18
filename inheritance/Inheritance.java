/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perwarisan;

/**
 *
 * @author chondroseto
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Mobil mbl = new Mobil ("Xenia","B 239 D","manual","");
            Profil[] myProf = {mbl};
            
            for (Profil prof : myProf){
                System.out.println(prof);
            }
     System.out.println("tipe mobil :"+mbl.getNamaMobil());
    }
    
    
}

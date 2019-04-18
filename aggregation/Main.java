/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agregasi;

/**
 *
 * @author chondroseto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dosen dsn = new Dosen("1234","Doni","RPL");
        Mahasiswa mhs = new Mahasiswa("152016046","seto","bandung",18);
        dsn.setBimbingan(mhs);
        System.out.println("info dosen : "+dsn);
        System.out.println("mhs bimbingan : "+dsn.getBimbingan());
    }
    
}

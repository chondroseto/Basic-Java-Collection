/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asosiasi;

/**
 *
 * @author chondroseto
 */
public class MainClass {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mahasiswa m1 = new Mahasiswa();
        m1.setNim("152016046");
        m1.setNama("Seto");
        Mahasiswa m2 = new Mahasiswa();
        m2.setNim("152016046");
        m2.setNama("raffi");
        
        Dosen d = new Dosen();
        d.setKodeDosen("D112");
        
        d.setNimMahasiswa(m1.getNim());
        d.setNimMahasiswa(m2.getNim());
        
        System.out.println("Kode Dosen = "+d.getKodeDosen());
        System.out.println("Mengajar Mahasiswa");
        
        int jum = d.getJmlMhsw();
        
        for (int i=0; i <jum; i++){
            System.out.println(" - "+d.getNimMHS(i));
        }
        
        
        
        
        // TODO code application logic here
    }
    
}

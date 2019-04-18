/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortArray;
import java.util.Arrays;
/**
 *
 * @author chondroseto
 */
public class Sortir {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Mahasiswa[] nMahasiswa = { new Mahasiswa(43, "Rifqi"),
            new Mahasiswa(73, "Sony"),
            new Mahasiswa(32, "Alit")
        };
        System.out.println("Daftar Nama Anggota:");
        for(Mahasiswa x: nMahasiswa){
            System.out.println(x.toString());
        }

        //urutkan dan tampilkan kembali
        Arrays.sort(nMahasiswa);
        System.out.println("\nDaftar Nama Anggota:");
        for(Mahasiswa x: nMahasiswa){
            System.out.println(x.toString());
        }
    
    }
    
}

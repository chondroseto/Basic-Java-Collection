
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortArray;

/**
 *
 * @author chondroseto
 */
public class Mahasiswa implements Comparable<Mahasiswa>  {
    private int berat; 
    private String nama;

    @Override
    public String toString() {
        return nama+" punya berat "+berat;
    }

    public Mahasiswa(int berat, String nama) {
        this.berat = berat;
        this.nama = nama;
    }
    
    public int compareTo(Mahasiswa o) {
        if (this.berat < o.berat) {
            return -1;
        } else if (this.berat == o.berat) {
            return 0;
        } else {
            return 1;
        }


    }
}

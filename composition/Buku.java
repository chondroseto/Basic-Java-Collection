/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komposisi;

/**
 *
 * @author chondroseto
 */
public class Buku {
    private String nama;
    private int halaman;

    public Buku(String nama, int halaman) {
        this.nama = nama;
        this.halaman = halaman;
    }

    public String getNama() {
        return nama;
    }

    public int getHalaman() {
        return halaman;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }

    @Override
    public String toString() {
        return "Buku{" + "nama=" + nama + ", halaman=" + halaman + '}';
    }
    
    
}

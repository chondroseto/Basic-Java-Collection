/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agregasi;

/**
 * 
 *
 * @author chondroseto
 */
public class Dosen {
    private String nip;
    private String nama;
    private String kompetensi;
    private Mahasiswa bimbingan;

    public Dosen(String nip, String nama, String kompetensi) {
        this.nip = nip;
        this.nama = nama;
        this.kompetensi = kompetensi;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getKompetensi() {
        return kompetensi;
    }

    public Mahasiswa getBimbingan() {
        return bimbingan;
    }


    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKompetensi(String kompetensi) {
        this.kompetensi = kompetensi;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setBimbingan(Mahasiswa bimbingan) {
        this.bimbingan = bimbingan;
    }

    @Override
    public String toString() {
        return "Dosen{" + "nip=" + nip + ", nama=" + nama + ", kompetensi=" + kompetensi + ", bimbingan=" + bimbingan + '}';
    }

    
    
    
}

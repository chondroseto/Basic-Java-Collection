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
public class Mobil extends Profil{
    private String nama;
    private String no;

    public Mobil(String nama, String no, String namaMobil, String noMobil) {
        super(namaMobil, noMobil);
        this.nama = nama;
        this.no = no;
    }

    

    public String getNama() {
        return nama;
    }

    public String getNo() {
        return no;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNo(String no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Mobil{" + "nama=" + nama + ", no=" + no + '}';
    }

    
}

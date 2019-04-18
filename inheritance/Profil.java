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
public class Profil {
    private String namaMobil;
    private String noMobil;

    public Profil(String namaMobil, String noMobil) {
        this.namaMobil = namaMobil;
        this.noMobil = noMobil;
    }

    public String getNamaMobil() {
        return namaMobil;
    }

    public String getNoMobil() {
        return noMobil;
    }

    public void setNamaMobil(String namaMobil) {
        this.namaMobil = namaMobil;
    }

    public void setNoMobil(String noMobil) {
        this.noMobil = noMobil;
    }

    @Override
    public String toString() {
        return "Profil{" + "namaMobil=" + namaMobil + ", noMobil=" + noMobil + '}';
    }
    
    
    
}

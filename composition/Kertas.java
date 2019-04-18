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
public class Kertas {
    private String namamerk;
    private String jenis;

    public Kertas(String namamerk, String jenis) {
        this.namamerk = namamerk;
        this.jenis = jenis;
    }

    public String getNamamerk() {
        return namamerk;
    }

    public String getJenis() {
        return jenis;
    }

    public void setNamamerk(String namamerk) {
        this.namamerk = namamerk;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Override
    public String toString() {
        return "Kertas{" + "namamerk=" + namamerk + ", jenis=" + jenis + '}';
    }
    
    
    
    
}

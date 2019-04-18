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
public class Dosen {
    private String KodeDosen;
    private String[] nimMHS = new String[5];
    private int JmlMhsw;

    public Dosen() {
      }
    public Dosen(String KodeDosen, int JmlMhsw) {
        this.KodeDosen = KodeDosen;
        this.JmlMhsw = JmlMhsw;
    }
    
    public void setkodeDosen(String KodeDosen){
        this.KodeDosen = KodeDosen;
    }
    
    public void setNimMahasiswa(String nimMHS){
        if (JmlMhsw<this.nimMHS.length){
                this.nimMHS[JmlMhsw]=nimMHS;
                JmlMhsw++;
       }
    }
    

    public String getKodeDosen() {
        return this.KodeDosen;
    }

    public String getNimMHS(int indeks) {
        return nimMHS[indeks];
    }

    public int getJmlMhsw() {
        return JmlMhsw;
    }

    public void setKodeDosen(String KodeDosen) {
        this.KodeDosen = KodeDosen;
    }

    public void setNimMHS(String[] nimMHS) {
        this.nimMHS = nimMHS;
    }

    public void setJmlMhsw(int JmlMhsw) {
        this.JmlMhsw = JmlMhsw;
    }
   
  
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Other;

/**
 *
 * @author chondroseto
 */
public class RegularEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String first = "Chondro";
        String last = "Seto";
        if (first.matches("Chondro")){
            System.out.println("String1 adalah Chondro");
        } else {
            System.out.println("String1 bukan Chondro");
        }
        
        if (last.matches("rifaldy")){
            System.out.println("String2 adalah Seto");
        } else {
            System.out.println("String2 bukan Seto");
        }
        // TODO code application logic here
    }
    
}

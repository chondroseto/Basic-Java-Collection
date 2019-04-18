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
public class ExceptHandling {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int b = 3;
        try {
        b = 1/0;
        }
        catch (Exception e) {
            System.out.println("terdapat error di "+e);
        }
    }
    
}

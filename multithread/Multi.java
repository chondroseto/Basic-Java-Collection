/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading;


/**
 *
 * @author chondroseto
 */
public class Multi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        threadSample t1 = new threadSample("THREAD1");
        t1.start();
        
        threadSample t2 = new threadSample("THREAD2");
        t2.start();
        
        
        
    
        // TODO code application logic here
    }
     
}

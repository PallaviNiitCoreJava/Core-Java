/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadexp;

/**
 *
 * @author Admin
 */
public class PrintPages {

    
//    public void print(String s) {
//        
//        synchronized(this)
//        {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Thread " + s + " is printing page " + i);
//        }
//        }
//        
//        for (int j = 1; j <= 10; j++) {
//            System.out.println("New Thread " + s + " is printing page " + j);
//        }
//    }

        public synchronized void print(String s) {
        
       
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread " + s + " is printing page " + i);
        }     
        for (int j = 1; j <= 10; j++) {
            System.out.println("New Thread " + s + " is printing page " + j);
        }
    }

}

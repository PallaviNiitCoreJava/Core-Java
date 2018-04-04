/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsyncexp;

/**
 *
 * @author Admin
 */
public class ThreadSyncExp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(Thread.currentThread().isDaemon());
        
//        Loop l=new Loop();
//        Loop l2=new Loop();
        Task1 t1=new Task1();
        Task2 t2=new Task2();
        Task3 t3=new Task3();
//        t1.setDaemon(true);
//        System.out.println(t1.isDaemon());
        t1.start();
        t2.start();
        t3.start();
    }
    
}

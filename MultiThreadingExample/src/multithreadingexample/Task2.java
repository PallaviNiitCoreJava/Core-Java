/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadingexample;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Task2 {

    Runnable r1 = new Runnable() {

        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                try {
                    Thread.sleep(2000);
                    System.out.println("Thread 2 Executing!!! execution number : "+i);
                } catch (InterruptedException ex) {
                   
                }
            }
        }
    };

    public void start1() {
        Thread th1 = new Thread(r1);
        //th1.setPriority(Thread.MIN_PRIORITY);
        th1.start();
    }

}

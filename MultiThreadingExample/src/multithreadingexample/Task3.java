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
public class Task3 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(3000);
                System.out.println("Thread 3 executing!!! execution number : "+i);
            } catch (InterruptedException ex) {
                }
        }
    }

    public void start1() {
        Thread th3 = new Thread(this);
        //th3.setPriority(Thread.NORM_PRIORITY);
        th3.start();
    }

}

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
public class Task1 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                sleep(1000);
                System.out.println("Thread 1 executing!!! execution number : " + i);

            } catch (InterruptedException ex) {
            }
        }
    }

    public void start1() {
        //this.setPriority(MAX_PRIORITY);
        this.start();
    }
}

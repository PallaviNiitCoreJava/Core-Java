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
public class Loop {

    synchronized static void exe() {
         for (int i = 1; i <= 10; i++) {

            System.out.println("value of i is : " + i);
        }
        for (int j = 1; j <= 10; j++) {
            System.out.println("value of j is : " + j);
        }
    }
}

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
public class Task1 extends Thread{
    
//    Loop l;
//    public Task1(Loop o)
//    {
//        this.l=o;
//    }
    public void run()
    {
        System.out.println("Task 1 ");
        Loop.exe();
        
    }
}

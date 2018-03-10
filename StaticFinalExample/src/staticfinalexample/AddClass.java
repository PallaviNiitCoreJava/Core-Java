/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticfinalexample;

/**
 *
 * @author Admin
 */
public class AddClass {
    
            public static void add(){
                int a=2, b=5;
                System.out.println("a+b" + (a+b));
        }
            public static void add(int a){
                System.out.println("Addition is: " + (a+a));
            }

            public static void add(int a, int b){
                System.out.println("Addition is: " + (a+b));
            }
}

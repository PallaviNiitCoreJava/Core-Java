/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericexp;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class GenericExp extends Object {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        OneVar<Integer> o = new OneVar<>();
        o.setVar(30);
        o.sqr(o);
        System.out.println(o.getVar());
        
        OneVar<Float> o1 = new OneVar<>();
        o1.setVar(3.6f);
        o1.sqr(o);
        System.out.println(o1.getVar());

        OneVar<String> o2 = new OneVar<>();
        o2.setVar("WELCOME");
        o2.sqr(o);
        System.out.println(o2.getVar());
    }

}

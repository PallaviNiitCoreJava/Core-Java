package genericexample;

import java.util.Scanner;

public class GenericExample {
    public static void main(String[] args) {
        /*
        Scanner sc=new Scanner(System.in);
        
        ValueExp<Integer> e1=new ValueExp<>();
        e1.setA(50);
        System.out.println(e1.getA());
        
        ValueExp<String> e2=new ValueExp<>();
        e2.setA("String");
        System.out.println(e2.getA());
        
        ValueExp<Scanner> e3=new ValueExp<>();
        e3.setA(sc);
        System.out.println(e3.getA());
        */
        System.out.println("=============Integer OneValue==============");
        OneValue<Integer> o1=new OneValue<>(); 
        o1.setA(12);
        o1.setB(10);
        o1.add(o1);
        o1.sub(o1);
        System.out.println(o1.getA());
        System.out.println(o1.getB());
        
        System.out.println("=============Double OneValue==============");
        OneValue<Double> o2=new OneValue<>();
        o2.setA(20.5);
        o2.setB(2.5);
        //o2.add(o2);               //Double is not parent of Integer
        o2.sub(o2);
        System.out.println(o2.getA());
        System.out.println(o2.getB());
        
        System.out.println("=============Number OneValue==============");
        OneValue<Number> o4=new OneValue<>();
        o4.setA(20);
        o4.setB(2);
        o4.add(o4);
        o4.sub(o4);
        System.out.println(o2.getA());
        System.out.println(o2.getB());
        
        System.out.println("=============String OneValue==============");
        OneValue<String> o3=new OneValue<>();
        o3.setA("Pallavi");
        o3.setB("Gaikwad");
//        o3.add(o3);
//        o3.sub(o3);
        System.out.println(o3.getA());
        System.out.println(o3.getB());
    /*
        TwoValues<Integer,Integer> t1=new  TwoValues<>();
        TwoValues<Integer,String> t2=new  TwoValues<>();
        TwoValues<String,Integer> t3=new  TwoValues<>();
        
    */    
        
    }
    
}

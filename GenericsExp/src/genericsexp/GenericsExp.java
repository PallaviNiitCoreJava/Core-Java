
package genericsexp;

import java.util.Scanner;

public class GenericsExp {

    public static void main(String[] args) {
     
        SingleData <Integer,Integer> s1=new SingleData<>();
        s1.setA(10);
        System.out.println("value of a for s1 is : "+s1.getA());
        
        SingleData <String,Integer> s2=new SingleData<>();
        s2.setA("Pallavi");
        System.out.println("value of a for s1 is : "+s2.getA());
        
        SingleData <Scanner,Integer> s3=new SingleData<>();
        
        SingleNumber<Double> sni=new SingleNumber<>();
        sni.setX(5.6);
        sni.sqr(sni);
        SingleNumber<Integer> snit=new SingleNumber<>();
        snit.setX(5);
        snit.sqr(snit);
        
        
    }
}

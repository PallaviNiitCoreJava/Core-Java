package constructoroverloadingexample;

import java.util.Scanner;

public class ConstructorOverloadingExample {
    public static void main(String[] args) {
        Car c=new Car();
        Car c1=new Car(5.6);
        Car c2=new Car(7.3,"Red","Cotton");
        Car c3=new Car(c2);
        c.disp();
        c1.disp();
        c2.disp();
        c3.disp();
        c3.setColor("Blue");
        c2.disp();
        c3.disp();
        
        
    }   
}

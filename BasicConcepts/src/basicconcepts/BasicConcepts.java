package basicconcepts;

import java.util.Scanner;

public class BasicConcepts {
    public static void main(String args[]) {
       
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        a=sc.nextInt();
        System.out.println("Enter a Number : ");
        b=sc.nextInt();
        System.out.println("Addition is : "+(a+b));
    }
}

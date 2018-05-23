package basicconcepts;

import java.util.Scanner;

public class StringBufferExample {
    public static void main(String[] args) {
        
        StringBuffer sb=new StringBuffer();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter your Name ");  
        sb.append(sc.next());
        System.out.println("Enter your Name ");
        sb.append(sc.next());
        System.out.println("Enter your Name ");
        sb.append(sc.next());
        
        System.out.println("Complete String is "+sb);
        
        String str=sb.toString();
        
    }
}

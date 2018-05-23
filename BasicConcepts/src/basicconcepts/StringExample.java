package basicconcepts;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        
        String str,str1,str2;
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your Name ");
//        str=sc.next();
//        System.out.println("Welcome "+str);
//        System.out.println("Length of string is "+str.length());
//        System.out.println("Upper Case "+str.toUpperCase());
//        System.out.println("Lower Case "+str.toLowerCase());
//        System.out.println("Index of "+str.indexOf("l"));
//        System.out.println("Char at 4 is  "+str.charAt(4));
        System.out.println("Enter Str1 : ");
        str1=sc.next();
        System.out.println("Enter Str1 : ");
        str2=sc.next();
        if(str1.compareToIgnoreCase(str2)==0)
        {
            System.out.println("Strings are Same.");
        }
        else
        {
            System.out.println("Strings are Not Same.");
        }
        
        if (str1.equalsIgnoreCase(str2)) 
        {
            System.out.println("Strings are Same.");
        }
        else
        {
            System.out.println("Strings are Not Same.");
        }
        
    }
}

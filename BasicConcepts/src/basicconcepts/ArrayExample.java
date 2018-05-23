package basicconcepts;

import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {
        int a[]=new int[5];
        int b[]={1,54,76,324,7,97,45,34}; 
        Integer[] c=new Integer[5];
        int temp;
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a Number : ");
            a[i]=sc.nextInt();
        }
        System.out.println("Values Before Sorting");
        for (int i = 0; i < 5; i++) {
            System.out.println("Value of a["+i+"] is "+a[i]);
        }
        System.out.println("==========Sorting...==============");
        for (int i = 0; i < 5; i++) {
            for (int j = i+1; j < 5; j++) {
                    if(a[i]>a[j])
                    {
                        temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
            }
        }
        System.out.println("Values After Sorting");
        for (int i = 0; i < 5; i++) {
            System.out.println("Value of a["+i+"] is "+a[i]);
        }       
    }   
}

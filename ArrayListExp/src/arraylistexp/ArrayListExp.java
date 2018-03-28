package arraylistexp;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExp {
    public static void main(String[] args) {

        int a=1;
        int b=2;
        int c=3;
        int d=4;
        String str1="Priyanka";
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        
        al.add(a);
        al.add(b);
        al.add(c);
        al.add(d);
//        al.add(str1);
//        al.add(sc);
        
        for(Object t:al)
        {
            System.out.println(t);
        }
       
//        Integer arr[]=new Integer[5];
//        arr[0]=10;
//        arr[1]=20;
//        arr[2]=30;
//        arr[3]=40;
//        arr[4]=50;
//       
//        for(int i=0;i<5;i++)
//        {
//            System.out.println(arr[i]);
//        }
//        
//        /*
//        t=arr[0]            //1st itereation
//        t=arr[1]            //2nd itereation
//        t=arr[2]            //3rd itereation
//        t=arr[3]            //4th itereation
//        t=arr[4]            //5th itereation
//        */
//        for(int t:arr)
//        {
//            System.out.println(t);
//        }
    }
    
}

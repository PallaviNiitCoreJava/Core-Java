package arraylistexp;

import java.util.ArrayList;
import java.util.Scanner;

public class ArListExp {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a Number : ");
            al.add(sc.nextInt());           
            System.out.println("Do you want to repeat?(yes/no) : ");
            
        } while (sc.next().equals("yes"));
        
        for(int t:al)
        {
            System.out.println("Numner : "+t);
        }
    }
}

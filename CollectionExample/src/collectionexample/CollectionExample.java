package collectionexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CollectionExample {

    public static void main(String[] args) {
     
        Scanner sc=new Scanner(System.in);
        int x=20;
        List<Integer> al=new ArrayList<>();
        al.add(5);
        al.add(sc.nextInt());
        al.add(x);
        al.add(new Integer(15));
        al.add(Integer.parseInt("123"));
        
//        Iterator et=al.iterator();
//        
//        while(et.hasNext())
//        {
//            System.out.println(et.next());
//        }

      
      for(Integer t:al)
      {
          System.out.println(t);
      }
      
      al.add(67);
    }
    
}

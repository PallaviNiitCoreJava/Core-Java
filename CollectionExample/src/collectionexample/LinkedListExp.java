package collectionexample;

import java.util.LinkedList;

public class LinkedListExp {
 
    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        
        int ind=l.indexOf(20);
        
        l.add(ind, 15);
        l.remove(ind+1);
        for(Integer i:l)
        {
            System.out.println(i);
        }
    }
}

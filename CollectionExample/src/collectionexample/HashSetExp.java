package collectionexample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;
import javax.swing.text.StyledEditorKit;

public class HashSetExp {
    public static void main(String[] args) {
        TreeSet<Integer> hs=new TreeSet();
        HashMap<Integer,String> ht=new HashMap<>();
        
        
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(30);
        //hs.add(10);
        
        ht.put(1, "Pallavi");
        ht.put(2, "Pankaj");
        ht.put(3, "Prachi");
        ht.put(4, "Pooja");
        ht.put(null, "Poonam");
        ht.put(5,null);
        
        
//        for(Integer i:hs)
//        {
//            System.out.println("Enter Values ");
//            ht.put(i, new Scanner(System.in).next());
//        }
        
        for(Map.Entry s:ht.entrySet())
        {
            System.out.println("Key is "+s.getKey()+" Value is "+s.getValue());
        }
    }
    
}

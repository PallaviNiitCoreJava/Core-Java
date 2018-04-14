package collectionexample;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExp {
    public static void main(String[] args) {
        Queue <Integer>q=new PriorityQueue();
        
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        
        q.remove();
        q.remove();
        
        for(Integer i:q)
        {
            System.out.println(i); 
        }
    }
}

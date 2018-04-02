package multithreadingexample;
public class MultiThreadingExample {
    public static void main(String[] args) {
        
        Task1 t1=new Task1();
        t1.start1();
        
        Task2 t2=new Task2();
        t2.start1();
        
        Task3 t3=new Task3();
        t3.start1();
           
    }
    
}

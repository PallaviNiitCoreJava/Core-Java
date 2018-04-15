package multithreadexp;

public class WorkTwo implements Runnable{
    
    @Override
    public void run()
    {
        for (int i = 1; i <= 100; i++) {
             System.out.println("This is Work Two i= "+i);
        }
       
    }
}

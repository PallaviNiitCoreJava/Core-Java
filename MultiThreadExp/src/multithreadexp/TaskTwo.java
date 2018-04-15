package multithreadexp;


public class TaskTwo extends Thread{
    
    @Override
    public void run()
    {
//        this.setPriority(MIN_PRIORITY);
        
        for (int i = 1; i <= 10; i++) {
             System.out.println("This is TaskTwo i= "+i);
             try {
                sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
       
    }
}

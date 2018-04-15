package multithreadexp;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TaskOne extends Thread {

    @Override
    public void run()
    {
//        this.setPriority(MAX_PRIORITY);
        for (int i = 1; i <= 10; i++) {
            
            System.out.println("This is TaskOne i= "+i);
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
            }
            
            
        }
       
    }
}

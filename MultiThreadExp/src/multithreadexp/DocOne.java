package multithreadexp;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DocOne extends Thread{
    
    PrintPages p;
    
    public DocOne(PrintPages p)
    {
        this.p=p;
    }
    public void run()
    {
        try {
            sleep(5000);
        } catch (InterruptedException ex) {
        }
        p.print("Document One ");
    }
    
}

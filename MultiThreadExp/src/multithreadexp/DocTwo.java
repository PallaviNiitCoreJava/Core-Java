package multithreadexp;
public class DocTwo extends Thread{
    
    PrintPages p;
    
     public DocTwo(PrintPages p)
    {
        this.p=p;
    }
    
    
    public void run()
    {
        p.print("Document Two ");
    } 
}

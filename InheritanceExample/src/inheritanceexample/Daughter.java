package inheritanceexample;
public class Daughter extends Dad{
    public Daughter()
    {
        System.out.println("Daughter Constructor");
        
    }
    void cook()
    {
        System.out.println("Daughter : I can cook");
    }
    
    void eat(int x)
    {
        System.out.println("I eat at "+x+" o'clock.");
    }
}

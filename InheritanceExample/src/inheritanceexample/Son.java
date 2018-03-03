package inheritanceexample;
public class Son extends Dad {
    
    public Son()
    {  
        System.out.println("Son Constructor.");

    }
    public Son(int x)
    {
        super(x);  
        System.out.println("Son Constructor.");

    }
    
    void play()
    {
        System.out.println("Son : I play whole day.");
    }
    void eat()
    {
        //super.eat();
        System.out.println("Son : I sit on table to eat.");
    }
}

package inheritanceexample;
public class Dad {
    int money;

    public Dad()
    {
        System.out.println("Simple Dad Constructor");
    }

    public Dad(int x)
    {
        money = x;
        System.out.println("Parameterized Dad Constructor");
    }
    void work()
    {
        System.out.println("Dad : I work for earning Money");
    } 
    void eat()
    {
        System.out.println("Dad: I sit on floor to ");
    }
}

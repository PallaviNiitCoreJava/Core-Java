package basicconcepts;
public class BankExp {

    private int bal;
    
    public BankExp()
    {
        this.bal=2000;
        System.out.println("Constructor is executed!!!");
    }
    
    public void dep(int bal)
    {
        this.bal=this.bal+bal;
    }
    public void wid(int bal)
    {
        if(this.bal>bal)
        {
            this.bal=this.bal-bal;
        }
        else
        {
            System.out.println("Insufficient Balance ");
        }
    }
    public void checkBal()
    {
        System.out.println("Balance is "+this.bal);
    }
}

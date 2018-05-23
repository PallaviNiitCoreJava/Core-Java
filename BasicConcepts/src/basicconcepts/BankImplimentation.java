package basicconcepts;
public class BankImplimentation {
    
    public static void main(String[] args) {
        BankExp b1=new BankExp();
        
        b1.checkBal();
        b1.dep(2000);
        b1.checkBal();
        b1.wid(1000);
        b1.checkBal();
    }
    
}

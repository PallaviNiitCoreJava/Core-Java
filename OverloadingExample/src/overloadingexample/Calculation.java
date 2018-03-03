package overloadingexample;
public class Calculation {

    public void add(double a,double b)
    {
        System.out.println("Addition is "+(a+b));
    }
    public double add(int x,int y)
    {
        return(x+y);
    }
    public void add(double a,double b,double c)
    {
        System.out.println("Addition is "+(a+b+c));
    }
    public void add(String a,String b)
    {
        System.out.println("Addition is "+a+" "+b);
    }
    public void add(String a,int b)
    {
        System.out.println("Addition is "+a+" "+b);
    }
    public void add(int a,String b)
    {
        System.out.println("Addition is "+a+" "+b);
    }
    
}

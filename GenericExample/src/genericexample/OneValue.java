package genericexample;

public class OneValue<X> {

    X a;
    X b;

    public X getA() {
        return a;
    }

    public void setA(X a) {
        this.a = a;
    }

    public X getB() {
        return b;
    }

    public void setB(X b) {
        this.b = b;
    }

    public void sub(OneValue<? extends Number> o) {
        
        if(o.getA() instanceof Integer)
        {
             Integer ans=(Integer)o.getA()-(Integer)o.getB();
             System.out.println(ans);
        }
        else if(o.getA() instanceof Float)
        {
             Float ans=(Float)o.getA()-(Float)o.getB();
             System.out.println(ans);
        }
        else if(o.getA() instanceof Double)
        {
             Double ans=(Double)o.getA()-(Double)o.getB();
             System.out.println(ans);
        }
        else
        {
            System.out.println("Not a Number so Cannot Sub");
        }                   
    }
    public void add(OneValue<? super Integer> o) {
        Integer ans = (Integer) o.getA() + (Integer) o.getB();
        System.out.println(ans);
    }
}

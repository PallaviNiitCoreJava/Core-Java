package genericsexp;
public class SingleData<X,Y> {
    
    X a;
    Y b;

    public SingleData(X a, Y b) {
        this.a = a;
        this.b = b;
    }
    public SingleData(X a) {
        this.a = a;
    }

    public SingleData() {
    }

    public Y getB() {
        return b;
    }

    public void setB(Y b) {
        this.b = b;
    }

    public X getA() {
        return a;
    }

    public void setA(X a) {
        this.a = a;
    }
    
    
    
}

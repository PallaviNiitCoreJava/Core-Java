package staticfinalexample;

public final class FinalExp {
    
    private final float pi=3.14f;
    private int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public float getPi() {
        return pi;
    }

    
    public final void disp()
    {
        System.out.println("This is Final Disp Method.");
    }
    public final void disp(int x)
    {
        System.out.println("This is Final Disp Method.");
    }
    public void disp1()
    {
        
    }
}

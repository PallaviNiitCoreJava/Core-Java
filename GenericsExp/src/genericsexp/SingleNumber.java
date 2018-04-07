/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericsexp;

/**
 *
 * @author Admin
 */
public class SingleNumber <T>{
    
    T x;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }
    public void sqr(SingleNumber<? extends Number> sn)
    {
        Double i=sn.getX().doubleValue();
        i*=i;
        
        System.out.println("Sqr of a x is "+i);   
    }
    
    public void disp(SingleNumber<T> t)
    {
        t.setX(x);
        System.out.println(t.getX());
    }
}

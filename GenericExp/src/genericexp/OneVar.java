/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericexp;

/**
 *
 * @author Admin
 */
public class OneVar<X> {
    
    private X var;

    public X getVar() {
        return var;
    }

    public void setVar(X var) {
        this.var = var;
    }
    
    public void sqr(OneVar<Integer> wcd)
    {
        System.out.println(wcd.var * wcd.var);
    }
    
}
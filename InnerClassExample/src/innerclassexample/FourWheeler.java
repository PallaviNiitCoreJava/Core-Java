
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclassexample;

/**
 *
 * @author Admin
 */
public abstract class FourWheeler {
    
    abstract void run();
    
}

class NewCar extends FourWheeler{

    @Override
    void run() {
        System.out.println("This is New Car. ");
        
    }
    
}

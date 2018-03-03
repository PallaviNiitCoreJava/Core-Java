package overloadingexample;
public class OverloadingExample {
    public static void main(String[] args) {
    
        Calculation c=new Calculation();
        c.add(4,4);
        c.add(4,4,8);
        c.add(4.6F,8.67f);
        c.add(4.6,8.67);
        c.add("Pallavi","Gaikwad");
        c.add("Pallavi ", 9004);
        c.add(9004,"Pallavi ");       
    }
    
}

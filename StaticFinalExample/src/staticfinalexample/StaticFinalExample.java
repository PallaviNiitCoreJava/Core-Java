package staticfinalexample;
public class StaticFinalExample {
    public static void main(String[] args) {
//        System.out.println(Car.count);
//
//        Car c1=new Car();
//        System.out.println("Count = "+c1.getCount());
//        Car c2=new Car();
//        System.out.println("Count = "+c2.getCount());
//        Car c3=new Car();
//        System.out.println("Count = "+c3.getCount());
        
        FinalExp f1=new FinalExp();
        f1.disp();
        f1.setVal(30);
        System.out.println(f1.getVal());
        f1.disp();
    }    

}

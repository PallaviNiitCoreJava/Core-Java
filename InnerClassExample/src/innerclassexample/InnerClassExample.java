package innerclassexample;

public class InnerClassExample {

    public static void main(String[] args) {
    
//        Car c=new Car();
//        Car.GBox gb=new Car.GBox();
//        c.start();
//        gb.assem();
//        gb.disp();
//        Car.GBox.disp();
//        //c.GBox.disp();
//        
//        System.out.println(c.getX());
//        //gb.assem();
        FourWheeler car=new NewCar();
        FourWheeler f1=new FourWheeler() {
        public void run()
        {
            System.out.println("This is FourWheeler 1");
        }
        };
        FourWheeler f2=new FourWheeler() {
        public void run()
        {
            System.out.println("This is FourWheeler 2");
        }
        };
         
    }
    
}

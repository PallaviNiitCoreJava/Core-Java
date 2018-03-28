package innerclassexp;
abstract class Bike
{
    abstract void run();
}

public class InnerClassExp {

    public static void main(String[] args) {

        Bike b=new Bike() {

            @Override
            public void run() {
                
            }
        };
    }
    
    
}

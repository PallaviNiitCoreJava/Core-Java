package innerclassexp;
public class Car {
    private int horn;
    private int strbt;
    private int wheel;
    public Car()
    {
        horn=1;
        strbt=1;
        wheel=4;
    }
    public static class Eng{
        public static void useVar()
        {
            System.out.println("Horn ");
            System.out.println("Start Button ");
            System.out.println("Wheels ");
        }
    }   
    
}

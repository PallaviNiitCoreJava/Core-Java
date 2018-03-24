package innerclassexample;

public class Car {

    private int eng;
    public static int x;

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        Car.x = x;
    }

    static class GBox{
        private int scr;
        private int nut;
        private int gr;
        
        public void assem()
        {
            scr=15;
            nut=15;
            gr=5;
            System.out.println("GearBox is Ready");
        }
        public static void disp()
        {
            System.out.println("This is Static Method");
        }
    }    
    public void start()
    {
        System.out.println("Car is started");
    }
}

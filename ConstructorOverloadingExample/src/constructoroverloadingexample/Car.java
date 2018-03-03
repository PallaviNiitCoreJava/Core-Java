package constructoroverloadingexample;

public class Car {
    
    private double eng;
    private int win;
    private int door;
    private int ty;
    private String color;
    private String seatcover;
    
    public Car()
    {
        eng=2.3;
        win=4;
        door=4;
        ty=5;
        color="White";
        seatcover="Woolen";
    }
    public Car(double x)
    {
        eng=x;
        win=4;
        door=4;
        ty=5;
        color="White";
        seatcover="Woolen";
    }
    
    public Car(double eng,String c,String s)
    {
        this.eng=eng;
        win=4;
        door=4;
        ty=5;
        color=c;
        seatcover=s;
    }
    public Car(Car o)
    {
        this.eng=o.eng;
        this.win=o.win;
        door=o.door;
        ty=o.ty;
        color=o.color;
        seatcover=o.seatcover;
    }
    
    
    public double getEng() {
        return eng;
    }

    public void setEng(double eng) {
        this.eng = eng;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public int getTy() {
        return ty;
    }

    public void setTy(int ty) {
        this.ty = ty;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSeatcover() {
        return seatcover;
    }

    public void setSeatcover(String seatcover) {
        this.seatcover = seatcover;
    }
    void disp()
    {
        System.out.println("Type of Engine : "+eng);
        System.out.println("Number of Windows : "+win);
        System.out.println("Number of Doors : "+door);
        System.out.println("Number of Tyers : "+ty);
        System.out.println("Color of Car : "+color);
        System.out.println("Type of seat covers : "+seatcover);
    }
}

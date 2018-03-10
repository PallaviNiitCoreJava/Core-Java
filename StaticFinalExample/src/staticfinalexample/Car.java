package staticfinalexample;
public class Car {
    
    private int eng;
    public int door;
    final private String model;
    public static int count=0;
    final static private String cn="A5";

    Car()
    {
        model="A5";
        count++;
    }
    Car(int a)
    {
        model="A4";
        count++;
    }
    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public String getModel() {
        return model;
    }  

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
}

package abstractexp;
public abstract class House {
   
    public House()
    {
        System.out.println("House Constructor");
    }
    void createKitchen()
    {
        System.out.println("Defining Kitchen");
    }
    void createHall()
    {
        System.out.println("Defining Hall");
    }
    void createBR()
    {
        System.out.println("Defining Bed Room");
    }
    abstract void createRoof();
    
}

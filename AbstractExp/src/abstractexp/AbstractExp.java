package abstractexp;
public class AbstractExp {
    public static void main(String[] args) {
        
        New_House h1=new BrandNew_House();
        h1.createKitchen();
        h1.createHall();
        h1.createBR();
        h1.createRoof();
        h1.CreateGarden();

        House h2=new BrandNew_House();
        h2.createHall();
        h2.createBR();
        h2.createKitchen();
        h2.createRoof();
        
        New_House h3=new BrandNew_House();
        h3.createHall();
        h3.createBR();
        h3.createKitchen();
        h3.createRoof();
        h3.CreateGarden();
    }    
}

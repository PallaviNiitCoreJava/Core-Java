package enumwitharray;

public class EnumWithArray {

    enum Season {

        WINTER(5, new Emp("Jan")), SPRING(10, new Emp("Feb")), SUMMER(15, new Emp("Mar")), FALL(20, new Emp("April"));

        private int value;
        private Emp e;

        private Season(int value, Emp e) {
            this.value = value;
            this.e=e;
        }
    }

    public static void main(String[] args) {
        
        for (Season s : Season.values()) {
            System.out.println(s + " " + s.value);
            System.out.println(s + " " + s.e.name);
        }
    }

}

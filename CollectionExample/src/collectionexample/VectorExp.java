package collectionexample;

import java.util.Vector;

public class VectorExp {

    public static void main(String[] args) {
        Vector<String> v = new Vector();

        v.add("Pallavi");
        v.add("Zain");
        v.add("Pushkaraj");
        v.add("Yograj");

        for (String s : v) {
            System.out.println(s);
        }
    }
}

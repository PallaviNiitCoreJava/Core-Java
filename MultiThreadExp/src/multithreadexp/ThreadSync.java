package multithreadexp;

public class ThreadSync {

    public static void main(String[] args) {

        PrintPages p1 = new PrintPages();

        DocOne d1 = new DocOne(p1);
        DocTwo d2 = new DocTwo(p1);

        Thread t1 = new Thread() {
            @Override
            public void run() {
            p1.print("Annonymus ");
            }
        };
        t1.start();
        d1.start();
        d2.start();
    }

}

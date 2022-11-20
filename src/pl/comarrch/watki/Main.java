package pl.comarrch.watki;

public class Main {
    public static void main(String[] args) {

        /*Watek w1 = new Watek();
        Watek w2 = new Watek();
        Watek w3 = new Watek();
        Watek w4 = new Watek();

        w1.start();
        w2.start();
        w3.start();
        w4.start();*/

        Thread t1 = new Thread(new LepszyWatek());
        t1.start();
    }
}

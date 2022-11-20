package pl.comarrch.incrementator;

public class Main {

    public static int counter = 0;
    public static final Object lock = new Object();
    public static void main(String[] args) throws Exception {
        IncrementatorSynchronizedClass incrementato =
                new IncrementatorSynchronizedClass();
        Thread t1 = new Thread(new Incrementator(incrementato));
        Thread t2 = new Thread(new Incrementator(incrementato));
        Thread t3 = new Thread(new Incrementator(incrementato));
        Thread t4 = new Thread(new Incrementator(incrementato));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println(counter);
    }

    public static synchronized void increment() {
        Main.counter++;
    }
}

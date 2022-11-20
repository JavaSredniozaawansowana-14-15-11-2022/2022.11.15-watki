package pl.comarrch.incrementator;

public class IncrementatorSynchronizedClass {
    public synchronized void increment() {
        Main.counter++;
    }
}

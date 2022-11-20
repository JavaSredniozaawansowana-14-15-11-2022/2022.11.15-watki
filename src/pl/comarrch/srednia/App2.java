package pl.comarrch.srednia;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App2 {
    public static List<Integer> partialSums = new ArrayList<>();
    public static final Object communicationChannel = new Object();

    public static void main(String[] args) throws Exception {
        int[] ints = new Random().ints(0, 10000)
                .limit(100000).toArray();

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Runnable r1 = new Suma(ints, 0, 25000);
        Runnable r2 = new Suma(ints, 25000, 50000);
        Runnable r3 = new Suma(ints, 50000, 75000);
        Runnable r4 = new Suma(ints, 75000, 100000);

        executorService.submit(r1);
        executorService.submit(r2);
        executorService.submit(r3);
        executorService.submit(r4);

        executorService.shutdown();
        /*Thread t1 = new Thread(new Suma(ints, 0, 25000));
        Thread t2 = new Thread(new Suma(ints, 25000, 50000));
        Thread t3 = new Thread(new Suma(ints, 50000, 75000));
        Thread t4 = new Thread(new Suma(ints, 75000, 100000));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();*/

        while(partialSums.size() != 4) {
            Thread.sleep(500);
        }

        int sum = partialSums.stream().reduce(0, (acc, x) -> acc + x);
        double avr = ((double) sum) / ((double) ints.length);
        System.out.println(avr);
    }
}

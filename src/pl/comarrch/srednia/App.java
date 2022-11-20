package pl.comarrch.srednia;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        int[] ints = new Random().ints(0, 10000)
                .limit(100000).toArray();

        int sum = 0;
        for(int element : ints) {
            sum += element;
        }

        double avr = ((double) sum) / ((double) ints.length);

        System.out.println(avr);
    }
}

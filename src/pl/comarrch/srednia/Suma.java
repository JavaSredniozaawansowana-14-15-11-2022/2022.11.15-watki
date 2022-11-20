package pl.comarrch.srednia;

public class Suma implements Runnable {

    int[] ints;
    int startIndex;
    int endIndex;

    public Suma(int[] ints, int startIndex, int endIndex) {
        this.ints = ints;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        int sum = 0;
        for(int i = startIndex; i < endIndex; i++) {
            sum += ints[i];
        }
        App2.partialSums.add(sum);
        //App2.communicationChannel.notify();
    }
}

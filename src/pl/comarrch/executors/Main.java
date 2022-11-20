package pl.comarrch.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        /*ExecutorService singleExecutor = Executors.newSingleThreadExecutor();

        singleExecutor.submit(new Watek());
        singleExecutor.submit(new Watek());
        singleExecutor.submit(new Watek());
        singleExecutor.submit(new Watek());
        singleExecutor.submit(new Watek());

        singleExecutor.shutdown();

        ExecutorService multiExecutor = Executors.newFixedThreadPool(4);

        multiExecutor.submit(new Watek());
        multiExecutor.submit(new Watek());
        multiExecutor.submit(new Watek());
        multiExecutor.submit(new Watek());
        multiExecutor.submit(new Watek());
        multiExecutor.submit(new Watek());

        multiExecutor.shutdown();

        ExecutorService multiExecutor2 = Executors.newFixedThreadPool(12);

        multiExecutor2.submit(new Watek());
        multiExecutor2.submit(new Watek());
        multiExecutor2.submit(new Watek());
        multiExecutor2.submit(new Watek());
        multiExecutor2.submit(new Watek());
        multiExecutor2.submit(new Watek());

        multiExecutor2.shutdown();*/

        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(4);

        scheduledExecutorService.schedule(new Watek(), 0, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(), 5, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(), 8, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(), 10, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();
    }
}

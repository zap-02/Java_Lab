package Lab9;

import java.util.ArrayList;
import java.util.List;

public class TaskRunner {
    public static void runTogether(Runnable... tasks) {
        List<Thread> threads = new ArrayList<>(tasks.length);
        for (Runnable task : tasks) {
            Thread thread = new Thread(task);
            threads.add(thread);
            thread.start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void runInOrder(Runnable... tasks) {
        for (Runnable task : tasks) {
            task.run();
        }
    }
}

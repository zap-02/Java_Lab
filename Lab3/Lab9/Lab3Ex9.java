package Lab9;

public class Lab3Ex9 {
    public static void main(String[] args) {
        Runnable task1 = () -> System.out.println("Task 1 is running in " + Thread.currentThread().getName());
        Runnable task2 = () -> System.out.println("Task 2 is running in " + Thread.currentThread().getName());
        Runnable task3 = () -> System.out.println("Task 3 is running in " + Thread.currentThread().getName());

        TaskRunner.runTogether(task1, task2, task3);
        TaskRunner.runInOrder(task1, task2, task3);
    }
}

package Lab3Ex11;

public class Greeter implements Runnable {
    private String target;

    public Greeter(String target) {
        this.target = target;
    }

    @Override
    public void run() {
        System.out.println("Hello, " + target + "!");
    }

    public static void main(String[] args) {
        Greeter greeter1 = new Greeter("world");
        Greeter greeter2 = new Greeter("world2");

        Thread thread1 = new Thread(greeter1);
        Thread thread2 = new Thread(greeter2);

        thread1.start();
        thread2.start();
    }
}

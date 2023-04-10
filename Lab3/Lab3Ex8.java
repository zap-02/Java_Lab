public class Lab3Ex8 implements Runnable {
    private String target;

    public Lab3Ex8(String target) {
        this.target = target;
    }

    @Override
    public void run() {
        System.out.println("Hello, " + target + "!");
    }

    public static void main(String[] args) {
        Lab3Ex8 greeter1 = new Lab3Ex8("world");
        Lab3Ex8 greeter2 = new Lab3Ex8("world2");

        Thread thread1 = new Thread(greeter1);
        Thread thread2 = new Thread(greeter2);

        thread1.start();
        thread2.start();
    }
}

public class Lab3Ex13 {

    public static Runnable sequence(Runnable[] runnables) {
        return () -> {
            for (Runnable runnable : runnables) {
                runnable.run();
            }
        };
    }

    public static Runnable[] createRunnablesList() {
        Runnable[] runnables = new Runnable[5];
        for (int i = 0; i < runnables.length; i++) {
            final int num = i;
            runnables[i] = () -> System.out.println("Runnable " + num);
        }
        return runnables;
    }


    public static void main(String[] args) {
        Runnable[] runnables = createRunnablesList();
        Runnable sequenceRunnable = sequence(runnables);
        sequenceRunnable.run();
    }


}

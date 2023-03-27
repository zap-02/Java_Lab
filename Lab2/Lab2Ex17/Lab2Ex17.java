package Lab2Ex17;

import java.util.Iterator;

public class Lab2Ex17 {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");


        System.out.println("Queue contains: " + queue + "\n");

        System.out.println("Iterated sequential queue traversal:");


        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
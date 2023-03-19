package Task16;


//import Task16.Queue.add;
public class Task16 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
        System.out.println("Queue contains: " + queue);

        String removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Queue contains: " + queue);

        queue.add("five");
        queue.add("six");
        System.out.println("Queue contains: " + queue);
    }
}

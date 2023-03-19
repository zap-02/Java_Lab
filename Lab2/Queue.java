package Task16;

public class Queue {
    private Node head; // голова очереди
    private Node tail; // хвост очереди

    private static class Node {
        String data; // данные элемента
        Node next; // ссылка на следующий узел

        public Node(String data) {
            this.data = data;
        }
    }

    public void add(String data) {
        Node node = new Node(data);
        if (head == null) { // если очередь пуста, новый узел становится головой и хвостом
            head = node;
            tail = node;
        } else { // иначе новый узел становится новым хвостом
            tail.next = node;
            tail = node;
        }
    }

    public String remove() {
        if (head == null) { // если очередь пуста, возвращаем null
            return null;
        }
        String data = head.data;
        head = head.next; // перемещаем голову на следующий узел
        if (head == null) { // если после удаления головы очередь стала пустой, обнуляем и хвост
            tail = null;
        }
        return data;
    }
}

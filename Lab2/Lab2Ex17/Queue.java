package Lab2Ex17;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue implements Iterable<String> {
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
  
  @Override
public Iterator<String> iterator() {
    return new QueueIterator(head);
}

private class QueueIterator implements Iterator<String> {
    private Node current;

    public QueueIterator(Node head) {
        this.current = head;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String data = current.data;
        current = current.next;
        return data;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
    }
}


package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Queue {
    private ImmutableLinkedList queue;

    public Queue() {
        queue = new ImmutableLinkedList();
    }

    public Object peek() {
        if (queue.size() == 0) {
            throw new IndexOutOfBoundsException();
        }
        return queue.getFirst();
    }

    public Object dequeue() {
        Object element = peek();
        queue = queue.removeFirst();
        return element;
    }

    public void enqueue(Object e) {
        queue = queue.addLast(e);
    }
}

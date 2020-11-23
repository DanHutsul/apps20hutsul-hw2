package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {

    private ImmutableLinkedList stack;

    public Stack() {
        stack = new ImmutableLinkedList();
    }

    public Object peek() {
        if (stack.size() == 0) {
            throw new IndexOutOfBoundsException();
        }
        return stack.getLast();
    }

    public Object pop() {
        Object element = peek();
        stack = stack.removeLast();
        return element;
    }

    public void push(Object e) {
        stack = stack.addLast(e);
    }


}
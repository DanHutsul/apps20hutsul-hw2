package ua.edu.ucu.collections;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {

    @Test(expected = IndexOutOfBoundsException.class)
    public void testEmptyQueuePeek() {
        Queue q = new Queue();
        q.peek();
    }

    @Test
    public void testOneElementQueuePeek() {
        Queue q = new Queue();
        q.enqueue("3");
        String expResult = "3";

        Object actualResult = q.peek();

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testMultipleElementsPeek() {
        Queue q = new Queue();
        q.enqueue("3");
        q.enqueue("1");
        q.enqueue("26");
        String expResult = "3";

        Object actualResult = q.peek();

        assertEquals(expResult, actualResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testEmptyQueueDequeue() {
        Queue q = new Queue();
        q.dequeue();
    }

    @Test
    public void testOneElementQueueDequeue() {
        Queue q = new Queue();
        q.enqueue("3");
        String expResult = "3";

        Object actualResult = q.dequeue();

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testFirstAfterDequeue() {
        Queue q = new Queue();
        q.enqueue("3");
        q.enqueue("1");
        q.enqueue("26");
        String expResult = "1";

        q.dequeue();
        Object actualResult = q.peek();

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testDeletedDequeue() {
        Queue q = new Queue();
        q.enqueue("3");
        q.enqueue("1");
        q.enqueue("26");
        String expResult = "3";

        Object actualResult = q.dequeue();

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testEmptyQueueEnqueue() {
        Queue q = new Queue();
        q.enqueue("3");
    }

    @Test
    public void testMultipleElementsEnqueue() {
        Queue q = new Queue();
        q.enqueue("3");
        q.enqueue("26");
    }
}
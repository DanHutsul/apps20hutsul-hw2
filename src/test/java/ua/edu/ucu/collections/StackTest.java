package ua.edu.ucu.collections;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class StackTest {

    @Test(expected = IndexOutOfBoundsException.class)
    public void testEmptyStackPeek() {
        Stack s = new Stack();
        s.peek();
    }

    @Test
    public void testOneElementStackPeek() {
        Stack s = new Stack();
        s.push("3");
        String expResult = "3";

        Object actualResult = s.peek();

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testMultipleElementsPeek() {
        Stack s = new Stack();
        s.push("3");
        s.push("1");
        s.push("26");
        String expResult = "26";

        Object actualResult = s.peek();

        assertEquals(expResult, actualResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testEmptyStackPop() {
        Stack s = new Stack();
        s.pop();
    }

    @Test
    public void testOneElementStackPop() {
        Stack s = new Stack();
        s.push("2");
        String expResult = "2";

        Object actualResult = s.pop();

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testFirstAfterPop() {
        Stack s = new Stack();
        s.push("3");
        s.push("1");
        s.push("26");
        String expResult = "1";

        s.pop();
        Object actualResult = s.peek();

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testDeletedPop() {
        Stack s = new Stack();
        s.push("3");
        s.push("1");
        s.push("26");
        String expResult = "26";

        Object actualResult = s.pop();

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testEmptyStackPush() {
        Stack s = new Stack();
        s.push("3");
    }

    @Test
    public void testMultipleElementsPush() {
        Stack s = new Stack();
        s.push("3");
        s.push("26");
    }

}
package ua.edu.ucu.collections;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class StackTest {

    //testing peek()

    @Test(expected = IndexOutOfBoundsException.class)
    public void testEmptyStackPeek() {
        Stack s = new Stack();
        s.peek();
    }

    @Test
    public void testOneElementStackPeek() {
        Stack s = new Stack();
        s.push("7");
        String expResult = "7";

        Object actualResult = s.peek();

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testPeek() {
        Stack s = new Stack();
        s.push("7");
        s.push("8");
        s.push("15");
        String expResult = "15";

        Object actualResult = s.peek();

        assertEquals(expResult, actualResult);
    }

    //testing pop()

    @Test(expected = IndexOutOfBoundsException.class)
    public void testEmptyStackPop() {
        Stack s = new Stack();
        s.pop();
    }

    @Test
    public void testOneElementStackPop() {
        Stack s = new Stack();
        s.push("7");
        String expResult = "7";

        Object actualResult = s.pop();

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testFirstAfterPop() {
        Stack s = new Stack();
        s.push("7");
        s.push("8");
        s.push("15");
        String expResult = "8";

        s.pop();
        Object actualResult = s.peek();

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testDeletedPop() {
        Stack s = new Stack();
        s.push("7");
        s.push("8");
        s.push("15");
        String expResult = "15";

        Object actualResult = s.pop();

        assertEquals(expResult, actualResult);
    }

    // testing push()

    @Test
    public void testEmptyStackPush() {
        Stack s = new Stack();
        s.push("7");
    }

    @Test
    public void testPush() {
        Stack s = new Stack();
        s.push("7");
        s.push("10");
    }

}
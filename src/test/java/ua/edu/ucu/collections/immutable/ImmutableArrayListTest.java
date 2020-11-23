package ua.edu.ucu.collections.immutable;

import org.junit.Test;
import static org.junit.Assert.*;

public class ImmutableArrayListTest {
    private final ImmutableArrayList testArr = new ImmutableArrayList(new Object[]{1, 2, 3, 4, 5, 6, 7, 8});
    private final ImmutableArrayList emptyArr = new ImmutableArrayList();
    private final Object[] addingList = {1, 2, 3};

    @Test
    public void testListGet() {
        assertEquals(testArr.get(3), 4);
        assertArrayEquals(testArr.toArray(), new Object[]{1, 2, 3, 4, 5, 6, 7, 8});
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListGetError() {
        testArr.get(100);
    }

    @Test
    public void testListRemove() {
        ImmutableList actual = testArr.remove(4);

        assertArrayEquals(actual.toArray(), new Object[]{1, 2, 3, 4, 6, 7, 8});
        assertArrayEquals(testArr.toArray(), new Object[]{1, 2, 3, 4, 5, 6, 7, 8});
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListRemoveError() {
        ImmutableList actual = testArr.remove(-20);
    }

    @Test
    public void testListSet() {
        ImmutableList actual = testArr.set(4, 100);

        assertArrayEquals(actual.toArray(), new Object[]{1, 2, 3, 4, 100, 6, 7, 8});
        assertArrayEquals(testArr.toArray(), new Object[]{1, 2, 3, 4, 5, 6, 7, 8});
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListSetError() {
        ImmutableList actual = testArr.set(-10, 1);
    }

    @Test
    public void testListIndexOfInArray() {
        int result = testArr.indexOf(5);
        assertEquals(result, 4);
    }

    @Test
    public void testListIndexOfNotInArray() {
        int result = testArr.indexOf(100);
        assertEquals(result, -1);
    }

    @Test
    public void testListClear() {
        ImmutableList result = testArr.clear();

        assertArrayEquals(result.toArray(), new Object[0]);
        assertArrayEquals(testArr.toArray(), new Object[]{1, 2, 3, 4, 5, 6, 7, 8});
    }

    @Test
    public void testListClearEmpty() {
        ImmutableList test = emptyArr.clear();

        assertArrayEquals(test.toArray(), new Object[0]);
    }

    @Test
    public void testIsEmptyNotEmpty() {
        assertFalse(testArr.isEmpty());
    }

    @Test
    public void testIsEmptyEmpty() {
        assertTrue(emptyArr.isEmpty());
    }

    @Test
    public void testToStringEmpty() {
        assertEquals(emptyArr.toString(), "[]");
    }

    @Test
    public void testToString() {
        assertEquals(testArr.toString(), "[1, 2, 3, 4, 5, 6, 7, 8]");
    }
}
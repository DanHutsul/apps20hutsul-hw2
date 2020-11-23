package ua.edu.ucu.collections.immutable;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImmutableLinkedListTest {

    private final ImmutableLinkedList empty = new ImmutableLinkedList();
    private final ImmutableLinkedList testList = new ImmutableLinkedList(new Object[]{1, 2, 3, 4, 5, 6, 7, 8});
    private final Object[] addingList = new Object[]{1, 2, 3};

    @Test
    public void testListAddAllEmpty() {
        ImmutableList actual = empty.addAll(addingList);
        Object[] expected = new Object[]{1, 2, 3};

        assertArrayEquals(actual.toArray(), expected);
    }

    @Test
    public void testListGet() {
        assertEquals(testList.get(4), 5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListGetError() {
        testList.get(15);
    }

    @Test
    public void testListRemove() {
        ImmutableList actual = testList.remove(2);

        assertArrayEquals(actual.toArray(), new Object[]{1, 2, 4, 5, 6, 7, 8});
        assertArrayEquals(testList.toArray(), new Object[]{1, 2, 3, 4, 5, 6, 7, 8});
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListRemoveIndexSmaller() {
        testList.remove(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListRemoveIndexBigger() {
        testList.remove(15);
    }

    @Test
    public void testListSet() {
        ImmutableList actual = testList.set(4, 100);

        assertArrayEquals(actual.toArray(), new Object[]{1, 2, 3, 4, 100, 6, 7, 8});
        assertArrayEquals(testList.toArray(), new Object[]{1, 2, 3, 4, 5, 6, 7, 8});
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testEmptyListSet() {
        empty.set(0, 0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListSetError() {
        ImmutableList actual = testList.set(100, 1);
    }

    @Test
    public void testListIndexOfInList() {
        int result = testList.indexOf(4);

        assertEquals(result, 3);
        assertArrayEquals(testList.toArray(), new Object[]{1, 2, 3, 4, 5, 6, 7, 8});
    }

    @Test
    public void testListIndexOfNotInList() {
        int result = testList.indexOf(100);

        assertEquals(result, -1);
        assertArrayEquals(testList.toArray(), new Object[]{1, 2, 3, 4, 5, 6, 7, 8});
    }

    @Test
    public void testListClear() {
        ImmutableList result = testList.clear();

        assertArrayEquals(result.toArray(), new Object[0]);
        assertArrayEquals(testList.toArray(), new Object[]{1, 2, 3, 4, 5, 6, 7, 8});
    }

    @Test
    public void testListClearEmpty() {
        ImmutableList result = empty.clear();

        assertArrayEquals(result.toArray(), new Object[0]);
    }

    @Test
    public void testIsEmptyNotEmpty() {
        assertFalse(testList.isEmpty());
    }

    @Test
    public void testIsEmptyEmpty() {
        assertTrue(empty.isEmpty());
    }

    @Test
    public void testToStringEmpty() {
        assertEquals(empty.toString(), "[]");
    }

    @Test
    public void testToString() {
        assertEquals(testList.toString(), "[1, 2, 3, 4, 5, 6, 7, 8]");
    }

    @Test
    public void testListAddFirstEmpty() {
        ImmutableLinkedList actual = empty.addFirst(1);
        Object[] expected = new Object[]{1};
        assertArrayEquals(actual.toArray(), expected);
    }

    @Test
    public void testListAddLastEmpty() {
        ImmutableLinkedList actual = empty.addLast(1);
        Object[] expected = new Object[]{1};
        assertArrayEquals(actual.toArray(), expected);
        assertEquals(actual.size(), 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListGetFirstEmpty() {
        empty.getFirst();
    }

    @Test
    public void testListRemoveFirst() {
        ImmutableLinkedList actual = testList.removeFirst();
        assertArrayEquals(actual.toArray(), new Object[]{2, 3, 4, 5, 6, 7, 8});
    }

    @Test
    public void testListRemoveLast() {
        ImmutableLinkedList actual = testList.removeLast();
        assertArrayEquals(actual.toArray(), new Object[]{1, 2, 3, 4, 5, 6, 7});
        assertArrayEquals(testList.toArray(), new Object[]{1, 2, 3, 4, 5, 6, 7, 8});
        assertEquals(testList.size(), 8);
        assertEquals(actual.size(), 7);
        assertEquals(actual.getLast(), 7);
    }


    @Test
    public void testListGetFirst() {
        assertEquals(testList.getFirst(), 1);
        assertArrayEquals(testList.toArray(), new Object[]{1, 2, 3, 4, 5, 6, 7, 8});
    }

    @Test
    public void testListGetLast() {
        assertEquals(testList.getLast(), 8);
        assertArrayEquals(testList.toArray(), new Object[]{1, 2, 3, 4, 5, 6, 7, 8});
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListGetLastError() {
        empty.getLast();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListRemoveLastError() {
        empty.removeLast();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListGetFirstError() {
        empty.getFirst();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListRemoveFirstError() {
        empty.removeFirst();
    }


}
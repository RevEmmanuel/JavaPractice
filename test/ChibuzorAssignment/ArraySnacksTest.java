package ChibuzorAssignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArraySnacksTest {

    @Test
    void largestOf() {
        int[] array = {1, 2, 3, 4, 5, 6};
        assertEquals(6, ArraySnacks.largestOf(array));
    }

    @Test
    void reverseOf() {
        int[] array = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(new int[] {6, 5, 4, 3, 2, 1}, ArraySnacks.reverseOf(array));
    }

    @Test
    void occursIn() {
        int[] array = {1, 2, 3, 4, 5, 6};
        assertTrue(ArraySnacks.occursIn(2, array));
    }

    @Test
    void occursInFail() {
        int[] array = {1, 2, 3, 4, 5, 6};
        assertFalse(ArraySnacks.occursIn(9, array));
    }

    @Test
    void oddElements() {
        int[] array = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(new int[] {2, 4, 6}, ArraySnacks.oddElements(array));
    }

    @Test
    void evenElements() {
        int[] array = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(new int[] {1, 3, 5}, ArraySnacks.evenElements(array));
    }

    @Test
    void totalOf() {
        int[] array = {1, 2, 3, 4, 5, 6};
        assertEquals(21, ArraySnacks.totalOf(array));
    }

    @Test
    void isPalindrome() {
        String name = "Aibohphobia";
        assertTrue(ArraySnacks.isPalindrome(name));
    }

    @Test
    void isPalindromeFails() {
        String name = "Chibuzor";
        assertFalse(ArraySnacks.isPalindrome(name));
    }

    @Test
    void forLoopSumOf() {
        int[] array = {1, 2, 3, 4, 5, 6};
        assertEquals(21, ArraySnacks.forLoopSumOf(array));
    }

    @Test
    void whileLoopSumOf() {
        int[] array = {1, 2, 3, 4, 5, 6};
        assertEquals(21, ArraySnacks.whileLoopSumOf(array));
    }

    @Test
    void doWhileLoopSumOf() {
        int[] array = {1, 2, 3, 4, 5, 6};
        assertEquals(21, ArraySnacks.doWhileLoopSumOf(array));
    }

    @Test
    void concatenateTwoList() {
        String[] names = {"a", "b", "c"};
        int[] array = {1, 2, 3};
        assertArrayEquals(new String[] {"a", "b", "c", "1", "2", "3"}, ArraySnacks.concatenateTwoList(names, array));
    }

    @Test
    void combineTwoLists() {
        String[] names = {"a", "b", "c"};
        int[] array = {1, 2, 3, 4};
        assertArrayEquals(new String[] {"a", "1", "b", "2", "c", "3", "4"}, ArraySnacks.combineTwoLists(names, array));
    }

    @Test
    void digitsOf() {
        assertArrayEquals(new int[]{2, 3, 4, 2}, ArraySnacks.digitsOf(2342));
    }
}
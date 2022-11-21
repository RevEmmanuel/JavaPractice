package tdd;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class ArrayManipulationTest {

    @Test
    void reverseAnArray() {
        int[] array = {1, 2, 3, 4, 5};
        assertArrayEquals(new int[] {5, 4, 3, 2, 1}, ArrayManipulation.reverseAnArray(array));
    }

    @Test
    void ascendingOrder() {
        int[] array = {5, 3, 2, 1, 4};
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, ArrayManipulation.ascendingOrder(array));
    }

    @Test
    void descendingOrder() {
        int[] array = {5, 3, 2, 1, 4};
        assertArrayEquals(new int[] {5, 4, 3, 2, 1}, ArrayManipulation.descendingOrder(array));
    }

    @Test
    void minimumOf() {
        int[] array = {5, 3, 2, 1, 4};
        assertEquals(1, ArrayManipulation.minimumOf(array));
    }

    @Test
    void maximumOf() {
        int[] array = {5, 3, 2, 1, 4};
        assertEquals(5, ArrayManipulation.maximumOf(array));
    }

    @Test
    void sumOf() {
        int[] array = {5, 3, 2, 1, 4};
        assertEquals(15, ArrayManipulation.sumOf(array));
    }

    @Test
    void capitalize() {
        String simi = "marTHa";
        assertEquals("Martha", ArrayManipulation.capitalize(simi));
    }

    @Test
    void reverseOf() {
        String simi = "martha";
        assertEquals("ahtram", ArrayManipulation.reverseOf(simi));
    }

    @Test
    void shuffle() {
        int[] array = {1, 2, 3, 4, 5};
        assertNotEquals(Arrays.toString(array), Arrays.toString(ArrayManipulation.shuffle(array)));
    }

    @Test
    void fill() {
        int[] array = new int[10];
        int[] filledArray = ArrayManipulation.fillWith(array);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, filledArray);
    }

    @Test
    void printing() {
        int[] array = {1, 2, 3, 4, 5};
        String printed = ArrayManipulation.toString(array);
        assertEquals("1, 2, 3, 4, 5" ,printed);
    }

    @Test
    void swap() {
        String[] string = {"a", "b"};
        assertArrayEquals(new String[] {"b", "a"}, ArrayManipulation.swap(string));
    }

    @Test
    void sumOfTwoHighest() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(19, ArrayManipulation.sumOfTwoHighest(numbers));
    }

    @Test
    void isANumber() {
        assertTrue(ArrayManipulation.isANumber('1'));
        assertTrue(ArrayManipulation.isANumber('4'));
        assertTrue(ArrayManipulation.isANumber('6'));
        assertTrue(ArrayManipulation.isANumber('5'));
        assertTrue(ArrayManipulation.isANumber('0'));
    }

    @Test
    void numberOfNumbers() {
        assertEquals(7, ArrayManipulation.countNumbers("A1B2#-+C3D456BG5"));
        assertEquals(5, ArrayManipulation.countNumbers("AB#-+C3D456BG5"));
        assertEquals(6, ArrayManipulation.countNumbers("AB2#-+C3D456BG5"));
        assertEquals(8, ArrayManipulation.countNumbers("A1B23#-+C3D456BG5"));
        assertEquals(10, ArrayManipulation.countNumbers("A1B2#-+C3D4567B90G5"));
    }
}

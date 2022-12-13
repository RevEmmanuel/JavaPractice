package Leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryDigitsTest {

    @Test
    void addBinary() {
    }

    @Test
    void convertToBinary() {
        assertEquals("11011", AddBinaryDigits.convertToBinary(27));;
    }

    @Test
    void convertToInt() {
        assertEquals(27, AddBinaryDigits.convertToInt("11011"));
        assertEquals(3, AddBinaryDigits.convertToInt("11"));
        assertEquals(1, AddBinaryDigits.convertToInt("1"));
    }

    @Test
    void reverseOf() {
        assertEquals("2501", AddBinaryDigits.reverseOf("1052"));
    }
}
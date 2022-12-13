package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    private RomanToInteger integerOf;

    @BeforeEach
    void setUp() {
        integerOf = new RomanToInteger();
    }

    @Test
    void testingOneValue() {
        assertEquals(3, integerOf.romanToInt("III"));
    }

    @Test
    void testingAnotherValue() {
        assertEquals(50, integerOf.romanToInt("L"));
    }

    @Test
    void testFor58() {
        assertEquals(58, integerOf.romanToInt("LVIII"));
    }

    @Test
    void testForNumber() {
        assertEquals(1994, integerOf.romanToInt("MCMXCIV"));
    }
}
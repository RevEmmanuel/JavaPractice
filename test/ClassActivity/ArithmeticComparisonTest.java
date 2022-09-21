package ClassActivity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
// (Arithmetic) Write an application that asks the user to enter two integers, obtains them from
//the user and prints the square of each, the sum of their squares, and the difference of the squares (first
//number squared minus the second number squared).

class ArithmeticComparisonTest {

    ArithmeticComparison compare;


    @BeforeEach
    void startAllTestsWith() {
        compare = new ArithmeticComparison();
    }

    @Test
    void testThatObjectExists() {
        assertNotNull(compare);
    }

    @Test
    void squareOfNumbers() {
        assertEquals(25, compare.square(5));
    }

    @Test
    void sumOfSquares() {
        assertEquals(41, compare.squareSum(4, 5));
    }

    @Test
    void differenceOfSquares() {
        assertEquals(9, compare.subtractSquares(5, 4));
    }





}
package ClassActivity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberLessThan100Test {

    NumberLessThan100 compare;

    @BeforeEach
    void startAllTestsWith() {
        compare = new NumberLessThan100();
    }

    @Test
    void numberLessThan100() {
        assertTrue(compare.numberIsLessThan100(70));
    }

    @Test
    void numberGreaterThan100() {
        assertTrue(compare.numberIsGreaterThan100(150));
    }

    @Test
    void squareGreaterThan100() {
        assertTrue(compare.squareIsLessThan100(5));
    }

    @Test
    void squareLessThan100() {
        assertTrue(compare.squareIsGreaterThan100(25));
    }

    @Test
    void numberEqualTo100() {
        assertTrue(compare.numberIsEqualsTo100(100));
    }

    @Test
    void squareEqualTo100() {
        assertTrue(compare.squareIsEqualsTo100(10));
    }

}
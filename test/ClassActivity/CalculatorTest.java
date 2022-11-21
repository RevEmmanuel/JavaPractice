package ClassActivity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void startAllTestWith() {
     calculator = new Calculator();
    }

    @Test
    void testObjectExists() {
        assertNotNull(calculator);
    }

    @Test
    void sum() {
        assertEquals(5, calculator.addTwoNumbers(2, 3));
    }

    @Test
    void subtract () {
        assertEquals(6, calculator.subtractTwoNumbers(8, 2));
    }

    @Test
    void divide(){
        assertEquals(20,calculator.divideTwoNumbers(40,2));
    }

    @Test
    void multiply(){
        assertEquals(30,calculator.multiplyTwoNumbers(5,6));
    }

    @Test
    void factorial() {
        assertEquals(120, calculator.factorialOf(5));
    }

    @Test
    void factorialOfZero() {
        assertEquals(1, calculator.factorialOf(0));
    }

    @Test
    void factorialOfOne() {
        assertEquals(1, calculator.factorialOf(1));
    }
}
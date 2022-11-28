package ChibuzorAssignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HugeIntegerTest {

    private HugeInteger hugeInteger;
    private HugeInteger hugeInteger2;

    @BeforeEach
    void setUp() {
        hugeInteger = new HugeInteger();
        hugeInteger2 = new HugeInteger();
    }

    @Test
    void testThatClassThrowsExceptionWhenGivenWrongParameter() {
        try {
            hugeInteger.parse("34567*^(");
        }
        catch (NumberFormatException e) {
            System.out.println("It throws the exception");
        }
    }

    @Test
    void testThatItCanTakeCorrectInput() {
        hugeInteger.parse("123456789");
//        assertEquals(hugeInteger.getDigits(), );
    }

    @Test
    void testThatLessThanWorks() {

    }
}
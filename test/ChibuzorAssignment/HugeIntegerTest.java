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
        hugeInteger2.parse("0912678");
        assertEquals("123456789", hugeInteger.toString());
        assertEquals("0912678", hugeInteger2.toString());
    }

    @Test
    void testThatIsZeroWorks() {
        hugeInteger.parse("0000000000");
        assertTrue(hugeInteger.isZero());
        hugeInteger.parse("0000100000");
        assertFalse(hugeInteger.isZero());
    }

    @Test
    void testThatGreaterThanWorks() {
        hugeInteger.parse("123456789");
        hugeInteger2.parse("12345");
        assertTrue(hugeInteger.isGreaterThan(hugeInteger2));
        assertFalse(hugeInteger2.isGreaterThan(hugeInteger));
    }

    @Test
    void testThatLessThanWorks() {
        hugeInteger.parse("12345");
        hugeInteger2.parse("123456789");
        assertTrue(hugeInteger.isLessThan(hugeInteger2));
        assertFalse(hugeInteger2.isLessThan(hugeInteger));
    }

    @Test
    void testThatGreaterThanWorksForEqualLength() {
        hugeInteger.parse("123459789");
        hugeInteger2.parse("123456789");
        assertTrue(hugeInteger.isGreaterThan(hugeInteger2));
        assertFalse(hugeInteger2.isGreaterThan(hugeInteger));
    }

    @Test
    void testThatLessThanWorksForEqualLength() {
        hugeInteger.parse("123456789");
        hugeInteger2.parse("123659789");
        assertTrue(hugeInteger.isLessThan(hugeInteger2));
        assertFalse(hugeInteger2.isLessThan(hugeInteger));
    }

    @Test
    void testThatEqualsToWorks() {
        hugeInteger.parse("123456789");
        hugeInteger2.parse("123456789");
        assertTrue(hugeInteger.isEqualTo(hugeInteger2));
        hugeInteger.parse("111111111");
        assertFalse(hugeInteger2.isEqualTo(hugeInteger));
    }

    @Test
    void testThatEqualsToWorksWithUnequalLength() {
        hugeInteger2.parse("123456789");
        hugeInteger.parse("111111");
        assertFalse(hugeInteger2.isEqualTo(hugeInteger));
    }

    @Test
    void testThatNotEqualsToWorks() {
        hugeInteger.parse("123456789");
        hugeInteger2.parse("123496789");
        assertTrue(hugeInteger.isNotEqualTo(hugeInteger2));
        hugeInteger.parse("123496789");
        assertFalse(hugeInteger2.isNotEqualTo(hugeInteger));
    }

    @Test
    void testThatNotEqualsToWorksWithUnequalLength() {
        hugeInteger2.parse("123456789");
        hugeInteger.parse("111111");
        assertTrue(hugeInteger2.isNotEqualTo(hugeInteger));
    }

    @Test
    void testThatLessThanOrEqualToWorksWithLessThan() {
        hugeInteger2.parse("123456789");
        hugeInteger.parse("11111");
        assertTrue(hugeInteger.isLessThanOrEqualTo(hugeInteger2));
        hugeInteger.parse("12345678912");
        assertFalse(hugeInteger.isLessThanOrEqualTo(hugeInteger2));
    }

    @Test
    void testThatLessThanOrEqualToWorksWithEqualTo() {
        hugeInteger2.parse("123456789");
        hugeInteger.parse("123456789");
        assertTrue(hugeInteger.isLessThanOrEqualTo(hugeInteger2));
        hugeInteger.parse("12345678912");
        assertFalse(hugeInteger.isLessThanOrEqualTo(hugeInteger2));
    }

    @Test
    void testThatGreaterThanOrEqualToWorksWorksWithGreaterThan() {
        hugeInteger.parse("123456789");
        hugeInteger2.parse("11111");
        assertTrue(hugeInteger.isGreaterThanOrEqualTo(hugeInteger2));
        assertFalse(hugeInteger2.isGreaterThanOrEqualTo(hugeInteger));
    }

    @Test
    void testThatGreaterThanOrEqualToWorksWithEqualTo() {
        hugeInteger2.parse("123456789");
        hugeInteger.parse("123456789");
        assertTrue(hugeInteger.isGreaterThanOrEqualTo(hugeInteger2));
        hugeInteger2.parse("11111");
        assertFalse(hugeInteger2.isGreaterThanOrEqualTo(hugeInteger));
    }
}
package ClassActivity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindLargestSmallestTest {
    FindLargestSmallest compare;

    @BeforeEach
    void startAllTestsWith() {
        compare = new FindLargestSmallest();
    }

    @Test
    void testObjectExists() {
        assertNotNull(compare);
    }

    @Test
    void findLargestNumber() {
        assertEquals(100, compare.findLargest(60, 100, 90));
    }

    @Test
    void findSmallestNumber() {
        assertEquals(10, compare.findSmallest(70, 30, 10));
    }

}
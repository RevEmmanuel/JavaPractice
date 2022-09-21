package ClassActivity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageProductTest {

    AverageProduct find;

    @BeforeEach
    void startAllTestsWith() {
        find = new AverageProduct();
    }

    @Test
    void testObjectExists() {
        assertNotNull(find);
    }

    @Test
    void average() {
        assertEquals(200, find.averageOf(100, 200, 300));
    }

    @Test
    void product() {
        assertEquals(150, find.productOf(3, 5, 10));
    }

    @Test
    void smallest() {
        assertEquals(10, find.smallestOf(20, 10, 45));
    }

    @Test
    void largest() {
        assertEquals(200, find.largestOf(150, 200, 180));
    }

}
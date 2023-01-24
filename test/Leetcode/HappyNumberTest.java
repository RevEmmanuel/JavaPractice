package Leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {

    @Test
    void isHappy() {
        assertFalse(HappyNumber.isHappy(2));
        assertTrue(HappyNumber.isHappy(19));
    }

}
package Leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColumnNumberTest {

    @Test
    void checkColumnNumber() {
        assertEquals(1, ColumnNumber.titleToNumber("A"));
        assertEquals(28, ColumnNumber.titleToNumber("AB"));
        assertEquals(701, ColumnNumber.titleToNumber("ZY"));
        assertEquals(702, ColumnNumber.titleToNumber("ZZ"));
        assertEquals(703, ColumnNumber.titleToNumber("AAA"));
        assertEquals(729, ColumnNumber.titleToNumber("ABA"));
    }

}
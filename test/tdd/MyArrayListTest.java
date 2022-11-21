package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {

    @Test
    public void addItemListSizeIncreasesTest() {
        // given I have a list
        MyArrayList strings = new MyArrayList();
        // when I add an item
        strings.add("G-String");
        strings.add("A-String");
        //check that the size  has increased
        assertEquals(2, strings.size());
    }

    @Test
    public void addOneItemAndGetItemByIndexTest() {
        // given I have a list
        MyArrayList strings = new MyArrayList();
        // when I add an item
        strings.add("G-String");
        // confirm I get the correct item when I et by index
        String result = strings.get(0);
        assertEquals("G-String", result);
    }

}
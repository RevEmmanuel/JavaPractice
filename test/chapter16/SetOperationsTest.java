package chapter16;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class SetOperationsTest {

    private Set<String> string1;
    private Set<String> string2;
    private String[] colors1;
    private String[] colors2;

    @BeforeEach
    void setUp() {
        colors1 = new String[]{"red", "green", "blue", "alpha", "cyan"};
        colors2 = new String[]{"black", "blue", "violet", "purple"};
        string1 = new TreeSet<>();
        string1.addAll(Arrays.asList(colors1));
        string2 = new TreeSet<>();
        string2.addAll(Arrays.asList(colors2));
    }

    @Test
    void union() {
        Set<String> result = SetOperations.union(string1, string2);
        Set<String> expectedResult = new TreeSet<>();
        expectedResult.addAll(Arrays.asList(colors1));
        expectedResult.addAll(Arrays.asList(colors2));
        assertEquals(expectedResult, result);
    }

    @Test
    void interaction() {
        Set<String> result = SetOperations.interaction(string1, string2);
        Set<String> expectedResult = new TreeSet<>();
        expectedResult.add("blue");
        assertEquals(expectedResult, result);
    }

    @Test
    void difference() {
        Set<String> result = SetOperations.difference(string1, string2);
        Set<String> expectedResult = new TreeSet<>();
        expectedResult.addAll(Arrays.asList(colors1));
        expectedResult.addAll(Arrays.asList(colors2));
        expectedResult.remove("blue");
        assertEquals(expectedResult, result);
    }
}
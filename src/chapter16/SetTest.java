package chapter16;

import java.util.*;

public class SetTest {

    public static void main(String[] args) {
        String[] colors = {"red", "white", "blue", "green", "gray", "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
        List<String> colorList = Arrays.asList(colors);
        removeDuplicatesAndPrint(colorList);
    }

    public static void removeDuplicatesAndPrint(Collection<String> list) {
        Set<String> set = new HashSet<>(list);
        for (String value : set) {
            System.out.printf("%s   ", value);
        }
    }

}

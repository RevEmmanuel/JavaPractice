package chapter16;

import java.util.*;

public class SortedSetTest {

    public static void main(String[] args) {
        String[] colors =  {"yellow", "green", "black", "tan", "grey", "white", "orange", "red", "green"};

        SortedSet<String> colorSet = new TreeSet<>(Arrays.asList(colors));
        System.out.println("Sorted set: ");
        printSet(colorSet);


        System.out.println("Head to orange: " + colorSet.headSet("orange"));
        System.out.println("Orange to tail: " + colorSet.tailSet("orange"));
        System.out.println("First: " + colorSet.first());
        System.out.println("Last: " + colorSet.last());
    }

    public static void printSet(SortedSet<String> list) {
        for (var value : list) {
            System.out.printf("%s   ", value);
        }
        System.out.println();
    }
}

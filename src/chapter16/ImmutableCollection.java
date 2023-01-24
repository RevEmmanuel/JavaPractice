package chapter16;

import java.util.*;

public class ImmutableCollection {

    public static void main(String[] args) {
        String[] colors = {"red", "green", "blue", "orange", "yellow", "cyan"};
        LinkedList<String> colour = new LinkedList<>(Arrays.asList(colors));
        List<String> unmodified = Collections.unmodifiableList(colour);

        try {
            unmodified.add("Balablue");
            unmodified.remove("orange");
        }
        catch (UnsupportedOperationException exception) {
//            exception.printStackTrace();
            System.out.println("Action cannot be done!");
        }

        List<String> colourList = List.of("Blue", "red", "green", "blue", "orange", "yellow", "cyan", "orange");
        Set<String> colourSet = Set.of("Blue", "red", "green", "blue", "orange", "yellow", "cyan");
        Map<String, Integer> map1 =
                Map.of("Monday", 1,
                        "Tuesday", 2,
                        "Wednesday", 3,
                        "Thursday", 4,
                        "Friday", 5,
                        "Saturday", 6,
                        "Sunday", 7);

        Map<String, Integer> map2 =
                Map.ofEntries(
                        Map.entry("January", 31),
                        Map.entry("February", 28),
                        Map.entry("March", 31),
                        Map.entry("April", 30),
                        Map.entry("May", 31),
                        Map.entry("June", 30),
                        Map.entry("July", 31),
                        Map.entry("August", 31),
                        Map.entry("September", 30),
                        Map.entry("October", 31),
                        Map.entry("November", 30),
                        Map.entry("December", 31)
                        );

        try {
            colourList.add("Unknown");
            colourSet.add("Unknown as well");
            map1.put("Unknown", 5);
            map2.put("Unknown 2", 9);
        }
        catch (UnsupportedOperationException exception) {
            System.out.println("I no go allow you do am.");
        }
    }
}

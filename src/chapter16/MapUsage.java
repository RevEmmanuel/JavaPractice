package chapter16;

import java.util.*;

public class MapUsage {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        fillMap(map);
        displayMap(map);
    }

    public static void fillMap(Map<String, Integer> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words separated by space: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (map.containsKey(word)) map.put(word, map.get(word) + 1);
            else map.put(word, 1);
        }
    }

    public static void displayMap(Map<String, Integer> map) {
        Set<String> keySet = map.keySet();
        TreeSet<String> sortedKeySet = new TreeSet<>(keySet);
        for (String key : sortedKeySet) {
            System.out.println("Key:    " + key + "    " + "Value:    " + map.get(key));
        }
        System.out.printf("Size: %s%nIs Empty: %s", map.size(), map.isEmpty());
    }
}

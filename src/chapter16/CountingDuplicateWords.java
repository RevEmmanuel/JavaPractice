package chapter16;

import java.util.*;

public class CountingDuplicateWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, Integer> colors = new HashMap<>();
        int count = 0;
        while (count < 10) {
            System.out.print("Enter the color: ");
            String colorName = input.next();
            String[] keySet = colors.keySet().toArray(new String[colors.size()]);
            int keyCount = 0;
            while (keyCount < keySet.length) {
                if (keySet[keyCount].equalsIgnoreCase(colorName)) {
                    colors.put(keySet[keyCount], colors.get(keySet[keyCount]) + 1);
                    break;
                }
                keyCount++;
            }
            if (keyCount == keySet.length) colors.put(colorName, 1);
            count++;
        }

        System.out.println(colors);
    }
}

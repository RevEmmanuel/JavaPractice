package Chapter15;

import java.util.*;

public class ListManipulation {

    public static void main(String[] args) {
        String[] colors = {"red", "green", "blue", "orange", "yellow", "cyan"};
        LinkedList<String> colour = new LinkedList<>(Arrays.asList(colors));

        colour.add("black");
        colour.add(1, "aqua");
        colour.addLast("indigo");
        colour.addFirst("violet");
        colour.sort(Collections.reverseOrder());
        colors = colour.toArray(new String[colour.size()]);
        System.out.println(Arrays.toString(colors));
        List<String> list = new LinkedList<>();
        for (String color: colors) {
            list.add(color);
        }

        String[] colors2 = {"black", "purple", "indigo", "violet", "aqua"};
        List<String> list2 = new LinkedList<>();
        for (String color: colors2) {
            list2.add(color);
        }

        list.addAll(list2);
        list2 = null;

        printList(list);
        convertToUpperCase(list);
        printList(list);

        removeElements(list, 3, 6);
        printList(list);
        reversedList(list);
    }

    private static void removeElements(List<String> list, int start, int stop) {
        list.subList(start, stop).clear();
    }

    private static void convertToUpperCase(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }

    private static void printList(List<String> list) {
        System.out.println("List : ");
        for (String s : list) {
            System.out.print(s + "   ");
        }
        System.out.println();
    }

    private static void reversedList(List<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            System.out.printf("%s   ", iterator.previous());
        }
        System.out.println();
    }
}

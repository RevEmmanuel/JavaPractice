package Chapter7;

import java.util.ArrayList;

public class ArrayListWorks {

    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<>();

        items.add("red");
        items.add("yellow");
        items.add(2, "blue");
        for (String index : items) {
            System.out.printf("%s%n", index);
        }

        display(items, "List of content of items array");

        System.out.printf("%d%n", items.indexOf("blue"));
        items.add("black");
        items.add("purple");

        items.remove("blue");
        display(items, "after removing blue");

        System.out.printf("red is %s the array list%n", (items.contains("red")? "in" : "not in"));

        System.out.printf("The size of the array is %d", items.size());
    }

    public static void display(ArrayList<String> item, String header) {
        System.out.println(header);

        for (String index: item) {
            System.out.printf(" %s", index);
        }

        System.out.println();
    }

}

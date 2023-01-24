package chapter16;

import java.util.HashSet;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class DuplicateElimination {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        SortedSet<String> set = new TreeSet<>();
        int count = 0;
        while (count < 6) {
            System.out.println("Enter name: ");
            name = input.nextLine();
            set.add(name);
            count++;
        }
        System.out.println(set);

        System.out.println("Enter name to find: ");
        name = input.nextLine();
        System.out.printf("Name %s %s", name, (set.contains(name) ? "found" : "not found"));
    }
}

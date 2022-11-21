package HackerRank;

import java.util.Scanner;

public class Printing {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        double num = input.nextDouble();
        input.nextLine();
        String string = input.nextLine();

        System.out.printf("String: %s%n", string);
        System.out.println("Double: " + num);
        System.out.printf("Int: %d", number);
    }
}

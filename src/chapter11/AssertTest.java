package chapter11;

import java.util.Scanner;

public class AssertTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 10: ");
        int num = input.nextInt();
        // using assertions to debug code
        assert (num >= 0 && num <= 10) : String.format("Invalid number: %d", num);

        System.out.printf("You entered %d", num);
    }
}

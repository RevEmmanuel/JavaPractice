package ChibuzorAssignment;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int factor = 1;

        if (number == 0) {
            System.out.println("The factorial of zero is 1!");
        } else if (number == 1) {
            System.out.println("The factorial of 1 is 1!");
        } else if (number > 1) {
            for (int temp = number; temp >= 1; temp--) {
                factor = factor * temp;
            }
            System.out.printf("The factorial of %d is %d!", number, factor);
        }
        else System.out.println("Please enter a non-negative number!");
    }
}

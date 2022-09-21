package ChibuzorAssignment;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter a number: ");
            double num1 = input.nextDouble();

            System.out.println();

            System.out.println("Enter a second number: ");
            double num2 = input.nextDouble();

            double sum = num1 + num2;

            System.out.printf("%nThe sum of the two numbers is: %.2f%n%n", sum);
            System.out.println("Do you want to add another set of numbers?\nPress 1 for yes and 2 for no.");

            number = input.nextInt();
        }
        while (number == 1);

        System.out.println("Thanks for trying out.");
    }

}

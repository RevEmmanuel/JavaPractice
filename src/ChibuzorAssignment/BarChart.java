package ChibuzorAssignment;

import java.util.Scanner;

public class BarChart {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Enter a number between 1 and 30: ");
            int number1 = input.nextInt();
        System.out.println();

        System.out.print("Enter the second number between 1 and 30: ");
            int number2 = input.nextInt();
        System.out.println();

        System.out.print("Enter the third number between 1 and 30: ");
            int number3 = input.nextInt();
        System.out.println();

        System.out.print("Enter the fourth number between 1 and 30: ");
            int number4 = input.nextInt();
        System.out.println();

        System.out.print("Enter the fifth number between 1 and 30: ");
            int number5 = input.nextInt();
        System.out.println();

            ashPrinter(number1);
            ashPrinter(number2);
            ashPrinter(number3);
            ashPrinter(number4);
            ashPrinter(number5);
    }

    public static void ashPrinter(int number) {
        if (number >= 1 && number <= 30) {
            while (number != 0) {
               System.out.print("*");
                --number;
            }
        }
        else {
            System.out.println("Enter a number between 1 and 30!");
        }
        System.out.println();

    }
}

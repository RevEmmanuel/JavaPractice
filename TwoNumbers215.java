package Chapters2to6;

import java.util.Scanner;

public class TwoNumbers215 {

    //2.15 (Arithmetic) Write an application that asks the user to enter two integers, obtains them from
    //the user and prints the square of each, the sum of their squares, and the difference of the squares (first
    //number squared minus the second number squared). Use the techniques shown in Fig. 2.7

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.printf("The square of %d is %d%n", num1, num1 * num1);
        System.out.printf("The square of %d is %d%n%n", num2, num2 * num2);
        System.out.printf("The sum of their squares is %d%n", (num1 * num1) + (num2 * num2));
        System.out.printf("The difference of their squares is %d%n", (num1 * num1) - (num2 * num2));
    }
}

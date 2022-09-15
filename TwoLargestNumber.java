package Chapters2to6;

// 4.23 (Find the Two Largest Numbers) Using an approach similar to that for Exercise 4.21, find
//the two largest values of the 10 values entered. [Note: You may input each number only once.]

import java.util.Scanner;

public class TwoLargestNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number = input.nextInt();

        int largest2 = number;
        int largest = number;

        for (int i = 1; i <= 9; i++) {
            System.out.println("Enter the number: ");
            number = input.nextInt();
            if (number > largest) {
                largest2 = largest;
                largest = number;
            }
        }

        System.out.printf("The largest number is %d%n", largest);
        System.out.printf("The second largest number is %d", largest2);
    }
}

package ChibuzorAssignment;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int division = 1;

        if (number > 0) {

            for (int divider = 2; divider < number / 2; divider++) {
                division = number % divider;

                if (division == 0) {
                    break;
                }

            }

            if (division == 0) {
                System.out.printf("The number %d is not a prime number.", number);
            } else {
                System.out.printf("The number %d is a prime number", number);
            }
        }
    }
}

package ChibuzorAssignment;

import java.util.Scanner;

public class Mathpow {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = input.nextInt();

        System.out.println();

        System.out.print("Enter the power: ");
        int num2 = input.nextInt();

        powerOf(num1, num2);

    }

    public static int powerOf(int number1, int number2) {
        int initialNumber = number1;
        int power = number2;
        while (number2 > 1) {
            number1 = number1 * initialNumber;
            --number2;
        }

        System.out.printf("%d raced to power %d is %d", initialNumber, power, number1);
        return number1;
    }

}

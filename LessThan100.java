package Chapters2to6;

import java.util.Scanner;

public class LessThan100 {

    //2.16 (Comparing Integers) Write an application that asks the user to enter one integer, obtains
    //it from the user and displays whether the number and its square are greater than, equal to, not equal
    //to, or less than the number 100. Use the techniques shown in Fig. 2.15.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integer: ");
        int number = input.nextInt();

        if(number > 100) {
            System.out.printf("%d is greater than 100.%n%n", number);
        }
        else {
            if (number < 100) {
                System.out.printf("%d is less than 100.%n%n", number);
            }
            else {
                System.out.printf("%d is equal to 100%n%n", number);
            }

        }


        if ((number * number) > 100) {
            System.out.printf("The square of the number is %d. It is greater than 100.%n%n", number * number);
        }
        else {
            if ((number * number) < 100) {
                System.out.printf("The square of the number is %d. It is less than 100.%n%n", number * number);
            }
            else {
                System.out.printf("The square of the number is %d. It is equal to 100.%n%n", number * number);
            }

        }
    }
}

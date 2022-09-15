package Chapters2to6;

import java.util.Scanner;

public class LargestSmallest {

    // (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
    //user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
    //shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
    //representation of the average. So, if the sum of the values is 7, the average should be 2, not
    //2.3333….

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        int largest = num1;

        System.out.println();

        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        int smallest = num2;

        System.out.println();

        System.out.println("Enter the third number: ");
        int num3 = input.nextInt();

        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        
        if (num1 < smallest) {
            smallest = num1;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

        System.out.println();

        System.out.printf("%nThe sum of the three numbers is %d%n", num3 + num2 + num1);
        System.out.printf("The product of the three numbers is %d%n", num3 * num2 * num1);
        System.out.printf("The average of the three numbers is %d%n", (num2 + num1 + num3) / 3);
        System.out.printf("The largest number is %d%n", largest);
        System.out.printf("The smallest number is %d%n", smallest);



    }
}

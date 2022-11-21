package ClassActivity;

import tdd.ArrayManipulation;
import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inputCollection = new int[5];
        for(int count = 0; count < inputCollection.length;) {
            System.out.printf("Enter number %d: ", count + 1);
            int score = input.nextInt();
            if (score >= 0 && score <= 100) {
                inputCollection[count++] = score;
                System.out.println();
            }
            else System.out.println("Enter a valid value.\n");
        }
        System.out.printf("The minimum is %d%n", ArrayManipulation.minimumOf(inputCollection));
        System.out.printf("The maximum is %d%n", ArrayManipulation.maximumOf(inputCollection));
        int min = Integer.MIN_VALUE; // minimum value for integer
        int max = Integer.MAX_VALUE; // maximum value for integer.
        System.out.printf("Min is %d\nMax is %d", min, max);
    }
}

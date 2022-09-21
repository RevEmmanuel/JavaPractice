package Chapter7;

import java.util.Arrays;

public class ArrayManipulations {

    public static void main(String[] args) {
        double[] firstArray = {2.5, 9.5, 8.7, 1.2, 5.9, 4.3, 3.8, 9.2};

        displayArray(firstArray, "Before using Arrays.sort");
        Arrays.sort(firstArray);
        displayArray(firstArray, "Using Arrays.sort = Arranged in ascending order");

        Arrays.fill(firstArray, 8);
        displayArray(firstArray, "Using Arrays.fill to fill the entire array with value 8");

        for (int counter = 0; counter < firstArray.length; counter++) {
            firstArray[counter] = firstArray[counter] * counter - counter * 2;
        }

        displayArray(firstArray, "Modifying the values of the first array.");

        double[] secondArray = new double[firstArray.length];
        System.arraycopy(firstArray, 0, secondArray, 0, firstArray.length);

        displayArray(firstArray, "Using System.arraycopy");
        displayArray(secondArray, "This is the copied array");

        boolean test = Arrays.equals(firstArray, secondArray);
        System.out.printf("%nSecond array %s first array%n", (test ? "==" : "!="));

        int location = Arrays.binarySearch(firstArray, 30);

        System.out.printf("element found at %d", location);

        System.out.printf("%n30 %s in first array.%n", (location > 1 ? "found" : "not found"));

        location = Arrays.binarySearch(secondArray, 60);

        System.out.printf("%n60 %s in first array.%n", (location > 1 ? "found" : "not found"));
    }

    public static void displayArray(double[] array, String description) {
        System.out.printf("%n%s%n", description);
        for (double counter : array) {
            System.out.printf("%.2f   ", counter);
        }
        System.out.println();
    }
}

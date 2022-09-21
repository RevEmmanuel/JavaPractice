package GraceAssignment;

public class ArrayAssignment {

    public static void main(String[] args) {

        /*
        Create an array to hold the numbers you want to add
        Use a loop to add all the numbers continually
        Print the result after all the numbers have been added.
         */
        int[] numbers = {10, 12, 34, 56, 67, 43, 23, 8, 87, 98, 235};
        int total = 0;

        for (int index : numbers) {
            total += index;
        }

        System.out.printf("The total is %d%n", total);
    }
}

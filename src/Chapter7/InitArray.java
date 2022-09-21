package Chapter7;

public class InitArray {

    public static void main(String[] args) {
        final int Array_Length = 10;
        int[] array = new int [Array_Length];
        System.out.printf("%5s%20s%n", "Index", "Array Value");
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%20d%n", counter, array[counter]);
        }

        int[] array1 = {10, 20, 20, 40, 50, 68};
        System.out.printf("%n%5s%20s%n", "Index", "Array Value");
        for (int counter = 0; counter < array1.length; counter++) {
            System.out.printf("%5d%20d%n", counter, array1[counter]);
        }

        System.out.printf("%n%5s%20s%n", "Index", "Array Value");
        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = 2 + 2 * counter;
        }

        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%20d%n", counter, array[counter]);
        }

    }
}

package Chapter7;

// Copy a hundred-element arrayA into a hundred-element arrayB, but in reverse order.

public class ExerciseChap7 {

    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayB = new int[arrayA.length];
        int counter2 = arrayA.length - 1;

        for (int fill : arrayA) {
            arrayB[counter2] = fill;
            counter2--;
        }

        for (int read : arrayB) {
            System.out.printf("%d   ", read);
        }
    }
}

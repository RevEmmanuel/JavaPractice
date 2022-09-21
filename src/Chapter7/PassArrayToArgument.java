package Chapter7;

public class PassArrayToArgument {

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};

        for (int counter : array) {
            System.out.printf("%4d", counter);
        }
        passArray(array);
        System.out.println();

        for (int counter : array) {
            System.out.printf("%4d", counter);
        }

        System.out.printf("%nElement before method passElement is %d", array[2]);
        passElement(array[2]);
        System.out.printf("%nElement after method passElement is %d", array[2]);
    }

    public static void passArray(int[] passed) {
       for (int counter = 0; counter < passed.length; counter++) {
           passed[counter] *= 2;
       }
    }

    public static void passElement(int element) {
        element *= 2;
        System.out.printf("%nElement during method passElement is %d", element);
    }
}

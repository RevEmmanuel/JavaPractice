package Chapter8;

import java.util.Arrays;

public class PassArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.printf("Value of array before method is %s%n", Arrays.toString(array));
        modifyArray(array);
        System.out.printf("Value of array after method is %s%n", Arrays.toString(array));
        System.out.printf("Value of element before method is %d%n", array[3]);
        modifyElement(array[3]);
        System.out.printf("Value of element after method is %d%n", array[3]);
    }

    public static void modifyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                array[i] *= 2;
                System.out.printf("Value of array in method is %s%n", Arrays.toString(array));
            } else {
                return ;
            }
//        System.out.printf("Value of array in method is %s%n", Arrays.toString(array));
        }
    }

    public static void modifyElement(int element) {
        element *= 2;
        System.out.printf("Value of element inside method is %d%n", element);
    }
}

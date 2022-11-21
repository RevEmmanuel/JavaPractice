package ClassActivity;

import java.security.SecureRandom;

public class ArrayIng {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[][] oneToTwenty = new int[20][10];

        for (int i = 0; i < oneToTwenty.length; i++){
            for (int j = 0; j < oneToTwenty[i].length; j++){
                oneToTwenty[i][j] = 1 + random.nextInt(30);
            }
        }

        for (int[] numbers : oneToTwenty) {
            for (int aNumber : numbers) {
                System.out.printf("%02d  ", aNumber);
            }
            System.out.println();
        }
        System.out.println("\n");

        int[] rowToLoopThrough = new int[oneToTwenty.length];
        for (int i = 0; i < rowToLoopThrough.length; i++) {
            rowToLoopThrough[i] = i;
        }

        for (int column = 0; column < oneToTwenty[rowToLoopThrough[column]].length; column++) {
            for (int[] ints : oneToTwenty) {
                System.out.printf("%02d  ", ints[column]);
            }
            System.out.println();
        }
    }
}

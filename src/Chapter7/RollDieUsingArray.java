package Chapter7;

import java.security.SecureRandom;

public class RollDieUsingArray {

    public static void main(String[] args) {
        SecureRandom random= new SecureRandom();
        int[] array = new int[7];

        for (int counter = 1; counter <= 60_000_000; counter++) {
            ++array[1 + random.nextInt(6)];

        }

        System.out.printf("%4s%15s%n", "Face", "Appearance");
        for (int counter = 1; counter < array.length; counter++) {
            System.out.printf("%4d%15d%n", counter, array[counter]);
        }
    }
}

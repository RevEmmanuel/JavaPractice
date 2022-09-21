package Chapter7;

import java.security.SecureRandom;

public class CountDie {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] frequency = new int[7];

        for (int counter = 1; counter < 60_000_000; counter++) {
            ++frequency[1 + random.nextInt(6)];
        }

        System.out.printf("%3s%20s%n", "Die", "Count");

        for (int counter = 1; counter < frequency.length; counter++) {
            System.out.printf("%3d%20d%n", counter, frequency[counter]);
        }
    }
}

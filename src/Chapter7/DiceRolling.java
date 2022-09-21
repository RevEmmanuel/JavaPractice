package Chapter7;

// (Dice Rolling) Write an application to simulate the rolling of two dice. The application
//should use an object of class Random once to roll the first die and again to roll the second die. The
//sum of the two values should then be calculated. Each die can show an integer value from 1 to 6, so
//the sum of the values will vary from 2 to 12, with 7 being the most frequent sum, and 2 and 12 the
//least frequent. Figure 7.28 shows the 36 possible combinations of the two dice. Your application
//should roll the dice 36,000,000 times. Use a one-dimensional array to tally the number of times
//each possible sum appears. Display the results in tabular format

import java.util.Random;

public class DiceRolling {

    public static void main(String[] args) {
        Random random = new Random();
        int[] tally = new int[13];

        for (int rollDie = 1; rollDie <= 36_000_000; rollDie++) {
            int face1 = 1 + random.nextInt(6);
            int face2 = 1 + random.nextInt(6);

            int sum = face1 + face2;

            ++tally[sum];
        }

        System.out.printf("%4s%20s%n", "Face", "Appearance");

        for (int index = 2; index < tally.length; index++) {
            System.out.printf("%4d%20d%n", index, tally[index]);
        }
    }
}

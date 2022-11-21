package Chapter7;

// 7.20 (Archery Game) A group of four friends visit a sports club and they decide to practice archery.
// Each player gets 3 chances and in every chance they can score between 0 to 10 points. The
//player with the maximum score after adding the scores obtained in all 3 chances wins. Write an application
// that simulates this game and prints the scores of all four players in a tabular format and
//also prints which player won.
//Each line in the table should contain the following:
//1) The player number
//2) Their first chance score
//3) Their second chance score
//4) Their third chance score
//5) Their score after all three chances
//Use multidimensional arrays to store the scores of players in each chance.
//Use the secure random-number generation mechanism learnt in the previous chapter to generate
//scores between 0 and 10 for each player chance

import java.security.SecureRandom;

public class ArcheryGame {
    private static final SecureRandom random = new SecureRandom();

    public static void main(String[] args) {
        int[][] players = new int[4][3];

        for (int score = 0; score < players.length; score++) {
            for (int player = 0; player < players[score].length; player++) {
                players[score][player] = random.nextInt(11);
            }
        }

        printResult(players);
    }

    public static void printResult(int[][] output) {
        int[] totalPlayer = new int[4];

        for (int score = 0; score < output.length; score++) {
            for (int player = 0; player < output[score].length; player++) {
                totalPlayer[score] += output[score][player];
            }
        }
        System.out.printf("%8s%10s%10s%10s%10s%n", "Player", "Round1", "Round2", "Round3", "Total");
        for (int score = 0; score < output.length; score++) {
            System.out.printf("Player %d", score + 1);
            for (int player = 0; player < output[score].length; player++) {
                System.out.printf("%10d", output[score][player]);
            }
            System.out.printf("%10d", totalPlayer[score]);
            System.out.println();
        }
        findMaximumValue(totalPlayer);
    }

    public static void findMaximumValue(int[] array) {
        int maximum = 0;
        for (int score : array) {
            if (score > maximum) {
                maximum = score;
            }
        }
        for (int score = 0; score < array.length; score++) {
            if (array[score] == maximum) {
                System.out.println("\nPlayer " + (score + 1) + " wins!");
                break;
            }
        }
    }
}

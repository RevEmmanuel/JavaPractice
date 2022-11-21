package tdd;

import java.security.SecureRandom;

public class GameOfCraps {

    private static final SecureRandom random = new SecureRandom();

    private enum Status {WON, LOST, CONTINUE}

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        Status gameStatus;
        int[] won = new int[22];
        int[] lost = new int[22];

        for (int count = 0; count < 1_000_000; count++) {

            int counter = 0;
            int myPoint = 0;
            int sumOfDice = rollDice();
            ++counter;

            switch (sumOfDice) {
                case SEVEN, YO_LEVEN -> gameStatus = Status.WON;
                case SNAKE_EYES, TREY, BOX_CARS -> gameStatus = Status.LOST;
                default -> {
                    gameStatus = Status.CONTINUE;
                    myPoint = sumOfDice;
                    System.out.println("Player rolls again");
                    System.out.printf("Player's point is %d%n", myPoint);
                }
            }

            while (gameStatus == Status.CONTINUE) {
                sumOfDice = rollDice();
                //rollCount(counter);
                ++counter;
                if (sumOfDice == myPoint) {
                    gameStatus = Status.WON;
                } else {
                    if (sumOfDice == SEVEN) {
                        gameStatus = Status.LOST;
                    }
                }
            }

            if (gameStatus == Status.WON) {
                System.out.println("Player wins! :)");
                if (counter <= 20) {
                    ++won[counter];
                }
                else {
                    ++won[21];
                }
            } else {
                System.out.println("Player loses :(");
                if (counter <= 20) {
                    ++lost[counter];
                }
                else {
                    ++lost[21];
                }
            }
        }

        System.out.printf("%4s%15s%15s%n", "Roll", "Number Won", "Number Lost");
        for (int count = 1; count < won.length; count++) {
            System.out.printf("%4d%15d%15d%n", count, won[count], lost[count]);
        }
        int total = 0;
        for (int count : won) {
            total+= count;
        }
        for (int count : lost) {
            total += count;
        }

        System.out.printf("Total of %d rolls", total);
    }

    public static int rollDice() {
        int die1 = 1 + random.nextInt(6);
        int die2 = 1 + random.nextInt(6);

        int sum = die1 + die2;

        System.out.printf("%nPlayer played %d + %d = %d%n%n", die1, die2, sum);

        return sum;
    }

}

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

        int myPoint = 0;
        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case SEVEN, YO_LEVEN -> gameStatus = Status.WON;
            case SNAKE_EYES, TREY, BOX_CARS -> gameStatus = Status.LOST;
            default -> {
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.println("Player rolls again");
                System.out.printf("Player's point is %d%n%n", myPoint);
            }
        }

        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();
            if (sumOfDice == myPoint) {
              gameStatus = Status.WON;
            }
            else {
                if (sumOfDice == SEVEN) {
                    gameStatus = Status.LOST;
                }
            }
        }

        if (gameStatus == Status.WON) {
            System.out.println("Player wins! :)");
        }
        else {
            System.out.println("Player loses :(");
        }
    }

    public static int rollDice() {
        int die1 = 1 + random.nextInt(6);
        int die2 = 1 + random.nextInt(6);

        int sum = die1 + die2;

        System.out.printf("Player played %d + %d = %d%n%n", die1, die2, sum);

        return sum;
    }

}

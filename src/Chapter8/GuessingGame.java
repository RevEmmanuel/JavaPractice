package Chapter8;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessingGame {
    private static final SecureRandom random = new SecureRandom();
    private static final Scanner input = new Scanner(System.in);
    private enum Status {WON, LOST, CONTINUE}
    private final Player player1 = new Player();
    private final Player player2 = new Player();

    public void startGame() {
        System.out.println("Player 1, enter your name : ");
        String name1 = input.nextLine();
        player1.setPlayerName(name1);
        askAge(player1);
        askDeposit(player1);

        System.out.println("Player 2, enter your name : ");
        String name2 = input.next();
        player2.setPlayerName(name2);
        askAge(player2);
        askDeposit(player2);

        Status gameStatus;

        do {
            System.out.printf("%s, enter your guess : ", player1.getName());
            int guess1 = input.nextInt();
            System.out.println();

            System.out.printf("%s, enter your guess : ", player2.getName());
            int guess2 = input.nextInt();

            int guess = printGameGuess();
            double player1Lose = 0.2 * player1.getBalance();
            double player2Lose = 0.2 * player2.getBalance();

            if (guess == guess1) {
                gameStatus = Status.WON;
                player1.deposit(player2Lose);
                player2.withdraw(player2Lose);
                System.out.printf("%s wins!", player1.getName());
            } else {
                if (guess == guess2) {
                    gameStatus = Status.WON;
                    player2.deposit(player1Lose);
                    player1.withdraw(player1Lose);
                    System.out.printf("%s wins!", player2.getName());
                } else {
                    gameStatus = Status.CONTINUE;
                }
            }
        } while (gameStatus == Status.CONTINUE);
    }

    public static int printGameGuess() {
        int guess = 1 + random.nextInt(6);
        System.out.printf("Random number is %d%n", guess);
        return guess;
    }

    public static void askAge(Player xyz) {
        System.out.println("Player, enter your age : ");
        int age = input.nextInt();
            if (age >= 18) {
                xyz.setPlayerAge(age);
            } else {
                System.out.println("Enter a valid age!");
            }
            while (age < 18) {
                System.out.println("Player, enter your age : ");
                int age1 = input.nextInt();
                if (age1 >= 18) {
                    xyz.setPlayerAge(age1);
                } else {
                    System.out.println("Enter a valid age!");
                }
                age = age1;
            }
    }

    public static void askDeposit(Player xyz) {
        System.out.printf("%s, please make a deposit NOT GREATER THAN 200.0: ", xyz.getName());
        double amount = input.nextDouble();
        if (amount > 0 && amount <= 200) {
            xyz.deposit(amount);
        } else {
            System.out.println("Enter a valid amount!");
        }
        while (amount < 0 || amount > 200) {
            System.out.printf("%s, please make a deposit NOT GREATER THAN 200.0: ", xyz.getName());
            double amount1 = input.nextDouble();
            if (amount1 > 0 && amount1 <= 200) {
                xyz.deposit(amount1);
            } else {
                System.out.println("Enter a valid amount!");
            }
            amount = amount1;
        }
    }

}

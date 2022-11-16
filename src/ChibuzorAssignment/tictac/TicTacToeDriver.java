package ChibuzorAssignment;

import java.util.Scanner;

public class TicTacToeDriver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Player 1, please enter your name: ");
        String player1Name = input.nextLine();
        System.out.print("Hi " + player1Name + ", please pick a character: ");
        String player1Character = input.next();
        input.nextLine();
        System.out.print("Player 2, please enter your name: ");
        String player2Name = input.nextLine();
        System.out.print("Hi " + player2Name + ", please pick a character: ");
        String player2Character = input.next();

        Player player1 = new Player(player1Name, player1Character);
        Player player2 = new Player(player2Name, player2Character);

        TicTacToe newGame = new TicTacToe(player1, player2);
        System.out.printf("Hi %s%n", newGame.getPlayers());
        System.out.println("Welcome to TicTacToe!");
        newGame.printTable();

        while (newGame.canPlay()) {
            System.out.printf("%s, please pick a play position from 1 - 9: ", player1.getName());
            int position = input.nextInt();
            String haveIPlayed = newGame.play(player1, position);

            while (haveIPlayed.equals("0")) {
                System.out.printf("%s, please pick a play position from 1 - 9: ", player1.getName());
                position = input.nextInt();
                haveIPlayed = newGame.play(player1, position);
            }
            newGame.printTable();

            System.out.printf("%s, please pick a play position from 1 - 9: ", player2.getName());
            position = input.nextInt();
            haveIPlayed = newGame.play(player2, position);
            while (haveIPlayed.equals("0")) {
                System.out.printf("%s, please pick a play position from 1 - 9: ", player2.getName());
                position = input.nextInt();
                haveIPlayed = newGame.play(player2, position);
            }
            newGame.printTable();
        }
    }

}

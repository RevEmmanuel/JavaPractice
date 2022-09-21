package tdd;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessingApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        long magicNumber = 1 + random.nextLong(1000000000);

        for (long number = 0; number != magicNumber;) {
            System.out.print("Guess a number: ");
            number = input.nextLong();

            if (number > magicNumber) System.out.println("Too high!");
            else {
                if (number < magicNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Perfect! You guessed the number!");
                }
            }
        }

    }
}


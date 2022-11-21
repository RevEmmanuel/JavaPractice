package Chapter8;

import java.util.Scanner;

public class Player {
    private String playerName;
    private int playerAge;
    private double playerBalance;
    // private static final Scanner input = new Scanner(System.in);

    public void setPlayerName(String name) {
       playerName = name;
    }

    public String getName() {
        return playerName;
    }

    public void setPlayerAge(int age) {
        if (age >= 18) {
            playerAge = age;
        }
    }

    public int getPlayerAge() {
        return playerAge;
    }

    public void getPlayerDetails() {
        System.out.printf("Name : %s%nAge : %d%nBalance : %.2f%n%n", getName(), getPlayerAge(), getBalance());
    }

    public void deposit(double amount) {
        if (amount > 0 && amount <= 200.0) {
            playerBalance += amount;
        }
    }

    public double getBalance() {
        return playerBalance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            playerBalance -= amount;
        }
    }
}

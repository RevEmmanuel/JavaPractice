package Chapter15;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Reading {

    private static final MenuOption[] options = MenuOption.values();

    public static void main(String[] args) {
        MenuOption accountType = getRequest();
        switch (accountType) {
            case ZERO_BALANCE -> System.out.println("Accounts with zero balance are: ");
            case DEBIT_BALANCE -> System.out.println("Accounts with debit balance are: ");
            case CREDIT_BALANCE -> System.out.println("Accounts with credit balance are: ");
        }
        while (accountType != MenuOption.END) {
            System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "FirstName", "LastName", "Balance");
            readData(accountType);
            accountType = getRequest();
        }
        System.out.println("Thanks for trying us out.");
    }

    private static void readData(MenuOption accountType) {
        try (Scanner scanner = new Scanner(Paths.get("C:\\Users\\user\\IdeaProjects\\adekunleAdeola\\src\\Chapter15\\mySecondFile.txt"))) {
            while (scanner.hasNext()) {
                int accountNumber = scanner.nextInt();
                String firstName = scanner.next();
                String lastName = scanner.next();
                double balance = scanner.nextDouble();
                if (shouldDisplay(accountType, balance))
                    System.out.printf("%-10d%-12s%-12s%10.2f%n", accountNumber, firstName, lastName, balance);
            }
            System.out.println();
        }
        catch (IOException e) {
            System.out.println("An error occurred. Terminating application.");
            System.exit(0);
        }
    }

    private static MenuOption getRequest() {
        Scanner scanner = new Scanner(System.in);
        int requestNumber;

        do {
            System.out.println("""
            1. Zero Balance
            2. Credit Balance
            3. Debit Balance
            4. End
            Pick a choice:""");
            requestNumber = scanner.nextInt();
        } while (requestNumber < 1 || requestNumber > 4);
        return options[requestNumber - 1];
    }

    private static boolean shouldDisplay(MenuOption accountType, double balance) {
        switch (accountType) {
            case ZERO_BALANCE -> {
                if (balance == 0) return true;
            }
            case DEBIT_BALANCE -> {
                if (balance > 0) return true;
            }
            case CREDIT_BALANCE -> {
                if (balance < 0) return true;
            }
        }
        return false;
    }
}

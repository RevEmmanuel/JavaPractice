package tdd;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;

public class Checkout {

    public static void main(String[] args) {
        LocalDate timer = LocalDate.now();
        Scanner input = new Scanner(System.in);
        // Scanner input2 = new Scanner(System.in);
        ArrayList<String> itemBought = new ArrayList<>();
        ArrayList<Integer> quantity = new ArrayList<>();
        ArrayList<Integer> itemPrice = new ArrayList<>();
        String moreItems;
        System.out.println("What is the customer's name?");
        String customerName = input.nextLine();

        do {
            System.out.println("What did the customer buy?");
            itemBought.add(input.nextLine());
            System.out.println("How many pieces?");
            quantity.add(input.nextInt());
            System.out.println("How much per unit?");
            itemPrice.add(input.nextInt());
            input.nextLine();
            System.out.println("Add more items?");
            moreItems = input.nextLine();
            moreItems = moreItems.toUpperCase();
        } while (moreItems.equals("YES"));

        if (moreItems.equals("NO")) {
            System.out.println("Enter the cashier's name:");
            String cashierName = input.next();
            int total = 0;
            for(int counter = 0; counter < itemBought.toArray().length; counter++) {
                total += quantity.get(counter) * itemPrice.get(counter);
            }
            System.out.printf("Total is %d%n", total);
            System.out.println("How much did you pay?");
            int amountPaid = input.nextInt();
            System.out.printf("""
        *=============================================================*
        | PARAGON SUPERMARKET STORES INTERNATIONAL                    |
        | DATE & TIME: %-30s                 |
        | 419, VAWULENCE HIGHWAY, GOD ABEG STREET, YABA, LAGOS.       |
        | CUSTOMER'S NAME: %9s                                  |
        | CASHIER'S NAME: %10s                                  |
        *-------------------------------------------------------------*
        *-------------------------------------------------------------*
        |%12s%12s%15s%15s       |
        *-------------------------------------------------------------*
        """, timer, customerName, cashierName, "Item Name", "Quantity", "Unit Price", "Final Price");
            for(int counter = 0; counter < itemBought.toArray().length; counter++) {
                System.out.printf("""
                        |%12s%12s%15s%15d       |
                        """, itemBought.get(counter), quantity.get(counter),
                        itemPrice.get(counter), quantity.get(counter) * itemPrice.get(counter));
            }

            int discount = 3 * total / 100;
            System.out.printf("""
            *-------------------------------------------------------------*
            |%39s : %12d       |%n|%39s : %12d       |%n
            """, "Total", total, "Discount", discount);
            int expectedAmount = total - discount;
            System.out.printf("""
                    |%39s : %12d       |%n
                    *-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -*
                    """, "Amount to be paid", expectedAmount);
            paymentValidation(expectedAmount, amountPaid);
            System.out.printf("""
            *=============================================================*
            |%25s                                    |
            |%25s                                    |
            *=============================================================*
            ""","Thanks for patronizing <3", "See you next time :)");
        }



    }

    public static void paymentValidation(int amountExpected, int amountReceived) {
        System.out.printf("|%39s : %12d       |%n", "Amount paid", amountReceived);
        if (amountReceived >= amountExpected) {
            System.out.printf("|%39s : %12d       |%n", "Balance", amountReceived - amountExpected);
        }
        else {
            System.out.printf("|%39s : %12d       |%n", "Remaining amount to be paid", amountExpected - amountReceived);
        }
    }
}

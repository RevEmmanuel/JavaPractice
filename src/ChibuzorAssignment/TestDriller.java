package ChibuzorAssignment;

import java.util.Scanner;

public class TestDriller {

    public static void main(String[] args) {

        int price;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of copies:");
        int copy = input.nextInt();

        if (copy >= 1 && copy <= 4) {
            price = copy * 2000;
        }
        else if (copy >= 5 && copy <= 9) {
            price = copy * 1800;
        } else if (copy >= 10 && copy <= 29) {
            price = copy * 1600;
        } else if (copy >= 30 && copy <= 49) {
            price = copy * 1500;
        } else if (copy >= 50 && copy <= 99) {
            price = copy * 1300;
        } else if (copy >= 100 && copy <= 199) {
            price = copy * 1200;
        } else if (copy >= 200 && copy <= 499) {
            price = copy * 1100;
        } else { price = copy * 1000; }
        System.out.printf("The total price is: %d", price);

        }


    }


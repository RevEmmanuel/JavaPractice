package Chapter7;

//7.19 (Airline Reservations System) A small airline has just purchased a computer for its new automated
// reservation system. You’ve been asked to develop the new system.
// You’re to write an application to assign seats on each flight of the airline’s only plane (capacity: 10 seats)
//Your application should display the following alternatives: Please type 1 for First Class and
//Please type 2 for Economy. If the user types 1, your application should assign a seat in the first class section (seats 1–5)
// . If the user types 2, your application should assign a seat in the economy
//section (seats 6–10). Your application should then display a boarding pass indicating the person’s
//seat number and whether it’s in the first-class or economy section of the plane.
//Use a one-dimensional array of primitive type boolean to represent the seating chart of the
//plane. Initialize all the elements of the array to false to indicate that all the seats are empty. As
//each seat is assigned, set the corresponding element of the array to true to indicate that the seat is
//no longer available.
//Your application should never assign a seat that has already been assigned. When the economy
//section is full, your application should ask the person if it’s acceptable to be placed in the first-class
//section (and vice versa). If yes, make the appropriate seat assignment. If no, display the message
//"Next flight leaves in 3 hours."

import java.util.Arrays;
import java.util.Scanner;

public class AirlineReservations {
    private static int firstClassSeat = 0;
    private static int economySeat = 5;
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean[] occupy = new boolean[10];
        int[] seatNo = new int[11];
        Arrays.fill(occupy, false);

        for (int counter = 0; counter < 5; counter++) {
            seatNo[counter] = counter;
        }

        for (int counter = 5; counter < 11; counter++) {
            seatNo[counter] = counter;
        }

        for (int seat = 0; seat < 12; seat++) {
            System.out.print("Enter 1 for First class or Enter 2 for Economy: ");
            int seatClass = input.nextInt();

            switch (seatClass) {
                case 1 -> firstClass(occupy, seatNo);
                case 2 -> economy(occupy, seatNo);
            }
        }
    }

    private static void economy(boolean[] inSeat, int[] seatNo) {
        if (economySeat + firstClassSeat < 15) {
            if (economySeat < 10) {
                inSeat[economySeat] = true;
                System.out.printf("You have been assigned seat %d in economy class.%n", seatNo[economySeat + 1]);
                economySeat++;
            } else {
                System.out.println("Economy is full! \nWould you like to be placed in FirstClass");
                System.out.println("Enter 1 for yes and 2 for no: ");
                int answer = input.nextInt();
                System.out.println();

                if (answer == 1) {
                    firstClass(inSeat, seatNo);
                    System.out.println();
                } else {
                    System.out.println("Next flight leaves in 3 hours!");
                }
            }
        }
        else {
            System.out.println("No more available spaces.\nNext flight leaves in 3 hours!");
            System.out.println();
        }
    }

    public static void firstClass(boolean[] inSeat, int[] seatNo) {
        if (economySeat + firstClassSeat < 15) {
            if (firstClassSeat < 5) {
                inSeat[firstClassSeat] = true;
                System.out.printf("You have been assigned seat %d in first class.%n", seatNo[firstClassSeat + 1]);
                firstClassSeat++;
            } else {
                System.out.println("First class is full! \nWould you like to be placed in Economy section? ");
                System.out.println("Enter 1 for yes and 2 for no: ");
                int answer = input.nextInt();
                System.out.println();

                if (answer == 1) {
                    economy(inSeat, seatNo);
                    System.out.println();
                } else {
                    System.out.println("Next flight leaves in 3 hours!");
                }
            }
        }
        else {
            System.out.println("No more available spaces.\nNext flight leaves in 3 hours!");
        }
    }
}


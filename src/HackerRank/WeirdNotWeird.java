package HackerRank;

import java.util.Scanner;

public class WeirdNotWeird {

    //If  is odd, print Weird
    //If  is even and in the inclusive range of  to , print Not Weird
    //If  is even and in the inclusive range of  to , print Weird
    //If  is even and greater than , print Not Weird

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = input.nextInt();

        boolean range2To5 = N >= 2 && N <= 5;
        boolean range6To20 = N >= 6 && N <= 20;
        boolean range20 = N > 20;

        if (N >= 1 && N <= 100) {
            if (N % 2 == 0 && range2To5) {
                System.out.println("Not weird");
            }
            else if (N % 2 == 0 && range6To20) {
                System.out.println("Weird");
            }
            else if (N % 2 != 0) {
                System.out.println("Weird");
            }
            else if (N % 2 == 0 && range20) {
                System.out.println("Not weird");
            }
        }
    }
}

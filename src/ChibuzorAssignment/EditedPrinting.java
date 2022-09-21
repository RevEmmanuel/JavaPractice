package ChibuzorAssignment;

public class EditedPrinting {

    public static void main(String[] args) {

        for (int counter = 0; counter <= 5; counter++) {
            for (int star = 1; star <= counter; star++) {
                for (int space = 6; space >= counter + 1; space--) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.printf("%5s%n", "*");
        System.out.printf("%6s%n", "***");
        System.out.printf("%7s%n", "*****");
        System.out.printf("%8s%n", "*******");
        System.out.printf("%9s%n", "*********");

        System.out.println();
        System.out.println();

        System.out.printf("%5d%n", 1);
        System.out.printf("%6d%n", 222);
        System.out.printf("%7d%n", 33333);
        System.out.printf("%8d%n", 4444444);
        System.out.printf("%9d%n", 555555555);

        System.out.println();
        System.out.println();

        System.out.printf("%5d%n", 1);
        System.out.printf("%6d%n", 212);
        System.out.printf("%7d%n", 32123);
        System.out.printf("%8d%n", 4321234);
        System.out.printf("%9d%n", 543212345);
    }
}

package ChibuzorAssignment;

public class PrintATable {

    public static void main(String[] args) {

        System.out.printf("%-10s%-10s%-15s%n", "a", "b", "pow(a, b)");
        System.out.printf("%-10d%-10d%-15d%n", 1, 2, (int) Math.pow(1, 2));
        System.out.printf("%-10d%-10d%-15d%n", 2, 3, (int) Math.pow(2, 3));
        System.out.printf("%-10d%-10d%-15d%n", 3, 4, (int) Math.pow(3, 4));
        System.out.printf("%-10d%-10d%-15d%n", 4, 5, (int) Math.pow(4, 5));
        System.out.printf("%-10d%-10d%-15d%n", 5, 6, (int) Math.pow(5, 6));
    }
}

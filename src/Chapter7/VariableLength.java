package Chapter7;

// (Variable-Length Argument List) Write an application that calculates the average of a series
//of integers that are passed to method average using a variable-length argument list. Test your method
//with several calls, each with a different number of arguments.

public class VariableLength {

    public static void main(String[] args) {
        System.out.printf("Average of 10, 20, 30 and 40 is %.2f%n%n", averageOf(10, 20, 30, 40));
        System.out.printf("Average of 15, 20, 25, 30, 35 and 40 is %.2f%n%n", averageOf(15, 20, 25, 30, 35, 40));
    }

    public static double averageOf(int... num) {
        double total = 0;
        for (int index : num) {
            total += index;
        }
        return total / num.length;
    }
}

package Chapter7;

public class VariableNoOfArguments {

    public static void main(String[] args) {
        int num1 = 10;
        double num2 = 20.8;
        double num3 = 30.7;
        double num4 = 40.5;
        int num5 = 50;

        System.out.printf("Number 1 is %d%n", num1);
        System.out.printf("Number 2 is %.2f%n", num2);
        System.out.printf("Number 3 is %.2f%n", num3);
        System.out.printf("Number 4 is %.2f%n", num4);
        System.out.printf("Number 5 is  %d%n", num5);

        System.out.printf("Average of num1 and num2 is %.2f%n", averageOf(num1, num2));
        System.out.printf("Average of num1, 2 and 3 is %.2f%n", averageOf(num1, num2, num3));
        System.out.printf("Average of num1, 2, 3 and 4 is %.2f%n", averageOf(num1, num2, num3, num4));
        System.out.printf("Average of num1, 2, 3, 4 and5 is %.2f%n", averageOf(num1, num2, num3, num4, num5));
    }

    public static double averageOf(double... numbers) {
        double total = 0;
        for (double sum : numbers) {
            total += sum;
        }
        return total / numbers.length;
    }
}

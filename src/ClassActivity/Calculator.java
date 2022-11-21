package ClassActivity;

public class Calculator {

    public int addTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public int subtractTwoNumbers(int num1, int num2) {
        return Math.abs(num1 - num2);
    }

    public int divideTwoNumbers(int num1, int num2) {
        return num1 / num2;
    }

    public int multiplyTwoNumbers(int num1, int num2) {
        return num1 * num2;
    }

    public long factorialOf(int number) {
        long factor = 1;
        if (number == 1 || number == 0) return 1;
        else if (number > 1) {
            for (; number >= 1; number--) {
                factor *= number;
            }
        }
        else System.out.println("Please enter a non-negative number!");
        return factor;
    }

    public double valueOfE(int number) {
        double e = 1;
        for (int i = 1; i < number; i++) {
            e += (1 / (double) i);
        }
        return e;
    }

    public double valueOfERacedToPowerX(int number) {
        double e = 1;
        for (int i = 1; i < number; i++) {
            e += Math.pow(number, i) / factorialOf(i);
        }
        return e;
    }
}

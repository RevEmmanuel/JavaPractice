package ClassActivity;

public class NumberLessThan100 {


    public boolean numberIsLessThan100(int num) {
        if (num < 100) {
            System.out.println("Number is less than 100.");
            return true;
        }
        else return false;
    }

    public boolean numberIsGreaterThan100(int num) {
        if (num > 100) {
            System.out.println("Number is greater than 100.");
            return true;
        }
        else return false;
    }

    public boolean numberIsEqualsTo100(int num) {
        if (num == 100) {
            System.out.println("Number is equal tp 100.");
            return true;
        }
        else return false;
    }

    public boolean squareIsLessThan100(int num) {
        num = (int) Math.pow(num, 2);
        if (num < 100) {
            System.out.println("Square of number is less than 100.");
            return true;
        }
        else return false;
    }

    public boolean squareIsGreaterThan100(int num) {
        num = (int) Math.pow(num, 2);
        if (num > 100) {
            System.out.println("Square of number is greater than 100.");
            return true;
        }
        else return false;
    }

    public boolean squareIsEqualsTo100(int num) {
        num = (int) Math.pow(num, 2);
        if (num == 100) {
            System.out.println("Square of number is equal to 100.");
            return true;
        }
        else return false;
    }
}

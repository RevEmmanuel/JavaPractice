package Leetcode;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647));
    }

    public static int mySqrt(int x) {
        int sqrt = 0;
        if (x == 0) return sqrt;
        if (x == 1 || x == 2) return ++sqrt;
        for (double i = 1; i <= (double) (x / 2) + 1; i++) {
            if (i * i == x) return (int) i;
            if (i * i > x) return (int) i - 1;
        }
        return sqrt;
    }
}

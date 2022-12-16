package Leetcode;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(1));
        System.out.println(mySqrt(0));
    }

    public static int mySqrt(int x) {
        int sqrt = 0;
        if (x == 0) return sqrt;
        if (x == 1 || x == 2) return ++sqrt;
        for (int i = 1; i <= x; i++) {
            if (i * i == x) return i;
            if (i * i > x) return i - 1;
        }
        return sqrt;
    }
}

package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {

    public static boolean isHappy(int n) {
        List<Integer> results = new ArrayList<>();
        int sum = n;
        if (sum == 1) return true;
        do {
            results.add(sum);
            n = sum;
            sum = 0;
            while (n != 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            if (sum == 1) return true;
        } while (!results.contains(sum));
        return false;
    }

}

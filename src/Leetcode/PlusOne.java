package Leetcode;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i != 0) {
                if (digits[i] > 9) {
                    digits[i - 1] += 1;
                    digits[i] = 0;
                }
            }
        }

        if (digits[0] > 9) {
            digits[0] = 0;
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            System.arraycopy(digits, 0, newDigits, 1, digits.length);
            return newDigits;
        }
        return digits;
    }
}

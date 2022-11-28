package ChibuzorAssignment;

import java.util.Arrays;

public class HugeInteger {

    private int[] digits = new int[40];
    private int length;
    private int startCount;

    public void parse(String numbers) {
        validateInput(numbers);
        int counter = 39;
        for (int i = numbers.length() - 1; i >= 0; i--) {
            digits[counter--] = (int) numbers.charAt(i);
        }
        length = numbers.length();
        startCount = 40 - length - 1;
    }

    public int[] getDigits() {
        return digits;
    }

    @Override
    public String toString() {
        return "HugeInteger {" +
                "digits=" + Arrays.toString(digits) +
                '}';
    }

    public boolean isEqualTo(HugeInteger hugeInteger) {
        boolean equalTo = true;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != hugeInteger.getDigits()[i]) {
                equalTo = false;
                break;
            }
        }
        return equalTo;
    }

    public boolean isNotEqualTo(HugeInteger hugeInteger) {
        boolean notEqualTo = false;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != hugeInteger.getDigits()[i]) {
                notEqualTo = true;
                break;
            }
        }
        return notEqualTo;
    }

    public int getLength() {
        return length;
    }

    public boolean isLessThan(HugeInteger integer) {
        boolean lessThan = integer.getLength() > length;
        if (integer.getLength() == length) {
            for (int i = integer.getStartCount(); i < digits.length; i++) {
                if (integer.getDigits()[i] > digits[i]) {
                    lessThan = true;
                    break;
                }
            }
        }
        return lessThan;
    }

    public boolean isGreaterThan(HugeInteger integer) {
        boolean greaterThan = integer.getLength() < length;
        if (integer.getLength() == length) {
            for (int i = integer.getStartCount(); i < digits.length; i++) {
                if (integer.getDigits()[i] < digits[i]) {
                    greaterThan = true;
                    break;
                }
            }
        }
        return greaterThan;
    }

    private int getStartCount() {
        return startCount;
    }

    public boolean isGreaterThanOrEqualTo(HugeInteger integer) {
        return isGreaterThan(integer) || isEqualTo(integer);
    }

    public boolean isLessThanOrEqualTo(HugeInteger integer) {
        return isLessThan(integer) || isEqualTo(integer);
    }
    private void validateInput(String input) {
        String input2 = input.replaceAll("\\D", "");
        if (input2.length() != input.length()) throw new NumberFormatException("Please enter only digits.");
    }

}

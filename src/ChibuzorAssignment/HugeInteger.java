package ChibuzorAssignment;

import java.util.Arrays;

public class HugeInteger {

    private final int[] digits = new int[40];
    private int length;
    private int startCount;

    public void parse(String numbers) {
        validateInput(numbers);
        int counter = 40;
        for (int i = numbers.length() - 1; i >= 0; i--) {
            digits[--counter] = Character.getNumericValue(numbers.charAt(i));
        }
        length = numbers.length();
        startCount = counter;
    }

    public int[] getDigits() {
        return digits;
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        for (int i = getStartCount(); i < digits.length; i++) {
            build.append(digits[i]);
        }
        return build.toString();
    }

    public int getLength() {
        return length;
    }

    public boolean isZero() {
        boolean isZero = true;
        for (int digit : getDigits()) {
            if (digit != 0) {
                isZero = false;
                break;
            }
        }
        return isZero;
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
        boolean notEqualTo = hugeInteger.getLength() != length;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != hugeInteger.getDigits()[i]) {
                notEqualTo = true;
                break;
            }
        }
        return notEqualTo;
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

    private int getStartCount() {
        return startCount;
    }

}

package ChibuzorAssignment;

public class HugeInteger {

    private final int MAX_LENGTH = 40;
    private final int[] digits = new int[MAX_LENGTH];
    private int length;
    private int startCount;

    public HugeInteger() {}

    public HugeInteger(HugeInteger hugeInteger) {
        this.parse(hugeInteger.toString());
    }

    public void parse(String numbers) {
        validateInput(numbers);
        int counter = 40;
        for (int i = numbers.length() - 1; i >= 0; i--) {
            digits[--counter] = Character.getNumericValue(numbers.charAt(i));
        }
        this.length = numbers.length();
        this.startCount = counter;
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
        boolean lessThan = false;
        if (integer.getLength() == this.length) {
            for (int i = 0; i < this.digits.length; i++) {
                if (this.digits[i] < integer.getDigits()[i]) {
                    lessThan = true;
                    break;
                }
                if (this.digits[i] > integer.getDigits()[i]) {
                    break;
                }
            }
        }
        else lessThan = this.length < integer.getLength();
        return lessThan;
    }

    public boolean isGreaterThan(HugeInteger integer) {
        boolean greaterThan = false;
        if (integer.getLength() == this.length) {
            for (int i = 0; i < this.digits.length; i++) {
                if (integer.getDigits()[i] < this.digits[i]) {
                    greaterThan = true;
                    break;
                }
                if (integer.getDigits()[i] > this.digits[i]) {
                    break;
                }
            }
        }
        else greaterThan = integer.getLength() < this.length;
        return greaterThan;
    }

    public boolean isGreaterThanOrEqualTo(HugeInteger integer) {
        return isGreaterThan(integer) || isEqualTo(integer);
    }

    public boolean isLessThanOrEqualTo(HugeInteger integer) {
        return isLessThan(integer) || isEqualTo(integer);
    }

    public HugeInteger add(HugeInteger integer) {
        HugeInteger hugeInteger = new HugeInteger(this);
        int carryOver = 0;
        HugeInteger a = new HugeInteger(hugeInteger);
        HugeInteger b = new HugeInteger(integer);
        if (hugeInteger.isLessThan(integer)) {
            a = integer;
            b = hugeInteger;
        }

        for (int i = a.getDigits().length - 1; i >= 0; i--) {
            int sum = a.getDigits()[i] + b.getDigits()[i] + carryOver;
            if (sum > 9) {
                a.getDigits()[i] = sum % 10;
                carryOver = sum / 10;
            }
            else {
                a.getDigits()[i] = sum;
                carryOver = 0;
            }
        }

        hugeInteger = a;
        return hugeInteger;
    }

    private void validateInput(String input) {
        String input2 = input.replaceAll("\\D", "");
        if (input2.length() != input.length()) throw new NumberFormatException("Please enter only digits.");
        if (input2.length() > MAX_LENGTH) throw new NumberFormatException(String.format("Limit of %s digits exceeded.", MAX_LENGTH));
    }

    private int getStartCount() {
        return startCount;
    }

}

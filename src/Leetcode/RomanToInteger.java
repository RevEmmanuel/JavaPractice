package Leetcode;

public class RomanToInteger {

    private final String[] values = {"I", "V", "X", "L", "C", "D", "M"};

    public int romanToInt(String s) {
        int numeral = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                numeral += findValueOf(s.charAt(i));
            }
            else {
                if (isLarger(s.charAt(i), s.charAt(i + 1))) {
                    numeral = numeral + findValueOf(s.charAt(i + 1)) - findValueOf(s.charAt(i));
                    i++;
                }
                else numeral += findValueOf(s.charAt(i));
            }
        }
        return numeral;
    }

    private boolean isLarger(char a, char b){
        for (int i = findIndex(a) + 1; i < values.length; i++) {
            if (values[i].equals(Character.toString(b))) return true;
        }
        return false;
    }

    private int findIndex(char finding) {
        for (int i = 0; i < values.length; i++) {
            if (values[i].equals(Character.toString(finding))) return i;
        }
        return -1;
    }

    private int findValueOf(char value) {
        return switch (value) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

}

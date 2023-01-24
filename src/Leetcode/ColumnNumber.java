package Leetcode;

public class ColumnNumber {

    public static int titleToNumber(String columnTitle) {
        int index= 0;
        int lengthOfWord = columnTitle.length() - 1;
        int length = lengthOfWord;
        for (int i = 0; i < lengthOfWord; i++) {
            index += Math.pow(26, length--) * (getIndex(columnTitle.charAt(i)) + 1);
        }
        return index + getIndex(columnTitle.charAt(lengthOfWord)) + 1;
    }

    private static int getIndex(char character) {
        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == character) return i;
        }
        return -1;
    }
}

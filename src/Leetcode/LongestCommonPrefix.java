package Leetcode;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] words = {"flow", "flourish", "flower"};
        System.out.println(longestCommonPrefix(words));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder longestCommonPrefix = new StringBuilder();
        int length = shortestLength(strs);
        StringBuilder prefixCheck = new StringBuilder();
        for (int i = 0; i < length; i++) {
            prefixCheck.append(strs[0].charAt(i));
            int count = 0;
            for (String s : strs) {
                if (s.startsWith(prefixCheck.toString())) ++count;
                else break;
            }
            if (count == strs.length) longestCommonPrefix.append(strs[0].charAt(i));
        }
        return longestCommonPrefix.toString();
    }

    private static int shortestLength(String[] strs) {
        int shortestLength = Integer.MAX_VALUE;
        for (String str : strs) if (str.length() < shortestLength) shortestLength = str.length();
        return shortestLength;
    }
}

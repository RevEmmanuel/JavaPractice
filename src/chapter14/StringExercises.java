package chapter14;

import java.util.ArrayList;

public class StringExercises {

    public static boolean isPalindrome(String word) {
        return word.equals(new StringBuilder(word).reverse().toString());
    }

    public static boolean compareRegion(String word1, int startingIndex, String word2, int startingIndex2, int numberOfCharacters) {
        String wordRegion1 = word1.substring(startingIndex, numberOfCharacters);
        String wordRegion2 = word2.substring(startingIndex2, numberOfCharacters);
        return wordRegion1.equalsIgnoreCase(wordRegion2);
    }

    public static void findingString(String[] strings) {
        ArrayList<String> withCharacters = new ArrayList<>();
        ArrayList<String> withoutCharacters = new ArrayList<>();
        for (String oneString : strings) {
            oneString = oneString.substring(0, 1).toUpperCase() + oneString.substring(1);
            if (oneString.matches("[a-zA-Z0-9]")) withoutCharacters.add(oneString);
            else withCharacters.add(oneString);
        }

        System.out.println(withoutCharacters + " " + withoutCharacters.size() + " in number");
        System.out.println(withCharacters + " " + withCharacters.size() + " in number");
    }

//    public static boolean isValidPassword(String password) {
//        return password.length() >= 8 && password.length() <= 15 && password.matches("[a-zA-Z].")
//    }

}

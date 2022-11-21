package ChibuzorAssignment;

import tdd.ArrayManipulation;

public class ArraySnacks {

    public static int largestOf(int[] array) {
        return ArrayManipulation.maximumOf(array);
    }

    public static int[] reverseOf(int[] array) {
        return ArrayManipulation.reverseAnArray(array);
    }

    public static boolean occursIn(int find, int[] array) {
        boolean found = false;
        for (int i : array) {
            if (i == find) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static int[] oddElements(int[] array) {
        int[] newArray = new int[(array.length / 2)];
        int count = 0;
        for (int i = 1; i < array.length; i += 2) {
            newArray[count++] = array[i];
        }
        return newArray;
    }

    public static int[] evenElements(int[] array) {
        int lengthOfArray;
        if (array.length % 2 ==  0) {
            lengthOfArray = array.length / 2;
        }
        else {
            lengthOfArray = array.length / 2 + 1;
        }
        int[] newArray = new int[lengthOfArray];
        int count = 0;
        for (int i = 0; i < array.length; i += 2) {
            newArray[count++] = array[i];
        }
        return newArray;
    }

    public static int totalOf(int[] array) {
        return ArrayManipulation.sumOf(array);
    }

    public static boolean isPalindrome(String word) {
        String reversedWord = ArrayManipulation.reverseOf(word);
        return reversedWord.equalsIgnoreCase(word);
    }

    public static int forLoopSumOf(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int whileLoopSumOf(int[] numbers) {
        int sum = 0;
        int counter = 0;
        while (counter < numbers.length) {
            sum += numbers[counter];
            counter++;
        }
        return sum;
    }

    public static int doWhileLoopSumOf(int[] numbers) {
        int sum = 0;
        int counter = 0;
        do {
            sum += numbers[counter];
            counter++;
        } while (counter < numbers.length);
        return sum;
    }

    public static String[] concatenateTwoList(String[] words, int[] numbers) {
        String[] concatenatedList = new String[numbers.length + words.length];
// for (int i = 0; i < words.length; i++) {
//     concatenatedList[i] = words[i];
// }
        System.arraycopy(words, 0, concatenatedList, 0, words.length);
        int count = 0;
        for (int i = words.length; i < concatenatedList.length; i++) {
            concatenatedList[i] = String.valueOf(numbers[count++]);
        }
        return concatenatedList;
    }

    public static String[] combineTwoLists(String[] words, int[] numbers) {
        String[] combinedList = new String[words.length + numbers.length];
        int counter = 0;
        for (int i = 0; i < numbers.length || i < words.length; i++) {
            if (words.length > i) {
                combinedList[counter++] = words[i];
            }
            if (numbers.length > i) {
                String addedNumber = String.valueOf(numbers[i]);
                combinedList[counter++] = addedNumber;
            }
        }
        return combinedList;
    }

    public static int[] digitsOf(int number) {
        int[] digitsList = new int[String.valueOf(number).length()];
        for (int i = String.valueOf(number).length() - 1; i >= 0; i--) {
            digitsList[i] = number % 10;
            number /= 10;
        }
        return digitsList;
    }

}

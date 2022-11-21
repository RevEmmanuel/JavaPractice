package tdd;

import java.security.SecureRandom;

public class ArrayManipulation {

    public static int[] reverseAnArray(int[] array) {
        int counter = 0;
        int[] reversedArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[counter++] = array[i];
        }
//        for (int counter = 0; counter < array.length / 2; counter++) {
//            int temp = array[counter];
//            array[counter] = array[array.length - 1- counter];
//            array[array.length - 1 - counter] = temp;
//        }
//        return array;
        return reversedArray;
    }

    public static int[] ascendingOrder(int[] array) {
        for (int sorting = 0; sorting < array.length; sorting++) {
            int currentValue = array[sorting];
            for (int comparing = sorting; comparing < array.length; comparing++) {
                if (currentValue > array[comparing]) {
                    int temp = array[comparing];
                    array[comparing] = currentValue;
                    currentValue = temp;
                }
            }
            array[sorting] = currentValue;
        }
        return array;
    }

    public static int[] descendingOrder(int[] array) {
        return reverseAnArray(ascendingOrder(array));
    }

    public static int minimumOf(int[] array) {
        int minimum = array[0];
        for (int i : array) {
            if (i < minimum) {
                minimum = i;
            }
        }
        return minimum;
    }

    public static int maximumOf(int[] array) {
        int maximum = array[0];
        for (int i : array) {
            if (i > maximum) {
                maximum = i;
            }
        }
        return maximum;
    }

    public static int sumOf(int[] array) {
        int total = 0;
        for (int i : array) {
            total += i;
        }
        return total;
    }

    public static String capitalize(String word) {
        word = word.toUpperCase().charAt(0) + word.toLowerCase().substring(1);
        return word;
    }

    public static String reverseOf(String word) {
        StringBuilder reversedWord = new StringBuilder();
        for (int counter = word.length() - 1; counter >= 0; counter--) {
            reversedWord.append(word.charAt(counter));
        }
        return reversedWord.toString();
    }

    public static int[] shuffle(int[] array) {
        SecureRandom random = new SecureRandom();
        for (int counter = 0; counter < array.length; counter++) {
            int randomIndex = random.nextInt(array.length);
            int temp = array[0];
            array[0] = array[randomIndex];
            array[randomIndex] = temp;
        }
        return array;
    }

    public static int[] fillWith(int[] array) {
        for(int counter = 0; counter < array.length; counter++) {
            array[counter] = counter + 1;
        }
        return array;
    }

    public static String toString(int[] array) {
        StringBuilder printing = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1) {
                printing.append(array[i]);
            }
            else {
                printing.append(array[i]).append(", ");
            }
        }
        return printing.toString();
    }

    public static String[] swap(String[] array) {
        return new String[] { array[1], array[0]};
    }

    public static int sumOfTwoHighest(int[] array) {
        return maximumOf(array) + secondMaximum(array);
    }

    public static int secondMaximum(int[] array) {
        int maximum = array[0];
        int secondMaximum = array[0];
        for (int i : array) {
            if (i > maximum) {
                secondMaximum = maximum;
                maximum = i;
            }
        }
        return secondMaximum;
    }

    public static boolean isANumber(char value) {
        boolean isItANumber = false;
        String numbers = "0123456789";
        for (int i = 0; i < numbers.length(); i++) {
            if(numbers.charAt(i) == value) {
                isItANumber = true;
                break;
            }
        }
        return isItANumber;
    }

    public static int countNumbers(String values) {
        // return values.replaceAll("\\D", "").length();
        int numberOfNumbers = 0;
        for (int i = 0; i < values.length(); i++) {
            if(isANumber(values.charAt(i))) numberOfNumbers++;
        }
        return numberOfNumbers;
    }

}

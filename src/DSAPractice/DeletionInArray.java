package DSAPractice;

import java.util.Arrays;

public class DeletionInArray {

    public static String searchFor(int element, int[] array) {
        // searching for an item
        String found = "";
        int numberOfSearchedItems;
        for(numberOfSearchedItems = 0; numberOfSearchedItems < array.length; numberOfSearchedItems++) {
            if (array[numberOfSearchedItems] == element) {
                found = "Found searchElement at index " + numberOfSearchedItems + "\n";
                break;
            }
        }
        if (numberOfSearchedItems == array.length) {
            found = "searchElement not found.\n";
        }
        return found;
    }

    public static int[] deleteElement(int element, int[] array) {
        // deleting an item
        int numberOfSearchedItems;
        for (numberOfSearchedItems = 0; numberOfSearchedItems < array.length; numberOfSearchedItems++) {
            if(array[numberOfSearchedItems] == element) {
                for(int shifting = numberOfSearchedItems; shifting < array.length - 1; shifting++) {
                    array[shifting] = array[shifting + 1];
                }
                break;
            }
        }
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, array.length - 1);
        return newArray;
    }

    public static void main(String[] args) {
        int[] numbers = new int[50];
        int numberOfFilledElements = 0; // number of indexes filled with non-default content
        for(int counter = 0; counter < 20; counter++) {
            numbers[counter] = counter + 2;
            numberOfFilledElements++;
        }
        System.out.printf("Array --> %s%nLength --> %d%n", Arrays.toString(numbers), numbers.length);
        System.out.printf("%s", searchFor(6, numbers));
        numbers = deleteElement(6, numbers);
        System.out.printf("Array --> %s%nLength --> %d%n", Arrays.toString(numbers), numbers.length);
    }
}

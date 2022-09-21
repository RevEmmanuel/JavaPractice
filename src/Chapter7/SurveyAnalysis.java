package Chapter7;

import java.util.Scanner;

public class SurveyAnalysis {

    public static void main(String[] args) {
        int[] frequency = new int[6];
        int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 3};

        for (int counter = 0; counter < responses.length; counter++) {
            ++frequency[responses[counter]];
        }

        System.out.printf("%9s%8s%n", "Responses", "Count");

        for (int counter = 1; counter < frequency.length; counter++) {
            System.out.printf("%9d%8d%n", counter, frequency[counter]);
        }
    }
}

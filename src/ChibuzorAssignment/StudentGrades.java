package ChibuzorAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter;
        int aCounter = 0;
        int bCounter = 0;
        int cCounter = 0;
        int dCounter = 0;
        String[] grade = new String[5];
        String[] name = new String[5];
        int[] number = new int[5];

        for (counter = 0; counter < number.length; counter++) {

            System.out.println("Enter student name: ");
            name[counter] = input.nextLine();

            System.out.println("Enter the student letter grade: ");
            grade[counter] = input.nextLine();

            switch (grade[counter].toUpperCase()) {
                case "A" -> ++aCounter;
                case "B" -> ++bCounter;
                case "C" -> ++cCounter;
                case "D" -> ++dCounter;
            }
        }

        System.out.printf("%n%12s%10s%n", "Student Name", "Grade");

        for (counter = 0; counter < number.length; counter++) {
            System.out.printf("%12s%10s%n", name[counter].toUpperCase(), grade[counter].toUpperCase());
        }

        System.out.printf("%n%5s%20s%n", "Grade", "No Of Students");
        System.out.printf("%5s%20s%n", "A", aCounter);
        System.out.printf("%5s%20s%n", "B", bCounter);
        System.out.printf("%5s%20s%n", "C", cCounter);
        System.out.printf("%5s%20s%n", "D", dCounter);
    }
}

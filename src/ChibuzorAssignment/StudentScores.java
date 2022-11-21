package ChibuzorAssignment;

import tdd.ArrayManipulation;
import java.util.Scanner;

public class StudentScores {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int studentNumber = input.nextInt();
        System.out.println("How many subjects do they offer? ");
        int subjectNumber = input.nextInt();
        System.out.println("Saving >>>>>>>>>>>>>>>>>\nSaved successfully");

        int[][] studentsAndSubjects = new int[studentNumber][subjectNumber];
        int[] eachStudentTotal;
        int[] eachStudentPosition = new int[studentNumber];
        int[][] highestSubject = new int[studentNumber][subjectNumber];
        int[] passes = new int[studentNumber];
        int[] failures = new int[studentNumber];
        int[][] subjectBestAndWorst = new int[subjectNumber][2];
        for (int student = 0; student < studentsAndSubjects.length; student++) {
            System.out.printf("%nEntering score for student %d%n", student + 1);
            for (int subjects = 0; subjects < studentsAndSubjects[student].length;) {
                System.out.printf("Enter score for subject %d%n", subjects + 1);
                int score = input.nextInt();
                if (score >= 0 && score <= 100) {
                    System.out.println("Saving >>>>>>>>>>>>>>>>>");
                    studentsAndSubjects[student][subjects] = score;
                    System.out.println("Saved successfully");
                    subjects++;
                }
            }
        }

        eachStudentTotal = totalOfEachArrayInAMultiDimensionalArray(studentsAndSubjects);

        int position1 = ArrayManipulation.maximumOf(eachStudentTotal);
        int position2 = ArrayManipulation.secondMaximum(eachStudentTotal);
        int position3 = ArrayManipulation.minimumOf(eachStudentTotal);
        int bestGraduatingStudent = 0;
        int worstGraduatingStudent = 0;

        for(int i = 0; i < eachStudentTotal.length; i++) {
            if (position1 == eachStudentTotal[i]) {
                eachStudentPosition[i] = 1;
                bestGraduatingStudent = i;
            }
            if (position2 == eachStudentTotal[i]) {
                eachStudentPosition[i] = 2;
            }
            if (position3 == eachStudentTotal[i]) {
                eachStudentPosition[i] = 3;
                worstGraduatingStudent = i;
            }
        }

        int a = 0;
        for (int i = 0; i < subjectNumber; i++) {
            for (int j = 0; j < studentNumber; j++) {
                if (studentsAndSubjects[j][a] >= 50){
                    passes[a]++;
                }
                else {
                    failures[a]++;
                }
                highestSubject[a][j] = studentsAndSubjects[j][a];
            }
            a++;
        }

        for (int i = 0; i < highestSubject.length; i++) {
            int bestie = ArrayManipulation.maximumOf(highestSubject[i]);
            int fail = ArrayManipulation.minimumOf(highestSubject[i]);
            for (int j = 0; j < highestSubject[i].length; j++) {
                if (bestie == highestSubject[i][j]) {
                    subjectBestAndWorst[i][0] = j + 1;
                }
                if (fail == highestSubject[i][j]) {
                    subjectBestAndWorst[i][1] = j + 1;
                }
            }
        }

        System.out.printf(
                """
                
                *=========================================================================*
                |%-14s%-5s%8s%10s%8s%6s%7s               |
                *=========================================================================*
                """, "STUDENT", "SUB1", "SUB2", "SUB3", "TOT", "AVE", "POS"
        );

        for(int row =0; row < studentsAndSubjects.length; row++) {
            int total = 0;
            System.out.printf("%-15s", "Student " + (row + 1));
            for(int column =0; column < studentsAndSubjects[row].length; column++) {
                total += studentsAndSubjects[row][column];
                System.out.printf("%-9d", studentsAndSubjects[row][column]);
            }
            System.out.printf("%-5d%.2f%5d         %n", total, (double) total / 3, eachStudentPosition[row]);
        }
        System.out.println(
                """
                *=========================================================================*
                *=========================================================================*
                """
        );

        System.out.println("*=========================================================================*");
        System.out.printf("|%-73s|%n", "SUBJECT SUMMARY");
        for(int i = 0; i < subjectNumber; i++) {
            System.out.println("*=========================================================================*");
            System.out.printf("|Subject %-65d|%n", i + 1);
            System.out.println("*=========================================================================*");
            System.out.printf("Highest scoring student is Student %d scoring %d%n", subjectBestAndWorst[i][0], ArrayManipulation.maximumOf(highestSubject[i]));
            System.out.printf("Lowest scoring student is Student %d scoring %d%n", subjectBestAndWorst[i][1], ArrayManipulation.minimumOf(highestSubject[i]));
            System.out.printf("Total score is %d%n", ArrayManipulation.sumOf(highestSubject[i]));
            System.out.printf("Average score  is %.2f%n", (double) ArrayManipulation.sumOf(highestSubject[i]) / 3);
            System.out.printf("Number of passes is %d%n", passes[i]);
            System.out.printf("Number of failures is %d%n", failures[i]);
            System.out.println("*=========================================================================*");
        }

        System.out.println("\nCLASS SUMMARY");
        System.out.println("*=========================================================================*");
        System.out.printf("Best Graduating Student is: Student %d scoring %d%n", bestGraduatingStudent + 1, eachStudentTotal[bestGraduatingStudent]);
        System.out.println("*=========================================================================*\n");
        System.out.println("!".repeat(65));
        System.out.printf("Worst Graduating Student is: Student %d scoring %d%n", worstGraduatingStudent + 1, eachStudentTotal[worstGraduatingStudent]);
        System.out.println("!".repeat(65));
        System.out.println();
        System.out.println("*=========================================================================*");
        System.out.printf("Class total score is %d%n", ArrayManipulation.sumOf(eachStudentTotal));
        System.out.printf("Class average score is %.2f%n", (double) ArrayManipulation.sumOf(eachStudentTotal) / 3);
        System.out.println("*=========================================================================*");
    }

    public static int[] totalOfEachArrayInAMultiDimensionalArray(int[][] array) {
        int[] totalArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            int total = 0;
            for (int j = 0; j < array[i].length; j++){
                total += array[i][j];
            }
            totalArray[i] = total;
        }
        return totalArray;
    }
}

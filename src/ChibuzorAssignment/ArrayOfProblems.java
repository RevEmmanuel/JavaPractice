package ChibuzorAssignment;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ArrayOfProblems {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> problems = new ArrayList<>();
        for(String wahala = ""; !Objects.equals(wahala, "Finish");) {
            System.out.println("Enter your problem or enter \"Finish\" to stop: ");
            wahala = input.nextLine();
            if (!Objects.equals(wahala, "Finish")) {
                problems.add(wahala);
            }
        }
        printProblems(problems);
    }

    public static void printProblems(ArrayList<String> problems) {
        for(int i = 0; i < problems.toArray().length; i++) {
            System.out.printf("Problem %d : \"%s\"%n", i + 1, problems.get(i));
        }
        System.out.println("Chai! See as problem plenty ehn.\nGod abeg ooh");
        System.out.println("Werey, better go do ritual.");
    }
}

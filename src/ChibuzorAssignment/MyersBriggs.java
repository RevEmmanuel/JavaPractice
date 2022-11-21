package ChibuzorAssignment;

import java.util.Scanner;

public class MyersBriggs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] personalities = {"ISTJ", "ISFJ", "INFJ", "INTJ", "ISTP", "ISFP", "INFP", "INTP", "ESTP", "ESFP", "ENFP", "ENTP", "ESTJ", "ESFJ", "ENFJ", "ENTJ"};
        String[] personalityDescriptions = {
                """
                Prefers own company (I)
                Fact/detail-oriented (S)
                Decisions based on logic/reason (T)
                Structured/Prepared (J)""",
                """
                Prefers own company (I)
                Fact/detail-oriented (S)
                Decisions based on emotions/feelings (F)
                Structured/Prepared (J)""",
                "No info for this personality.",
                """
                Prefers own company (I)
                Pattern/possibility oriented (N)
                Decisions based on facts/data (T)
                Structured/Prepared (J)""",
                """
                Prefers own company (I)
                Fact/detail-oriented (S)
                Decisions based on facts/data (T)
                Flexible/Adaptable (P)""",
                """
                Prefers own company (I)
                Fact/detail-oriented (S)
                Decisions based on emotions/feelings (F)
                Flexible/adaptable (P)""",
                """
                Prefers own company (I)
                Pattern/possibility oriented (N)
                Decisions based on emotions/feelings (F)
                Flexible/adaptable (P)""",
                """
                Prefers own company (I)
                Pattern/possibility oriented (N)
                Decisions based on logic/reason (T)
                Flexible/adaptable (P)""",
                """
                Prefer the company of others (E)
                Fact/detail-oriented (S)
                Decisions based on logic/reason (T)
                Flexible/adaptable (P)""",
                """
                Prefer the company of others (E)
                Fact/detail-oriented (S)
                Decisions based on feelings/emotions (F)
                Flexible/adaptable (P)""",
                """
                Prefer the company of others (E)
                Pattern/possibility oriented (N)
                Decisions based on feelings/emotions (F)
                Flexible/adaptable (P)""",
                """
                Prefer the company of others (E)
                Pattern/possibility oriented (N)
                Decisions based on facts/details (T)
                Flexible/adaptable (P)""",
                """
                Prefer the company of others (E)
                Fact/detail-oriented (S)
                Decisions based on logic/reason (T)
                Structured/prepared (J)""",
                """
                Prefer the company of others (E)
                Fact/detail-oriented (S)
                Decisions based on feelings/emotions (F)
                Structured/prepared (J)""",
                """
                Prefer the company of others (E)
                Pattern/possibility oriented (N)
                Decisions based on feelings/emotions (F)
                Structured/prepared (J)""",
                """
                Prefer the company of others (E)
                Pattern/possibility oriented (N)
                Decisions based on logic/reason (T)
                Structured/prepared (J)"""
        };
        String[] aQuestions = {
                "A. expend energy, enjoy groups\t\t\t",
                "A. interpret literally\t\t\t",
                "A. logical, thinking, questioning\t\t\t",
                "A. organized, orderly\t\t\t",
                "A. more outgoing, think out loud or \t\t\t",
                "A. practical, realistic, experiential\t\t\t",
                "A. candid, straight forward, frank\t\t\t",
                "A. plan, schedule\t\t\t",
                "A. seek many tasks, public activities, interaction with others\t\t\t",
                "A. standard, usual, conventional\t\t\t",
                "A. firm, tend to criticize, hold the line\t\t\t",
                "A. regulated, structured\t\t\t",
                "A. external, communicative, express yourself\t\t\t",
                "A. focus on here-and-now\t\t\t",
                "A. tough-minded, just\t\t\t",
                "A. preparation, plan ahead\t\t\t",
                "A. active, initiate\t\t\t",
                "A. facts, things, \"what is\"\t\t\t",
                "A. matter of fact, issue-oriented\t\t\t",
                "A. control, govern\t\t\t"
        };
        String[] bQuestions = {
                "B. conserve energy, enjoy one-on-one",
                "B. look for meaning and possibilities",
                "B. empathetic, feeling, accommodating",
                "B. flexible, adaptable",
                "B. more reserved, think to yourself",
                "B. imaginative, innovative, theoretical",
                "B. tactful, kind, encouraging",
                "B. unplanned, spontaneous",
                "B. seek private, solitary activities with quiet to concentrate",
                "B. different, novel, unique",
                "B. gentle, tend to appreciate, conciliate",
                "B. easygoing, \"live\" and \"let live\"",
                "B. internal, reticent, keep to yourself",
                "B. look to the future, global perspective, \"big picture\"",
                "B. tender-hearted, merciful",
                "B. go with the flow, adapt as you go",
                "B. reflective, deliberate",
                "B. ideas, dreams, \"what could be,\" philosophical",
                "B. sensitive, people-oriented, compassionate",
                "B. latitude, freedom"
        };
        String[] answers = new String[aQuestions.length];

        System.out.println("Enter your name to proceed: ");
        String name = input.nextLine();
        System.out.println("Welcome " + name + "!\n");

        System.out.println("Please enter \"A\" or \"B\"");
        for(int counter = 0; counter < aQuestions.length;) {
            System.out.println((counter + 1) + ". " + aQuestions[counter] + bQuestions[counter] + "?");
            String enter = input.nextLine();
            if (enter.equals("A") || enter.equals("B")) {
                answers[counter] = enter;
                counter++;
            }
            else {
                System.out.println("Please enter \"A\" or \"B\"");
            }
        }

        int[] answerCounterArray = new int[answers.length];
        for (int counter = 0; counter < answers.length; counter++) {
            if (answers[counter].equalsIgnoreCase("A")) {
                answerCounterArray[counter]++;
            }
        }

        System.out.println("\nHello " + name + "\nYou selected the options below: ");
        int countA = 0;
        int countB = 0;
        for(int counter = 1; counter <= answers.length; counter++) {
            String result = "";
            if(answers[counter - 1].equalsIgnoreCase("A")) {
                result = aQuestions[counter - 1];
                countA++;
            }
            else if(answers[counter - 1].equalsIgnoreCase("B")) {
                result = bQuestions[counter - 1];
                countB++;
            }
            System.out.println(result);
            if (counter % 5 == 0) {
                System.out.printf("Number of A: %d%nNumber of B: %d%n", countA, countB);
                countA = 0;
                countB = 0;
            }

        }
        int[] aAbsorbCounter = new int[4];
        int[] bAbsorbCounter = new int[4];


        for (int i = 0; i <= 17; i += 4) {
            if(answerCounterArray[i] != 0) {
                aAbsorbCounter[0]++;
            }
            else {
                if (answerCounterArray[i] == 0) {
                    bAbsorbCounter[0]++;
                }
            }
        }
        for (int i = 1; i <= 18; i += 4) {
            if(answerCounterArray[i] != 0) {
                aAbsorbCounter[1]++;
            }
            else if(answerCounterArray[i] == 0) {
                bAbsorbCounter[1]++;
            }
        }
        for (int i = 2; i <= 19; i += 4) {
            if(answerCounterArray[i] != 0) {
                aAbsorbCounter[2]++;
            }
            else if(answerCounterArray[i] == 0) {
                bAbsorbCounter[2]++;
            }
        }
        for (int i = 3; i < answers.length; i += 4) {
            if(answerCounterArray[i] != 0) {
                aAbsorbCounter[3]++;
            }
            else if(answerCounterArray[i] == 0) {
                bAbsorbCounter[3]++;
            }
        }

        StringBuilder personality = new StringBuilder();
        String[] aLetters = {"E", "S", "T", "J"};
        String[] bLetters = {"I", "N", "F", "P"};

        for (int i = 0; i < aAbsorbCounter.length; i++) {
            if (aAbsorbCounter[i] > bAbsorbCounter[i]) {
                personality.append(aLetters[i]);
            }
            else if (aAbsorbCounter[i] < bAbsorbCounter[i]) {
                personality.append(bLetters[i]);
            }
        }

        int index = 0;
        for (int counter = 0; counter < personalities.length; counter++) {
            if (personality.toString().equals(personalities[counter])) {
                System.out.println("Personality found!");
                index = counter;
                break;
            }
        }
        System.out.printf("Your personality is %s%n", personality);
        System.out.printf("%s%n", personalityDescriptions[index]);
        System.out.println("\nThanks for taking the test!");
    }
}

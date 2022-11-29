package diary;

import javax.swing.*;
import java.util.Scanner;

public class Maine {
    private static Diary diary;

    public static void main(String[] args) {
        begin();
        displayDiaryMenu();
    }

    private static void begin() {
        String mainMain = """
                Welcome to MyDiary!!!
                Let's set it up.
                """;

        print(mainMain);
        String userName = input("Enter your username");
        String password = input("Enter your password");
        diary = new Diary(userName, password);
        print("Diary created for " + userName);
    }

    private static void displayDiaryMenu() {
        String mainMain = """
                Press:
                1 --> Unlock diary
                2 --> Lock diary
                3 --> Exit diary
                
                """;
        String userInput = input(mainMain + "Pick an option");
        try {
            switch (Integer.parseInt(userInput)) {
                case 1 -> unlockDiary();
                case 2 -> lockDiary();
                case 3 -> exitApplication();
                default -> {
                    print("Error: " + userInput + "\n" + "Please enter a valid number");
                    displayDiaryMenu();
                }
            }
        }
        catch (NumberFormatException e) {
            print("Error: " + userInput + "\n" + "Please enter a valid number");
            displayDiaryMenu();
        }
    }

    private static void exitApplication() {
        print("Thanks for using our application");
        System.exit(0);
    }

    private static void lockDiary() {
        diary.lock();
        print("Diary has been locked");
        displayDiaryMenu();
    }

    private static void unlockDiary() {
        diary.unlockWith(input("Enter your password"));
        if (diary.isLocked()) {
            print("Incorrect password.");
            displayDiaryMenu();
        }
        else displayUnlockedMenuOptions();
    }

    private static void
    displayUnlockedMenuOptions() {
        String diaryMenu = """
                Press 1 --> Create Entry
                Press 2 --> Find Entry By ID
                Press 3 --> Get total number of entries
                Press 4 --> Lock diary
                
                """;

        String userInput = input(diaryMenu);
        try {
            switch (Integer.parseInt(userInput)) {
                case 1 -> createDiaryEntry();
                case 2 -> findById();
                case 3 -> getTotalNumberOfEntries();
                case 4 -> lockDiary();
                default -> {
                    print("Error: " + userInput + "\n" + "Please enter a valid number");
                    displayUnlockedMenuOptions();
                }
            }
        }
        catch (NumberFormatException n) {
            print("Error: " + userInput + "\n" + "Please enter a valid number");
            displayUnlockedMenuOptions();
        }
    }

    private static void getTotalNumberOfEntries() {
        int totalNumberOfEntries = diary.getNumberOfEntries();
        print("Total number of entries: " + totalNumberOfEntries);
        displayUnlockedMenuOptions();
    }

    private static void findById() {
        String id = input("Enter the id to find");
        try {
            Entry foundEntry = diary.findEntryWithId(Integer.parseInt(id));
            print(foundEntry.toString());
            displayUnlockedMenuOptions();
        }
        catch (NumberFormatException n) {
            print("Error: " + id + "\n" + "Please enter a valid number");
            displayUnlockedMenuOptions();
        }
        catch (NullPointerException nullPointerException) {
            print("Error: ID " + id + "not found!");
            displayUnlockedMenuOptions();
        }
    }

    private static void createDiaryEntry() {
        String title = input("Enter the title of the entry");
        String content = input("Enter the content of the entry");
        diary.write(title, content);
        print("Written successfully!");
        displayUnlockedMenuOptions();
    }

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(null, prompt);
        /*
        Scanner scanner = new Scanner(System.in);
        print(prompt);
        return scanner.nextLine(); */
    }

    private static void print(String input) {
        JOptionPane.showMessageDialog(null, input);
//        System.out.println(input);
    }
}

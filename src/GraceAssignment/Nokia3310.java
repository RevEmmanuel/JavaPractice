package GraceAssignment;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Nokia3310 {

    private static final Scanner input = new Scanner(System.in);
    private static String name;



    public static void setName(String name) {
        Nokia3310.name = name;
    }

    public static String getName() {
        return name;
    }

    public static void mainMenu() {
        System.out.println("+------------------------------+");
        System.out.println("|        GOD ABEG  3310        |");
        System.out.printf("|        Welcome %s!       |%n", getName());
        System.out.println("|                              |");
        System.out.println("+------------------------------+");

        System.out.println("1. Phone book");
        System.out.println("2. Messages");
        System.out.println("3. Chat");
        System.out.println("4. Call register");
        System.out.println("5. Tones");
        System.out.println("6. Settings");
        System.out.println("7. Call divert");
        System.out.println("8. Games");
        System.out.println("9. Calculator");
        System.out.println("10. Reminders");
        System.out.println("11. Clock");
        System.out.println("12. Profiles");
        System.out.println("13. Sim services");
        System.out.println("Enter 0 to end process.");

        System.out.printf("%nPick an option: ");
        int choice = input.nextInt();
        if (choice >= 0 && choice <= 13) {
            switch (choice) {
                case 0 -> exit();
                case 1 -> menu1();
                case 2 -> menu2();
                case 3 -> menu3();
                case 4 -> menu4();
                case 5 -> menu5();
                case 6 -> menu6();
                case 7 -> menu7();
                case 8 -> menu8();
                case 9 -> menu9();
                case 10 -> menu10();
                case 11 -> menu11();
                case 12 -> menu12();
                case 13 -> menu13();
            }
        } else {
            System.out.println("Enter a valid number!");
            mainMenu();
        }
    }

    public static void exit() {
        System.out.printf("Thanks for trying out our phone. %nWe hope to see you again soon!");
        System.out.println();
    }

    public static void menu1() {
        System.out.println("Welcome to Phone book");
        System.out.println("1. Search\n2. Services Nos.\n3. Add name\n4. Erase\n5. Edit\n6. Assign tone\n7. Send card\n8. Options\n9. Speed dials\n10. Voice tags\nEnter 99 to return to main menu.");
        System.out.println("Pick an option: ");
        int option = input.nextInt();
        if ((option >= 1 && option <= 10) || (option == 99)) {
            switch (option) {
                case 99 -> mainMenu();
                case 1 -> {
                    System.out.println("Welcome to the search screen!");
                    System.out.println("Nothing to search for.\nReturning to previous page.");
                    System.out.println();
                    menu1();
                }
                case 2 -> {
                    System.out.println("Welcome to the Service Nos screen!");
                    System.out.println("Nothing here.\nReturning to previous page.");
                    System.out.println();
                    menu1();
                }
                case 3 -> {
                    System.out.println("Welcome to the Add name screen!");
                    System.out.println("No directory for name storing.\nReturning to previous page.");
                    System.out.println();
                    menu1();
                }
                case 4 -> {
                    System.out.println("Welcome to the erase screen!");
                    System.out.println("Nothing to erase.\nReturning to previous page.");
                    System.out.println();
                    menu1();
                }
                case 5 -> {
                    System.out.println("Welcome to the edit screen!");
                    System.out.println("Nothing to edit.\nReturning to previous page.");
                    System.out.println();
                    menu1();
                }
                case 6 -> {
                    System.out.println("Welcome to the Assign tone screen!");
                    System.out.println("No downloaded tones.\nReturning to previous page.");
                    System.out.println();
                    menu1();
                }
                case 7 -> {
                    System.out.println("Welcome to the Send card screen!");
                    System.out.println("No cards to send.\nReturning to previous page.");
                    System.out.println();
                    menu1();
                }
                case 8 -> subMenu1_8();
                case 9 -> {
                    System.out.println("Welcome to the Speed dials screen!");
                    System.out.println("Your speed dials are: \n1. Bill +2348102345678\n2. Liz +23456789012");
                    System.out.println("Returning to previous page.");
                    System.out.println();
                    menu1();
                }
                case 10 -> {
                    System.out.println("Welcome to the Voice tags screen!");
                    System.out.println("No new voice tags.\nReturning to previous page.");
                    System.out.println();
                    menu1();
                }
            }
        } else {
            System.out.println("Please enter a valid number.");
            menu1();
        }
    }

    // menu for option 8 under Phone book(Option 1)
    public static void subMenu1_8() {
        System.out.println("Welcome to the Options screen.");
        System.out.println("1. Type of view.\n2. Memory status");
        System.out.println("Pick an option or Enter 99 to return to previous menu: ");
        int option = input.nextInt();
        if (((option == 1) || (option == 2)) || (option == 99)) {
            switch (option) {
                case 99 -> menu1();
                case 1 -> {
                    System.out.println("No type of view available.\nReturning to previous page.");
                    System.out.println();
                    subMenu1_8();
                }
                case 2 -> {
                    System.out.println("Memory size is 2GB\nYou have used a total of 235.46MB");
                    System.out.println("Returning to previous page.");
                    System.out.println();
                    subMenu1_8();
                }
            }
        } else {
            System.out.println("Please enter a valid number.");
            subMenu1_8();
        }

    }

    public static void menu2() {
        System.out.println("Welcome to Messages");
        System.out.println("1. Write messages\n2. Inbox\n3. Outbox\n4. Picture messages\n5. Templates\n6. Smileys\n7. Message settings\nEnter 99 to return to main menu.");
        System.out.println("Pick an option: ");
        int option = input.nextInt();
        if ((option >= 1 && option <= 7) || (option == 99)) {
            switch (option) {
                case 99 -> mainMenu();
                case 1 -> {
                    System.out.println("Type your message: ");
                    String message = input.nextLine();
                    System.out.printf("Message: %s%n", message);
                    System.out.println("Type receiver phone number: ");
                    String phone = input.nextLine();
                    System.out.printf("Message sent successfully to %s%n!", phone);
                    System.out.println();
                    menu2();
                }
                case 2 -> {
                    System.out.println("You have received 0 messages.");
                    System.out.println("Returning to previous menu");
                    System.out.println();
                    menu2();
                }
                case 3 -> {
                    System.out.println("1 message sent recently.");
                    System.out.println("Returning to previous screen.");
                    System.out.println();
                    menu2();
                }
                case 4 -> {
                    System.out.println("No pictures to send.");
                    System.out.println("Returning to previous page.");
                    System.out.println();
                    menu2();
                }
                case 5 -> {
                    System.out.println("Empty templates.");
                    System.out.println("Returning to previous menu");
                    System.out.println();
                    menu2();
                }
                case 6 -> {
                    System.out.println("No smileys available.");
                    System.out.println("Returning to previous menu");
                    System.out.println();
                    menu2();
                }
                case 7 -> subMenu2_7();
            }
        } else {
            System.out.println("Please enter a valid number.");
            menu2();
        }

    }

    // menu for option 7 under option 2 in main menu
    public static void subMenu2_7() {

    }

    public static void menu3() {
        System.out.println("Welcome to the chat menu.\nYou have no pending conversations.\nReturning to main menu");
        mainMenu();
    }

    public static void menu4() {
        System.out.println("Welcome to Call Register");
        System.out.println("1. Missed calls\n2. Received calls\n3. Dialled numbers\n4. Erase recent call lists\n5. Show call duration\n6. Show call cost\n7. Call cost settings\n8. Prepaid cost\nEnter 99 to return to main menu.");
        System.out.println("Pick an option: ");
        int option = input.nextInt();
        if ((option >= 1 && option <= 8) || (option == 99)) {
            switch (option) {
                case 99 -> mainMenu();
                case 1 -> {
                    System.out.println("No missed calls!");
                    System.out.println("Returning to previous menu");
                    System.out.println();
                    menu4();
                }
                case 2 -> {
                    System.out.println("You have received 2 calls.");
                    System.out.println("1. Bill. +2348123456789\n2. Liz +23456789012");
                    System.out.println("Returning to previous menu");
                    System.out.println();
                    menu4();
                }
                case 3 -> {
                    System.out.println("No numbers dialled recently.");
                    System.out.println("Returning to previous menu");
                    System.out.println();
                    menu4();
                }
                case 4 -> {
                    System.out.println("Welcome to the erase screen!");
                    System.out.println("Nothing to erase.\nReturning to previous page.");
                    System.out.println();
                    menu4();
                }
                case 5 -> subMenu4_5();
                case 6 -> subMenu4_6();
                case 7 -> subMenu4_7();
                case 8 -> {
                    System.out.println("No  info available.");
                    System.out.println("Returning to previous menu");
                    System.out.println();
                    menu4();
                }
            }
        } else {
            System.out.println("Please enter a valid number.");
            menu4();
        }

    }

    // sub menu for option 5 under option 4 in the main menu
    public static void subMenu4_5() {
        System.out.println("Welcome to the Show call duration screen.");
        System.out.println("1. Last call duration\n2. All calls' duration\n3. Received calls duration\n4. Dialled calls duration\5. Clear timers");
        System.out.println("Pick an option or Enter 99 to return to previous menu: ");
        int option = input.nextInt();
        if (((option >= 1) && (option <= 5)) || (option == 99)) {
            switch (option) {
                case 99 -> menu4();
                default -> {
                    System.out.println("All call duration info currently unavailable.");
                    System.out.println("Returning to previous page.");
                    System.out.println();
                    subMenu4_5();
                }
                case 1 -> {
                    System.out.println("Last call was 12 minutes");
                    System.out.println("Returning to previous page.");
                    System.out.println();
                    subMenu4_5();
                }
                case 5 -> {
                    System.out.println("Timers cleared successfully!");
                    System.out.println("Returning to previous menu");
                    System.out.println();
                    subMenu4_5();
                }
            }
        } else {
            System.out.println("Enter a valid number.");
            subMenu4_5();
        }
    }

    // sub menu for option 6 under option 4 in the main menu
    public static void subMenu4_6() {
        System.out.println("Welcome to the Show call cost screen.");
        System.out.println("1. Last call cost\n2. All calls' cost\n3. Clear counters");
        System.out.println("Pick an option or Enter 99 to return to previous menu: ");
        int option = input.nextInt();
        if (((option >= 1) && (option <= 3)) || (option == 99)) {
            switch (option) {
                case 99 -> menu4();
                case 2 -> {
                    System.out.println("Call cost info currently unavailable.");
                    System.out.println("Returning to previous page.");
                    System.out.println();
                    subMenu4_6();
                }
                case 1 -> {
                    System.out.println("Last call cost $0.99");
                    System.out.println("Returning to previous page.");
                    System.out.println();
                    subMenu4_6();
                }
                case 3 -> {
                    System.out.println("Counters cleared successfully!");
                    System.out.println("Returning to previous menu");
                    System.out.println();
                    subMenu4_6();
                }
            }
        } else {
            System.out.println("Enter a valid number.");
            subMenu4_6();
        }
    }

    // sub menu for option 7 under option 4 in the main menu
    public static void subMenu4_7() {
        System.out.println("Welcome to the Call cost settings screen.");
        System.out.println("1. Call cost limit\n2. Show call info");
        System.out.println("Pick an option or Enter 99 to return to previous menu: ");
        int option = input.nextInt();
        if (((option >= 1) && (option <= 2)) || (option == 99)) {
            switch (option) {
                case 99 -> menu4();
                case 2 -> {
                    System.out.println("No info available.");
                    System.out.println("Returning to previous page.");
                    System.out.println();
                    subMenu4_7();
                }
                default -> {
                    System.out.println("Call cost limit is 128 hours!");
                    System.out.println("Returning to previous menu");
                    System.out.println();
                    subMenu4_7();
                }
            }
        } else {
            System.out.println("Enter a valid number.");
            subMenu4_7();
        }
    }

    public static void menu5() {
        System.out.println("Welcome to Tones");
        System.out.println("1. Ringing Tone\n2. Ringing volume.\n3. Incoming call alert\n4. Composer\n5. Message alert tone\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver\nEnter 99 to return to main menu.");
        System.out.println("Pick an option: ");
        int option = input.nextInt();
        if ((option >= 1 && option <= 9) || (option == 99)) {
            switch (option) {
                case 99 -> mainMenu();
                case 1 -> {
                    System.out.println("Welcome to the Ringing tones screen!");
                    System.out.println("Default ringing tone is Opening.\nReturning to previous page.");
                    System.out.println();
                    menu1();
                }
                case 2 -> {
                    System.out.println("Welcome to the Ringing volume screen!");
                    System.out.println("Please long press 1 to increase volume or long press 2 to decrease volume\nReturning to previous page.");
                    System.out.println();
                    menu1();
                }
                case 3 -> {
                    System.out.println("Welcome to the Incoming call alert screen!");
                    System.out.println("Incoming call alert is -Vibration.\nReturning to previous page.");
                    System.out.println();
                    menu1();
                }
                case 4 -> {
                    System.out.println("Welcome to the Composer screen!");
                    System.out.println("Currently unavailable.\nReturning to previous page.");
                    System.out.println();
                    menu1();
                }
                case 5 -> {
                    System.out.println("Welcome to the Message alert tone screen!");
                    System.out.println("Alert tone is set to default.\nReturning to previous page.");
                    System.out.println();
                    menu1();
                }
                case 6 -> {
                    System.out.println("Welcome to the Keypad tone screen!");
                    System.out.println("Default tone is \"beep\"\nReturning to previous page.");
                    System.out.println();
                    menu1();
                }
                case 7 -> {
                    System.out.println("Welcome to the Vibrating and game screen!");
                    System.out.println("Preset tone is default.\nReturning to previous page.");
                    System.out.println();
                    menu1();
                }
                case 8 -> {
                    System.out.println("Welcome to the Vibrating alert screen!");
                    System.out.println("Your device vibrates for every notification.\nReturning to previous page.");
                    System.out.println();
                    menu1();
                }
                case 9 -> {
                    System.out.println("Welcome to the Screen saver screen!");
                    System.out.println("Your settings are\n1. Dim screen when battery level below 50\n2. Screen goes off after 5 minutes inactivity");
                    System.out.println("Returning to previous page.");
                    System.out.println();
                    menu1();
                }
            }
        }
        else {
            System.out.println("Enter a valid number.");
            menu5();
        }
    }

    public static void menu6() {
        System.out.println("Welcome to Settings.");
        System.out.println("1. Call settings\n2. Phone settings\n3. Security settings\n4. Restore factory settings");
        System.out.println("Pick an option or Enter 99 to return to previous menu: ");
        int option = input.nextInt();
        if(((option >= 1) && (option <= 4)) || (option == 99)) {
            switch (option) {
                case 4 -> {
                    System.out.println("Enter password to restore factory settings: ");
                    int decide = input.nextInt();
                    if (decide == 1234) {
                        System.out.println("Factory settings restored!");
                        System.out.println("Returning to previous menu");
                        System.out.println();
                        menu6();
                    } else {
                        System.out.println("Wrong password.");
                    }
                }
                case 1 -> subMenu6_1();
                case 2 -> subMenu6_2();
                case 3 -> subMenu6_3();
                default -> mainMenu();
            }
        }
        else {
            System.out.println("Please enter a valid number\nReturning to previous page.");
            menu6();
        }

    }

    //sub menu for option 1 under option 6 in the main menu
    public static void subMenu6_1() {
        System.out.println("Welcome to the Call settings screen.");
        System.out.println("1. Type of view.\n2. Memory status\n3. Call waiting options\n4.Own number sending\n5.Phone line in use\6. Automatic answer.");
        System.out.println("Pick an option or Enter 99 to return to previous menu: ");
        int option = input.nextInt();
        if (((option >= 1) && (option <= 6)) || (option == 99)) {
            switch (option) {
                case 99 -> menu6();
                case 2 -> {
                    System.out.println("Welcome to the Speed dials screen!");
                    System.out.println("Your speed dials are: \n1. Bill +2348102345678\n2. Liz +23456789012");
                    System.out.println("Returning to previous page.");
                    System.out.println();
                    menu6();
                }
                default -> {
                    System.out.println("Call settings unavailable!");
                    System.out.println("Returning to previous menu");
                    System.out.println();
                    menu6();
                }
            }
        }
        else {
            System.out.println("Enter a valid number.");
            subMenu6_1();
        }
    }

    // sub menu for option 2 under option 6 in the main menu
    public static void subMenu6_2() {
        System.out.println("Welcome to the Phone settings screen.");
        System.out.println("1. Lanuage\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\6. Confirm sim service actions");
        System.out.println("Pick an option or Enter 99 to return to previous menu: ");
        int option = input.nextInt();
        if (((option >= 1) && (option <= 6)) || (option == 99)) {
            switch (option) {
                case 99 -> menu6();
                case 2 -> {
                    System.out.println("Your phone is a nokia 3310 with the features of iPhone 14 pro.");
                    System.out.println("Returning to previous page.");
                    System.out.println();
                    menu6();
                }
                default -> {
                    System.out.println("Phone settings unavailable!\nSettings set to default");
                    System.out.println("Returning to previous menu");
                    System.out.println();
                    menu6();
                }
            }
        }
        else {
            System.out.println("Enter a valid number.");
            subMenu6_2();
        }
    }

    // sub menu for option 3 under option 6 in the main menu
    public static void subMenu6_3() {
        System.out.println("Welcome to the Security settings screen.");
        System.out.println("1. Pin code request\n2. Call barring services\n3. Fixed dialing\n4. Closed user group.\n5. Phone security\6. Change access codes");
        System.out.println("Pick an option or Enter 99 to return to previous menu ");
        int option = input.nextInt();
        if (((option >= 1) && (option <= 6)) || (option == 99)) {
            switch (option) {
                case 99 -> menu6();
                case 1 -> {
                    System.out.println("Your pin code is 1234");
                    System.out.println("Returning to previous page.");
                    System.out.println();
                    menu6();
                }

                case 6 -> {
                    System.out.println("Access code not changeable");
                    System.out.println("Returning to previous menu");
                    System.out.println();
                    menu6();
                }
                default -> {
                    System.out.println("Phone settings unavailable!\nSettings set to default");
                    System.out.println("Returning to previous menu");
                    System.out.println();
                    menu6();
                }
            }
        }
        else {
            System.out.println("Enter a valid number.");
            subMenu6_3();
        }
    }

    public static void menu7() {
        System.out.println("Welcome to the Call divert.\nYou have no incoming calls.\nReturning to main menu");
        System.out.println();
        mainMenu();

    }

    public static void menu8() {
        System.out.println("Welcome to the Games.\nYou have no installed games.\nReturning to main menu");
        System.out.println();
        mainMenu();

    }

    public static void menu9() {
        System.out.println("Welcome to the Calculator.\n");
        System.out.println("Press 1 for addition\nPress 2 for subtraction");
        System.out.println("Press 99 to exit.");
        int menu9 = input.nextInt();
        if ((menu9 == 1 || menu9 == 2) || menu9 == 99) {
                switch (menu9) {
                    case 1 -> {
                        System.out.println("Enter the two numbers to add separated by spaces: ");
                        int num1 = input.nextInt();
                        int num2 = input.nextInt();
                        System.out.printf("%nThe sum is %d%n", num2 + num1);
                        System.out.println("Returning to previous menu.");
                        System.out.println();
                        mainMenu();
                    }
                    case 2 -> {
                        System.out.println("Enter the two numbers to subtract separated by spaces: ");
                        int num1 = input.nextInt();
                        int num2 = input.nextInt();
                        System.out.printf("The difference is %d%n", Math.abs(num2 - num1));
                        System.out.println("Returning to previous menu.");
                        System.out.println();
                        mainMenu();
                    }
                    default -> mainMenu();
                }
            }
        else {
            System.out.println("Please enter a valid number.");
            System.out.println();
            menu9();
        }

    }

    public static void menu10() {
        System.out.println("Welcome to the Reminders.\nYou're all caught up.\nReturning to main menu");
        System.out.println();
        mainMenu();

    }

    public static void menu11() {
        System.out.println("Welcome to Clock.");
        System.out.println("1. Alarm clock\n2. Clock settings\n3. Date settings\n4. Stopwatch\n5. Countdown timer\n6. Auto update of date and time");
        System.out.printf("The date and time is: %s", LocalDateTime.now());
        System.out.println();
        mainMenu();

    }

    public static void menu12() {
        System.out.println("Welcome to the Profiles.\nYou have no visible profiles.\nReturning to main menu");
        System.out.println();
        mainMenu();

    }

    public static void menu13() {
        System.out.println("No sim card installed.\nReturning to main menu");
        System.out.println();
        mainMenu();

    }


    public static void execute() {
        System.out.print("Enter your name to proceed: ");
        String user = input.next();
        Nokia3310.setName(user);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Press 1 for main menu or 99 to terminate.");
            int begin = input.nextInt();
            if (begin == 1 || begin == 99) {
                if (begin == 1) {
                    Nokia3310.mainMenu();
                } else {
                    System.out.println("Thanks for using our app");
                    break;
                }
            } else {
                System.out.println("Enter either 1 or 99!");
            }
        }
    }
}


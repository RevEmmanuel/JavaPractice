package ChibuzorAssignment.contactInfo;

import Chapter9.Hotel.Address;

// import javax.swing.*;
import java.util.Scanner;

public class PhonebookMain {
    private static Phonebook phonebook;

    public static void main(String[] args) {
        begin();
        displayPhonebook();
    }

    private static void begin() {
        phonebook = new Phonebook();
        print("Welcome " + input("Hi there, enter your name: "));
    }

    private static void displayPhonebook() {
        String mainMain = """
                Press:
                1 --> Find contact
                2 --> Update contact info
                3 --> Delete contact
                4 --> View all contacts
                5 --> Exit application
                
                """;
        String userInput = input(mainMain + "Pick an option");
        switch (userInput) {
            case "1" -> findContact();
            case "2" -> updateContact();
            case "3" -> deleteContact();
            case "4" -> viewAllContacts();
            case "5" -> exitApplication();
            default -> {
                print("Error: " + userInput + "\n" + "Please enter a valid number");
                displayPhonebook();
            }
        }
    }

    private static void findContact() {
        String id = input("Enter the id of the contact");
        try {
            print(phonebook.getContact(Integer.parseInt(id)).toString());
        }
        catch (NumberFormatException e) {
            print("Error: " + id + "\n" + "Please enter a valid number");
            findContact();
        }
        catch (ContactDoesNotExistException c) {
            print(c.getMessage());
            displayPhonebook();
        }
    }

    private static void updateContact() {
        String choice = input("""
                Press 1 --> Update contact name
                Press 2 --> Update contact phone number
                Press 3 --> Update contact email address
                Press 4 --> Update contact address;
                Press 9 to go back.
                """);
        updates(choice);
    }

    private static void updates(String switchCase) {
        switch (switchCase) {
            case "1" -> updateContactName();
            case "2" -> updateContactPhoneNumber();
            case "3" -> updateEmailAddress();
            case "4" -> updateAddress();
            case "9" -> displayPhonebook();
            default -> {
                print("Invalid input.");
                updateContact();
            }
        }
    }

    private static void updateContactName() {
        String id = input("Enter the id of contact to update");
        try {
            phonebook.getContact(Integer.parseInt(id));
            String name = input("Enter the new name of the contact");
            phonebook.getContact(Integer.parseInt(id)).setName(name);
            print("Updated!");
            displayPhonebook();
        }
        catch (NumberFormatException n) {
            print("Please enter a valid number.");
            updateContact();
        }
        catch (ContactDoesNotExistException c) {
            print(c.getMessage());
            displayPhonebook();
        }
    }

    private static void updateContactPhoneNumber() {
        String id = input("Enter the id of contact to update");
        try {
            phonebook.getContact(Integer.parseInt(id));
            String phoneNumber = input("Enter the new phone number of the contact");
            phonebook.getContact(Integer.parseInt(id)).setPhoneNumber(phoneNumber);
            print("Updated!");
            displayPhonebook();
        }
        catch (NumberFormatException n) {
            print("Please enter a valid number.");
            updateContact();
        }
        catch (ContactDoesNotExistException c) {
            print(c.getMessage());
            displayPhonebook();
        }
    }

    private static void updateEmailAddress() {
        String id = input("Enter the id of contact to update");
        try {
            phonebook.getContact(Integer.parseInt(id));
            String email = input("Enter the new email address of the contact");
            phonebook.getContact(Integer.parseInt(id)).setEmailAddress(email);
            print("Updated!");
            displayPhonebook();
        }
        catch (NumberFormatException n) {
            print("Please enter a valid number.");
            updateContact();
        }
        catch (ContactDoesNotExistException c) {
            print(c.getMessage());
            displayPhonebook();
        }
    }

    private static void updateAddress() {
        String id = input("Enter the id of contact to update");
        try {
            phonebook.getContact(Integer.parseInt(id));
            Address newAddress;
            String houseNumber = input("Enter the new house number of the contact");
            String streetName = input("Enter the new street name of the contact");
            String cityName = input("Enter the new city name of the contact");
            String stateName = input("Enter the new state name of the contact");
            String countryName = input("Enter the new country name of the contact");
            newAddress = new Address(houseNumber, streetName, cityName, stateName, countryName);
            phonebook.getContact(Integer.parseInt(id)).setAddress(newAddress);
            print("Updated!");
            displayPhonebook();
        }
        catch (NumberFormatException n) {
            print("Please enter a valid number.");
            updateContact();
        }
        catch (ContactDoesNotExistException c) {
            print(c.getMessage());
            displayPhonebook();
        }
    }

    private static void deleteContactAsk() {
        String mainMain = """
                Press:
                1 --> Delete contacts
                9 --> Go back
                
                """;
        deletingContact(input(mainMain + "Pick an option"));
    }

    private static void deletingContact(String choice) {
        switch (choice) {
            case "1" -> deleteContact();
            case "9" -> displayPhonebook();
            default -> {
                print("Invalid input");
                displayPhonebook();
            }
        }
    }

    private static void deleteContact() {
        String id = input("Enter the id of the contact to delete");
        try {
            phonebook.deleteContact(Integer.parseInt(id));
        }
        catch (NumberFormatException n) {
            print("Please enter  valid id");
            deleteContactAsk();
        }
        catch (ContactDoesNotExistException c) {
            print(c.getMessage());
            displayPhonebook();
        }
    }

    private static void viewAllContacts() {
        print(phonebook.toString());
    }

    private static void exitApplication() {
        print("Thanks for using our application");
        System.exit(0);
    }

    private static String input(String prompt) {
//        return JOptionPane.showInputDialog(null, prompt);
        Scanner scanner = new Scanner(System.in);
        print(prompt);
        return scanner.nextLine();
    }

    private static void print(String input) {
//        JOptionPane.showMessageDialog(null, input);
        System.out.println(input);
    }
}

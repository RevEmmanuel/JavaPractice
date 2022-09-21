package DietelTextbook;

//import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

class HeartRateTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HeartRate client = new HeartRate("Adewunmi", "Adegunwa", 1996, 5, 10);

        System.out.println("Enter your FirstName: ");
        String firstName = input.next();
        client.setFirstName(firstName);

        System.out.println();

        System.out.println("Enter your LastName: ");
        String lastName = input.next();
        client.setLastName(lastName);

        System.out.println();

        System.out.println("Enter your year of birth: ");
        int year = input.nextInt();
        client.setYear(year);

        System.out.println();

        System.out.println("Enter your month of birth: ");
        int month = input.nextInt();
        client.setMonth(month);

        System.out.println();

        System.out.println("Enter your day of birth: ");
        int day = input.nextInt();
        client.setDay(day);

        displayDetails(client);

    }

    public static void displayDetails(HeartRate person) {
        person.setAge();
        System.out.printf("%n%nThe details for: %s %s%n", person.getFirstName(), person.getLastName());
        person.getDateOfBirth();
        System.out.printf("%nAge is %d%n", person.getAge());
        System.out.printf("The maximum heart rate is %d%n", person.getMaximumHeartRate());
        person.getTargetHeartRange();
    }

}
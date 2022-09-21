package Chapters2to6;

import java.util.Scanner;

class HealthProfileTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HealthProfile patient = new HealthProfile("Adewunmi", "Adegunwa", "Female", 1996, 5, 10, 69, 130.4);

        System.out.println("Enter your FirstName: ");
        String firstName = input.next();
        patient.setFirstName(firstName);

        System.out.println();

        System.out.println("Enter your LastName: ");
        String lastName = input.next();
        patient.setLastName(lastName);

        System.out.println();

        System.out.println("Enter your gender: ");
        String gender = input.next();
        patient.setGender(gender);

        System.out.println();

        System.out.println("Enter your year of birth: ");
        int year = input.nextInt();
        patient.setYear(year);

        System.out.println();

        System.out.println("Enter your month of birth: ");
        int month = input.nextInt();
        patient.setMonth(month);

        System.out.println();

        System.out.println("Enter your day of birth: ");
        int day = input.nextInt();
        patient.setDay(day);

        System.out.println();

        System.out.println("Enter your height in inches: ");
        double height = input.nextDouble();
        patient.setHeight(height);

        System.out.println();

        System.out.println("Enter your weight: ");
        double weight = input.nextDouble();
        patient.setWeight(weight);

        System.out.println();

        displayDetails(patient);

    }

    public static void displayDetails(HealthProfile person) {
        person.setAge();
        System.out.printf("%n%nThe details for: %s %s%n", person.getFirstName(), person.getLastName());
        System.out.print("Born on "); person.getDateOfBirth();
        System.out.printf(", %s is a %.2f inches tall %s", person.getFirstName(), person.getHeight(), person.getGender());
        System.out.printf("%nAge is %d%n", person.getAge());
        System.out.printf("%s weighs %.2f pounds%n", person.getFirstName(), person.getWeight());
        System.out.printf("Maximum heart rate is %d%n", person.getMaximumHeartRate());
        person.getTargetHeartRange();
        System.out.printf("%nBMI is %.2f", person.calculateBMI());
    }

}
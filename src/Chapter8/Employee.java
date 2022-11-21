package Chapter8;

public class Employee {

    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;
    private static int count = 0;

    public Employee(String firstName, String lastName) {
        this(firstName, lastName, null, null);
    }

    public Employee(String firstName, String lastName, Date birthDate, Date hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        ++count;

        System.out.printf("Employee constructor: %s %s; count = %d%n", firstName, lastName, count);

    }

    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %s%n", "Name", firstName, lastName, "Birth Date", birthDate, "Hire Date", hireDate);
    }

    public static int getCount() {
        return count;
    }
}

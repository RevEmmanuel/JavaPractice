package Chapter8;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    public static void main(String[] args) {
        Date birth = new Date(2004, 9, 15);
        Date hire = new Date(2023, 8, 1);
        Employee adeola = new Employee("Adeola", "Adekunle", birth, hire);
        Employee ade = new Employee("Adewunmi", "Adegunwa");

        System.out.printf("Normal count is %d%n", Employee.getCount());
        System.out.printf("After creating first employee, Count is %d%n", adeola.getCount());
        System.out.printf("After creating second employee, Count is %d%n", ade.getCount());

        System.out.println(adeola);
        System.out.println(ade);
    }

}
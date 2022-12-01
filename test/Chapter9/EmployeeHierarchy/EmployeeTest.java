package Chapter9.EmployeeHierarchy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    private BaseSalaryEmployee baseSalaryEmployee;
    private CommissionEmployee commissionEmployee;
    private Employee employee;
    private HourlyEmployee hourlyEmployee;
    private CommissionCompensationModel model1;
    private BasePlusCommissionCompensationModel model2;
    private HourlyEmployeeCompensationModel model3;

    @BeforeEach
    void setUp() {
        model1 = new CommissionCompensationModel(10, 0.8);
        model2 = new BasePlusCommissionCompensationModel(12, 0.5, 1200);
        model3 = new HourlyEmployeeCompensationModel(12, 30);
        employee = new Employee("Adeola", "Adekunle", "12345678901", model1);
        commissionEmployee = new CommissionEmployee("Adeola", "Adekunle", "12345678901", model1);
        baseSalaryEmployee = new BaseSalaryEmployee("Adeola", "Adekunle", "12345678901", model2);
        hourlyEmployee = new HourlyEmployee("Adeola", "Adekunle", "12345678901", model3);
    }

    @Test
    void setFirstName() {
        employee.setFirstName("Ade");
        assertEquals("Ade", employee.getFirstName());
    }

    @Test
    void getFirstName() {
        assertEquals("Adeola", employee.getFirstName());
    }

    @Test
    void setLastName() {
        employee.setLastName("OlaEmma");
        assertEquals("OlaEmma", employee.getLastName());
    }

    @Test
    void getLastName() {
        assertEquals("Adekunle", employee.getLastName());
    }

    @Test
    void setSocialSecurityNumber() {
        employee.setSocialSecurityNumber("09876543219");
        assertEquals("09876543219", employee.getSocialSecurityNumber());
    }

    @Test
    void getSocialSecurityNumber() {
        assertEquals("12345678901", employee.getSocialSecurityNumber());
    }

    @Test
    void getGrossSales() {
        assertEquals(10, employee.getGrossSales());
    }

    @Test
    void testThatGrossSalesChangesWhenIChangeCompensationModel() {
        employee.setCompensationModel(model2);
        assertEquals(12, employee.getGrossSales());
    }

    @Test
    void getCommissionRate() {
        assertEquals(0.8, employee.getCommissionRate());
    }

    @Test
    void testThatCommissionRateChangesWhenIChangeCompensationModel() {
        employee.setCompensationModel(model2);
        assertEquals(0.5, employee.getCommissionRate());
    }

    @Test
    void earnings() {
        assertEquals(8, employee.earnings());
    }

    @Test
    void testThatEarningsChangesWhenIChangeCompensationModel() {
        employee.setCompensationModel(model2);
        assertEquals(1206, employee.earnings());
    }

    @Test
    void testThatSubclassesCanHaveDifferentCompensationModel() {
        assertEquals(1206, baseSalaryEmployee.earnings());
        assertEquals(0.5, baseSalaryEmployee.getCommissionRate());
        assertEquals(12, baseSalaryEmployee.getGrossSales());

        CommissionEmployee employee1 = new CommissionEmployee("Richard", "Kent", "12345678", model1);
        assertEquals(8, employee1.earnings());
        assertEquals(0.8, employee1.getCommissionRate());
        assertEquals(10, employee.getGrossSales());
    }

    @Test
    void testHourlyEmployee() {
        assertEquals(360, hourlyEmployee.earnings());
    }
}
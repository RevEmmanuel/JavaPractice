package Chapter9.EmployeeHierarchy;

public class HourlyEmployee extends Employee{
    private HourlyEmployeeCompensationModel model;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, HourlyEmployeeCompensationModel model) {
        super(firstName, lastName, socialSecurityNumber);
        this.model = model;
    }

    @Override
    public double getGrossSales() {
        return model.getGrossSales();
    }

    @Override
    public double getCommissionRate() {
        return model.getCommissionRate();
    }

    @Override
    public double earnings() {
        return model.earnings();
    }

    public double getHours() {
        return model.getHour();
    }

    public double getWages() {
        return model.getWage();
    }
}

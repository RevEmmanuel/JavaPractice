package Chapter9.EmployeeHierarchy;

public class BaseSalaryEmployee extends Employee{
    private BasePlusCommissionCompensationModel model;

    public BaseSalaryEmployee(String firstName, String lastName, String socialSecurityNumber, BasePlusCommissionCompensationModel model) {
        super(firstName, lastName, socialSecurityNumber);
        this.model = model;
    }

    public double getBaseSalary() {
        return model.getBaseSalary();
    }

    public void setBaseSalary(double baseSalary) {
        model.setBaseSalary(baseSalary);
    }

    @Override
    public double earnings() {
        return model.earnings();
    }

    @Override
    public double getGrossSales() {
        return model.getGrossSales();
    }

    @Override
    public double getCommissionRate() {
        return model.getCommissionRate();
    }
}

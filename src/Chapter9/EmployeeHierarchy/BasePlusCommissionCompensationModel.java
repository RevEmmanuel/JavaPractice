package Chapter9.EmployeeHierarchy;

public class BasePlusCommissionCompensationModel extends CommissionCompensationModel {

    private double baseSalary;

    public BasePlusCommissionCompensationModel(double grossSales, double commissionRate, double baseSalary) {
        super(grossSales, commissionRate);
        validateBaseSalary(baseSalary);
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return baseSalary + getGrossSales() * getCommissionRate();
    }

    private void validateBaseSalary(double baseSalary) {
        if (baseSalary < 0) throw new IllegalArgumentException("base salary must be greater than 0");
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        validateBaseSalary(baseSalary);
        this.baseSalary = baseSalary;
    }
}

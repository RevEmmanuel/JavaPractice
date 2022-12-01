package Chapter9.EmployeeHierarchy;

public class CommissionEmployee extends Employee{

    CommissionCompensationModel model;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, CommissionCompensationModel model) {
        super(firstName, lastName, socialSecurityNumber);
        this.model = model;
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

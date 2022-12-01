package Chapter9.EmployeeHierarchy;

public class Employee {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private CompensationModel model;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Employee(String firstName, String lastName, String socialSecurityNumber, CompensationModel model) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.model = model;
    }

    public String getFirstName() {
        return firstName;
    }

    public CompensationModel getModel() {
        return model;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getGrossSales() {
        return model.getGrossSales();
    }

    public double getCommissionRate() {
        return model.getCommissionRate();
    }

    public double earnings() {
        return model.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", model.getGrossSales(),
                "commission rate", model.getCommissionRate());
    }

    public void setCompensationModel(CompensationModel model) {
        this.model = model;
    }
}

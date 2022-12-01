package Chapter9.EmployeeHierarchy;

public interface CompensationModel {

    double earnings();

    void setGrossSales(double grossSales);
    void setCommissionRate(double commissionRate);

    double getGrossSales();

    double getCommissionRate();
}

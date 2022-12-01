package Chapter9.EmployeeHierarchy;

public class CommissionCompensationModel implements CompensationModel{

    private double grossSales;
    private double commissionRate;

    public CommissionCompensationModel(double grossSales, double commissionRate) {
        validateParameters(grossSales, commissionRate);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    @Override
    public void setGrossSales(double grossSales) {
        validateGrossSales(grossSales);
        this.grossSales = grossSales;
    }

    @Override
    public void setCommissionRate(double commissionRate) {
        validateCommissionRate(commissionRate);
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    private void validateParameters(double grossSales, double commissionRate) {
        validateGrossSales(grossSales);
        validateCommissionRate(commissionRate);
    }

    private void validateGrossSales(double grossSales) {
        if (grossSales < 0) throw new IllegalArgumentException("Invalid gross sales value");
    }

    private void validateCommissionRate(double commissionRate) {
        if (commissionRate <= 0 || commissionRate >= 1) throw new IllegalArgumentException("Invalid commission rate");
    }

}

package Chapter9.EmployeeHierarchy;

public class HourlyEmployeeCompensationModel implements CompensationModel {

    private double hour;
    private double wage;

    public HourlyEmployeeCompensationModel(double hour, double wage) {
        validateParameters(hour, wage);
        this.hour = hour;
        this.wage = wage;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public double earnings() {
        return hour * wage;
    }

    private void validateParameters(double hour, double wage) {
        validateHour(hour);
        validateWage(wage);
    }

    @Override
    public void setGrossSales(double grossSales) {}

    @Override
    public void setCommissionRate(double commissionRate) {}

    @Override
    public double getGrossSales() {
        return 0;
    }

    @Override
    public double getCommissionRate() {
        return 0;
    }

    private void validateWage(double wage) {
        if (wage < 0) throw new IllegalArgumentException("wage must be positive");
    }

    private void validateHour(double hour) {
        if (hour < 0 || hour > 168) throw new IllegalArgumentException("Hour must be between 0 and 168");
    }

    public double getHour() {
        return hour;
    }

    public double getWage() {
        return wage;
    }
}

package nl.inholland.fundamentals.model;

public class Employee implements Payable {
    private double grossSalary;

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    @Override
    public double getPayout() {
        return .7 * getGrossSalary();
    }
}

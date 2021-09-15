package nl.inholland.fundamentals.model;

public class Freelancer implements Payable {

    private double hourlyRate;
    private int workedHours;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    @Override
    public double getPayout() {
        return workedHours * hourlyRate;
    }
}

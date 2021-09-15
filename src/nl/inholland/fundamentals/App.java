package nl.inholland.fundamentals;

import nl.inholland.fundamentals.model.Employee;
import nl.inholland.fundamentals.model.Freelancer;
import nl.inholland.fundamentals.model.Payable;

import java.util.List;

public class App {

    public static void main(String[] args) {
        App app = new App();
        Employee employee = new Employee();
        employee.setGrossSalary(5000);

        Freelancer freelancer = new Freelancer();
        freelancer.setWorkedHours(140);
        freelancer.setHourlyRate(60);

        List<Payable> payables = List.of(freelancer,employee);
        for (Payable payable: payables) {
            app.displayPayment(payable);
        }
    }

    public void displayPayment(Payable payable) {
        System.out.println(payable.getClass().getSimpleName() + ": " + payable.getPayout());
    }
}

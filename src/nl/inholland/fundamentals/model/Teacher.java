package nl.inholland.fundamentals.model;

public class Teacher extends Person{

    private double salary;

    public Teacher(String name, String email, double salary) {
        super(name, email);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  String.format("Teacher: name=%s, email=%s, salary=%.2f", super.getName(), super.getEmail(), this.getSalary());
    }
}

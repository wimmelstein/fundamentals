package nl.inholland.fundamentals;

import nl.inholland.fundamentals.model.Person;
import nl.inholland.fundamentals.model.Student;
import nl.inholland.fundamentals.model.Teacher;

public class App {

    public static void main(String[] args) {
        Student jack = new Student("Jack Monterrey", "jack.monterrey@student.inholland.nl", "IT2a");
        Student lisa = new Student("Lisa Ventura", "lisa.ventura@student.inholland.nl", "IT2a");
        Teacher jill = new Teacher("Jill Summers", "jill.summers@inholland.nl", 3500.00);
        Teacher peter = new Teacher("Peter Prince", "peter.prince@inholland.nl", 2790.85);

        Person[] people = new Person[]{jack, lisa, jill, peter};

        for (Person person : people) {
            if (person instanceof Teacher) {
                double yearlySalary = ((Teacher) person).getSalary();
                System.out.println(person + ", yearly salary=" + String.format("%.2f", yearlySalary * 12.00));
            } else {
                System.out.println(person);
            }
        }

    }
}

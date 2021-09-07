package nl.inholland.fundamentals;

import nl.inholland.fundamentals.model.Student;

import java.util.Scanner;

public class App {


    Scanner scanner = new Scanner(System.in);
    Student[] students;
    int numberOfStudents;

    public static void main(String[] args) {
        App app = new App();

        System.out.print("Please enter the size of your group and press [Enter]: ");
        app.numberOfStudents = app.scanner.nextInt();
        app.scanner.nextLine();
        System.out.printf("Group size: %d%n", app.numberOfStudents);

        app.readStudentNames(app.numberOfStudents);

        for (int i = 0; i < app.numberOfStudents; i++) {
            System.out.printf("Student #%d: %s%n", i+1, app.students[i].getName());
        }
        System.out.println();

        app.readStudentsPresence(app.numberOfStudents);

        app.printStudentsPresence(app.numberOfStudents);
        app.scanner.close();
    }

    private void printStudentsPresence(int numberOfStudents) {
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("Student #%d: %-20s    | Present: %s%n", i+1, students[i].getName(), students[i].isPresent());
        }
    }

    private void readStudentsPresence(int numberOfStudents) {
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("Is student #%d (%s) present? [Y/N + ENTER]: ", i+1, students[i].getName());
            String present = scanner.nextLine();
            students[i].setPresent(present.substring(0).equalsIgnoreCase("y") ? true : false);
        }
        System.out.println();
    }

    private void readStudentNames(int numberOfStudents) {
        students = new Student[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("Please enter the name of student %d and press [ENTER]: ", i+1);
            Student student = new Student(scanner.nextLine());
            students[i] = student;
        }
        System.out.println();
    }
}

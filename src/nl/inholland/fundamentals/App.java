package nl.inholland.fundamentals;

import java.util.Scanner;

public class App {

    String course;
    int numberOfStudents;
    String[] students;
    int[] grades;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        app.readBaseData();
        app.readStudents(app.numberOfStudents);
        app.readGrades(app.numberOfStudents);
        app.printResults();
        app.scanner.close();
    }

    private void printResults() {
        int sum = 0;
        int maxResult = 0;
        int studentWithHighestScore = 0;
        
        for (int i = 0; i < numberOfStudents; i++) {
            sum += grades[i];
        }

        double avgResult = sum/numberOfStudents;

        for (int i = 0; i < numberOfStudents; i++) {
            if (grades[i] > maxResult) {
                studentWithHighestScore = i;
                maxResult = grades[i];
            }
        }

        System.out.printf("Average grade: %.1f%n", avgResult);
        System.out.printf("Student %s has highest score of %d%n%n", students[studentWithHighestScore], maxResult);

        for (int i = 0; i < numberOfStudents; i++) {
            printStudentGrade(students[i], course, grades[i]);
        }
    }

    private void printStudentGrade(String student, String course, int grade) {
        System.out.printf("Grade for student %s (course %s): %d%n", student, course, grade);
    }


    private void readGrades(int numberOfStudents) {
        grades = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("Enter grade for %s: ", students[i]);
            grades[i] = scanner.nextInt();
        }
        System.out.println();
    }

    private void readStudents(int numberOfStudents) {
        students = new String[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("Enter name of student %d: ", i+1);
            students[i] = scanner.nextLine();
        }
        System.out.println();
    }

    private void readBaseData() {
        System.out.print("Course: ");
        course = scanner.nextLine();
        System.out.print("Number of students: ");
        numberOfStudents = scanner.nextInt();
        scanner.nextLine();
    }
}

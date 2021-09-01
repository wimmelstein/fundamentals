package nl.inholland.fundamentals;

import java.util.Scanner;

public class Main {

    String course;
    int numberOfStudents;
    String[] students;
    int[] grades;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        main.readBaseData();
        main.readStudents(main.numberOfStudents);
        main.readGrades(main.numberOfStudents);
        main.printResults();
        main.scanner.close();
    }

    private void printResults() {

        int sum = 0;
        int maxResult = 0;
        int studentWithHighestScore = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            sum += grades[i];
        }
        double avgResult = sum/numberOfStudents;
        System.out.printf("Average score: %d%n", numberOfStudents);
        for (int i = 0; i < numberOfStudents; i++) {
            if (grades[i] > maxResult) {
                studentWithHighestScore = i;
                maxResult = grades[i];
            }
        }
        System.out.printf("Student %s has highest score of %d", students[studentWithHighestScore], maxResult);
        System.out.println();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("Grade for student %s (course %s): %d", students[i], course, grades[i] );
        }
    }


    private void readGrades(int numberOfStudents) {
        grades = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Grade for " + students[i]);
            grades[i] = scanner.nextInt();
        }
    }

    private void readStudents(int numberOfStudents) {
        students = new String[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student name: ");
            students[i] = scanner.nextLine();
        }
    }

    private void readBaseData() {
        System.out.print("Course: ");
        course = scanner.nextLine();
        System.out.print("Number of students: ");
        numberOfStudents = scanner.nextInt();
    }
}

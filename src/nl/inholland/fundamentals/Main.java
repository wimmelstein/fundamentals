package nl.inholland.fundamentals;

import java.util.Scanner;

public class Main {

    /*
    Creating scanner as a class variable
     */

    Scanner scanner = null;

    public static void main(String[] args) {
        //Creating a start method. But then we have to instantiate this class...
        Main main = new Main();
        main.start();
    }

    private void start() {
        // Initialize scanner and read in a string
        scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        // Read in an int
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        System.out.println(String.format("You are %s, and you are %d years old", name, age));

        // This is System I/O. It's good practice to close the scanner...
        scanner.close();
    }
}

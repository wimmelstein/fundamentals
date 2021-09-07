package nl.inholland.fundamentals;

import nl.inholland.fundamentals.model.BankAccount;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(1, 200);
        System.out.println(bankAccount);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the amount to witdraw or 0 to exit: ");
            double amount = scanner.nextDouble();
            if (amount == 0) {
                System.out.println("End of program");
                break;
            }
            bankAccount.withdraw(amount);
            System.out.println(bankAccount);
        }

        scanner.close();
    }

}


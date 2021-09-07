package nl.inholland.fundamentals;

import nl.inholland.fundamentals.model.BankAccount;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1, 200.00);
        System.out.println(account);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an amount to withdraw or 0 to stop: ");
            double amount = scanner.nextDouble();
            if (amount==0) {
                System.out.println("End program...");
                break;
            }

            account.withdraw(amount);
            System.out.printf("Account number %d now has balance %.2f%n", account.getAccountNumber(), account.getBalance());
        }

        scanner.close();
    }
}

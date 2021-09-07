package nl.inholland.fundamentals.model;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (this.getBalance() - amount < 0) {
            System.out.println("You don't have enough money in your account to withdraw money");
            return;
        }

        if (amount < 0) {
            System.out.println("Withdrawing a negative amount is not possible");
            return;
        }

        balance -= amount;
    }

    @Override
    public String toString() {
        return String.format("Bankaccount %d now has balance %.2f", this.getAccountNumber(), this.getBalance());
    }
}

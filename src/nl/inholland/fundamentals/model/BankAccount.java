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
        if (isNegativeAmount(amount)) {
            System.out.println("Withdrawing a negative amount is not possible");
            return;
        }

        if (willBalanceBecomeLessThanZero(amount)) {
            System.out.println("You don't have enough money in your account to withdraw money");
            return;
        }

        balance -= amount;
    }

    private boolean willBalanceBecomeLessThanZero(double amount) {
        return this.getBalance() -amount < 0;
    }

    private boolean isNegativeAmount(double amount) {
        return amount < 0;
    }

    @Override
    public String toString() {
        return String.format("Bankaccount %d now has balance %.2f", this.getAccountNumber(), this.getBalance());
    }
}

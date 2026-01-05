package entities;

public class Account {

    private int accountNumber;
    private String holderName;
    private double balance;

    public static final double WITHDRAW_TAX = 5.00;

    public Account() {
    }

    public Account(int accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    public Account(int accountNumber, String holderName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        deposit(initialDeposit);    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + WITHDRAW_TAX;
    }

    public String toString() {
        return "Account "
                + accountNumber
                + ", Holder: "
                + holderName
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
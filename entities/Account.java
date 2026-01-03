package entities;

public class Account {

    private int accountNumber;
    private String nameHolder;
    private double balance;
    private double depositValue;
    private double withdrawValue;
    public double taxPerTransaction = 5.00;

    public Account() {
    }

    public Account(int accountNumber, String nameTitular) {
        this.accountNumber = accountNumber;
        this.nameHolder = nameTitular;
    }

    public Account(double withdrawValue) {

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getNameTitular() {
        return nameHolder;
    }

    public void setNameTitular(String nameTitular) {
        this.nameHolder = nameTitular;
    }

    public double getBalance() {
        return depositValue - withdrawValue;
    }

    public void setDepositValue(double depositvalue) {
        this.depositValue = depositvalue;
    }

    public void setWithdrawValue(double withdrawValue) {
        this.withdrawValue = withdrawValue + taxPerTransaction;
    }

    public String toString() {
        return "Account "
                + getAccountNumber()
                + ", Holder: "
                + getNameTitular()
                + ", Balance: $ "
                + String.format("%.2f", getBalance());
    }
}


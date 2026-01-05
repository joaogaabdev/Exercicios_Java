package exercicios;

import entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioAccount {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double amount;
        Account account;

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); //para consumir o enter do input accountNumber, antes do próximo nextline.
        System.out.print("Enter account holder: ");
        String holderName = scanner.nextLine();
        System.out.print("Is there na initial deposit value (y/n)? ");
        char response = scanner.next().charAt(0);
        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = scanner.nextDouble();
            account = new Account(accountNumber, holderName, initialDeposit);
        } else {
            account = new Account(accountNumber, holderName);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

       System.out.print("Enter a deposit value: ");
        amount = scanner.nextDouble();
        account.deposit(amount);
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        amount = scanner.nextDouble();
        account.withdraw(amount);
        System.out.println("Updated account data:");
        System.out.println(account);
    }
}

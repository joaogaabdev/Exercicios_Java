package exercicios;

import entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioAccount {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        String choice;
        double amount;

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); //para consumir o enter do input accountNumber, antes do próximo nextline.
        System.out.print("Enter account holder: ");
        String holderName = scanner.nextLine();
        Account account = new Account(accountNumber, holderName);

        System.out.print("Is there na initial deposit value (y/n)? ");
        choice = scanner.next();
        if (choice .equals("y")) {
            System.out.print("Enter initial deposit value: ");
            amount = scanner.nextDouble();
            account.Deposit(amount);
            System.out.println("Account data: ");
            System.out.println(account);
        } else if (choice .equals("n")) {
            System.out.println("Account data:");
            System.out.println(account);
        } else {
            System.out.println("Digite uma opção válida!");
        }

        System.out.print("Enter a deposit value: ");
        amount = scanner.nextDouble();
        account.Deposit(amount);
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        amount = scanner.nextDouble();
        account.Withdraw(amount);
        System.out.println("Updated account data:");
        System.out.println(account);
    }
}

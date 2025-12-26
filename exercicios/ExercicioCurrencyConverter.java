package exercicios;

import entities.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;
import static entities.CurrencyConverter.*;

public class ExercicioCurrencyConverter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is dollar price? ");
        double dolarPrice = scanner.nextDouble();
        System.out.print("How many dollars will be bought?");
        double quantityDollars = scanner.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.convertToReais(quantityDollars, dolarPrice), IOF);
        scanner.close();
    }
}

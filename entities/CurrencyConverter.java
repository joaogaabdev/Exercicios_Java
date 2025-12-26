package entities;

public class CurrencyConverter {

    public static final double IOF = 6 * 0.0100;

    public static double convertToReais(double quantityDollars, double dolarPrice) {
        double amount = quantityDollars * dolarPrice;
        return amount + amount * IOF;
    }
}

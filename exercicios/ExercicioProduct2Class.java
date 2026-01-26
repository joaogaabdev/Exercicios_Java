package exercicios;

import entities.Product2;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProduct2Class {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Product2 product2;

        Product2[] vect = new Product2[n];

        for (int i=0; i<n; i++) {
            scanner.nextLine();
            String name = scanner.next();
            double price = scanner.nextDouble();
            vect[i] = new Product2(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;

        System.out.printf("Average Price: %.2f", avg);
        scanner.close();
    }
}

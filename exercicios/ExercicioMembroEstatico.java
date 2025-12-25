package exercicios;

import java.util.Locale;
import java.util.Scanner;
import static entities.Calculator.*;

public class ExercicioMembroEstatico {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        double c = circumference(radius);
        double v = volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", PI);
        scanner.close();
    }
}

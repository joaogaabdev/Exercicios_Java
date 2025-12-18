package exercicios;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioRetanguloClass {
    public static void main(String [] args) {
        // Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor
        // de sua área, perímetro e diagonal. Usar uma classe.
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height: ");
        rectangle.width = scanner.nextDouble();
        rectangle.height = scanner.nextDouble();

        System.out.println();
        System.out.printf("AREA = %.2f", rectangle.area());
        System.out.println();
        System.out.printf("PERIMETER = %.2f", rectangle.perimeter());
        System.out.println();
        System.out.printf("DIAGONAL = %.2f", rectangle.diagonal());
        scanner.close();
    }
}

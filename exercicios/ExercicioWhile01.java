package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioWhile01 {
    public static void main(String args []) {
        //fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenreit. Perguntar se o
        //usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o programa.
        //Fórmula: F = 9 * c / 5 + 32
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("\nSeja bem vindo ao seu conversor de temperatura de °C para F");

        char resposta;
        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenreit = 9.0 * celsius / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenreit: %.1f%n", fahrenreit);
            System.out.print("Deseja repetir (s/n) ? ");
            resposta = scanner.next().charAt(0);
        } while (resposta != 'n');
            scanner.close();
    }
}

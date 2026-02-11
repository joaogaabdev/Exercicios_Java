package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioNumeroNegativo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = scanner.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i<n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = scanner.nextInt();//adiciona o numero na posicao do vetor vect[]
        }
        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < n; i++) {
            if (vect[i] < 0) {
                System.out.print(vect[i]);
            }
        }
        scanner.close();
    }
}


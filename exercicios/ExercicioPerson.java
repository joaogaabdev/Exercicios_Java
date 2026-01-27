package exercicios;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPerson {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = scanner.nextInt();

        Person person;
        Person[] vect = new Person[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Dados da %da pessoa: \n", i + 1);
            scanner.nextLine();
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();
            vect[i] = new Person(nome, idade, altura);
        }

        double sumAltura = 0.0;
        for (int i = 0; i < n; i++) {
            sumAltura += vect[i].getAltura();
        }

        int countUnder16 = 0; //Contador de pessaos com idade abaixo de 16
        for (int i = 0; i < n; i++) {
            if (vect[i].getIdade() < 16) {
                countUnder16++;
            }
        }

        double percentage = (double) countUnder16 / n * 100.00;

        for (int i = 0; i < n; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.println(vect[i].getNome());
            }
        }
        double avg = sumAltura / vect.length;

        System.out.println("Altura media %.2f" + avg);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentage);
    }
}

package exercicios;
import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioStudentClass {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Digite o nome do Aluno: ");
        student.nome = scanner.nextLine();

        System.out.print("Digite a primeira nota (Deve conter um valor de 0 a 30) : ");
        student.notaPrimeiroTrimestre = scanner.nextDouble();

        System.out.print("Digite a segunda nota (Deve conter um valor de 0 a 35) : ");
        student.notaSegundoTrimeste = scanner.nextDouble();

        System.out.print("Digite a terceira nota (Deve conter um valor de 0 a 35) : ");
        student.notaTerceiroTrimestre = scanner.nextDouble();
        System.out.printf("FINAL GRADE: %.2f", student.calcularMedia());

        if (student.AvisoAprovacao()) {
            System.out.println("\nPass");
        }
        else {
            System.out.println("\nFAILED");
            System.out.printf("MISSING %.2f POINTS", 60.00 - student.calcularMedia());
        }
        scanner.close();
    }
}

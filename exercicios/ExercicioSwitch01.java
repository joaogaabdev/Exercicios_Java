package exercicios;
import java.util.Scanner;
public class ExercicioSwitch01 {
    //Exercício de switch

    public static void main(String[] args) {
        System.out.println("Exercício de switch");

        String diaDaSemana = " ";
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite qual o dia da semana(digite de 1 a 7):");
        int numero = scanner.nextInt();
        scanner.close();

        switch (numero) {
            case 1:
                diaDaSemana = "Domingo";
                break;
            case 2:
                diaDaSemana = "Segunda";
                break;
            case 3:
                diaDaSemana = "Terça";
                break;
            case 4:
                diaDaSemana = "Quarta";
                break;
            case 5:
                diaDaSemana = "Quinta";
                break;
            case 6:
                diaDaSemana = "Sexta";
                break;
            case 7:
                diaDaSemana = "Sábado";
                break;
            default:
                diaDaSemana = "valor inválido";
                break;
        }
        System.out.printf("Hoje é %s !", diaDaSemana);
    }
}

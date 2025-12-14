import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        //Uma operadora de telefonia cobra R$50.00 por um plano básico que
        //dá direito a 100 minutos de telefone. Cada minuto que exceder a
        //franquia de 100 minutos custa R$2.00.Fazer um programa para ler a
        //quantidade de minutos que uma pessoa consumiu,daí mostrar o valor
        //a ser pago

        Scanner scanner = new Scanner(System.in);

        double planoBasico = 50.00;

        System.out.println("\nVocê possui o plano básico no valor de " +
                "R$ 50,00, com direito a 100 minutos de ligação!");

        double minutosUsuario = 0;
        System.out.printf("\nQuantos minutos você consumiu?", minutosUsuario);
        minutosUsuario = scanner.nextDouble();
        scanner.close();

        if ( minutosUsuario <= 100) {
            System.out.println("\nValor a pagar R$ 50.00");
        } else if ( minutosUsuario > 100 ) {
            double novoValor = (minutosUsuario - 100) * 2;
            double total = planoBasico + novoValor;
            System.out.printf("\nValor a pagar: R$ %.2f", total);
        }
        else {
            System.out.println("\nDigite um valor válido.");
        }
    }
}

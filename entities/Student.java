package entities;

public class Student {
    public String nome;
    public double notaPrimeiroTrimestre;
    public double notaSegundoTrimeste;
    public double notaTerceiroTrimestre;

    public double calcularMedia() {
        return notaPrimeiroTrimestre
                + notaSegundoTrimeste
                + notaTerceiroTrimestre;
    }

    public boolean AvisoAprovacao() {
        return calcularMedia() >= 60.00;
    }
}



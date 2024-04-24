package edu.segundaSemana;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int notaFinal = 7;
        if (notaFinal < 6) {
            System.out.println("REPROVADO");
        } else if (notaFinal == 6) {
            System.out.println("PROVA MINERVA");
        } else {
            System.out.println("APROVADO");
        }
    }
}

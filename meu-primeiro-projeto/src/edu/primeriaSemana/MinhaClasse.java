package edu.primeriaSemana;

public class MinhaClasse {
    public static void main(String[] args) {
        // CONSTANTE
        final String BR = "Brasil";
        System.out.println(BR);
        int ano = 2024;
        System.out.println(ano);
        System.out.println("Hello world");

        String primeiroNome = "joao";
        String segundoNome = "castro";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    // metodo

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);

    }

}
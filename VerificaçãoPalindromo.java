package org.example;

public class VerificaçãoPalindromo {
    public static boolean ehPalindromo(String palavra) {
        Pilha pilha = new Pilha();


        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(String.valueOf(palavra.charAt(i)));
        }


        StringBuilder palavraInvertida = new StringBuilder();
        while (!pilha.estaVazia()) {
            palavraInvertida.append(pilha.desempilha());
        }

        return palavra.equals(palavraInvertida.toString());
    }

    public static void main(String[] args) {
        String palavra1 = "arara";
        String palavra2 = "casa";

        System.out.println(palavra1 + " → " + (ehPalindromo(palavra1) ? "É palíndromo" : "Não é palíndromo"));
        System.out.println(palavra2 + " → " + (ehPalindromo(palavra2) ? "É palíndromo" : "Não é palíndromo"));
    }
}

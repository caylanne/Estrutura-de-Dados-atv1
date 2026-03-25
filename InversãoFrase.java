package org.example;

public class InversãoFrase {
    public static String inverterOrdemPalavras(String frase) {
        Pilha pilha = new Pilha();


        String[] palavras = frase.split(" ");
        for (String palavra : palavras) {
            pilha.empilha(palavra);
        }


        StringBuilder fraseInvertida = new StringBuilder();
        while (!pilha.estaVazia()) {
            fraseInvertida.append(pilha.desempilha());
            if (!pilha.estaVazia()) {
                fraseInvertida.append(" ");
            }
        }

        return fraseInvertida.toString();
    }

    public static void main(String[] args) {
        String frase = "eu gosto de java";
        String resultado = inverterOrdemPalavras(frase);
        System.out.println(resultado);
    }
}
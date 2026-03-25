package org.example;

public class InversãoHello {
    public static String inverter(String palavra) {
        Pilha pilha = new Pilha();


        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(String.valueOf(palavra.charAt(i)));
        }


        StringBuilder invertida = new StringBuilder();
        while (!pilha.estaVazia()) {
            invertida.append(pilha.desempilha());
        }

        return invertida.toString();
    }

    public static void main(String[] args) {
        String palavra = "hello";
        String resultado = inverter(palavra);
        System.out.println(resultado);
    }
}
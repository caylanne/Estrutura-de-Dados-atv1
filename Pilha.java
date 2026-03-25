package org.example;

import java.util.Arrays;

public class Pilha {
    private String[] elementos;
    private int tamanho;
    private static final int CAPACIDADE_INICIAL = 10;

    public Pilha() {
        this.elementos = new String[CAPACIDADE_INICIAL];
        this.tamanho = 0;
    }

    public void empilha(String elemento) {
        if (tamanho == elementos.length) {
            String[] novoVetor = new String[elementos.length * 2];
            for (int i = 0; i < tamanho; i++) {
                novoVetor[i] = elementos[i];
            }
            elementos = novoVetor;
        }
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public String desempilha() {
        if (estaVazia()) {
            throw new RuntimeException("Pilha vazia");
        }
        tamanho--;
        String removido = elementos[tamanho];
        elementos[tamanho] = null;
        return removido;
    }

    public String topo() {
        if (estaVazia()) {
            throw new RuntimeException("Pilha vazia");
        }
        return elementos[tamanho - 1];
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < tamanho; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(elementos[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
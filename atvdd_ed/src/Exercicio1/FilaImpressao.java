package Exercicio1;

import java.util.LinkedList;
import java.util.Queue;

public class FilaImpressao {
    public static <Documento> void main(String[] args) {
        Queue<Documento> fila = new LinkedList<>();

        fila.add(new Documento("Trabalho.pdf", 10));
        fila.add(new Documento("Relatorio.docx", 5));
        fila.add(new Documento("Planilha.xlsx", 3));
        fila.add(new Documento("Apresentacao.ppt", 12));
        fila.add(new Documento("Contrato.pdf", 8));

        System.out.println("Fila inicial:");
        for (Documento d : fila) {
            System.out.println(d.nome + " - " + d.paginas + " páginas");
        }

        System.out.println("\nImprimindo documentos:");
        while (!fila.isEmpty()) {
            Documento d = fila.poll();
            System.out.println("Imprimindo: " + d.nome + " (" + d.paginas + " páginas)");
        }
    }
}
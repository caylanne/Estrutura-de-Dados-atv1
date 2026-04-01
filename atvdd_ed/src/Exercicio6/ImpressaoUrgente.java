public class ImpressaoUrgente {
    public static void main(String[] args) {
        PriorityQueue<DocumentoUrgente> fila = new PriorityQueue<>();

        fila.add(new DocumentoUrgente("Relatorio", 10, 2));
        fila.add(new DocumentoUrgente("Contrato", 5, 1));
        fila.add(new DocumentoUrgente("Planilha", 8, 3));
        fila.add(new DocumentoUrgente("Apresentacao", 12, 1));

        while (!fila.isEmpty()) {
            DocumentoUrgente d = fila.poll();
            System.out.println("Imprimindo: " + d.nome + " - Prioridade " + d.prioridade);
        }
    }
}
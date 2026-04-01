import java.util.PriorityQueue;

class DocumentoUrgente implements Comparable<DocumentoUrgente> {
    String nome;
    int paginas;
    int prioridade;

    public DocumentoUrgente(String nome, int paginas, int prioridade) {
        this.nome = nome;
        this.paginas = paginas;
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(DocumentoUrgente outro) {
        return this.prioridade - outro.prioridade;
    }
}
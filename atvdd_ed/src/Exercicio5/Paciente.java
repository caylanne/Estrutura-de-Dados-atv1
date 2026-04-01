import java.util.PriorityQueue;

class Paciente implements Comparable<Paciente> {
    String nome;
    int prioridade;

    public Paciente(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(Paciente outro) {
        return this.prioridade - outro.prioridade;
    }
}

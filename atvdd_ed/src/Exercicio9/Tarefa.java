import java.util.PriorityQueue;

class Tarefa implements Comparable<Tarefa> {
    String nome;
    int prioridade;

    public Tarefa(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(Tarefa outra) {
        return this.prioridade - outra.prioridade;
    }
}
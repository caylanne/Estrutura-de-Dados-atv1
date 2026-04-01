public class AgendamentoSistema {
    public static void main(String[] args) {
        PriorityQueue<Tarefa> fila = new PriorityQueue<>();

        fila.add(new Tarefa("Backup", 2));
        fila.add(new Tarefa("Atualização", 1));
        fila.add(new Tarefa("Verificação de vírus", 3));
        fila.add(new Tarefa("Limpeza de disco", 2));

        while (!fila.isEmpty()) {
            System.out.println("Fila atual:");
            for (Tarefa t : fila) {
                System.out.println(t.nome + " - Prioridade " + t.prioridade);
            }

            Tarefa executada = fila.poll();
            System.out.println("\nExecutando: " + executada.nome);
            System.out.println("-----------------------------");
        }
    }
}
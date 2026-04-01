public class ProntoSocorro {
    public static void main(String[] args) {
        PriorityQueue<Paciente> fila = new PriorityQueue<>();

        fila.add(new Paciente("Ana", 2));
        fila.add(new Paciente("Carlos", 1));
        fila.add(new Paciente("Marina", 3));
        fila.add(new Paciente("Pedro", 1));
        fila.add(new Paciente("Lucas", 2));
        fila.add(new Paciente("Julia", 3));

        while (!fila.isEmpty()) {
            Paciente p = fila.poll();
            System.out.println("Atendendo: " + p.nome + " - Prioridade " + p.prioridade);
        }
    }
}
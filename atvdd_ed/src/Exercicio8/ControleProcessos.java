public class ControleProcessos {
    public static void main(String[] args) {
        Queue<Processo> fila = new LinkedList<>();

        fila.add(new Processo(1, 5));
        fila.add(new Processo(2, 3));
        fila.add(new Processo(3, 8));
        fila.add(new Processo(4, 2));

        while (!fila.isEmpty()) {
            Processo p = fila.poll();
            System.out.println("Executando processo " + p.id + " - Tempo estimado: " + p.tempo + " segundos");
        }
    }
}
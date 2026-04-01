public class Banco {
    public static void main(String[] args) {
        Queue<Cliente> fila = new LinkedList<>();

        fila.add(new Cliente("Ana", 101));
        fila.add(new Cliente("Carlos", 102));
        fila.add(new Cliente("Marina", 103));
        fila.add(new Cliente("João", 104));
        fila.add(new Cliente("Paula", 105));
        fila.add(new Cliente("Lucas", 106));

        while (!fila.isEmpty()) {
            Cliente c = fila.poll();
            System.out.println("Chamando senha " + c.senha + " - Cliente: " + c.nome);
        }

        System.out.println("Fila vazia.");
    }
}
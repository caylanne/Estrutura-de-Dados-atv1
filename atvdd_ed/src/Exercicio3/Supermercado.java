public class Supermercado {
    public static void main(String[] args) {
        Queue<ClienteMercado> fila = new LinkedList<>();

        fila.add(new ClienteMercado("Ana", 10));
        fila.add(new ClienteMercado("Pedro", 7));
        fila.add(new ClienteMercado("Julia", 15));
        fila.add(new ClienteMercado("Carlos", 5));
        fila.add(new ClienteMercado("Marcos", 12));

        while (!fila.isEmpty()) {
            ClienteMercado cliente = fila.poll();
            System.out.println("Atendendo: " + cliente.nome);
            System.out.println("Produtos: " + cliente.produtos);
            System.out.println("Clientes restantes: " + fila.size());
            System.out.println();
        }
    }
}
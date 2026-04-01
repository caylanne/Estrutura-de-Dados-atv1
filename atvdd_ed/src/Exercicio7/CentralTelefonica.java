public class CentralTelefonica {
    public static void main(String[] args) {
        Queue<Chamada> fila = new LinkedList<>();

        fila.add(new Chamada("Ana", "Suporte"));
        fila.add(new Chamada("Carlos", "Financeiro"));
        fila.add(new Chamada("Julia", "Informações"));

        while (!fila.isEmpty()) {
            Chamada c = fila.poll();
            System.out.println("Atendendo: " + c.nome + " - Assunto: " + c.assunto);
            System.out.println("Chamadas aguardando: " + fila.size());
            System.out.println();
        }
    }
}
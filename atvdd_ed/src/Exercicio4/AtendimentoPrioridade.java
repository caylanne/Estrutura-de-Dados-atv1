public class AtendimentoPrioridade {
    public static void main(String[] args) {
        Queue<Pessoa> prioritarios = new LinkedList<>();
        Queue<Pessoa> normais = new LinkedList<>();

        prioritarios.add(new Pessoa("Maria"));
        prioritarios.add(new Pessoa("José"));
        prioritarios.add(new Pessoa("Clara"));
        prioritarios.add(new Pessoa("Pedro"));

        normais.add(new Pessoa("Ana"));
        normais.add(new Pessoa("Lucas"));
        normais.add(new Pessoa("João"));

        int contador = 0;

        while (!prioritarios.isEmpty() || !normais.isEmpty()) {
            if ((!prioritarios.isEmpty() && contador < 3) || normais.isEmpty()) {
                System.out.println("Atendendo prioritário: " + prioritarios.poll().nome);
                contador++;
            } else {
                System.out.println("Atendendo normal: " + normais.poll().nome);
                contador = 0;
            }
        }
    }
}
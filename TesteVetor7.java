public class TesteVetor7 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");

        System.out.println("Inicial: " + vetor);

        vetor.remove(0);
        System.out.println("Remove posição 0: " + vetor);
        System.out.println("Tamanho: " + vetor.tamanho());

        vetor.remove(1);
        System.out.println("Remove posição do meio: " + vetor);
        System.out.println("Tamanho: " + vetor.tamanho());

        vetor.remove(vetor.tamanho() - 1);
        System.out.println("Remove última posição: " + vetor);
        System.out.println("Tamanho: " + vetor.tamanho());

        try {
            vetor.remove(10);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
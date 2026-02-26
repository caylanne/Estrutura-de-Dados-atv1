public class TesteVetor1 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);

        vetor.adiciona("Ana");
        vetor.adiciona("Carlos");
        vetor.adiciona("Bruna");

        System.out.println("Tamanho: " + vetor.tamanho());
        System.out.println("Vetor: " + vetor);

        System.out.println("Elementos um por linha:");
        vetor.imprimeUmPorLinha();
    }
}
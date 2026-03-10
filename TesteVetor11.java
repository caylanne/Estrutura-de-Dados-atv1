public class TesteVetor11 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adicionarSeNaoExiste("Java");
        vetor.adicionarSeNaoExiste("Python");
        vetor.adicionarSeNaoExiste("Java");

        System.out.println("Vetor: " + vetor);
    }
}
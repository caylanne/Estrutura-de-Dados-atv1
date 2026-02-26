public class TesteVetor4 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);

        vetor.adiciona("1");
        vetor.adiciona("2");
        vetor.adiciona("3");

        System.out.println("Antes de limpar: " + vetor);

        vetor.limpar();

        System.out.println("Depois de limpar: " + vetor);
        System.out.println("Está vazio? " + vetor.estaVazia());
    }
}
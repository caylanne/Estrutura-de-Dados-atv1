public class TesteVetor10 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("A");
        vetor.adiciona("C");
        vetor.adiciona("A");

        System.out.println("Antes: " + vetor);

        vetor.removerTodos("A");

        System.out.println("Depois: " + vetor);
    }
}
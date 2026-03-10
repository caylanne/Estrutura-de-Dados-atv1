public class TesteVetor12 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("A");
        vetor.adiciona("C");
        vetor.adiciona("D");

        System.out.println("Antes: " + vetor);

        vetor.inserirDepois("A", "B");

        System.out.println("Depois: " + vetor);
    }
}
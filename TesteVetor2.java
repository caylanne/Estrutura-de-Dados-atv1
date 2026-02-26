public class TesteVetor2 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");

        System.out.println("Busca por 'C': " + vetor.busca("C"));
        System.out.println("Contém 'B'? " + vetor.contem("B"));
        System.out.println("Contém 'X'? " + vetor.contem("X"));
    }
}
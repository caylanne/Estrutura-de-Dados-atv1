public class TesteVetor8 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("B");
        vetor.adiciona("D");

        System.out.println("Inicial: " + vetor);

        boolean removeu = vetor.remove("B");
        System.out.println("Removeu B? " + removeu);
        System.out.println("Depois: " + vetor);

        boolean removeu2 = vetor.remove("X");
        System.out.println("Removeu X? " + removeu2);
        System.out.println("Final: " + vetor);
    }
}
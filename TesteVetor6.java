public class TesteVetor6 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);

        vetor.adiciona("Java");
        vetor.adiciona("Python");
        vetor.adiciona("C++");

        System.out.println("Antes: " + vetor);

        boolean substituiu1 = vetor.substituir("Python", "Kotlin");
        System.out.println("Substituiu Python? " + substituiu1);
        System.out.println("Depois: " + vetor);

        boolean substituiu2 = vetor.substituir("Ruby", "Go");
        System.out.println("Substituiu Ruby? " + substituiu2);
        System.out.println("Final: " + vetor);
    }
}
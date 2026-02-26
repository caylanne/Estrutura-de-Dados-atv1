public class TesteVetor3 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);

        try {
            System.out.println("Último: " + vetor.ultimo());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        vetor.adiciona("João");
        vetor.adiciona("Maria");

        System.out.println("Último após adicionar: " + vetor.ultimo());
    }
}
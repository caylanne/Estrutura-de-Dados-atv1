public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public boolean adiciona(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } 
        return false;
        }
    }

    public String busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }


    public boolean busca(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public String ultimo() {
        if (estaVazia()) {
            throw new IllegalStateException("Vetor está vazio!");
        }
        return this.elementos[this.tamanho - 1];
    }

    public void imprimeUmPorLinha() {
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println(this.elementos[i]);
        }
    }

    public boolean contem(String elemento) {
        return busca(elemento);
    }

    public void limpar() {
        for (int i = 0; i < this.tamanho; i++) {
            this.elementos[i] = null;
        }
        this.tamanho = 0;
    }

    public int contarOcorrencias(String elemento) {
        int contador = 0;

        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                contador++;
            }
        }

        return contador;
    }

    public boolean substituir(String antigo, String novo) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(antigo)) {
                this.elementos[i] = novo;
                return true;
            }
        }

        return false;
    }

    public void remove(int posicao) {

        if (posicao < 0 || posicao >= this.tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }

        this.elementos[this.tamanho - 1] = null;
        this.tamanho--;
    }

    public boolean remove(String elemento) {

        for (int i = 0; i < this.tamanho; i++) {

            if (this.elementos[i].equals(elemento)) {
                remove(i);
                return true;
            }

        }

        return false;
    }

    public int indiceUltimo(String elemento) {

        for (int i = this.tamanho - 1; i >= 0; i--) {

            if (this.elementos[i].equals(elemento)) {
                return i;
            }

        }

        return -1;
    }

    public void removerTodos(String elemento) {

        while (remove(elemento)) {
        }

    }

    public boolean adicionarSeNaoExiste(String elemento) {

        if (!contem(elemento)) {
            adiciona(elemento);
            return true;
        }

        return false;
    }

    public boolean inserirDepois(String referencia, String novoElemento) {

        for (int i = 0; i < this.tamanho; i++) {

            if (this.elementos[i].equals(referencia)) {

                if (this.tamanho >= this.elementos.length) {
                    throw new IllegalStateException("Vetor cheio!");
                }

                for (int j = this.tamanho; j > i + 1; j--) {
                    this.elementos[j] = this.elementos[j - 1];
                }

                this.elementos[i + 1] = novoElemento;
                this.tamanho++;

                return true;
            }

        }

        return false;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("[");

        for (int i = 0; i < this.tamanho; i++) {

            sb.append(this.elementos[i]);

            if (i < this.tamanho - 1) {
                sb.append(", ");
            }

        }

        sb.append("]");

        return sb.toString();
    }

}



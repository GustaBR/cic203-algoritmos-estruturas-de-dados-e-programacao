public class NossoVetor {
    private int[] vetor;
    private int ocupacao;
    private int capacidade;

    public NossoVetor() {
        vetor = new int[10];
        ocupacao = 0;
        capacidade = 10;
    }

    public NossoVetor(int capacidadeInicial) {
        vetor = new int[capacidadeInicial];
        ocupacao = 0;
        capacidade = capacidadeInicial;
    }

    public boolean estaVazio() {
        return ocupacao == 0;
    }

    public boolean estaCheio() {
        return ocupacao == capacidade;
    }

    public boolean adiciona(int elemento) {
        if (estaCheio()) return false;

        vetor[ocupacao++] = elemento;
        return true;
    }

    public int remove() {
        if (ocupacao == 0) return -1;

        return vetor[--ocupacao];
    }

    @Override
    public String toString() {
        if (estaVazio()) return "Vetor vazio";
        
        String s = "";

        for (int i = 0; i < ocupacao; i++) {
            s += vetor[i] + " ";
        }

        return s;
    }
}
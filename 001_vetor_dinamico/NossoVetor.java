import java.util.Random;

public class NossoVetor {
    private int[] vetor;
    private int ocupacao;
    private int capacidade;
    private static final int CAP_PADRAO = 4;

    // Sobrecarga (overload)
    public NossoVetor() {
        this(CAP_PADRAO);
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

    private void aumentarCapacidade() {
        var aux = new int[2 * capacidade];
        capacidade *= 2;

        for (int i = 0; i < ocupacao; i++) {
            aux[i] = vetor[i];
        }

        vetor = aux;
    }

    private void reduzirCapacidade() {
        var aux = new int[capacidade / 2];
        capacidade /= 2;

        for (int i = 0; i < ocupacao; i++) {
            aux[i] = vetor[i];
        }

        vetor = aux;
    }

    public boolean adiciona(int elemento) {
        if (estaCheio()) aumentarCapacidade();

        vetor[ocupacao++] = elemento;
        return true;
    }

    public int remove() {
        if (estaVazio()) return -1;

        ocupacao--;

        if (ocupacao <= capacidade / 4 && ocupacao > CAP_PADRAO) reduzirCapacidade();

        return vetor[ocupacao];
    }

    public void preencheVetor() {
        Random gerador = new Random();
        for (int i = 0; i < capacidade; i++) {
            vetor[i] = gerador.nextInt(0, capacidade * 10);
        }
        ocupacao = capacidade;
    }

    public void bubbleSortMelhorado() {
        for (int i = ocupacao - 1; i > 0; i--) {
            boolean trocou = false;
            for (int j = 0; j < i; j++) {
                if (vetor[j] > vetor[j+1]) {
                    trocou = true;

                    int aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }

            if (!trocou) break;
        }
    }

    public boolean buscaLinear(int valor) {
        for (int i = 0; i < capacidade; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }

    public boolean buscaBinaria(int valor) {
        int inicio = 0;
        int fim = ocupacao - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2; // Ponto médio
            
            if (valor == vetor[meio]) return true;
            else if (valor < vetor[meio]) fim = meio-1;
            else inicio = meio+1;
        }

        return false;
    }
 
    @Override
    public String toString() {
        var sb = new StringBuilder();

        sb.append("Quantidade ").append(ocupacao).append("\n");
        sb.append("Capacidade: ").append(capacidade).append("\n");

        if (!estaVazio()) {
            for (int i = 0; i < ocupacao; i++) {
                sb.append(vetor[i]).append(" ");
            }
        }

        return sb.toString();
    }
}
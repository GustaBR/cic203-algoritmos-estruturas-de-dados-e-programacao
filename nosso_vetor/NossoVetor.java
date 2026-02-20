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
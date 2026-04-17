public class FilaCircular implements Fila {
    private int[] dados;
    private int inicio;
    private int fim;
    private int ocupacao;
    private static final int CAPACIDADE = 100;

    public FilaCircular() {
        dados = new int[CAPACIDADE];
        inicio = 0;
        fim = -1;
        ocupacao = 0;
    }

    public boolean estaCheia() {
        return ocupacao == CAPACIDADE;
    }

    public boolean estaVazia() {
        return ocupacao == 0;
    }

    @Override
    public void enfileirar(int valor) {
        if (estaCheia()) {
            throw new RuntimeException();
        }
        dados[++fim] = valor;
        ocupacao++;
    }

    @Override
    public int desenfileirar() {
        if (estaVazia()) {
            throw new RuntimeException();
        }
        int temp = dados[inicio];
        inicio = (inicio + 1) % CAPACIDADE;
        ocupacao--;
        return temp;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder("");
        sb.append("[");
        for (int i = 0; i < ocupacao; i++) {
            var idx = (inicio + i) % CAPACIDADE;
            sb.append(dados[idx]).append(" ");
            if (i == ocupacao - 1) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
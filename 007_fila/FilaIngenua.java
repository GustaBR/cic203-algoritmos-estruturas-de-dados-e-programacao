public class FilaIngenua implements Fila {
    private int[] dados;
    private static final int CAPACIDADE = 100;
    private int ocupacao;

    public FilaIngenua() {
        this.dados = new int[CAPACIDADE];
        this.ocupacao = 0;
    }

    public boolean estaCheia() {
        return ocupacao == CAPACIDADE;
    }

    public boolean estaVazia() {
        return ocupacao == 0;
    }

    @Override
    public void enfileirar(int valor) {
        if (!estaCheia()) {
            dados[ocupacao++] = valor;
        }
    }

    @Override
    public int desenfileirar() {
        if (estaVazia()) {
            throw new RuntimeException();
        }

        int temp = dados[0];
        for (int i = 1; i < ocupacao; i++) {
            dados[i-1] = dados[i];
        }

        ocupacao--;
        return temp;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder("");
        sb.append("[");
        for (int i = 0; i < ocupacao; i++) {
            sb.append(dados[i]).append(" ");
            if (i == ocupacao - 1) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
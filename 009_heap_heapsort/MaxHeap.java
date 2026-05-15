import java.lang.StringBuilder;

public class MaxHeap {
    private int[] dados;
    private int tamanhoHeap;

    public MaxHeap(int[] dados) {
        this.dados = new int[dados.length + 1];
        for (int i = 0; i < dados.length; i++) {
            this.dados[i+1] = dados[i];
        }

        this.tamanhoHeap = 0;
    }

    private int pai(int indice) {
        return indice/2;
    }

    private int esquerda(int indice) {
        return indice*2;
    }

    private int direita(int indice) {
        return indice*2+1;
    }

    private void trocar(int i, int j) {
        int temp = dados[i];
        dados[i] = dados[j];
        dados[j] = temp;
    }

    public void heapify(int i) {
        int l = esquerda(i);
        int r = direita(i);
        int maior;

        if (l <= tamanhoHeap && dados[l] > dados[i]) {
            maior = l;
        } else {
            maior = i;
        }

        if (r <= tamanhoHeap && dados[r] > dados[maior]) {
            maior = r;
        }

        if (maior != i) {
            trocar(i, maior);
            heapify(maior);
        }
    }

    public void buildMaxHeap() {
        tamanhoHeap = dados.length - 1;
        for (int i = tamanhoHeap; i >= 1; i--) {
            heapify(i);
        }
    }

    public void heapSort() {
        buildMaxHeap();
        for (int i = tamanhoHeap; i >= 2; i--) {
            trocar(1, i);
            tamanhoHeap--;
            heapify(1);
        }
    }

    public void imprimirTopK(int k) {
        buildMaxHeap();
        for (int i = 0; i < k && i < dados.length - 1; i++) {
            System.out.print(dados[1] + " ");
            trocar(1, tamanhoHeap);
            tamanhoHeap--;
            heapify(1);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        for (int i = 1; i < dados.length; i++) {
            sb.append(dados[i]).append(" ");
        }

        return sb.toString();
    }
}
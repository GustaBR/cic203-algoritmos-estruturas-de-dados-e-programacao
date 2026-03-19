public class Pilha {
    private int topo;
    private int[] dados;
    private int capacidade;

    public Pilha(int capacidade) {
        dados = new int[capacidade];
        topo = 0;
        this.capacidade = capacidade;
    }

    public Pilha() {
        this(10);
    }

    public boolean estaVazia() {
        return topo == 0;
    }

    public boolean estaCheia() {
        return topo == capacidade;
    }

    public int tamanho() {
        return topo;
    }

    public boolean empilhar(int numero) {
        if (estaCheia()) return false;
        dados[topo++] = numero;
        return true;
    }

    public int desempilhar() {
        // Essa implementação deixa a cargo da aplicação checar se a pilha está vazia
        return dados[--topo];
    }
}
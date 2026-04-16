import java.lang.StringBuilder;
import java.util.NoSuchElementException;

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
        if (estaVazia()) {
            throw new NoSuchElementException();
        }
        
        return dados[--topo];
    }

    @Override
    public String toString() {
        if (estaVazia()) {
            return "[ ]";
        }

        var sb = new StringBuilder("");
        for (int i = 0; i < topo; i++) {
            sb.append(dados[i]);
            
            if (i != topo-1) sb.append("\n");
        }

        return sb.toString();
    }
}
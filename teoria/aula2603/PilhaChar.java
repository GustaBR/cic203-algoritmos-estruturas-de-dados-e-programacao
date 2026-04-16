import java.lang.StringBuilder;
import java.util.NoSuchElementException;

public class PilhaChar {
    private int topo;
    private char[] dados;
    private int capacidade;

    public PilhaChar(int capacidade) {
        dados = new char[capacidade];
        topo = 0;
        this.capacidade = capacidade;
    }

    public PilhaChar() {
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

    public boolean empilhar(char caractere) {
        if (estaCheia()) return false;
        dados[topo++] = caractere;
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
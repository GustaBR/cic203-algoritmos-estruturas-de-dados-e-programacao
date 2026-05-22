import java.util.*;

public class TabelaHash {
    private static final int M = 7;
    private LinkedList<Par>[] tabela;
    private int tamanho;

    public TabelaHash() {
        this.tabela = new LinkedList[M];
        for (int i = 0; i < M; i++) {
            this.tabela[i] = new LinkedList<>();
        }
        this.tamanho = 0;
    }

    private int hash(int chave) {
        return Math.abs(chave) % M;
    }

    public void inserir(int chave, String valor) {
        int bucket = hash(chave);
        Iterator<Par> it = tabela[bucket].iterator();
        while (it.hasNext()) {
            Par el = it.next();
            if (el.chave == chave) {
                el.valor = valor;
                return;
            }
        } 
        tabela[bucket].add(new Par(chave, valor));
        tamanho++;
    }

    public String buscar(int chave) {
        int bucket = hash(chave);
        for (Par e : tabela[bucket]) {
            if (e.chave == chave) 
                return e.valor;
        }
        return null;
    }

    public void remover(int chave) {
        int bucket = hash(chave);
        Iterator<Par> it = tabela[bucket].iterator();
        while (it.hasNext()) {
            if (it.next().chave == chave) {
                it.remove();
            }
        }
    }

    public void imprimir() {
        for (int i = 0; i < M; i++) {
            Iterator<Par> it = tabela[i].iterator();
            while (it.hasNext()) {
                Par atual = it.next(); 
                System.out.println("Chave: " + atual.chave);
                System.out.println("Valor: " + atual.valor);
                System.out.println();
            }
        }
    }

    public void imprimirBucket(int codigo) {
        int bucket = hash(codigo);
        Iterator<Par> it = tabela[bucket].iterator();
        while (it.hasNext()) {
            Par atual = it.next(); 
            System.out.println("Chave: " + atual.chave);
            System.out.println("Valor: " + atual.valor);
            System.out.println();
        }
    }
}
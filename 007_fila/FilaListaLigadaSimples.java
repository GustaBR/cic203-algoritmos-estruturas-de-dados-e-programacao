import java.lang.StringBuilder;

public class FilaListaLigadaSimples implements Fila {
    private static class No {
        int valor;
        No proximo;

        No(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    private static class Lista {
        No primeiro;
        No ultimo;
        int ocupacao = 0;

        Lista() {
            this.primeiro = this.ultimo = null;
        }

        void inserirFim(int valor) {
            var novo = new No(valor);
            if (primeiro == null) {
                primeiro = novo;
            } else {
                ultimo.proximo = novo;
            }
            ultimo = novo;
            ocupacao++;
        }

        int removerInicio() {
            if (ocupacao == 0) {
                throw new RuntimeException("Lista vazia");
            }
            var temp = primeiro.valor;
            primeiro = primeiro.proximo;
            if (primeiro == null) {
                ultimo = null;
            }
            ocupacao--;
            return temp;
        }
    }

    private Lista lista; 

    public FilaListaLigadaSimples() {
        lista = new Lista();
    }

    public boolean estaVazia() {
        return lista.primeiro == null;
    }

    public int espiar() {
        if (estaVazia()) {
            throw new RuntimeException();
        }

        return lista.primeiro.valor;
    }

    public boolean contem(int valor) {
        var atual = lista.primeiro;
        while (atual != null) {
            if (atual.valor == valor) return true;
            atual = atual.proximo;
        }
        return false;
    }

    @Override
    public void enfileirar(int valor) {
        lista.inserirFim(valor);
    }
    
    @Override
    public int desenfileirar() {
        return lista.removerInicio();
    }

    @Override
    public String toString() {
        var sb = new StringBuilder("");
        sb.append("[");
        var atual = lista.primeiro;
        while (atual != null) {
            sb.append(atual.valor).append(" ");
            atual = atual.proximo;
            if (atual == null) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
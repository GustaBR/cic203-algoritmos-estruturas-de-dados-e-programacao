public class Fila<T> {
    private No<T> primeiro;
    private No<T> ultimo;

    public boolean estaVazia() {
        return primeiro == null;
    }

    public void enfileirar(No<T> no) {
        if (estaVazia()) {
            primeiro = no;
        }
        else {
            ultimo.setProximo(no);
        }
        ultimo = no;
    }

    public T desenfileirar() {
        if (estaVazia()) return null;
        
        T temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (primeiro == null) {
            ultimo = null;
        }
        return temp;
    }

    public T consultaPrimeiro() {
        if (estaVazia()) return null;
        return primeiro.getInfo();
    }

    @Override
    public String toString() {
        if (estaVazia()) return "Fila vazia";
        String s = "";
        No<T> atual = primeiro;
        s += "[ ";
        while (atual != null) {
            s += (atual.getInfo() + " ");
            atual = atual.getProximo();
        }
        s += "]";
        return s;
    }
}
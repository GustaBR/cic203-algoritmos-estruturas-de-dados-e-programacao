public class No<T> {
    public T info;
    public No<T> esquerda;
    public No<T> direita;

    public No(T info) {
        this.info = info;
        this.esquerda = null;
        this.direita = null;
    }
}
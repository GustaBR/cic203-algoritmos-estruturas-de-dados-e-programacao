public class ListaLigada {
    No primeiro = null;
    int quantidade = 0;

    public void adicionarNoComeco(String musica) {
        No novo = new No();
        novo.musica = musica;
        quantidade++;
        novo.prox = primeiro;
        primeiro = novo;
    }

    public boolean estaVazia() {
        return quantidade == 0;
    }
}
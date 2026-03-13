import java.lang.StringBuilder;

public class ListaLigada {
    No primeiro = null;
    int quantidade = 0;

    public void adicionarNoComeco(String musica) {
        No novo = new No(musica, primeiro);
        quantidade++;
        primeiro = novo;
    }

    public void adicionarNoFim(String musica) {
        var no = new No(musica, null);
        quantidade++;

        if (primeiro == null) {
            primeiro = no;
            return;
        }

        var aux = primeiro;

        while (aux.prox != null) {
            aux = aux.prox;
        }

        aux.prox = no;
    }

    public boolean removerDoComeco() {
        if (estaVazia()) {
            return false;
        }

        primeiro = primeiro.prox;
        quantidade--;
        return true;
    }

    public boolean removerDoFim() {
        if (estaVazia()) {
            return false;
        }

        if (quantidade == 1) {
            primeiro = null;
        } else {
            var aux = primeiro;

            for (int i = 0; i < quantidade - 2; i++) {
                aux = aux.prox;
            }

            aux.prox = null;
        }

        quantidade--;
        return true;
    }

    public boolean estaVazia() {
        return quantidade == 0;
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("A lista está vazia.");
            return;
        }

        var aux = primeiro;

        while (aux != null) {
            System.out.print(aux.musica + " ");
            aux = aux.prox;
        }

        System.out.print("\n");
    }

    @Override
    public String toString() {
        if (estaVazia()) {
            return "Lista vazia";
        }

        var sb = new StringBuilder("");
        var aux = primeiro;

        while (aux != null) {
            sb.append(aux.musica).append(" -> ");
            aux = aux.prox;
        }

        sb.append("null");
        sb.append("\nQuantidade: ").append(quantidade);
        
        return sb.toString();
    }
}
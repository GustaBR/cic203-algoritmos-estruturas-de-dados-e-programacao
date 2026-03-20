import java.lang.StringBuilder;

public class ListaLigada {
    No primeiro = null, ultimo = null;
    int quantidade = 0;

    public void adicionarNoComeco(String musica) {
        No novo = new No(musica, primeiro);
        primeiro = novo;
        if (estaVazia()) {
            ultimo = primeiro;
        }

        quantidade++;
    }

    public void adicionarNoFim(String musica) {
        var no = new No(musica, null);

        if (estaVazia()) {
            primeiro = no;
            ultimo = primeiro;
        } else {
            ultimo.prox = no;
            ultimo = no;
        }

        quantidade++;
    }

    public boolean removerDoComeco() {
        if (estaVazia()) {
            return false;
        }

        primeiro = primeiro.prox;
        if (quantidade == 1) {
            ultimo = primeiro;
        }


        quantidade--;
        return true;
    }

    public boolean removerDoFim() {
        if (estaVazia()) {
            return false;
        }

        if (quantidade == 1) {
            primeiro = null;
            ultimo = primeiro;
        } else {
            var aux = primeiro;
            while (aux.prox.prox != null) {
                aux = aux.prox;
            }
            aux.prox = null;
            ultimo = aux;
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
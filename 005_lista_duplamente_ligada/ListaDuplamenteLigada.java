import java.lang.StringBuilder;

public class ListaDuplamenteLigada {
    No primeiro;
    No ultimo;
    int quantidade = 0;

    public boolean estaVazia() {
        return quantidade == 0;
    }

    public void inserirNoComeco(String musica) {
        var novo = new No(musica);
        
        if (estaVazia()) {
            primeiro = novo;
            ultimo = novo;
        } else {
            novo.proximo = primeiro;
            primeiro.anterior = novo;
            primeiro = novo;
        }

        quantidade++;
    }

    public boolean removerDoComeco() {
        if (estaVazia()) {
            return false;
        }

        if (quantidade == 1) {
            primeiro = null;
            ultimo = null;
        } else {
            primeiro = primeiro.proximo;
            primeiro.anterior = null;
        }

        quantidade--;
        return true;
    }

    public boolean removerDoFinal() {
        if (estaVazia() ) {
            return false;
        }

        if (quantidade == 1) {
            ultimo = null;
            primeiro = null;
        } else {
            var penultimo = ultimo.anterior;
            penultimo.proximo = null;
        }

        quantidade--;
        return true;
    }

    public String acessar(int posicao) {
        if (estaVazia()) {
            return "Lista vazia.";           
        }

        if (posicao >= quantidade || posicao < 0) {
            return "Posição inválida";
        }

        No atual = primeiro;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }

        return atual.musica;
    }

    public String exibirLTR() {
        var sb = new StringBuilder("");
        
        if (estaVazia()) {
            sb.append("Lista vazia.");
        } else {
            var aux = primeiro;
            sb.append(aux.musica);

            while (aux.proximo != null) {
                sb.append(" <-> ").append(aux.proximo.musica);
                aux = aux.proximo;
            }

            sb.append(" <-> null");
        }

        return sb.toString();
    }

    public String exibirRTL() {
        var sb = new StringBuilder("");
        
        if (estaVazia()) {
            sb.append("Lista vazia.");
        } else {
            var aux = ultimo;
            sb.append(aux.musica);

            while (aux.anterior != null) {
                sb.append(" <-> ").append(aux.anterior.musica);
                aux = aux.anterior;
            }

            sb.append(" <-> null");
        }

        return sb.toString();   
    }
}
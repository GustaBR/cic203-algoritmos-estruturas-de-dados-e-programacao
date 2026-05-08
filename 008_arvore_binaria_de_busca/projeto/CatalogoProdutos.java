import java.lang.StringBuilder;

public class CatalogoProdutos {
    private ArvoreBinariaBusca catalogo;

    private class ArvoreBinariaBusca {
        private No<Produto> raiz;

        public void inserir(Produto produto) {
            this.raiz = inserirRecursivo(this.raiz, produto); 
        }

        private No<Produto> inserirRecursivo(No<Produto> atual, Produto produto) {
            if (atual == null) {
                return new No<Produto>(produto); 
            }
            if (produto.codigo < atual.direita.info.codigo) {
                atual.esquerda = inserirRecursivo(atual.esquerda, produto);
            }
            else {
                atual.direita = inserirRecursivo(atual.direita, produto);
            }
            return atual;
        }
    }

    public void cadastrar(Produto produto) {
        catalogo.inserir(produto);
    }

    public String exibirEmOrdem() {
        return exibirEmOrdemRecursivo(catalogo.raiz);
    }

    private String exibirEmOrdemRecursivo(No<Produto> atual) {
        var sb = new StringBuilder();
        if (atual == null) {
            return "";
        }
        if (atual.esquerda != null) {
            sb.append(exibirEmOrdemRecursivo(atual.esquerda));
        }
        sb.append(atual.info.toString()).append("\n");
        if (atual.direita != null) {
            sb.append(exibirEmOrdemRecursivo(atual.esquerda));
        }
        return sb.toString();
    }
}
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Sistema {
    private HashMap<String, Produto> catalogo;
    private LinkedHashMap<String, Item> carrinho;

    public Sistema() {
        this.catalogo = new HashMap<String, Produto>();
        this.carrinho = new LinkedHashMap<String, Item>();

    }

    public void cadastrarProduto(String codigo, String nome) {
        var produto = new Produto(codigo, nome);
        catalogo.put(codigo, produto);
    }

    public void exibirProduto(String codigo) {
        System.out.println(catalogo.get(codigo).nome);
    }

    public void adicionarAoCarrinho(String codigo, int quantidade) {
        var produto = catalogo.get(codigo);
        var item = new Item(produto, quantidade);
        carrinho.put(codigo, item);   
    }

    public void exibirCarrinho() {
        // Não implementado
    }
    
}
public class Teste {
    public static void main(String[] args) {
        var prod = new Produto(10, "Hi");
        
        var catalogo = new CatalogoProdutos();
        catalogo.cadastrar(prod);
        catalogo.exibirEmOrdem();
    }
}
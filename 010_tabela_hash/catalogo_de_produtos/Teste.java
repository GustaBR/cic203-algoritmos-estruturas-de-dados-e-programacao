public class Teste {
    public static void main(String[] args) {
        var sistema = new Sistema();
        sistema.cadastrarProduto("Prod1", "O melhor produto");
        sistema.cadastrarProduto("Prod2", "O segundo melhor produto");

        sistema.adicionarAoCarrinho("Prod1", 10);
    }
}
public class Teste {
    public static void main(String[] args) {
        var tabelaHash = new TabelaHash();
        tabelaHash.inserir(10, "Hola");
        tabelaHash.inserir(17, "Hola2");
        tabelaHash.inserir(18, "Hola3");
        tabelaHash.inserir(25, "Hola4");
        tabelaHash.imprimir();
    }
}
public class TesteListaLigada {
    public static void main(String[] args) {
        var lista = new ListaLigada();
        
        for (int i = 0; i < 10; i++) {
            lista.adicionarNoComeco("Música " + (i+1));
        }
    }
}
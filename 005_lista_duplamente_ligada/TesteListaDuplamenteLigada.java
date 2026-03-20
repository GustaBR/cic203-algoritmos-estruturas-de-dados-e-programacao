public class TesteListaDuplamenteLigada {
    public static void main(String[] args) {
        var lista = new ListaDuplamenteLigada();

        for (int i = 0; i < 5; i++) {
            lista.inserirNoComeco(Integer.toString(i));
        }

        System.out.println(lista.exibirLTR());
        System.out.println(lista.exibirRTL());
        lista.removerDoComeco();
        System.out.println(lista.exibirLTR());
        lista.inserirNoComeco(Integer.toString(9430));
        System.out.println(lista.exibirLTR());
     

        for (int i = -2; i < 10; i++) {
            System.out.println("Posição " + i + ": " + lista.acessar(i));
        }
    }
}
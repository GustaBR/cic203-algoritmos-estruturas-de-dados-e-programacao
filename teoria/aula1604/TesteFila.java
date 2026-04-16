public class TesteFila {
    public static void main(String args[]) {
        Fila<String> fila = new Fila<>();
        fila.enfileirar(new No<String>("Teste1"));
        System.out.println(fila);
        fila.enfileirar(new No<String>("Teste2"));
        System.out.println(fila);
        fila.desenfileirar();
        System.out.println(fila);
        fila.desenfileirar();
        System.out.println(fila);
        fila.desenfileirar();
        System.out.println(fila);
    }
}
public class TestePilha {
    public static void main(String[] args) {
        var pilha = new Pilha(5);

        pilha.empilhar(1);
        pilha.empilhar(5);
        pilha.empilhar(15);
        System.out.println("Pilha após o empilhamento:\n" + pilha + "\n");

        if (!pilha.estaVazia()) {
            System.out.println("Elemento desempilhado: " + pilha.desempilhar() + "\n");
            System.out.println("Pilha após o desempilhamento:\n" + pilha + "\n");
        }
    }
}
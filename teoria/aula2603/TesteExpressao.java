import java.util.Scanner;

public class TesteExpressao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua expressão:");
        String expressao = sc.nextLine();

        var pilha = new PilhaChar(20);
        boolean erro = false;

        for (int i = 0; i < expressao.length(); i++) {
            char atual = expressao.charAt(i); 
            if (atual == '(') {
                pilha.empilhar('(');
            } else if (atual == ')') {
                if (!pilha.estaVazia()) {
                    pilha.desempilhar();
                } else {
                    erro = true;
                }
            }
        }

        if (erro || !pilha.estaVazia()) {
            System.out.println("expressão inválida");
        } else {
            System.out.println("expressão válida");
        }
    }
}
import java.util.Random;

public class TesteFila {
    public static void main(String[] args) throws Exception {
        var fila = new FilaCircular();
        var gerador = new Random();
        var sorteio = gerador.nextInt(2);
        while (true) {
            switch (sorteio) {
                case 0:
                    int valor = gerador.nextInt(1, 101);
                    System.out.println("Enfileirando (" + valor + ")...");
                    Thread.sleep(1500);
                    fila.enfileirar(valor);
                    break;
                case 1:
                    System.out.println("Desenfileirando...");
                    Thread.sleep(1500);
                    if (!fila.estaVazia()) {
                        fila.desenfileirar();
                    }
                    break;
            }
            System.out.println("Fila após a operação: " + fila);
            Thread.sleep(500);
            sorteio = gerador.nextInt(2);
        }
    }   
}
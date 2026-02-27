import java.util.Random;

public class BuscaLinearVetor {
    public static int buscaLinear(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) return i;
        }

        return -1;
    }

    public static int contagemLinear(int[] vetor, int valor) {
        int contador = 0;
        for (var e : vetor) {
            if (e == valor) contador++;
        }
        return contador;
    }

    public static void main(String args []) {
        int[] vetor = {4, 6, 10, 1, 2, 60, 4, 5};

        var resultado = buscaLinear(vetor, 1);
        System.out.println(resultado != -1 ? "Encontrou" : "Não encontrou");

        int[] outroVetor = new int[16];
        var gerador = new Random();

        for (int i = 0; i < outroVetor.length; i++) {
            outroVetor[i] = gerador.nextInt(1, 11);
        }

        System.out.println("Vetor de busca:");
        for (int i = 0; i < outroVetor.length; i++) {
            System.out.print(outroVetor[i] + " ");
        }

        int valorABuscar = gerador.nextInt(1, 11);

        System.out.println("\nElemento sendo buscado: " + valorABuscar);
        
        var contagem = contagemLinear(outroVetor, valorABuscar);

        var outroResultado = buscaLinear(outroVetor, valorABuscar);

        System.out.println(outroResultado != -1 ? "Encontrado na posição: " + outroResultado : "Não encontrado");

        System.out.printf("O valor %d foi encontrado %d vezes.", valorABuscar, contagem);
    }
}
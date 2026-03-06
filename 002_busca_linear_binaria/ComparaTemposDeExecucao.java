import java.util.Random;
import java.util.Arrays;

public class ComparaTemposDeExecucao {
    public static void go() {
        int quantidade = 10000000;
        int vetor[] = new int[quantidade];
        var gerador = new Random(); // Java 10+

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(1, 1000000); // Java 17+
        }

        var valor = -1;
        Arrays.sort(vetor);

        var inicio = System.currentTimeMillis();
        BuscaLinearVetor.buscaLinear(vetor, valor);
        var fim = System.currentTimeMillis();

        System.out.println("Tempo de busca linear: " + (fim - inicio));

        inicio = System.currentTimeMillis();
        BuscaBinariaVetor.buscaBinaria(vetor, valor);
        fim = System.currentTimeMillis();

        System.out.printf("Tempo de busca binária: " + (fim - inicio));
    }

    public static void main(String args[]) {
        go();
    }
}
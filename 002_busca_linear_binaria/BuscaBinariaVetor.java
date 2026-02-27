import java.util.Arrays;


public class BuscaBinariaVetor {
    public static int buscaBinaria(int[] vetor, int valor) {
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio = (inicio + fim) / 2; // Ponto médio
        int indice = -1;

        while (inicio <= fim) {
            if (valor == vetor[meio]) {
                indice = meio;
                break;
            }
            else if (valor < vetor[meio]) fim = meio-1;
            else inicio = meio+1;
            
            meio = (inicio + fim) / 2;
        }

        return indice;
    }
    
    public static void main(String... args) {
        int[] numeros = {3, 7, 1, 0, 45, 23, 67, 76, 12, 4};

        System.out.println("Antes da ordenação:");
        System.out.println(Arrays.toString(numeros));
        
        Arrays.sort(numeros);
        System.out.println("\nDepois da ordenação:");
        System.out.println(Arrays.toString(numeros));

        System.out.println("Encontrado em: " + buscaBinaria(numeros, 23));
    }
}
import java.util.Arrays;

public class RecursaoFibonacci {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1)
            return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static long fibonacciMemoizacao(int n, long[] memoria) {
        if (n == 0 || n == 1)
            return n;
        
        if (memoria[n] == -1)
            memoria[n] = fibonacciMemoizacao(n-1, memoria) + fibonacciMemoizacao(n-2, memoria);
        
        return memoria[n]; 
    }

    public static void main(String[] args) {
        int n = 5315;
        long[] memoria = new long[n+1];
        Arrays.fill(memoria, -1);

        var inicio = System.currentTimeMillis();
        System.out.println(fibonacciMemoizacao(n, memoria));
        var fim = System.currentTimeMillis();
        
        System.out.println("Tempo de execução: " + (fim - inicio) + "ms");
    }
}
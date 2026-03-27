public class RecursaoFatorial {
    public static int fatorial(int n) {
        if (n == 0)
            return 1;

        return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        int resultado = fatorial(10);
        System.out.println("Resultado do fatorial: " + resultado);
    }
}
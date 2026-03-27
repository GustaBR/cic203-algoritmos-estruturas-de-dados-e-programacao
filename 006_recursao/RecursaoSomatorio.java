public class RecursaoSomatorio {
    public static int somar(int n) {
        if (n == 1)
            return n;
        return n + somar(n-1); 
    }

    public static void main(String[] args) {
        int resultado = somar(10);
        System.out.println("Resultado da soma: " + resultado);
    }
}
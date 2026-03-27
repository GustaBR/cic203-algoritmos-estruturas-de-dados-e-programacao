public class RecursaoProgressaoAritmeticaCrescente {
    public static void exibir(int n) {
        if (n > 10) {
            return;
        }

        // Recursão
        System.out.println(n);
        exibir(n+1);
    }

    public static void main(String[] args) {
        exibir(1);
    }
}
public class RecursaoProgressaoAritmeticaDecrescente {
    public static void exibir(int n) {
        if (n < 1)
            return;

        System.out.println(n);
        exibir(n-1);
    }

    public static void main(String[] args) {
        exibir(10);
    }
}
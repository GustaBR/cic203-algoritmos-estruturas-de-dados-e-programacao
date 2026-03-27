public class RecursaoExponenciacao {
    public static float exponenciacao(float base, int expoente) {
        if (expoente < 0) {
            return exponenciacao(1/base, -expoente);
        }
        if (expoente == 0)
            return 1;
        return base * exponenciacao(base, expoente-1);
    }

    public static void main(String[] args) {
        int[][] testes = {{5, 3}, {-5, 3}, {5, -3}, {-5, -3}, };

        for (var teste : testes) {
            System.out.println(exponenciacao(teste[0], teste[1]));
        }
    }
}
public class RecursaoBuscaBinaria {
    public static int buscaBinaria(int[] v, int valor, int inicio, int fim) {
        if (inicio > fim)
            return -1;

        int meio = (inicio + fim) / 2;

        if (valor == v[meio])
            return meio;

        else if (valor < v[meio]) {
            return buscaBinaria(v, valor, inicio, meio-1);
        }
        
        return buscaBinaria(v, valor, meio+1, fim);
    }

    public static void main(String[] args) {
        int[] vetor = {2, 5, 8, 12, 16, 23, 38, 45, 67, 91};
        int[] testes = {1, 2, 5, 12, 20};

        for (int valor : testes) {
            System.out.println(buscaBinaria(vetor, valor, 0, vetor.length-1));
        }
    }
}
import java.util.Random;

public class Principal {
    public static void main(String[] args) throws Exception {
        NossoVetor nossoVetor = new NossoVetor(10);
        nossoVetor.preencheVetor();

        System.out.println(nossoVetor);

        boolean encontrou = false;
        while (!encontrou) {
            Random gerador = new Random();
            int sorteado = gerador.nextInt(0, 49);
            encontrou = nossoVetor.buscaBinaria(sorteado);

            System.out.println("Número sorteado: " + sorteado);
        }
    }
}
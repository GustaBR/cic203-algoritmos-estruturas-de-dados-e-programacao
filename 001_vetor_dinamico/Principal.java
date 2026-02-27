import java.util.Random;

public class Principal {
    public static void main(String[] args) throws Exception {
        var nossoVetor = new NossoVetor();
        var gerador = new Random();
        
        while (true) {
            double escolha = gerador.nextDouble(0, 1); 
            if (escolha <= 0.6) {
                int numero = gerador.nextInt(1, 11);
                nossoVetor.adiciona(numero);
            } else if (escolha < 0.9) {
                nossoVetor.remove();
            }

            System.out.println(escolha);
            System.out.println(nossoVetor);
            System.out.println("*************");
            Thread.sleep(5000);
        }
    }
}